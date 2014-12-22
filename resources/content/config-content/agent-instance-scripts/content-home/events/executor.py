#! /usr/bin/env python

import json
import subprocess
import sys

cmd = ['/bin/bash']
cmd.extend(sys.argv[1:])
p = subprocess.Popen(cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
ret_code = None
data = ''
output = ''
while(True):
    ret_code = p.poll()
    line = p.stdout.readline()
    try:
        if line[0] == '{':
            data = json.loads(line)
        else:
            output += line
        output += p.stdout.readline()
    except:
        pass
    if ret_code is not None:
        break

print json.dumps({'output' : output, 'data': data, 'exit_code': ret_code})

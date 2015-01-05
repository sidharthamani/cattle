from common_fixtures import *  # NOQA


def test_instance_link_auth(admin_client, client):
    auth_check(admin_client.schema, 'instanceLink', 'ru', {
        'accountId': 'ru',
        'data': 'ru',
        'instanceId': 'r',
        'linkName': 'r',
        'ports': 'r',
        'removeTime': 'ru',
        'targetInstanceId': 'ru',
    })

    auth_check(client.schema, 'instanceLink', 'ru', {
        'instanceId': 'r',
        'linkName': 'r',
        'targetInstanceId': 'ru',
    })

    auth_check(token_client.schema, 'instanceLink', 'ru', {
        'token': 'cr',
        'schema': 'r',
    })


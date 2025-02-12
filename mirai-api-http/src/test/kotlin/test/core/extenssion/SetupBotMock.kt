/*
 * Copyright 2020-2021 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package test.core.extenssion

import kotlinx.coroutines.runBlocking
import test.core.mock.BotMockStub
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext

class SetupBotMock: BeforeAllCallback {

    override fun beforeAll(context: ExtensionContext?) {
        runBlocking { BotMockStub().login() }
    }
}
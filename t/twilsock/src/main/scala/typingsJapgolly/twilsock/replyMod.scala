package typingsJapgolly.twilsock

import typingsJapgolly.twilsock.abstractmessageMod.AbstractMessage
import typingsJapgolly.twilsock.protocolMod.Protocol.MessageType
import typingsJapgolly.twilsock.twilsockStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/reply", JSImport.Namespace)
@js.native
object replyMod extends js.Object {
  @js.native
  class Reply protected () extends AbstractMessage {
    def this(id: String) = this()
    val body: js.Any = js.native
    val header: js.Any = js.native
    val method: MessageType = js.native
    val payload_type: applicationSlashjson = js.native
    val status: AnonCode = js.native
  }
  
}


package typingsJapgolly.twilsock

import typingsJapgolly.twilsock.initReplyMod.ContinuationTokenStatus
import typingsJapgolly.twilsock.initregistrationMod.InitRegistration
import typingsJapgolly.twilsock.protocolMod.Protocol.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages", JSImport.Namespace)
@js.native
object messagesMod extends js.Object {
  @js.native
  class Close ()
    extends typingsJapgolly.twilsock.closeMod.Close
  
  @js.native
  class Init protected ()
    extends typingsJapgolly.twilsock.initMod.Init {
    def this(token: String, continuationToken: String, metadata: js.Object) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.Array[InitRegistration]
    ) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.Array[InitRegistration],
      tweaks: js.Object
    ) = this()
  }
  
  @js.native
  class InitReply protected ()
    extends typingsJapgolly.twilsock.initReplyMod.InitReply {
    def this(
      id: String,
      continuationToken: String,
      continuationTokenStatus: ContinuationTokenStatus,
      offlineStorage: js.Any,
      initRegistrations: js.Any,
      debugInfo: js.Any
    ) = this()
  }
  
  @js.native
  class Message protected ()
    extends typingsJapgolly.twilsock.messageMod.Message {
    def this(grant: String, contentType: String, request: Request) = this()
  }
  
  @js.native
  class Reply protected ()
    extends typingsJapgolly.twilsock.replyMod.Reply {
    def this(id: String) = this()
  }
  
  @js.native
  class Update protected ()
    extends typingsJapgolly.twilsock.updateMod.Update {
    def this(token: String) = this()
  }
  
}


package typingsJapgolly.cometd

import typingsJapgolly.cometd.mod.CometD
import typingsJapgolly.cometd.mod.Extension
import typingsJapgolly.cometd.mod.Listener
import typingsJapgolly.cometd.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cometd/AckExtension", JSImport.Namespace)
@js.native
object ackExtensionMod extends js.Object {
  @js.native
  trait AckExtension extends Extension {
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    @JSName("incoming")
    def incoming_MAckExtension(message: Message): Unit = js.native
    @JSName("outgoing")
    def outgoing_MAckExtension(message: Message): Unit = js.native
    @JSName("registered")
    def registered_MAckExtension(name: String, cometd: CometD): Unit = js.native
    @JSName("unregistered")
    def unregistered_MAckExtension(): Unit = js.native
  }
  
  @js.native
  class default () extends AckExtension
  
}


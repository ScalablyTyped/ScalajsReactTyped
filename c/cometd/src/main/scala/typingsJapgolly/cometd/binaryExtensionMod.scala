package typingsJapgolly.cometd

import typingsJapgolly.cometd.mod.Extension
import typingsJapgolly.cometd.mod.Listener
import typingsJapgolly.cometd.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cometd/BinaryExtension", JSImport.Namespace)
@js.native
object binaryExtensionMod extends js.Object {
  @js.native
  trait BinaryExtension extends Extension {
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    @JSName("incoming")
    def incoming_MBinaryExtension(message: Message): Unit = js.native
    @JSName("outgoing")
    def outgoing_MBinaryExtension(message: Message): Unit = js.native
  }
  
  @js.native
  class default () extends BinaryExtension
  
}


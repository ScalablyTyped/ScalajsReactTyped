package typingsJapgolly.cometd

import japgolly.scalajs.react.Callback
import typingsJapgolly.cometd.mod.Extension
import typingsJapgolly.cometd.mod.Listener
import typingsJapgolly.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryExtensionMod {
  
  @JSImport("cometd/BinaryExtension", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BinaryExtension {
    
    /* CompleteClass */
    @JSName("incoming")
    override def incoming_MBinaryExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("outgoing")
    override def outgoing_MBinaryExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
  }
  
  trait BinaryExtension
    extends StObject
       with Extension {
    
    @JSName("incoming")
    def incoming_MBinaryExtension(message: Message): Unit
    @JSName("incoming")
    var incoming_Original: Listener
    
    @JSName("outgoing")
    def outgoing_MBinaryExtension(message: Message): Unit
    @JSName("outgoing")
    var outgoing_Original: Listener
  }
  object BinaryExtension {
    
    inline def apply(incoming: /* message */ Message => Callback, outgoing: /* message */ Message => Callback): BinaryExtension = {
      val __obj = js.Dynamic.literal(incoming = js.Any.fromFunction1((t0: /* message */ Message) => incoming(t0).runNow()), outgoing = js.Any.fromFunction1((t0: /* message */ Message) => outgoing(t0).runNow()))
      __obj.asInstanceOf[BinaryExtension]
    }
    
    extension [Self <: BinaryExtension](x: Self) {
      
      inline def setIncoming(value: /* message */ Message => Callback): Self = StObject.set(x, "incoming", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setOutgoing(value: /* message */ Message => Callback): Self = StObject.set(x, "outgoing", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
    }
  }
}

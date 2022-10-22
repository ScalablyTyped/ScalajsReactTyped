package typingsJapgolly.cometd

import japgolly.scalajs.react.Callback
import typingsJapgolly.cometd.mod.CometD
import typingsJapgolly.cometd.mod.Extension
import typingsJapgolly.cometd.mod.Listener
import typingsJapgolly.cometd.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ackExtensionMod {
  
  @JSImport("cometd/AckExtension", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AckExtension {
    
    /* CompleteClass */
    @JSName("incoming")
    override def incoming_MAckExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("incoming")
    var incoming_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("outgoing")
    override def outgoing_MAckExtension(message: Message): Unit = js.native
    /* CompleteClass */
    @JSName("outgoing")
    var outgoing_Original: Listener = js.native
    
    /* CompleteClass */
    @JSName("registered")
    override def registered_MAckExtension(name: String, cometd: CometD): Unit = js.native
    
    /* CompleteClass */
    @JSName("unregistered")
    override def unregistered_MAckExtension(): Unit = js.native
  }
  
  trait AckExtension
    extends StObject
       with Extension {
    
    @JSName("incoming")
    def incoming_MAckExtension(message: Message): Unit
    @JSName("incoming")
    var incoming_Original: Listener
    
    @JSName("outgoing")
    def outgoing_MAckExtension(message: Message): Unit
    @JSName("outgoing")
    var outgoing_Original: Listener
    
    @JSName("registered")
    def registered_MAckExtension(name: String, cometd: CometD): Unit
    
    @JSName("unregistered")
    def unregistered_MAckExtension(): Unit
  }
  object AckExtension {
    
    inline def apply(
      incoming: /* message */ Message => Callback,
      outgoing: /* message */ Message => Callback,
      registered: (String, CometD) => Callback,
      unregistered: Callback
    ): AckExtension = {
      val __obj = js.Dynamic.literal(incoming = js.Any.fromFunction1((t0: /* message */ Message) => incoming(t0).runNow()), outgoing = js.Any.fromFunction1((t0: /* message */ Message) => outgoing(t0).runNow()), registered = js.Any.fromFunction2((t0: String, t1: CometD) => (registered(t0, t1)).runNow()), unregistered = unregistered.toJsFn)
      __obj.asInstanceOf[AckExtension]
    }
    
    extension [Self <: AckExtension](x: Self) {
      
      inline def setIncoming(value: /* message */ Message => Callback): Self = StObject.set(x, "incoming", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setOutgoing(value: /* message */ Message => Callback): Self = StObject.set(x, "outgoing", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setRegistered(value: (String, CometD) => Callback): Self = StObject.set(x, "registered", js.Any.fromFunction2((t0: String, t1: CometD) => (value(t0, t1)).runNow()))
      
      inline def setUnregistered(value: Callback): Self = StObject.set(x, "unregistered", value.toJsFn)
    }
  }
}

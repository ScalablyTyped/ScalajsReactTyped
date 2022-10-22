package typingsJapgolly.ioredis

import japgolly.scalajs.react.Callback
import typingsJapgolly.ioredis.builtTypesMod.NetStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtConnectorsAbstractConnectorMod {
  
  /* note: abstract class */ @JSImport("ioredis/built/connectors/AbstractConnector", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AbstractConnector {
    def this(disconnectTimeout: Double) = this()
    
    /* CompleteClass */
    override def check(info: Any): Boolean = js.native
    
    /* CompleteClass */
    override def connect(_underscore: ErrorEmitter): js.Promise[NetStream] = js.native
    
    /* protected */ /* CompleteClass */
    var connecting: Boolean = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var disconnectTimeout: Any = js.native
    
    /* protected */ /* CompleteClass */
    var stream: NetStream = js.native
  }
  
  trait AbstractConnector extends StObject {
    
    def check(info: Any): Boolean
    
    def connect(_underscore: ErrorEmitter): js.Promise[NetStream]
    
    /* protected */ var connecting: Boolean
    
    def disconnect(): Unit
    
    /* private */ var disconnectTimeout: Any
    
    var firstError: js.UndefOr[js.Error] = js.undefined
    
    /* protected */ var stream: NetStream
  }
  object AbstractConnector {
    
    inline def apply(
      check: Any => Boolean,
      connect: ErrorEmitter => js.Promise[NetStream],
      connecting: Boolean,
      disconnect: Callback,
      disconnectTimeout: Any,
      stream: NetStream
    ): AbstractConnector = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), connect = js.Any.fromFunction1(connect), connecting = connecting.asInstanceOf[js.Any], disconnect = disconnect.toJsFn, disconnectTimeout = disconnectTimeout.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbstractConnector]
    }
    
    extension [Self <: AbstractConnector](x: Self) {
      
      inline def setCheck(value: Any => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setConnect(value: ErrorEmitter => js.Promise[NetStream]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setConnecting(value: Boolean): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setDisconnectTimeout(value: Any): Self = StObject.set(x, "disconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setFirstError(value: js.Error): Self = StObject.set(x, "firstError", value.asInstanceOf[js.Any])
      
      inline def setFirstErrorUndefined: Self = StObject.set(x, "firstError", js.undefined)
      
      inline def setStream(value: NetStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorEmitter = js.Function2[/* type */ String, /* err */ js.Error, Unit]
}

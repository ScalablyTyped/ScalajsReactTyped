package typingsJapgolly.trufflePrivatekeyProvider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("truffle-privatekey-provider", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PrivateKeyProvider {
    def this(privateKey: Any, providerUrl: Any) = this()
    
    /* CompleteClass */
    override def send(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def sendAsync(args: Any*): Unit = js.native
  }
  
  trait PrivateKeyProvider extends StObject {
    
    def send(args: Any*): Any
    
    def sendAsync(args: Any*): Unit
  }
  object PrivateKeyProvider {
    
    inline def apply(send: /* repeated */ Any => Any, sendAsync: /* repeated */ Any => Callback): PrivateKeyProvider = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1((t0: /* repeated */ Any) => sendAsync(t0).runNow()))
      __obj.asInstanceOf[PrivateKeyProvider]
    }
    
    extension [Self <: PrivateKeyProvider](x: Self) {
      
      inline def setSend(value: /* repeated */ Any => Any): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSendAsync(value: /* repeated */ Any => Callback): Self = StObject.set(x, "sendAsync", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}

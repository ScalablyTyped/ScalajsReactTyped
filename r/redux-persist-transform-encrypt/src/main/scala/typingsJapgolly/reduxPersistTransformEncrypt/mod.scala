package typingsJapgolly.reduxPersistTransformEncrypt

import japgolly.scalajs.react.Callback
import typingsJapgolly.reduxPersist.esTypesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-persist-transform-encrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State, Raw](config: EncryptorConfig): Transform[State, Raw, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  trait EncryptorConfig extends StObject {
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var secretKey: String
  }
  object EncryptorConfig {
    
    inline def apply(secretKey: String): EncryptorConfig = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptorConfig]
    }
    
    extension [Self <: EncryptorConfig](x: Self) {
      
      inline def setOnError(value: /* err */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}

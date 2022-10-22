package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShimBase
  extends StObject
     with IShim {
  
  /* private */ var factory: Any
}
object ShimBase {
  
  inline def apply(dispose: Any => Callback, factory: Any): ShimBase = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1((t0: Any) => dispose(t0).runNow()), factory = factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShimBase]
  }
  
  extension [Self <: ShimBase](x: Self) {
    
    inline def setFactory(value: Any): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
  }
}

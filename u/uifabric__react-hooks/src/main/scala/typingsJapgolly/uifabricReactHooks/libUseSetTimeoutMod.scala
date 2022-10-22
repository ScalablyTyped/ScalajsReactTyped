package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseSetTimeoutMod {
  
  @JSImport("@uifabric/react-hooks/lib/useSetTimeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSetTimeout(): UseSetTimeoutReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetTimeout")().asInstanceOf[UseSetTimeoutReturnType]
  
  trait UseSetTimeoutReturnType extends StObject {
    
    def clearTimeout(id: Double): Unit
    
    def setTimeout(callback: js.Function0[Unit], duration: Double): Double
  }
  object UseSetTimeoutReturnType {
    
    inline def apply(clearTimeout: Double => Callback, setTimeout: (js.Function0[Unit], Double) => Double): UseSetTimeoutReturnType = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1((t0: Double) => clearTimeout(t0).runNow()), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[UseSetTimeoutReturnType]
    }
    
    extension [Self <: UseSetTimeoutReturnType](x: Self) {
      
      inline def setClearTimeout(value: Double => Callback): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetTimeout(value: (js.Function0[Unit], Double) => Double): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}

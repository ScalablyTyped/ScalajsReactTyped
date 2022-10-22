package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseSetIntervalMod {
  
  @JSImport("@uifabric/react-hooks/lib/useSetInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSetInterval(): UseSetIntervalReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetInterval")().asInstanceOf[UseSetIntervalReturnType]
  
  trait UseSetIntervalReturnType extends StObject {
    
    def clearInterval(id: Double): Unit
    
    def setInterval(callback: js.Function0[Unit], duration: Double): Double
  }
  object UseSetIntervalReturnType {
    
    inline def apply(clearInterval: Double => Callback, setInterval: (js.Function0[Unit], Double) => Double): UseSetIntervalReturnType = {
      val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1((t0: Double) => clearInterval(t0).runNow()), setInterval = js.Any.fromFunction2(setInterval))
      __obj.asInstanceOf[UseSetIntervalReturnType]
    }
    
    extension [Self <: UseSetIntervalReturnType](x: Self) {
      
      inline def setClearInterval(value: Double => Callback): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetInterval(value: (js.Function0[Unit], Double) => Double): Self = StObject.set(x, "setInterval", js.Any.fromFunction2(value))
    }
  }
}

package typingsJapgolly.unload

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(fn: js.Function0[Unit]): AddReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(fn.asInstanceOf[js.Any]).asInstanceOf[AddReturn]
  
  inline def getSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Double]
  
  inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  
  inline def runAll(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAll")().asInstanceOf[js.Promise[Any]]
  
  trait AddReturn extends StObject {
    
    def remove(): Unit
    
    def run(): Any
  }
  object AddReturn {
    
    inline def apply(remove: Callback, run: CallbackTo[Any]): AddReturn = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn, run = run.toJsFn)
      __obj.asInstanceOf[AddReturn]
    }
    
    extension [Self <: AddReturn](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setRun(value: CallbackTo[Any]): Self = StObject.set(x, "run", value.toJsFn)
    }
  }
}

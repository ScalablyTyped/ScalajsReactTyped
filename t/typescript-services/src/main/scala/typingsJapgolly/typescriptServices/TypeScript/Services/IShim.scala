package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShim extends StObject {
  
  def dispose(dummy: Any): Unit
}
object IShim {
  
  inline def apply(dispose: Any => Callback): IShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1((t0: Any) => dispose(t0).runNow()))
    __obj.asInstanceOf[IShim]
  }
  
  extension [Self <: IShim](x: Self) {
    
    inline def setDispose(value: Any => Callback): Self = StObject.set(x, "dispose", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

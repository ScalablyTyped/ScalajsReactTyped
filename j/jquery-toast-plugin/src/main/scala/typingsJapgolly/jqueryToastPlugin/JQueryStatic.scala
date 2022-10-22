package typingsJapgolly.jqueryToastPlugin

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def toast(options: toastOptions): Unit
}
object JQueryStatic {
  
  inline def apply(toast: toastOptions => Callback): JQueryStatic = {
    val __obj = js.Dynamic.literal(toast = js.Any.fromFunction1((t0: toastOptions) => toast(t0).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setToast(value: toastOptions => Callback): Self = StObject.set(x, "toast", js.Any.fromFunction1((t0: toastOptions) => value(t0).runNow()))
  }
}

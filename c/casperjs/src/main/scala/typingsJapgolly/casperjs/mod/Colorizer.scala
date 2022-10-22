package typingsJapgolly.casperjs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colorizer extends StObject {
  
  def colorize(text: String, styleName: String): Unit
  
  def format(text: String, style: Any): Unit
}
object Colorizer {
  
  inline def apply(colorize: (String, String) => Callback, format: (String, Any) => Callback): Colorizer = {
    val __obj = js.Dynamic.literal(colorize = js.Any.fromFunction2((t0: String, t1: String) => (colorize(t0, t1)).runNow()), format = js.Any.fromFunction2((t0: String, t1: Any) => (format(t0, t1)).runNow()))
    __obj.asInstanceOf[Colorizer]
  }
  
  extension [Self <: Colorizer](x: Self) {
    
    inline def setColorize(value: (String, String) => Callback): Self = StObject.set(x, "colorize", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setFormat(value: (String, Any) => Callback): Self = StObject.set(x, "format", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}

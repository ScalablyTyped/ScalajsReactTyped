package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nParser extends StObject {
  
  def _validate(data: Any): Unit
  
  def parse(data: Any): Any
}
object I18nParser {
  
  inline def apply(_validate: Any => Callback, parse: Any => Any): I18nParser = {
    val __obj = js.Dynamic.literal(_validate = js.Any.fromFunction1((t0: Any) => _validate(t0).runNow()), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[I18nParser]
  }
  
  extension [Self <: I18nParser](x: Self) {
    
    inline def setParse(value: Any => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def set_validate(value: Any => Callback): Self = StObject.set(x, "_validate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

package typingsJapgolly.maplibreGl.distStyleSpecMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntlCollator extends StObject {
  
  def compare(a: String, b: String): Double
  
  def resolvedOptions(): Any
}
object IntlCollator {
  
  inline def apply(compare: (String, String) => Double, resolvedOptions: CallbackTo[Any]): IntlCollator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = resolvedOptions.toJsFn)
    __obj.asInstanceOf[IntlCollator]
  }
  
  extension [Self <: IntlCollator](x: Self) {
    
    inline def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setResolvedOptions(value: CallbackTo[Any]): Self = StObject.set(x, "resolvedOptions", value.toJsFn)
  }
}

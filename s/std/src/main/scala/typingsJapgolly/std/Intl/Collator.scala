package typingsJapgolly.std.Intl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collator extends StObject {
  
  /* standard es5 */
  def compare(x: String, y: String): Double
  
  /* standard es5 */
  def resolvedOptions(): ResolvedCollatorOptions
}
object Collator {
  
  inline def apply(compare: (String, String) => Double, resolvedOptions: CallbackTo[ResolvedCollatorOptions]): Collator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = resolvedOptions.toJsFn)
    __obj.asInstanceOf[Collator]
  }
  
  extension [Self <: Collator](x: Self) {
    
    inline def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setResolvedOptions(value: CallbackTo[ResolvedCollatorOptions]): Self = StObject.set(x, "resolvedOptions", value.toJsFn)
  }
}

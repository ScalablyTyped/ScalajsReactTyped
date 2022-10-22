package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISortedQuery
  extends StObject
     with IFinalizable {
  
  /** Specifies next order field (ascending) */
  def ThenBy(fieldInternalName: String): ISortedQuery
  
  /** Specifies next order field (descending) */
  def ThenByDesc(fieldInternalName: String): ISortedQuery
}
object ISortedQuery {
  
  inline def apply(
    ThenBy: String => ISortedQuery,
    ThenByDesc: String => ISortedQuery,
    ToCamlQuery: CallbackTo[Any],
    ToString: CallbackTo[String]
  ): ISortedQuery = {
    val __obj = js.Dynamic.literal(ThenBy = js.Any.fromFunction1(ThenBy), ThenByDesc = js.Any.fromFunction1(ThenByDesc), ToCamlQuery = ToCamlQuery.toJsFn, ToString = ToString.toJsFn)
    __obj.asInstanceOf[ISortedQuery]
  }
  
  extension [Self <: ISortedQuery](x: Self) {
    
    inline def setThenBy(value: String => ISortedQuery): Self = StObject.set(x, "ThenBy", js.Any.fromFunction1(value))
    
    inline def setThenByDesc(value: String => ISortedQuery): Self = StObject.set(x, "ThenByDesc", js.Any.fromFunction1(value))
  }
}

package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executable extends StObject {
  
  def toQuery(): QueryLike
}
object Executable {
  
  inline def apply(toQuery: CallbackTo[QueryLike]): Executable = {
    val __obj = js.Dynamic.literal(toQuery = toQuery.toJsFn)
    __obj.asInstanceOf[Executable]
  }
  
  extension [Self <: Executable](x: Self) {
    
    inline def setToQuery(value: CallbackTo[QueryLike]): Self = StObject.set(x, "toQuery", value.toJsFn)
  }
}

package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyingQuery
  extends StObject
     with Executable {
  
  def returning[U](nodes: Any*): Query[U]
  
  def where(nodes: Any*): ModifyingQuery
}
object ModifyingQuery {
  
  inline def apply(
    returning: /* repeated */ Any => Query[Any],
    toQuery: CallbackTo[QueryLike],
    where: /* repeated */ Any => ModifyingQuery
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(returning = js.Any.fromFunction1(returning), toQuery = toQuery.toJsFn, where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[ModifyingQuery]
  }
  
  extension [Self <: ModifyingQuery](x: Self) {
    
    inline def setReturning(value: /* repeated */ Any => Query[Any]): Self = StObject.set(x, "returning", js.Any.fromFunction1(value))
    
    inline def setWhere(value: /* repeated */ Any => ModifyingQuery): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}

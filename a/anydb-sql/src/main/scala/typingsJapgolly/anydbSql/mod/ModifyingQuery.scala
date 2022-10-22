package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyingQuery
  extends StObject
     with Executable[Unit] {
  
  def returning[U](nodes: Any*): Query[U]
  
  def where(nodes: Any*): ModifyingQuery
}
object ModifyingQuery {
  
  inline def apply(
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    allWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[js.Array[Unit]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    getWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    returning: /* repeated */ Any => Query[Any],
    toQuery: CallbackTo[QueryLike],
    where: /* repeated */ Any => ModifyingQuery
  ): ModifyingQuery = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, allWithin = js.Any.fromFunction1(allWithin), exec = exec.toJsFn, execWithin = js.Any.fromFunction1(execWithin), get = get.toJsFn, getWithin = js.Any.fromFunction1(getWithin), returning = js.Any.fromFunction1(returning), toQuery = toQuery.toJsFn, where = js.Any.fromFunction1(where))
    __obj.asInstanceOf[ModifyingQuery]
  }
  
  extension [Self <: ModifyingQuery](x: Self) {
    
    inline def setReturning(value: /* repeated */ Any => Query[Any]): Self = StObject.set(x, "returning", js.Any.fromFunction1(value))
    
    inline def setWhere(value: /* repeated */ Any => ModifyingQuery): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
  }
}

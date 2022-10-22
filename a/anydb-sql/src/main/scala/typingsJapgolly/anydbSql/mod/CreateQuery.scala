package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuery
  extends StObject
     with Executable[Unit] {
  
  def ifNotExists(): Executable[Unit]
}
object CreateQuery {
  
  inline def apply(
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    allWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[js.Array[Unit]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    getWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    ifNotExists: CallbackTo[Executable[Unit]],
    toQuery: CallbackTo[QueryLike]
  ): CreateQuery = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, allWithin = js.Any.fromFunction1(allWithin), exec = exec.toJsFn, execWithin = js.Any.fromFunction1(execWithin), get = get.toJsFn, getWithin = js.Any.fromFunction1(getWithin), ifNotExists = ifNotExists.toJsFn, toQuery = toQuery.toJsFn)
    __obj.asInstanceOf[CreateQuery]
  }
  
  extension [Self <: CreateQuery](x: Self) {
    
    inline def setIfNotExists(value: CallbackTo[Executable[Unit]]): Self = StObject.set(x, "ifNotExists", value.toJsFn)
  }
}

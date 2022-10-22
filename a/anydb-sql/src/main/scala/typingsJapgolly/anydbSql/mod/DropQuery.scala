package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropQuery
  extends StObject
     with Executable[Unit] {
  
  def ifExists(): Executable[Unit]
}
object DropQuery {
  
  inline def apply(
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[Unit]]],
    allWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[js.Array[Unit]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    getWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    ifExists: CallbackTo[Executable[Unit]],
    toQuery: CallbackTo[QueryLike]
  ): DropQuery = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, allWithin = js.Any.fromFunction1(allWithin), exec = exec.toJsFn, execWithin = js.Any.fromFunction1(execWithin), get = get.toJsFn, getWithin = js.Any.fromFunction1(getWithin), ifExists = ifExists.toJsFn, toQuery = toQuery.toJsFn)
    __obj.asInstanceOf[DropQuery]
  }
  
  extension [Self <: DropQuery](x: Self) {
    
    inline def setIfExists(value: CallbackTo[Executable[Unit]]): Self = StObject.set(x, "ifExists", value.toJsFn)
  }
}

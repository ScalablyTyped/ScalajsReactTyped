package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Executable[T] extends StObject {
  
  def all(): typingsJapgolly.bluebird.mod.^[js.Array[T]]
  
  def allWithin(tx: DatabaseConnection): typingsJapgolly.bluebird.mod.^[js.Array[T]]
  
  def exec(): typingsJapgolly.bluebird.mod.^[Unit]
  
  def execWithin(tx: DatabaseConnection): typingsJapgolly.bluebird.mod.^[Unit]
  
  def get(): typingsJapgolly.bluebird.mod.^[T]
  
  def getWithin(tx: DatabaseConnection): typingsJapgolly.bluebird.mod.^[T]
  
  def toQuery(): QueryLike
}
object Executable {
  
  inline def apply[T](
    all: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[T]]],
    allWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[js.Array[T]],
    exec: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    execWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit],
    get: CallbackTo[typingsJapgolly.bluebird.mod.^[T]],
    getWithin: DatabaseConnection => typingsJapgolly.bluebird.mod.^[T],
    toQuery: CallbackTo[QueryLike]
  ): Executable[T] = {
    val __obj = js.Dynamic.literal(all = all.toJsFn, allWithin = js.Any.fromFunction1(allWithin), exec = exec.toJsFn, execWithin = js.Any.fromFunction1(execWithin), get = get.toJsFn, getWithin = js.Any.fromFunction1(getWithin), toQuery = toQuery.toJsFn)
    __obj.asInstanceOf[Executable[T]]
  }
  
  extension [Self <: Executable[?], T](x: Self & Executable[T]) {
    
    inline def setAll(value: CallbackTo[typingsJapgolly.bluebird.mod.^[js.Array[T]]]): Self = StObject.set(x, "all", value.toJsFn)
    
    inline def setAllWithin(value: DatabaseConnection => typingsJapgolly.bluebird.mod.^[js.Array[T]]): Self = StObject.set(x, "allWithin", js.Any.fromFunction1(value))
    
    inline def setExec(value: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]]): Self = StObject.set(x, "exec", value.toJsFn)
    
    inline def setExecWithin(value: DatabaseConnection => typingsJapgolly.bluebird.mod.^[Unit]): Self = StObject.set(x, "execWithin", js.Any.fromFunction1(value))
    
    inline def setGet(value: CallbackTo[typingsJapgolly.bluebird.mod.^[T]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setGetWithin(value: DatabaseConnection => typingsJapgolly.bluebird.mod.^[T]): Self = StObject.set(x, "getWithin", js.Any.fromFunction1(value))
    
    inline def setToQuery(value: CallbackTo[QueryLike]): Self = StObject.set(x, "toQuery", value.toJsFn)
  }
}

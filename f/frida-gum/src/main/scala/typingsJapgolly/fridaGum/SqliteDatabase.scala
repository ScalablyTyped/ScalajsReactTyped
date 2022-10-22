package typingsJapgolly.fridaGum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides read/write access to a SQLite database. Useful for persistence
  * and to embed a cache in an agent.
  */
trait SqliteDatabase extends StObject {
  
  /**
    * Closes the database. You should call this function when you're done with
    * the database, unless you are fine with this happening when the object is
    * garbage-collected or the script is unloaded.
    */
  def close(): Unit
  
  /**
    * Dumps the database to a gzip-compressed blob encoded as Base64.
    *
    * This is useful for inlining a cache in your agent's code, loaded by
    * calling `SqliteDatabase.openInline()`.
    */
  def dump(): String
  
  /**
    * Executes a raw SQL query. Throws an exception if the query is invalid.
    *
    * The query's result is ignored, so this should only be used for queries
    * for setting up the database, e.g. table creation.
    *
    * @param sql Text-representation of the SQL query.
    */
  def exec(sql: String): Unit
  
  /**
    * Compiles the provided SQL into a `SqliteStatement` object. Throws an
    * exception if the query is invalid.
    *
    * @param sql Text-representation of the SQL query.
    */
  def prepare(sql: String): SqliteStatement
}
object SqliteDatabase {
  
  inline def apply(
    close: Callback,
    dump: CallbackTo[String],
    exec: String => Callback,
    prepare: String => SqliteStatement
  ): SqliteDatabase = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, dump = dump.toJsFn, exec = js.Any.fromFunction1((t0: String) => exec(t0).runNow()), prepare = js.Any.fromFunction1(prepare))
    __obj.asInstanceOf[SqliteDatabase]
  }
  
  extension [Self <: SqliteDatabase](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDump(value: CallbackTo[String]): Self = StObject.set(x, "dump", value.toJsFn)
    
    inline def setExec(value: String => Callback): Self = StObject.set(x, "exec", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPrepare(value: String => SqliteStatement): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
  }
}

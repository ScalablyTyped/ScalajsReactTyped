package typingsJapgolly.spatialite

import typingsJapgolly.sqlite3.mod.sqlite3
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spatialite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Database ()
    extends typingsJapgolly.sqlite3.mod.Database {
    def spatialite(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  }
  
  @js.native
  class Statement ()
    extends typingsJapgolly.sqlite3.mod.Statement
  
  val OPEN_CREATE: Double = js.native
  val OPEN_READONLY: Double = js.native
  val OPEN_READWRITE: Double = js.native
  def verbose(): sqlite3 = js.native
  @js.native
  object cached extends js.Object {
    def Database(filename: String): typingsJapgolly.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      callback: js.ThisFunction1[/* this */ typingsJapgolly.sqlite3.mod.Database, /* err */ Error | Null, Unit]
    ): typingsJapgolly.sqlite3.mod.Database = js.native
    def Database(filename: String, mode: Double): typingsJapgolly.sqlite3.mod.Database = js.native
    def Database(
      filename: String,
      mode: Double,
      callback: js.ThisFunction1[/* this */ typingsJapgolly.sqlite3.mod.Database, /* err */ js.Error | Null, Unit]
    ): typingsJapgolly.sqlite3.mod.Database = js.native
  }
  
}


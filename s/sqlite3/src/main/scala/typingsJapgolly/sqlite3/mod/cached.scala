package typingsJapgolly.sqlite3.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite3", "cached")
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


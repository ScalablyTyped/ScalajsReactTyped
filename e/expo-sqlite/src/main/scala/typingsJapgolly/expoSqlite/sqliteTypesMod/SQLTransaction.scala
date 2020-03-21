package typingsJapgolly.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQLTransaction extends js.Object {
  def executeSql(sqlStatement: String): Unit = js.native
  def executeSql(sqlStatement: String, args: js.Array[_]): Unit = js.native
  def executeSql(sqlStatement: String, args: js.Array[_], callback: SQLStatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: String,
    args: js.Array[_],
    callback: SQLStatementCallback,
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
}


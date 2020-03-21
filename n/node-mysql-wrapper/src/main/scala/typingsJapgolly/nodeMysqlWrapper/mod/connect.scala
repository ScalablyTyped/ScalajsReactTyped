package typingsJapgolly.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "connect")
@js.native
object connect extends js.Object {
  def apply(mysqlUrlOrObjectOrMysqlAlreadyConnection: String, useTables: js.Any*): Database = js.native
  /** For meteor js only
    * Same as wrap but it's sync mode - autoconnect to the database without need to use database.ready(callback).
    */
  def apply(mysqlUrlOrObjectOrMysqlAlreadyConnection: typingsJapgolly.mysql.mod.Connection, useTables: js.Any*): Database = js.native
}


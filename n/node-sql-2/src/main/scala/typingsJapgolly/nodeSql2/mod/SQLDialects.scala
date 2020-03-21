package typingsJapgolly.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeSql2.nodeSql2Strings.mssql
  - typingsJapgolly.nodeSql2.nodeSql2Strings.mysql
  - typingsJapgolly.nodeSql2.nodeSql2Strings.oracle
  - typingsJapgolly.nodeSql2.nodeSql2Strings.postgres
  - typingsJapgolly.nodeSql2.nodeSql2Strings.sqlite
*/
trait SQLDialects extends js.Object

object SQLDialects {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mssql: typingsJapgolly.nodeSql2.nodeSql2Strings.mssql = this.cast("mssql")
  @scala.inline
  def mysql: typingsJapgolly.nodeSql2.nodeSql2Strings.mysql = this.cast("mysql")
  @scala.inline
  def oracle: typingsJapgolly.nodeSql2.nodeSql2Strings.oracle = this.cast("oracle")
  @scala.inline
  def postgres: typingsJapgolly.nodeSql2.nodeSql2Strings.postgres = this.cast("postgres")
  @scala.inline
  def sqlite: typingsJapgolly.nodeSql2.nodeSql2Strings.sqlite = this.cast("sqlite")
}


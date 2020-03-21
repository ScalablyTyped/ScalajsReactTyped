package typingsJapgolly.anydbSql.mod

import typingsJapgolly.anydbSql.AnonRowCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseConnection extends js.Object {
  def queryAsync[T](query: String, params: js.Any*): typingsJapgolly.bluebird.mod.^[AnonRowCount[T]] = js.native
  def queryAsync[T](query: QueryLike): typingsJapgolly.bluebird.mod.^[AnonRowCount[T]] = js.native
}


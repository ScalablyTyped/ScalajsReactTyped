package typingsJapgolly.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends DatabaseConnection {
  def commitAsync(): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def rollback(): Unit = js.native
}


package typingsJapgolly.googleAppsScript.GoogleAppsScript.JDBC

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
trait JdbcSavepoint extends js.Object {
  def getSavepointId(): Integer
  def getSavepointName(): String
}

object JdbcSavepoint {
  @scala.inline
  def apply(getSavepointId: CallbackTo[Integer], getSavepointName: CallbackTo[String]): JdbcSavepoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSavepointId")(getSavepointId.toJsFn)
    __obj.updateDynamic("getSavepointName")(getSavepointName.toJsFn)
    __obj.asInstanceOf[JdbcSavepoint]
  }
}


package typingsJapgolly.sqlstring

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToSqlString extends js.Object {
  def toSqlString(): String
}

object AnonToSqlString {
  @scala.inline
  def apply(toSqlString: CallbackTo[String]): AnonToSqlString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toSqlString")(toSqlString.toJsFn)
    __obj.asInstanceOf[AnonToSqlString]
  }
}


package typingsJapgolly.toTitleCaseGouch

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def toTitleCase(): java.lang.String
}

object String {
  @scala.inline
  def apply(toTitleCase: CallbackTo[java.lang.String]): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toTitleCase")(toTitleCase.toJsFn)
    __obj.asInstanceOf[String]
  }
}


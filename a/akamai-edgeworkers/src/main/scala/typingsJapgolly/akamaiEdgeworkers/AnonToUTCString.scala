package typingsJapgolly.akamaiEdgeworkers

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToUTCString extends js.Object {
  def toUTCString(): String
}

object AnonToUTCString {
  @scala.inline
  def apply(toUTCString: CallbackTo[String]): AnonToUTCString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toUTCString")(toUTCString.toJsFn)
    __obj.asInstanceOf[AnonToUTCString]
  }
}


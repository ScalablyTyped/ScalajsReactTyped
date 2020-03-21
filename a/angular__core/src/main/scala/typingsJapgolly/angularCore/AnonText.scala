package typingsJapgolly.angularCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  def text(): js.Promise[String]
}

object AnonText {
  @scala.inline
  def apply(text: CallbackTo[js.Promise[String]]): AnonText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.asInstanceOf[AnonText]
  }
}


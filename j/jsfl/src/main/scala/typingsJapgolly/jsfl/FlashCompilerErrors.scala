package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCompilerErrors extends js.Object {
  def clear(): js.Any
  def save(): js.Any
}

object FlashCompilerErrors {
  @scala.inline
  def apply(clear: CallbackTo[js.Any], save: CallbackTo[js.Any]): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.asInstanceOf[FlashCompilerErrors]
  }
}


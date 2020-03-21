package typingsJapgolly.ckeditor

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInput extends js.Object {
  def input(): Unit
  def reset(): Unit
}

object AnonInput {
  @scala.inline
  def apply(input: Callback, reset: Callback): AnonInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[AnonInput]
  }
}


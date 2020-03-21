package typingsJapgolly.jsCaptcha.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jCaptcha extends js.Object {
  def reset(): Unit
  def validate(): Unit
}

object jCaptcha {
  @scala.inline
  def apply(reset: Callback, validate: Callback): jCaptcha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("validate")(validate.toJsFn)
    __obj.asInstanceOf[jCaptcha]
  }
}


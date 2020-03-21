package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDismiss extends js.Object {
  def dismiss(): Unit
}

object AnonDismiss {
  @scala.inline
  def apply(dismiss: Callback): AnonDismiss = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismiss")(dismiss.toJsFn)
    __obj.asInstanceOf[AnonDismiss]
  }
}


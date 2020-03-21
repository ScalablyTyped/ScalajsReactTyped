package typingsJapgolly.uikit.mod.UIkit

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitAlertElement extends js.Object {
  def close(): Unit
}

object UIkitAlertElement {
  @scala.inline
  def apply(close: Callback): UIkitAlertElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[UIkitAlertElement]
  }
}


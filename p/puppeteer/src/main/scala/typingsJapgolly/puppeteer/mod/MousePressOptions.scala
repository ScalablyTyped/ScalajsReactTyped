package typingsJapgolly.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePressOptions extends js.Object {
  /**
    * left, right, or middle.
    * @default left
    */
  var button: js.UndefOr[MouseButtons] = js.undefined
  /**
    * The number of clicks.
    * @default 1
    */
  var clickCount: js.UndefOr[Double] = js.undefined
}

object MousePressOptions {
  @scala.inline
  def apply(button: MouseButtons = null, clickCount: Int | Double = null): MousePressOptions = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (clickCount != null) __obj.updateDynamic("clickCount")(clickCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MousePressOptions]
  }
}


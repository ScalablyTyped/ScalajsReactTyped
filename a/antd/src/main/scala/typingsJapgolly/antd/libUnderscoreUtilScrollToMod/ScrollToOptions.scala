package typingsJapgolly.antd.libUnderscoreUtilScrollToMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions extends js.Object {
  /** Scroll end callback */
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  /** Animation duration, default as 450 */
  var duration: js.UndefOr[Double] = js.undefined
  /** Scroll container, default as window */
  var getContainer: js.UndefOr[js.Function0[HTMLElement | Window]] = js.undefined
}

object ScrollToOptions {
  @scala.inline
  def apply(
    callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    duration: Int | Double = null,
    getContainer: js.UndefOr[CallbackTo[HTMLElement | Window]] = js.undefined
  ): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    getContainer.foreach(p => __obj.updateDynamic("getContainer")(p.toJsFn))
    __obj.asInstanceOf[ScrollToOptions]
  }
}


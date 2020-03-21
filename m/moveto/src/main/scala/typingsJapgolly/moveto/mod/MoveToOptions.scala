package typingsJapgolly.moveto.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveToOptions extends js.Object {
  /**
    * The function to be run after scrolling complete. Target passes as the first argument
    */
  var callback: js.UndefOr[callbackType] = js.undefined
  /**
    * The container been computed and scrolled
    */
  var container: js.UndefOr[Window_ | HTMLElement] = js.undefined
  /**
    * Duration of scrolling, in milliseconds
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Ease function name
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * The tolerance of the target to be scrolled, can be negative or positive
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}

object MoveToOptions {
  @scala.inline
  def apply(
    callback: /* target */ HTMLElement | Double => Callback = null,
    container: Window_ | HTMLElement = null,
    duration: Int | Double = null,
    easing: String = null,
    tolerance: Int | Double = null
  ): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Double) => callback(t0).runNow()))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveToOptions]
  }
}


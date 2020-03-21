package typingsJapgolly.fnandoSparkline.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptions
  extends SparklineNonNativeOptions[js.Any] {
  /**
    * Set the cursor width. The default is 2.
    */
  var cursorwidth: js.UndefOr[Double] = js.undefined
  /**
    * When true, this enables the interactive mode. You don't have to set this option if you're providing a onmousemove callback.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * By setting this callback function, you'll enable the interactive mode (unless you set options.interactive to false).
    */
  var onmousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * This callback function is called every time the mouse leaves the SVG area. You can use it to hide things like tooltips.
    */
  var onmouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Set the spot radius. The default is 2.
    */
  var spotRadius: js.UndefOr[Double] = js.undefined
}

object SparklineOptions {
  @scala.inline
  def apply(
    cursorwidth: Int | Double = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    onmousemove: /* event */ MouseEvent => Callback = null,
    onmouseout: /* event */ MouseEvent => Callback = null,
    spotRadius: Int | Double = null
  ): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (cursorwidth != null) __obj.updateDynamic("cursorwidth")(cursorwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onmousemove(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onmouseout(t0).runNow()))
    if (spotRadius != null) __obj.updateDynamic("spotRadius")(spotRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineOptions]
  }
}


package typingsJapgolly.fnandoSparkline.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fnandoSparkline.mod.SparklineOptions
  - typingsJapgolly.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]
*/
trait SparklineNonNativeOptions[TEntry] extends js.Object

object SparklineNonNativeOptions {
  @scala.inline
  def SparklineOptions[TEntry](
    cursorwidth: Int | Double = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    onmousemove: /* event */ MouseEvent => Callback = null,
    onmouseout: /* event */ MouseEvent => Callback = null,
    spotRadius: Int | Double = null
  ): SparklineNonNativeOptions[TEntry] = {
    val __obj = js.Dynamic.literal()
    if (cursorwidth != null) __obj.updateDynamic("cursorwidth")(cursorwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onmousemove(t0).runNow()))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onmouseout(t0).runNow()))
    if (spotRadius != null) __obj.updateDynamic("spotRadius")(spotRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  }
  @scala.inline
  def SparklineOptionsFetch[TEntry](fetch: TEntry => CallbackTo[Double]): SparklineNonNativeOptions[TEntry] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: TEntry) => fetch(t0).runNow()))
    __obj.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  }
}


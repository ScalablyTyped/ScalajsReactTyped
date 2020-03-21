package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasOverlayProps extends BaseControlProps {
  def redraw(opts: CanvasRedrawOptions): Unit
}

object CanvasOverlayProps {
  @scala.inline
  def apply(
    redraw: CanvasRedrawOptions => Callback,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined
  ): CanvasOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redraw")(js.Any.fromFunction1((t0: typingsJapgolly.reactMapGl.mod.CanvasRedrawOptions) => redraw(t0).runNow()))
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasOverlayProps]
  }
}


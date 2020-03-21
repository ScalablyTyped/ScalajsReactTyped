package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOverlayProps extends BaseControlProps {
  var style: js.UndefOr[CSSProperties] = js.undefined
  def redraw(opts: SVGRedrawOptions): Unit
}

object SVGOverlayProps {
  @scala.inline
  def apply(
    redraw: SVGRedrawOptions => Callback,
    captureClick: js.UndefOr[Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[Boolean] = js.undefined,
    captureDrag: js.UndefOr[Boolean] = js.undefined,
    captureScroll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): SVGOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redraw")(js.Any.fromFunction1((t0: typingsJapgolly.reactMapGl.mod.SVGRedrawOptions) => redraw(t0).runNow()))
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGOverlayProps]
  }
}


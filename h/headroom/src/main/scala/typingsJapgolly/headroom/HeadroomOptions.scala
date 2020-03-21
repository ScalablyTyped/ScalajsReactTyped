package typingsJapgolly.headroom

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadroomOptions extends js.Object {
  var classes: js.UndefOr[AnonInitial] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onNotBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onNotTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scroller: js.UndefOr[Element] = js.undefined
  var tolerance: js.UndefOr[js.Any] = js.undefined
}

object HeadroomOptions {
  @scala.inline
  def apply(
    classes: AnonInitial = null,
    offset: Int | Double = null,
    onBottom: js.UndefOr[Callback] = js.undefined,
    onNotBottom: js.UndefOr[Callback] = js.undefined,
    onNotTop: js.UndefOr[Callback] = js.undefined,
    onPin: js.UndefOr[Callback] = js.undefined,
    onTop: js.UndefOr[Callback] = js.undefined,
    onUnpin: js.UndefOr[Callback] = js.undefined,
    scroller: Element = null,
    tolerance: js.Any = null
  ): HeadroomOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onBottom.foreach(p => __obj.updateDynamic("onBottom")(p.toJsFn))
    onNotBottom.foreach(p => __obj.updateDynamic("onNotBottom")(p.toJsFn))
    onNotTop.foreach(p => __obj.updateDynamic("onNotTop")(p.toJsFn))
    onPin.foreach(p => __obj.updateDynamic("onPin")(p.toJsFn))
    onTop.foreach(p => __obj.updateDynamic("onTop")(p.toJsFn))
    onUnpin.foreach(p => __obj.updateDynamic("onUnpin")(p.toJsFn))
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadroomOptions]
  }
}


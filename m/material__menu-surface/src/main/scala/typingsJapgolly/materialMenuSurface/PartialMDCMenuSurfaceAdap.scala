package typingsJapgolly.materialMenuSurface

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuDimensions
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/menu-surface.@material/menu-surface/adapter.MDCMenuSurfaceAdapter> */
trait PartialMDCMenuSurfaceAdap extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var getAnchorDimensions: js.UndefOr[js.Function0[ClientRect | Null]] = js.undefined
  var getBodyDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
  var getInnerDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
  var getWindowDimensions: js.UndefOr[js.Function0[MDCMenuDimensions]] = js.undefined
  var getWindowScroll: js.UndefOr[js.Function0[MDCMenuPoint]] = js.undefined
  var hasAnchor: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  var isElementInContainer: js.UndefOr[js.Function1[/* el */ Element, Boolean]] = js.undefined
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isRtl: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var notifyClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var notifyOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var restoreFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var saveFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var setMaxHeight: js.UndefOr[js.Function1[/* height */ String, Unit]] = js.undefined
  var setPosition: js.UndefOr[js.Function1[/* position */ PartialMDCMenuDistance, Unit]] = js.undefined
  var setTransformOrigin: js.UndefOr[js.Function1[/* origin */ String, Unit]] = js.undefined
}

object PartialMDCMenuSurfaceAdap {
  @scala.inline
  def apply(
    addClass: /* className */ String => Callback = null,
    getAnchorDimensions: js.UndefOr[CallbackTo[ClientRect | Null]] = js.undefined,
    getBodyDimensions: js.UndefOr[CallbackTo[MDCMenuDimensions]] = js.undefined,
    getInnerDimensions: js.UndefOr[CallbackTo[MDCMenuDimensions]] = js.undefined,
    getWindowDimensions: js.UndefOr[CallbackTo[MDCMenuDimensions]] = js.undefined,
    getWindowScroll: js.UndefOr[CallbackTo[MDCMenuPoint]] = js.undefined,
    hasAnchor: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    hasClass: /* className */ String => CallbackTo[Boolean] = null,
    isElementInContainer: /* el */ Element => CallbackTo[Boolean] = null,
    isFocused: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isRtl: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    notifyClose: js.UndefOr[Callback] = js.undefined,
    notifyOpen: js.UndefOr[Callback] = js.undefined,
    removeClass: /* className */ String => Callback = null,
    restoreFocus: js.UndefOr[Callback] = js.undefined,
    saveFocus: js.UndefOr[Callback] = js.undefined,
    setMaxHeight: /* height */ String => Callback = null,
    setPosition: /* position */ PartialMDCMenuDistance => Callback = null,
    setTransformOrigin: /* origin */ String => Callback = null
  ): PartialMDCMenuSurfaceAdap = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => addClass(t0).runNow()))
    getAnchorDimensions.foreach(p => __obj.updateDynamic("getAnchorDimensions")(p.toJsFn))
    getBodyDimensions.foreach(p => __obj.updateDynamic("getBodyDimensions")(p.toJsFn))
    getInnerDimensions.foreach(p => __obj.updateDynamic("getInnerDimensions")(p.toJsFn))
    getWindowDimensions.foreach(p => __obj.updateDynamic("getWindowDimensions")(p.toJsFn))
    getWindowScroll.foreach(p => __obj.updateDynamic("getWindowScroll")(p.toJsFn))
    hasAnchor.foreach(p => __obj.updateDynamic("hasAnchor")(p.toJsFn))
    if (hasClass != null) __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => hasClass(t0).runNow()))
    if (isElementInContainer != null) __obj.updateDynamic("isElementInContainer")(js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.raw.Element) => isElementInContainer(t0).runNow()))
    isFocused.foreach(p => __obj.updateDynamic("isFocused")(p.toJsFn))
    isRtl.foreach(p => __obj.updateDynamic("isRtl")(p.toJsFn))
    notifyClose.foreach(p => __obj.updateDynamic("notifyClose")(p.toJsFn))
    notifyOpen.foreach(p => __obj.updateDynamic("notifyOpen")(p.toJsFn))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => removeClass(t0).runNow()))
    restoreFocus.foreach(p => __obj.updateDynamic("restoreFocus")(p.toJsFn))
    saveFocus.foreach(p => __obj.updateDynamic("saveFocus")(p.toJsFn))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1((t0: /* height */ java.lang.String) => setMaxHeight(t0).runNow()))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: /* position */ typingsJapgolly.materialMenuSurface.PartialMDCMenuDistance) => setPosition(t0).runNow()))
    if (setTransformOrigin != null) __obj.updateDynamic("setTransformOrigin")(js.Any.fromFunction1((t0: /* origin */ java.lang.String) => setTransformOrigin(t0).runNow()))
    __obj.asInstanceOf[PartialMDCMenuSurfaceAdap]
  }
}


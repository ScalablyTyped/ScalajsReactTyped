package typingsJapgolly.materialTabScroller

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-scroller.@material/tab-scroller/adapter.MDCTabScrollerAdapter> */
trait PartialMDCTabScrollerAdap extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var addScrollAreaClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var computeHorizontalScrollbarHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  var computeScrollAreaClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
  var computeScrollContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
  var eventTargetMatchesSelector: js.UndefOr[js.Function2[/* evtTarget */ EventTarget, /* selector */ String, Boolean]] = js.undefined
  var getScrollAreaOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollAreaScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollContentStyleValue: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setScrollAreaScrollLeft: js.UndefOr[js.Function1[/* scrollLeft */ Double, Unit]] = js.undefined
  var setScrollAreaStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
  var setScrollContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
}

object PartialMDCTabScrollerAdap {
  @scala.inline
  def apply(
    addClass: /* className */ String => Callback = null,
    addScrollAreaClass: /* className */ String => Callback = null,
    computeHorizontalScrollbarHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    computeScrollAreaClientRect: js.UndefOr[CallbackTo[ClientRect]] = js.undefined,
    computeScrollContentClientRect: js.UndefOr[CallbackTo[ClientRect]] = js.undefined,
    eventTargetMatchesSelector: (/* evtTarget */ EventTarget, /* selector */ String) => CallbackTo[Boolean] = null,
    getScrollAreaOffsetWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollAreaScrollLeft: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollContentOffsetWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollContentStyleValue: /* propertyName */ String => CallbackTo[String] = null,
    removeClass: /* className */ String => Callback = null,
    setScrollAreaScrollLeft: /* scrollLeft */ Double => Callback = null,
    setScrollAreaStyleProperty: (/* propName */ String, /* value */ String) => Callback = null,
    setScrollContentStyleProperty: (/* propName */ String, /* value */ String) => Callback = null
  ): PartialMDCTabScrollerAdap = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => addClass(t0).runNow()))
    if (addScrollAreaClass != null) __obj.updateDynamic("addScrollAreaClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => addScrollAreaClass(t0).runNow()))
    computeHorizontalScrollbarHeight.foreach(p => __obj.updateDynamic("computeHorizontalScrollbarHeight")(p.toJsFn))
    computeScrollAreaClientRect.foreach(p => __obj.updateDynamic("computeScrollAreaClientRect")(p.toJsFn))
    computeScrollContentClientRect.foreach(p => __obj.updateDynamic("computeScrollContentClientRect")(p.toJsFn))
    if (eventTargetMatchesSelector != null) __obj.updateDynamic("eventTargetMatchesSelector")(js.Any.fromFunction2((t0: /* evtTarget */ org.scalajs.dom.raw.EventTarget, t1: /* selector */ java.lang.String) => eventTargetMatchesSelector(t0, t1).runNow()))
    getScrollAreaOffsetWidth.foreach(p => __obj.updateDynamic("getScrollAreaOffsetWidth")(p.toJsFn))
    getScrollAreaScrollLeft.foreach(p => __obj.updateDynamic("getScrollAreaScrollLeft")(p.toJsFn))
    getScrollContentOffsetWidth.foreach(p => __obj.updateDynamic("getScrollContentOffsetWidth")(p.toJsFn))
    if (getScrollContentStyleValue != null) __obj.updateDynamic("getScrollContentStyleValue")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => getScrollContentStyleValue(t0).runNow()))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: /* className */ java.lang.String) => removeClass(t0).runNow()))
    if (setScrollAreaScrollLeft != null) __obj.updateDynamic("setScrollAreaScrollLeft")(js.Any.fromFunction1((t0: /* scrollLeft */ scala.Double) => setScrollAreaScrollLeft(t0).runNow()))
    if (setScrollAreaStyleProperty != null) __obj.updateDynamic("setScrollAreaStyleProperty")(js.Any.fromFunction2((t0: /* propName */ java.lang.String, t1: /* value */ java.lang.String) => setScrollAreaStyleProperty(t0, t1).runNow()))
    if (setScrollContentStyleProperty != null) __obj.updateDynamic("setScrollContentStyleProperty")(js.Any.fromFunction2((t0: /* propName */ java.lang.String, t1: /* value */ java.lang.String) => setScrollContentStyleProperty(t0, t1).runNow()))
    __obj.asInstanceOf[PartialMDCTabScrollerAdap]
  }
}


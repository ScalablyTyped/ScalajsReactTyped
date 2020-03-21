package typingsJapgolly.materialTabBar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-bar.@material/tab-bar/adapter.MDCTabBarAdapter> */
trait PartialMDCTabBarAdapter extends js.Object {
  var activateTabAtIndex: js.UndefOr[js.Function2[/* index */ Double, /* clientRect */ js.UndefOr[ClientRect], Unit]] = js.undefined
  var deactivateTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var focusTabAtIndex: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var getFocusedTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  var getIndexOfTabById: js.UndefOr[js.Function1[/* id */ String, Double]] = js.undefined
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getPreviousActiveTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollContentWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.undefined
  var getTabDimensionsAtIndex: js.UndefOr[
    js.Function1[
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MDCTabDimensions */ _
    ]
  ] = js.undefined
  var getTabIndicatorClientRectAtIndex: js.UndefOr[js.Function1[/* index */ Double, ClientRect]] = js.undefined
  var getTabListLength: js.UndefOr[js.Function0[Double]] = js.undefined
  var incrementScroll: js.UndefOr[js.Function1[/* scrollXIncrement */ Double, Unit]] = js.undefined
  var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var notifyTabActivated: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var scrollTo: js.UndefOr[js.Function1[/* scrollX */ Double, Unit]] = js.undefined
  var setActiveTab: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
}

object PartialMDCTabBarAdapter {
  @scala.inline
  def apply(
    activateTabAtIndex: (/* index */ Double, /* clientRect */ js.UndefOr[ClientRect]) => Callback = null,
    deactivateTabAtIndex: /* index */ Double => Callback = null,
    focusTabAtIndex: /* index */ Double => Callback = null,
    getFocusedTabIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getIndexOfTabById: /* id */ String => CallbackTo[Double] = null,
    getOffsetWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getPreviousActiveTabIndex: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollContentWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScrollPosition: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getTabDimensionsAtIndex: /* index */ Double => CallbackTo[js.Any] = null,
    getTabIndicatorClientRectAtIndex: /* index */ Double => CallbackTo[ClientRect] = null,
    getTabListLength: js.UndefOr[CallbackTo[Double]] = js.undefined,
    incrementScroll: /* scrollXIncrement */ Double => Callback = null,
    isRTL: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    notifyTabActivated: /* index */ Double => Callback = null,
    scrollTo: /* scrollX */ Double => Callback = null,
    setActiveTab: /* index */ Double => Callback = null
  ): PartialMDCTabBarAdapter = {
    val __obj = js.Dynamic.literal()
    if (activateTabAtIndex != null) __obj.updateDynamic("activateTabAtIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* clientRect */ js.UndefOr[org.scalajs.dom.raw.ClientRect]) => activateTabAtIndex(t0, t1).runNow()))
    if (deactivateTabAtIndex != null) __obj.updateDynamic("deactivateTabAtIndex")(js.Any.fromFunction1((t0: /* index */ scala.Double) => deactivateTabAtIndex(t0).runNow()))
    if (focusTabAtIndex != null) __obj.updateDynamic("focusTabAtIndex")(js.Any.fromFunction1((t0: /* index */ scala.Double) => focusTabAtIndex(t0).runNow()))
    getFocusedTabIndex.foreach(p => __obj.updateDynamic("getFocusedTabIndex")(p.toJsFn))
    if (getIndexOfTabById != null) __obj.updateDynamic("getIndexOfTabById")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => getIndexOfTabById(t0).runNow()))
    getOffsetWidth.foreach(p => __obj.updateDynamic("getOffsetWidth")(p.toJsFn))
    getPreviousActiveTabIndex.foreach(p => __obj.updateDynamic("getPreviousActiveTabIndex")(p.toJsFn))
    getScrollContentWidth.foreach(p => __obj.updateDynamic("getScrollContentWidth")(p.toJsFn))
    getScrollPosition.foreach(p => __obj.updateDynamic("getScrollPosition")(p.toJsFn))
    if (getTabDimensionsAtIndex != null) __obj.updateDynamic("getTabDimensionsAtIndex")(js.Any.fromFunction1((t0: /* index */ scala.Double) => getTabDimensionsAtIndex(t0).runNow()))
    if (getTabIndicatorClientRectAtIndex != null) __obj.updateDynamic("getTabIndicatorClientRectAtIndex")(js.Any.fromFunction1((t0: /* index */ scala.Double) => getTabIndicatorClientRectAtIndex(t0).runNow()))
    getTabListLength.foreach(p => __obj.updateDynamic("getTabListLength")(p.toJsFn))
    if (incrementScroll != null) __obj.updateDynamic("incrementScroll")(js.Any.fromFunction1((t0: /* scrollXIncrement */ scala.Double) => incrementScroll(t0).runNow()))
    isRTL.foreach(p => __obj.updateDynamic("isRTL")(p.toJsFn))
    if (notifyTabActivated != null) __obj.updateDynamic("notifyTabActivated")(js.Any.fromFunction1((t0: /* index */ scala.Double) => notifyTabActivated(t0).runNow()))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1((t0: /* scrollX */ scala.Double) => scrollTo(t0).runNow()))
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(js.Any.fromFunction1((t0: /* index */ scala.Double) => setActiveTab(t0).runNow()))
    __obj.asInstanceOf[PartialMDCTabBarAdapter]
  }
}


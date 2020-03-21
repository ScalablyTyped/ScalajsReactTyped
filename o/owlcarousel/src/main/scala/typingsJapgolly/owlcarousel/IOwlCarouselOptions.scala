package typingsJapgolly.owlcarousel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOwlCarouselOptions extends js.Object {
  var addClassActive: js.UndefOr[Boolean] = js.undefined
  var afterAction: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterLazyLoad: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var afterUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[js.Any] = js.undefined
  var baseClass: js.UndefOr[String] = js.undefined
  var beforeInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var beforeMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  // callbacks
  var beforeUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var dragBeforeAnimFinish: js.UndefOr[Boolean] = js.undefined
  // options
  var items: js.UndefOr[Double] = js.undefined
  var itemsCustom: js.UndefOr[js.Any] = js.undefined
  var itemsDesktop: js.UndefOr[js.Array[Double]] = js.undefined
  var itemsDesktopSmall: js.UndefOr[js.Array[Double]] = js.undefined
  var itemsMobile: js.UndefOr[js.Array[Double]] = js.undefined
  var itemsScaleUp: js.UndefOr[Boolean] = js.undefined
  var itemsTablet: js.UndefOr[js.Array[Double]] = js.undefined
  var itemsTabletSmall: js.UndefOr[js.Any] = js.undefined
  var jsonPath: js.UndefOr[js.Any] = js.undefined
  var jsonSuccess: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var lazyEffect: js.UndefOr[js.Any] = js.undefined
  var lazyFollow: js.UndefOr[Boolean] = js.undefined
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mouseDrag: js.UndefOr[Boolean] = js.undefined
  var nav: js.UndefOr[Boolean] = js.undefined
  var navigation: js.UndefOr[Boolean] = js.undefined
  var navigationText: js.UndefOr[js.Any] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var paginationNumbers: js.UndefOr[Boolean] = js.undefined
  var paginationSpeed: js.UndefOr[Double] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var responsiveBaseWidth: js.UndefOr[JQuery | String] = js.undefined
  var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
  var rewindNav: js.UndefOr[Boolean] = js.undefined
  var rewindSpeed: js.UndefOr[Double] = js.undefined
  var scrollPerPage: js.UndefOr[Boolean] = js.undefined
  var singleItem: js.UndefOr[Boolean] = js.undefined
  var slideSpeed: js.UndefOr[Double] = js.undefined
  var startDragging: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.undefined
  var stopOnHover: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var touchDrag: js.UndefOr[Boolean] = js.undefined
  var transitionStyle: js.UndefOr[js.Any] = js.undefined
}

object IOwlCarouselOptions {
  @scala.inline
  def apply(
    addClassActive: js.UndefOr[Boolean] = js.undefined,
    afterAction: /* params */ js.UndefOr[js.Any] => Callback = null,
    afterInit: /* params */ js.UndefOr[js.Any] => Callback = null,
    afterLazyLoad: /* params */ js.UndefOr[js.Any] => Callback = null,
    afterMove: /* params */ js.UndefOr[js.Any] => Callback = null,
    afterUpdate: /* params */ js.UndefOr[js.Any] => Callback = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.Any = null,
    baseClass: String = null,
    beforeInit: /* params */ js.UndefOr[js.Any] => Callback = null,
    beforeMove: /* params */ js.UndefOr[js.Any] => Callback = null,
    beforeUpdate: /* params */ js.UndefOr[js.Any] => Callback = null,
    dragBeforeAnimFinish: js.UndefOr[Boolean] = js.undefined,
    items: Int | Double = null,
    itemsCustom: js.Any = null,
    itemsDesktop: js.Array[Double] = null,
    itemsDesktopSmall: js.Array[Double] = null,
    itemsMobile: js.Array[Double] = null,
    itemsScaleUp: js.UndefOr[Boolean] = js.undefined,
    itemsTablet: js.Array[Double] = null,
    itemsTabletSmall: js.Any = null,
    jsonPath: js.Any = null,
    jsonSuccess: /* data */ js.Any => Callback = null,
    lazyEffect: js.Any = null,
    lazyFollow: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    navigation: js.UndefOr[Boolean] = js.undefined,
    navigationText: js.Any = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    paginationNumbers: js.UndefOr[Boolean] = js.undefined,
    paginationSpeed: Int | Double = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    responsiveBaseWidth: JQuery | String = null,
    responsiveRefreshRate: Int | Double = null,
    rewindNav: js.UndefOr[Boolean] = js.undefined,
    rewindSpeed: Int | Double = null,
    scrollPerPage: js.UndefOr[Boolean] = js.undefined,
    singleItem: js.UndefOr[Boolean] = js.undefined,
    slideSpeed: Int | Double = null,
    startDragging: /* params */ js.UndefOr[js.Any] => Callback = null,
    stopOnHover: js.UndefOr[Boolean] = js.undefined,
    theme: String = null,
    touchDrag: js.UndefOr[Boolean] = js.undefined,
    transitionStyle: js.Any = null
  ): IOwlCarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addClassActive)) __obj.updateDynamic("addClassActive")(addClassActive.asInstanceOf[js.Any])
    if (afterAction != null) __obj.updateDynamic("afterAction")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => afterAction(t0).runNow()))
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => afterInit(t0).runNow()))
    if (afterLazyLoad != null) __obj.updateDynamic("afterLazyLoad")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => afterLazyLoad(t0).runNow()))
    if (afterMove != null) __obj.updateDynamic("afterMove")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => afterMove(t0).runNow()))
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => afterUpdate(t0).runNow()))
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => beforeInit(t0).runNow()))
    if (beforeMove != null) __obj.updateDynamic("beforeMove")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => beforeMove(t0).runNow()))
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => beforeUpdate(t0).runNow()))
    if (!js.isUndefined(dragBeforeAnimFinish)) __obj.updateDynamic("dragBeforeAnimFinish")(dragBeforeAnimFinish.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsCustom != null) __obj.updateDynamic("itemsCustom")(itemsCustom.asInstanceOf[js.Any])
    if (itemsDesktop != null) __obj.updateDynamic("itemsDesktop")(itemsDesktop.asInstanceOf[js.Any])
    if (itemsDesktopSmall != null) __obj.updateDynamic("itemsDesktopSmall")(itemsDesktopSmall.asInstanceOf[js.Any])
    if (itemsMobile != null) __obj.updateDynamic("itemsMobile")(itemsMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsScaleUp)) __obj.updateDynamic("itemsScaleUp")(itemsScaleUp.asInstanceOf[js.Any])
    if (itemsTablet != null) __obj.updateDynamic("itemsTablet")(itemsTablet.asInstanceOf[js.Any])
    if (itemsTabletSmall != null) __obj.updateDynamic("itemsTabletSmall")(itemsTabletSmall.asInstanceOf[js.Any])
    if (jsonPath != null) __obj.updateDynamic("jsonPath")(jsonPath.asInstanceOf[js.Any])
    if (jsonSuccess != null) __obj.updateDynamic("jsonSuccess")(js.Any.fromFunction1((t0: /* data */ js.Any) => jsonSuccess(t0).runNow()))
    if (lazyEffect != null) __obj.updateDynamic("lazyEffect")(lazyEffect.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyFollow)) __obj.updateDynamic("lazyFollow")(lazyFollow.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigationText != null) __obj.updateDynamic("navigationText")(navigationText.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationNumbers)) __obj.updateDynamic("paginationNumbers")(paginationNumbers.asInstanceOf[js.Any])
    if (paginationSpeed != null) __obj.updateDynamic("paginationSpeed")(paginationSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (responsiveBaseWidth != null) __obj.updateDynamic("responsiveBaseWidth")(responsiveBaseWidth.asInstanceOf[js.Any])
    if (responsiveRefreshRate != null) __obj.updateDynamic("responsiveRefreshRate")(responsiveRefreshRate.asInstanceOf[js.Any])
    if (!js.isUndefined(rewindNav)) __obj.updateDynamic("rewindNav")(rewindNav.asInstanceOf[js.Any])
    if (rewindSpeed != null) __obj.updateDynamic("rewindSpeed")(rewindSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPerPage)) __obj.updateDynamic("scrollPerPage")(scrollPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(singleItem)) __obj.updateDynamic("singleItem")(singleItem.asInstanceOf[js.Any])
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    if (startDragging != null) __obj.updateDynamic("startDragging")(js.Any.fromFunction1((t0: /* params */ js.UndefOr[js.Any]) => startDragging(t0).runNow()))
    if (!js.isUndefined(stopOnHover)) __obj.updateDynamic("stopOnHover")(stopOnHover.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(touchDrag)) __obj.updateDynamic("touchDrag")(touchDrag.asInstanceOf[js.Any])
    if (transitionStyle != null) __obj.updateDynamic("transitionStyle")(transitionStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOwlCarouselOptions]
  }
}


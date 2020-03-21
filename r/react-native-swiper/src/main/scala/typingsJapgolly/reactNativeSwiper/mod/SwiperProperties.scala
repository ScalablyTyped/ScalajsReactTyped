package typingsJapgolly.reactNativeSwiper.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiperProperties extends Props[Swiper] {
  var activeDot: js.UndefOr[Element] = js.undefined
  var activeDotColor: js.UndefOr[String] = js.undefined
  var activeDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplayDirection: js.UndefOr[Boolean] = js.undefined
  var autoplayTimeout: js.UndefOr[Double] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var buttonWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dot: js.UndefOr[Element] = js.undefined
  var dotColor: js.UndefOr[String] = js.undefined
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var loadMinimal: js.UndefOr[Boolean] = js.undefined
  var loadMinimalLoader: js.UndefOr[Element] = js.undefined
  var loadMinimalSize: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var nextButton: js.UndefOr[Element] = js.undefined
  var onMomentumScrollEnd: js.UndefOr[
    js.Function3[
      ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.undefined
  var onResponderRelease: js.UndefOr[
    js.Function3[
      ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.undefined
  var onScrollBeginDrag: js.UndefOr[
    js.Function3[
      ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.undefined
  var onTouchEnd: js.UndefOr[
    js.Function3[
      ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.undefined
  var onTouchStart: js.UndefOr[
    js.Function3[
      ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.undefined
  var onTouchStartCapture: js.UndefOr[
    js.Function3[
      ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], 
      /* state */ SwiperState, 
      /* context */ Swiper, 
      Unit
    ]
  ] = js.undefined
  var paginationStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var pagingEnabled: js.UndefOr[Boolean] = js.undefined
  var prevButton: js.UndefOr[Element] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var renderPagination: js.UndefOr[
    js.Function3[/* index */ Double, /* total */ Double, /* thisObject */ Swiper, Element]
  ] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  var showsButtons: js.UndefOr[Boolean] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var showsPagination: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SwiperProperties {
  @scala.inline
  def apply(
    activeDot: VdomElement = null,
    activeDotColor: String = null,
    activeDotStyle: StyleProp[ViewStyle] = null,
    automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayDirection: js.UndefOr[Boolean] = js.undefined,
    autoplayTimeout: Int | Double = null,
    bounces: js.UndefOr[Boolean] = js.undefined,
    buttonWrapperStyle: StyleProp[ViewStyle] = null,
    children: VdomNode = null,
    dot: VdomElement = null,
    dotColor: String = null,
    dotStyle: StyleProp[ViewStyle] = null,
    height: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    key: Key = null,
    loadMinimal: js.UndefOr[Boolean] = js.undefined,
    loadMinimalLoader: VdomElement = null,
    loadMinimalSize: Int | Double = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    nextButton: VdomElement = null,
    onMomentumScrollEnd: (ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], /* state */ SwiperState, /* context */ Swiper) => Callback = null,
    onResponderRelease: (ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], /* state */ SwiperState, /* context */ Swiper) => Callback = null,
    onScrollBeginDrag: (ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], /* state */ SwiperState, /* context */ Swiper) => Callback = null,
    onTouchEnd: (ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], /* state */ SwiperState, /* context */ Swiper) => Callback = null,
    onTouchStart: (ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], /* state */ SwiperState, /* context */ Swiper) => Callback = null,
    onTouchStartCapture: (ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element], /* state */ SwiperState, /* context */ Swiper) => Callback = null,
    paginationStyle: StyleProp[ViewStyle] = null,
    pagingEnabled: js.UndefOr[Boolean] = js.undefined,
    prevButton: VdomElement = null,
    ref: LegacyRef[Swiper] = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderPagination: (/* index */ Double, /* total */ Double, /* thisObject */ Swiper) => CallbackTo[Element] = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    showsButtons: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsPagination: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    width: Int | Double = null
  ): SwiperProperties = {
    val __obj = js.Dynamic.literal()
    if (activeDot != null) __obj.updateDynamic("activeDot")(activeDot.rawElement.asInstanceOf[js.Any])
    if (activeDotColor != null) __obj.updateDynamic("activeDotColor")(activeDotColor.asInstanceOf[js.Any])
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayDirection)) __obj.updateDynamic("autoplayDirection")(autoplayDirection.asInstanceOf[js.Any])
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (buttonWrapperStyle != null) __obj.updateDynamic("buttonWrapperStyle")(buttonWrapperStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (dot != null) __obj.updateDynamic("dot")(dot.rawElement.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMinimal)) __obj.updateDynamic("loadMinimal")(loadMinimal.asInstanceOf[js.Any])
    if (loadMinimalLoader != null) __obj.updateDynamic("loadMinimalLoader")(loadMinimalLoader.rawElement.asInstanceOf[js.Any])
    if (loadMinimalSize != null) __obj.updateDynamic("loadMinimalSize")(loadMinimalSize.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.rawElement.asInstanceOf[js.Any])
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.reactNativeSwiper.mod.SwiperState, t2: /* context */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => onMomentumScrollEnd(t0, t1, t2).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.reactNativeSwiper.mod.SwiperState, t2: /* context */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => onResponderRelease(t0, t1, t2).runNow()))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.reactNativeSwiper.mod.SwiperState, t2: /* context */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => onScrollBeginDrag(t0, t1, t2).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.reactNativeSwiper.mod.SwiperState, t2: /* context */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => onTouchEnd(t0, t1, t2).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.reactNativeSwiper.mod.SwiperState, t2: /* context */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => onTouchStart(t0, t1, t2).runNow()))
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(js.Any.fromFunction3((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* state */ typingsJapgolly.reactNativeSwiper.mod.SwiperState, t2: /* context */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => onTouchStartCapture(t0, t1, t2).runNow()))
    if (paginationStyle != null) __obj.updateDynamic("paginationStyle")(paginationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled.asInstanceOf[js.Any])
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.rawElement.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderPagination != null) __obj.updateDynamic("renderPagination")(js.Any.fromFunction3((t0: /* index */ scala.Double, t1: /* total */ scala.Double, t2: /* thisObject */ typingsJapgolly.reactNativeSwiper.mod.Swiper) => renderPagination(t0, t1, t2).runNow()))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(showsButtons)) __obj.updateDynamic("showsButtons")(showsButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsPagination)) __obj.updateDynamic("showsPagination")(showsPagination.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperProperties]
  }
}


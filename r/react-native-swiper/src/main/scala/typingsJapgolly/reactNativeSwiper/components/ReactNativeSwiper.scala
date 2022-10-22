package typingsJapgolly.reactNativeSwiper.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.anon.AutoscrollToTopThreshold
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NativeScrollEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.PointProp
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeSwiper.mod.Swiper
import typingsJapgolly.reactNativeSwiper.mod.SwiperInternals
import typingsJapgolly.reactNativeSwiper.mod.SwiperProps
import typingsJapgolly.reactNativeSwiper.mod.default
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.`box-none`
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.`box-only`
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.`no-hide-descendants`
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.`on-drag`
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.always
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.assertive
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.auto
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.automatic
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.black
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.center
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.end
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.fast
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.handled
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.interactive
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.never
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.no
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.none
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.normal
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.polite
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.scrollableAxes
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.start
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.white
import typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSwiper {
  
  @JSImport("react-native-swiper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def StickyHeaderComponent(value: ComponentType[Any]): this.type = set("StickyHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value*))
    
    inline def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledBy(value: String | js.Array[String]): this.type = set("accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def accessibilityLabelledByVarargs(value: String*): this.type = set("accessibilityLabelledBy", js.Array(value*))
    
    inline def accessibilityLanguage(value: String): this.type = set("accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    inline def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    
    inline def activeDot(value: VdomNode): this.type = set("activeDot", value.rawNode.asInstanceOf[js.Any])
    
    inline def activeDotColor(value: String): this.type = set("activeDotColor", value.asInstanceOf[js.Any])
    
    inline def activeDotNull: this.type = set("activeDot", null)
    
    inline def activeDotStyle(value: StyleProp[ViewStyle]): this.type = set("activeDotStyle", value.asInstanceOf[js.Any])
    
    inline def activeDotStyleNull: this.type = set("activeDotStyle", null)
    
    inline def activeDotVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("activeDot", js.Array(value*))
    
    inline def activeDotVdomElement(value: VdomElement): this.type = set("activeDot", value.rawElement.asInstanceOf[js.Any])
    
    inline def alwaysBounceHorizontal(value: Boolean): this.type = set("alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    inline def alwaysBounceVertical(value: Boolean): this.type = set("alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    inline def automaticallyAdjustContentInsets(value: Boolean): this.type = set("automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    inline def automaticallyAdjustKeyboardInsets(value: Boolean): this.type = set("automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
    
    inline def automaticallyAdjustsScrollIndicatorInsets(value: Boolean): this.type = set("automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def autoplayDirection(value: Boolean): this.type = set("autoplayDirection", value.asInstanceOf[js.Any])
    
    inline def autoplayTimeout(value: Double): this.type = set("autoplayTimeout", value.asInstanceOf[js.Any])
    
    inline def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    inline def bouncesZoom(value: Boolean): this.type = set("bouncesZoom", value.asInstanceOf[js.Any])
    
    inline def buttonWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("buttonWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def buttonWrapperStyleNull: this.type = set("buttonWrapperStyle", null)
    
    inline def canCancelContentTouches(value: Boolean): this.type = set("canCancelContentTouches", value.asInstanceOf[js.Any])
    
    inline def centerContent(value: Boolean): this.type = set("centerContent", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    inline def contentInset(value: Insets): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    inline def contentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): this.type = set("contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    inline def contentOffset(value: PointProp): this.type = set("contentOffset", value.asInstanceOf[js.Any])
    
    inline def decelerationRate(value: fast | normal | Double): this.type = set("decelerationRate", value.asInstanceOf[js.Any])
    
    inline def directionalLockEnabled(value: Boolean): this.type = set("directionalLockEnabled", value.asInstanceOf[js.Any])
    
    inline def disableIntervalMomentum(value: Boolean): this.type = set("disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    inline def disableScrollViewPanResponder(value: Boolean): this.type = set("disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    inline def dot(value: VdomNode): this.type = set("dot", value.rawNode.asInstanceOf[js.Any])
    
    inline def dotColor(value: String): this.type = set("dotColor", value.asInstanceOf[js.Any])
    
    inline def dotNull: this.type = set("dot", null)
    
    inline def dotStyle(value: StyleProp[ViewStyle]): this.type = set("dotStyle", value.asInstanceOf[js.Any])
    
    inline def dotStyleNull: this.type = set("dotStyle", null)
    
    inline def dotVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dot", js.Array(value*))
    
    inline def dotVdomElement(value: VdomElement): this.type = set("dot", value.rawElement.asInstanceOf[js.Any])
    
    inline def endFillColor(value: ColorValue): this.type = set("endFillColor", value.asInstanceOf[js.Any])
    
    inline def fadingEdgeLength(value: Double): this.type = set("fadingEdgeLength", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def indicatorStyle(value: typingsJapgolly.reactNativeSwiper.reactNativeSwiperStrings.default | black | white): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def invertStickyHeaders(value: Boolean): this.type = set("invertStickyHeaders", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def keyboardDismissMode(value: none | interactive | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def keyboardShouldPersistTaps(value: Boolean | always | never | handled): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def loadMinimal(value: Boolean): this.type = set("loadMinimal", value.asInstanceOf[js.Any])
    
    inline def loadMinimalLoader(value: VdomNode): this.type = set("loadMinimalLoader", value.rawNode.asInstanceOf[js.Any])
    
    inline def loadMinimalLoaderNull: this.type = set("loadMinimalLoader", null)
    
    inline def loadMinimalLoaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loadMinimalLoader", js.Array(value*))
    
    inline def loadMinimalLoaderVdomElement(value: VdomElement): this.type = set("loadMinimalLoader", value.rawElement.asInstanceOf[js.Any])
    
    inline def loadMinimalSize(value: Double): this.type = set("loadMinimalSize", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def maintainVisibleContentPosition(value: AutoscrollToTopThreshold): this.type = set("maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    inline def maintainVisibleContentPositionNull: this.type = set("maintainVisibleContentPosition", null)
    
    inline def maximumZoomScale(value: Double): this.type = set("maximumZoomScale", value.asInstanceOf[js.Any])
    
    inline def minimumZoomScale(value: Double): this.type = set("minimumZoomScale", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def nestedScrollEnabled(value: Boolean): this.type = set("nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def nextButton(value: VdomNode): this.type = set("nextButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def nextButtonNull: this.type = set("nextButton", null)
    
    inline def nextButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextButton", js.Array(value*))
    
    inline def nextButtonVdomElement(value: VdomElement): this.type = set("nextButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onContentSizeChange(value: (/* w */ Double, /* h */ Double) => Callback): this.type = set("onContentSizeChange", js.Any.fromFunction2((t0: /* w */ Double, t1: /* h */ Double) => (value(t0, t1)).runNow()))
    
    inline def onIndexChanged(value: /* index */ Double => Callback): this.type = set("onIndexChanged", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): this.type = set("onMomentumScrollBegin", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def onMomentumScrollEnd(
      value: (/* e */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperInternals, /* swiper */ Swiper) => Callback
    ): this.type = set("onMomentumScrollEnd", js.Any.fromFunction3((t0: /* e */ NativeSyntheticEvent[NativeScrollEvent], t1: /* state */ SwiperInternals, t2: /* swiper */ Swiper) => (value(t0, t1, t2)).runNow()))
    
    inline def onMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPointerCancel(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDown(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnter(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeave(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMove(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUp(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: /* event */ PointerEvent => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def onResponderEnd(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderGrant(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderReject(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderRelease(value: Any): this.type = set("onResponderRelease", value.asInstanceOf[js.Any])
    
    inline def onResponderStart(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: /* event */ GestureResponderEvent => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def onScrollAnimationEnd(value: Callback): this.type = set("onScrollAnimationEnd", value.toJsFn)
    
    inline def onScrollBeginDrag(
      value: (/* e */ NativeSyntheticEvent[NativeScrollEvent], /* state */ SwiperInternals, /* swiper */ Swiper) => Callback
    ): this.type = set("onScrollBeginDrag", js.Any.fromFunction3((t0: /* e */ NativeSyntheticEvent[NativeScrollEvent], t1: /* state */ SwiperInternals, t2: /* swiper */ Swiper) => (value(t0, t1, t2)).runNow()))
    
    inline def onScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): this.type = set("onScrollEndDrag", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def onScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): this.type = set("onScrollToTop", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def onStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTouchCancel(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchEnd(value: Any): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def onTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchMove(value: /* event */ GestureResponderEvent => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onTouchStart(value: Any): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    inline def onTouchStartCapture(value: Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    inline def overScrollMode(value: auto | always | never): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
    
    inline def paginationStyle(value: StyleProp[ViewStyle]): this.type = set("paginationStyle", value.asInstanceOf[js.Any])
    
    inline def paginationStyleNull: this.type = set("paginationStyle", null)
    
    inline def pagingEnabled(value: Boolean): this.type = set("pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def persistentScrollbar(value: Boolean): this.type = set("persistentScrollbar", value.asInstanceOf[js.Any])
    
    inline def pinchGestureEnabled(value: Boolean): this.type = set("pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def prevButton(value: VdomNode): this.type = set("prevButton", value.rawNode.asInstanceOf[js.Any])
    
    inline def prevButtonNull: this.type = set("prevButton", null)
    
    inline def prevButtonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prevButton", js.Array(value*))
    
    inline def prevButtonVdomElement(value: VdomElement): this.type = set("prevButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def refreshControl(value: VdomElement): this.type = set("refreshControl", value.rawElement.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderPagination(value: (/* index */ Double, /* total */ Double, /* swiper */ Swiper) => Node): this.type = set("renderPagination", js.Any.fromFunction3(value))
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def scrollEventThrottle(value: Double): this.type = set("scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def scrollIndicatorInsets(value: Insets): this.type = set("scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def scrollPerfTag(value: String): this.type = set("scrollPerfTag", value.asInstanceOf[js.Any])
    
    inline def scrollToOverflowEnabled(value: Boolean): this.type = set("scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    inline def scrollsToTop(value: Boolean): this.type = set("scrollsToTop", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def showsButtons(value: Boolean): this.type = set("showsButtons", value.asInstanceOf[js.Any])
    
    inline def showsHorizontalScrollIndicator(value: Boolean): this.type = set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def showsPagination(value: Boolean): this.type = set("showsPagination", value.asInstanceOf[js.Any])
    
    inline def showsVerticalScrollIndicator(value: Boolean): this.type = set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def snapToAlignment(value: start | center | end): this.type = set("snapToAlignment", value.asInstanceOf[js.Any])
    
    inline def snapToEnd(value: Boolean): this.type = set("snapToEnd", value.asInstanceOf[js.Any])
    
    inline def snapToInterval(value: Double): this.type = set("snapToInterval", value.asInstanceOf[js.Any])
    
    inline def snapToOffsets(value: js.Array[Double]): this.type = set("snapToOffsets", value.asInstanceOf[js.Any])
    
    inline def snapToOffsetsVarargs(value: Double*): this.type = set("snapToOffsets", js.Array(value*))
    
    inline def snapToStart(value: Boolean): this.type = set("snapToStart", value.asInstanceOf[js.Any])
    
    inline def stickyHeaderHiddenOnScroll(value: Boolean): this.type = set("stickyHeaderHiddenOnScroll", value.asInstanceOf[js.Any])
    
    inline def stickyHeaderIndices(value: js.Array[Double]): this.type = set("stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    inline def stickyHeaderIndicesVarargs(value: Double*): this.type = set("stickyHeaderIndices", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def zoomScale(value: Double): this.type = set("zoomScale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSwiper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwiperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

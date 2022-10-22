package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.anon.AutoscrollToTopThreshold
import typingsJapgolly.reactNative.anon.AverageItemLength
import typingsJapgolly.reactNative.anon.Changed
import typingsJapgolly.reactNative.anon.DistanceFromEnd
import typingsJapgolly.reactNative.anon.Length
import typingsJapgolly.reactNative.anon.Section
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.PointProp
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.SectionListData
import typingsJapgolly.reactNative.mod.SectionListProps
import typingsJapgolly.reactNative.mod.SectionListRenderItemInfo
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.mod.ViewabilityConfig
import typingsJapgolly.reactNative.mod.ViewabilityConfigCallbackPair
import typingsJapgolly.reactNative.mod.ViewabilityConfigCallbackPairs
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.`on-drag`
import typingsJapgolly.reactNative.reactNativeStrings.always
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.automatic
import typingsJapgolly.reactNative.reactNativeStrings.black
import typingsJapgolly.reactNative.reactNativeStrings.center
import typingsJapgolly.reactNative.reactNativeStrings.default
import typingsJapgolly.reactNative.reactNativeStrings.end
import typingsJapgolly.reactNative.reactNativeStrings.fast
import typingsJapgolly.reactNative.reactNativeStrings.handled
import typingsJapgolly.reactNative.reactNativeStrings.interactive
import typingsJapgolly.reactNative.reactNativeStrings.never
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.normal_
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.scrollableAxes
import typingsJapgolly.reactNative.reactNativeStrings.start
import typingsJapgolly.reactNative.reactNativeStrings.white
import typingsJapgolly.reactNative.reactNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SectionList {
  
  inline def apply[ItemT, SectionT](sections: js.Array[SectionListData[ItemT, SectionT]]): Builder[ItemT, SectionT] = {
    val __props = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
    new Builder[ItemT, SectionT](js.Array(this.component, __props.asInstanceOf[SectionListProps[ItemT, SectionT]]))
  }
  
  @JSImport("react-native", "SectionList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[ItemT, SectionT] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNative.mod.SectionList[ItemT, SectionT]] {
    
    inline def CellRendererComponent(value: ComponentType[Any]): this.type = set("CellRendererComponent", value.asInstanceOf[js.Any])
    
    inline def ItemSeparatorComponent(value: ComponentType[Any]): this.type = set("ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    inline def ItemSeparatorComponentNull: this.type = set("ItemSeparatorComponent", null)
    
    inline def ListEmptyComponent(value: ComponentType[Any] | Element): this.type = set("ListEmptyComponent", value.asInstanceOf[js.Any])
    
    inline def ListEmptyComponentNull: this.type = set("ListEmptyComponent", null)
    
    inline def ListEmptyComponentVdomElement(value: VdomElement): this.type = set("ListEmptyComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def ListFooterComponent(value: ComponentType[Any] | Element): this.type = set("ListFooterComponent", value.asInstanceOf[js.Any])
    
    inline def ListFooterComponentNull: this.type = set("ListFooterComponent", null)
    
    inline def ListFooterComponentStyle(value: StyleProp[ViewStyle]): this.type = set("ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    inline def ListFooterComponentStyleNull: this.type = set("ListFooterComponentStyle", null)
    
    inline def ListFooterComponentVdomElement(value: VdomElement): this.type = set("ListFooterComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def ListHeaderComponent(value: ComponentType[Any] | Element): this.type = set("ListHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def ListHeaderComponentNull: this.type = set("ListHeaderComponent", null)
    
    inline def ListHeaderComponentStyle(value: StyleProp[ViewStyle]): this.type = set("ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    inline def ListHeaderComponentStyleNull: this.type = set("ListHeaderComponentStyle", null)
    
    inline def ListHeaderComponentVdomElement(value: VdomElement): this.type = set("ListHeaderComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def SectionSeparatorComponent(value: ComponentType[Any] | Element): this.type = set("SectionSeparatorComponent", value.asInstanceOf[js.Any])
    
    inline def SectionSeparatorComponentNull: this.type = set("SectionSeparatorComponent", null)
    
    inline def SectionSeparatorComponentVdomElement(value: VdomElement): this.type = set("SectionSeparatorComponent", value.rawElement.asInstanceOf[js.Any])
    
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
    
    inline def alwaysBounceHorizontal(value: Boolean): this.type = set("alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    inline def alwaysBounceVertical(value: Boolean): this.type = set("alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    inline def automaticallyAdjustContentInsets(value: Boolean): this.type = set("automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    inline def automaticallyAdjustKeyboardInsets(value: Boolean): this.type = set("automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
    
    inline def automaticallyAdjustsScrollIndicatorInsets(value: Boolean): this.type = set("automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def bounces(value: Boolean): this.type = set("bounces", value.asInstanceOf[js.Any])
    
    inline def bouncesZoom(value: Boolean): this.type = set("bouncesZoom", value.asInstanceOf[js.Any])
    
    inline def canCancelContentTouches(value: Boolean): this.type = set("canCancelContentTouches", value.asInstanceOf[js.Any])
    
    inline def centerContent(value: Boolean): this.type = set("centerContent", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    
    inline def contentInset(value: Insets): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    inline def contentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): this.type = set("contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    inline def contentOffset(value: PointProp): this.type = set("contentOffset", value.asInstanceOf[js.Any])
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def decelerationRate(value: fast | normal_ | Double): this.type = set("decelerationRate", value.asInstanceOf[js.Any])
    
    inline def directionalLockEnabled(value: Boolean): this.type = set("directionalLockEnabled", value.asInstanceOf[js.Any])
    
    inline def disableIntervalMomentum(value: Boolean): this.type = set("disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    inline def disableScrollViewPanResponder(value: Boolean): this.type = set("disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    inline def disableVirtualization(value: Boolean): this.type = set("disableVirtualization", value.asInstanceOf[js.Any])
    
    inline def endFillColor(value: ColorValue): this.type = set("endFillColor", value.asInstanceOf[js.Any])
    
    inline def extraData(value: Any): this.type = set("extraData", value.asInstanceOf[js.Any])
    
    inline def fadingEdgeLength(value: Double): this.type = set("fadingEdgeLength", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def getItem(value: (/* data */ Any, /* index */ Double) => ItemT): this.type = set("getItem", js.Any.fromFunction2(value))
    
    inline def getItemCount(value: /* data */ Any => Double): this.type = set("getItemCount", js.Any.fromFunction1(value))
    
    inline def getItemLayout(
      value: (/* data */ (js.Array[SectionListData[ItemT, SectionT]]) | Null, /* index */ Double) => Length
    ): this.type = set("getItemLayout", js.Any.fromFunction2(value))
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def horizontalNull: this.type = set("horizontal", null)
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def indicatorStyle(value: default | black | white): this.type = set("indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def initialNumToRender(value: Double): this.type = set("initialNumToRender", value.asInstanceOf[js.Any])
    
    inline def initialScrollIndex(value: Double): this.type = set("initialScrollIndex", value.asInstanceOf[js.Any])
    
    inline def initialScrollIndexNull: this.type = set("initialScrollIndex", null)
    
    inline def invertStickyHeaders(value: Boolean): this.type = set("invertStickyHeaders", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def invertedNull: this.type = set("inverted", null)
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def keyExtractor(value: (ItemT, /* index */ Double) => String): this.type = set("keyExtractor", js.Any.fromFunction2(value))
    
    inline def keyboardDismissMode(value: none | interactive | `on-drag`): this.type = set("keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def keyboardShouldPersistTaps(value: Boolean | always | never | handled): this.type = set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def legacyImplementation(value: Boolean): this.type = set("legacyImplementation", value.asInstanceOf[js.Any])
    
    inline def listKey(value: String): this.type = set("listKey", value.asInstanceOf[js.Any])
    
    inline def maintainVisibleContentPosition(value: AutoscrollToTopThreshold): this.type = set("maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    inline def maintainVisibleContentPositionNull: this.type = set("maintainVisibleContentPosition", null)
    
    inline def maxToRenderPerBatch(value: Double): this.type = set("maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    inline def maximumZoomScale(value: Double): this.type = set("maximumZoomScale", value.asInstanceOf[js.Any])
    
    inline def minimumZoomScale(value: Double): this.type = set("minimumZoomScale", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def nestedScrollEnabled(value: Boolean): this.type = set("nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onContentSizeChange(value: (/* w */ Double, /* h */ Double) => Callback): this.type = set("onContentSizeChange", js.Any.fromFunction2((t0: /* w */ Double, t1: /* h */ Double) => (value(t0, t1)).runNow()))
    
    inline def onEndReached(value: /* info */ DistanceFromEnd => Callback): this.type = set("onEndReached", js.Any.fromFunction1((t0: /* info */ DistanceFromEnd) => value(t0).runNow()))
    
    inline def onEndReachedNull: this.type = set("onEndReached", null)
    
    inline def onEndReachedThreshold(value: Double): this.type = set("onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    inline def onEndReachedThresholdNull: this.type = set("onEndReachedThreshold", null)
    
    inline def onLayout(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMomentumScrollBegin(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onMomentumScrollBegin", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMomentumScrollEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onMomentumScrollEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onPointerCancel(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerCancelCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerDown(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerDownCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerEnter(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerEnterCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerLeave(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerLeaveCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerMoveCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerUp(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPointerUpCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onRefresh(value: Callback): this.type = set("onRefresh", value.toJsFn)
    
    inline def onRefreshNull: this.type = set("onRefresh", null)
    
    inline def onResponderEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderGrant(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderReject(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderRelease(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def onScroll(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onScrollAnimationEnd(value: Callback): this.type = set("onScrollAnimationEnd", value.toJsFn)
    
    inline def onScrollBeginDrag(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onScrollBeginDrag", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onScrollEndDrag(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onScrollEndDrag", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onScrollToIndexFailed(value: /* info */ AverageItemLength => Callback): this.type = set("onScrollToIndexFailed", js.Any.fromFunction1((t0: /* info */ AverageItemLength) => value(t0).runNow()))
    
    inline def onScrollToTop(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onScrollToTop", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def onTouchCancel(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactEventFrom[NodeHandle & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onViewableItemsChanged(value: /* info */ Changed => Callback): this.type = set("onViewableItemsChanged", js.Any.fromFunction1((t0: /* info */ Changed) => value(t0).runNow()))
    
    inline def onViewableItemsChangedNull: this.type = set("onViewableItemsChanged", null)
    
    inline def overScrollMode(value: auto | always | never): this.type = set("overScrollMode", value.asInstanceOf[js.Any])
    
    inline def pagingEnabled(value: Boolean): this.type = set("pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def persistentScrollbar(value: Boolean): this.type = set("persistentScrollbar", value.asInstanceOf[js.Any])
    
    inline def pinchGestureEnabled(value: Boolean): this.type = set("pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def progressViewOffset(value: Double): this.type = set("progressViewOffset", value.asInstanceOf[js.Any])
    
    inline def refreshControl(value: VdomElement): this.type = set("refreshControl", value.rawElement.asInstanceOf[js.Any])
    
    inline def refreshing(value: Boolean): this.type = set("refreshing", value.asInstanceOf[js.Any])
    
    inline def refreshingNull: this.type = set("refreshing", null)
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderItem(value: /* info */ SectionListRenderItemInfo[ItemT, SectionT] => Element | Null): this.type = set("renderItem", js.Any.fromFunction1(value))
    
    inline def renderScrollComponent(value: /* props */ ScrollViewProps => Element): this.type = set("renderScrollComponent", js.Any.fromFunction1(value))
    
    inline def renderSectionFooter(value: /* info */ Section[ItemT, SectionT] => Element | Null): this.type = set("renderSectionFooter", js.Any.fromFunction1(value))
    
    inline def renderSectionHeader(value: /* info */ Section[ItemT, SectionT] => Element | Null): this.type = set("renderSectionHeader", js.Any.fromFunction1(value))
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def scrollEventThrottle(value: Double): this.type = set("scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def scrollIndicatorInsets(value: Insets): this.type = set("scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def scrollPerfTag(value: String): this.type = set("scrollPerfTag", value.asInstanceOf[js.Any])
    
    inline def scrollToOverflowEnabled(value: Boolean): this.type = set("scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    inline def scrollsToTop(value: Boolean): this.type = set("scrollsToTop", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def showsHorizontalScrollIndicator(value: Boolean): this.type = set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
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
    
    inline def stickySectionHeadersEnabled(value: Boolean): this.type = set("stickySectionHeadersEnabled", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def updateCellsBatchingPeriod(value: Double): this.type = set("updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    inline def viewabilityConfig(value: ViewabilityConfig): this.type = set("viewabilityConfig", value.asInstanceOf[js.Any])
    
    inline def viewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): this.type = set("viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    inline def viewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): this.type = set("viewabilityConfigCallbackPairs", js.Array(value*))
    
    inline def windowSize(value: Double): this.type = set("windowSize", value.asInstanceOf[js.Any])
    
    inline def zoomScale(value: Double): this.type = set("zoomScale", value.asInstanceOf[js.Any])
  }
  
  def withProps[ItemT, SectionT](p: SectionListProps[ItemT, SectionT]): Builder[ItemT, SectionT] = new Builder[ItemT, SectionT](js.Array(this.component, p.asInstanceOf[js.Any]))
}

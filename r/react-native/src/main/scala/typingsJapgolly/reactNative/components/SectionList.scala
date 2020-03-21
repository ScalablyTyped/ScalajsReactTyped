package typingsJapgolly.reactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.AnonAverageItemLength
import typingsJapgolly.reactNative.AnonChanged
import typingsJapgolly.reactNative.AnonDistanceFromEnd
import typingsJapgolly.reactNative.AnonIndex
import typingsJapgolly.reactNative.AnonSection
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.PointPropType
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.SectionListData
import typingsJapgolly.reactNative.mod.SectionListProps
import typingsJapgolly.reactNative.mod.SectionListRenderItemInfo
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.mod.ViewabilityConfig
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
import typingsJapgolly.reactNative.reactNativeStrings.button
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
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_checked
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsJapgolly.reactNative.reactNativeStrings.scrollableAxes
import typingsJapgolly.reactNative.reactNativeStrings.start
import typingsJapgolly.reactNative.reactNativeStrings.white
import typingsJapgolly.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SectionList {
  def apply[SectionT](
    sections: js.Array[SectionListData[SectionT]],
    ItemSeparatorComponent: ComponentType[_] = null,
    ListEmptyComponent: ComponentType[_] | Element = null,
    ListFooterComponent: ComponentType[_] | Element = null,
    ListHeaderComponent: ComponentType[_] | Element = null,
    SectionSeparatorComponent: ComponentType[_] | Element = null,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined,
    alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined,
    automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined,
    bounces: js.UndefOr[Boolean] = js.undefined,
    bouncesZoom: js.UndefOr[Boolean] = js.undefined,
    canCancelContentTouches: js.UndefOr[Boolean] = js.undefined,
    centerContent: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contentContainerStyle: StyleProp[ViewStyle] = null,
    contentInset: Insets = null,
    contentInsetAdjustmentBehavior: automatic | scrollableAxes | never | always = null,
    contentOffset: PointPropType = null,
    data: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    decelerationRate: fast | normal_ | Double = null,
    directionalLockEnabled: js.UndefOr[Boolean] = js.undefined,
    disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined,
    disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined,
    disableVirtualization: js.UndefOr[Boolean] = js.undefined,
    endFillColor: String = null,
    extraData: js.Any = null,
    getItem: (/* data */ js.Any, /* index */ Double) => CallbackTo[SectionT] = null,
    getItemCount: /* data */ js.Any => CallbackTo[Double] = null,
    getItemLayout: (/* data */ js.Array[SectionListData[SectionT]] | Null, /* index */ Double) => CallbackTo[AnonIndex] = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    indicatorStyle: default | black | white = null,
    initialNumToRender: Int | Double = null,
    initialScrollIndex: Int | Double = null,
    invertStickyHeaders: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyExtractor: (SectionT, /* index */ Double) => CallbackTo[String] = null,
    keyboardDismissMode: none | interactive | `on-drag` = null,
    keyboardShouldPersistTaps: Boolean | always | never | handled = null,
    legacyImplementation: js.UndefOr[Boolean] = js.undefined,
    listKey: String = null,
    maxToRenderPerBatch: Int | Double = null,
    maximumZoomScale: Int | Double = null,
    minimumZoomScale: Int | Double = null,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onContentSizeChange: (/* w */ Double, /* h */ Double) => Callback = null,
    onEndReached: /* info */ AnonDistanceFromEnd => Callback = null,
    onEndReachedThreshold: Int | Double = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMomentumScrollBegin: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onMomentumScrollEnd: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onRefresh: js.UndefOr[Callback] = js.undefined,
    onResponderEnd: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderGrant: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderMove: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderReject: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderRelease: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderStart: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderTerminate: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onResponderTerminationRequest: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onScroll: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onScrollAnimationEnd: js.UndefOr[Callback] = js.undefined,
    onScrollBeginDrag: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onScrollEndDrag: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onScrollToIndexFailed: /* info */ AnonAverageItemLength => Callback = null,
    onScrollToTop: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onStartShouldSetResponder: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => CallbackTo[Boolean] = null,
    onTouchCancel: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchEnd: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchEndCapture: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchMove: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onTouchStart: ReactEventFrom[NodeHandle with org.scalajs.dom.raw.Element] => Callback = null,
    onViewableItemsChanged: /* info */ AnonChanged => Callback = null,
    overScrollMode: auto | always | never = null,
    pagingEnabled: js.UndefOr[Boolean] = js.undefined,
    pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    progressViewOffset: Int | Double = null,
    refreshControl: VdomElement = null,
    refreshing: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderItem: /* info */ SectionListRenderItemInfo[SectionT] => CallbackTo[Element | Null] = null,
    renderScrollComponent: /* props */ ScrollViewProps => CallbackTo[Element] = null,
    renderSectionFooter: /* info */ AnonSection[SectionT] => CallbackTo[Element | Null] = null,
    renderSectionHeader: /* info */ AnonSection[SectionT] => CallbackTo[Element | Null] = null,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEventThrottle: Int | Double = null,
    scrollIndicatorInsets: Insets = null,
    scrollPerfTag: String = null,
    scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollsToTop: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    snapToAlignment: start | center | end = null,
    snapToEnd: js.UndefOr[Boolean] = js.undefined,
    snapToInterval: Int | Double = null,
    snapToOffsets: js.Array[Double] = null,
    snapToStart: js.UndefOr[Boolean] = js.undefined,
    stickyHeaderIndices: js.Array[Double] = null,
    stickySectionHeadersEnabled: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    updateCellsBatchingPeriod: Int | Double = null,
    viewabilityConfig: ViewabilityConfig = null,
    viewabilityConfigCallbackPairs: ViewabilityConfigCallbackPairs = null,
    windowSize: Int | Double = null,
    zoomScale: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SectionListProps[SectionT], 
    typingsJapgolly.reactNative.mod.SectionList[SectionT], 
    Unit, 
    SectionListProps[SectionT]
  ] = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any])
  
      if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (ListEmptyComponent != null) __obj.updateDynamic("ListEmptyComponent")(ListEmptyComponent.asInstanceOf[js.Any])
    if (ListFooterComponent != null) __obj.updateDynamic("ListFooterComponent")(ListFooterComponent.asInstanceOf[js.Any])
    if (ListHeaderComponent != null) __obj.updateDynamic("ListHeaderComponent")(ListHeaderComponent.asInstanceOf[js.Any])
    if (SectionSeparatorComponent != null) __obj.updateDynamic("SectionSeparatorComponent")(SectionSeparatorComponent.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceHorizontal)) __obj.updateDynamic("alwaysBounceHorizontal")(alwaysBounceHorizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysBounceVertical)) __obj.updateDynamic("alwaysBounceVertical")(alwaysBounceVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticallyAdjustContentInsets)) __obj.updateDynamic("automaticallyAdjustContentInsets")(automaticallyAdjustContentInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(bounces)) __obj.updateDynamic("bounces")(bounces.asInstanceOf[js.Any])
    if (!js.isUndefined(bouncesZoom)) __obj.updateDynamic("bouncesZoom")(bouncesZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(canCancelContentTouches)) __obj.updateDynamic("canCancelContentTouches")(canCancelContentTouches.asInstanceOf[js.Any])
    if (!js.isUndefined(centerContent)) __obj.updateDynamic("centerContent")(centerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (contentInsetAdjustmentBehavior != null) __obj.updateDynamic("contentInsetAdjustmentBehavior")(contentInsetAdjustmentBehavior.asInstanceOf[js.Any])
    if (contentOffset != null) __obj.updateDynamic("contentOffset")(contentOffset.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (decelerationRate != null) __obj.updateDynamic("decelerationRate")(decelerationRate.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalLockEnabled)) __obj.updateDynamic("directionalLockEnabled")(directionalLockEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIntervalMomentum)) __obj.updateDynamic("disableIntervalMomentum")(disableIntervalMomentum.asInstanceOf[js.Any])
    if (!js.isUndefined(disableScrollViewPanResponder)) __obj.updateDynamic("disableScrollViewPanResponder")(disableScrollViewPanResponder.asInstanceOf[js.Any])
    if (!js.isUndefined(disableVirtualization)) __obj.updateDynamic("disableVirtualization")(disableVirtualization.asInstanceOf[js.Any])
    if (endFillColor != null) __obj.updateDynamic("endFillColor")(endFillColor.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (getItem != null) __obj.updateDynamic("getItem")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => getItem(t0, t1).runNow()))
    if (getItemCount != null) __obj.updateDynamic("getItemCount")(js.Any.fromFunction1((t0: /* data */ js.Any) => getItemCount(t0).runNow()))
    if (getItemLayout != null) __obj.updateDynamic("getItemLayout")(js.Any.fromFunction2((t0: /* data */ js.Array[typingsJapgolly.reactNative.mod.SectionListData[SectionT]] | scala.Null, t1: /* index */ scala.Double) => getItemLayout(t0, t1).runNow()))
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (initialNumToRender != null) __obj.updateDynamic("initialNumToRender")(initialNumToRender.asInstanceOf[js.Any])
    if (initialScrollIndex != null) __obj.updateDynamic("initialScrollIndex")(initialScrollIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(invertStickyHeaders)) __obj.updateDynamic("invertStickyHeaders")(invertStickyHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2((t0: SectionT, t1: /* index */ scala.Double) => keyExtractor(t0, t1).runNow()))
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyImplementation)) __obj.updateDynamic("legacyImplementation")(legacyImplementation.asInstanceOf[js.Any])
    if (listKey != null) __obj.updateDynamic("listKey")(listKey.asInstanceOf[js.Any])
    if (maxToRenderPerBatch != null) __obj.updateDynamic("maxToRenderPerBatch")(maxToRenderPerBatch.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedScrollEnabled)) __obj.updateDynamic("nestedScrollEnabled")(nestedScrollEnabled.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction2((t0: /* w */ scala.Double, t1: /* h */ scala.Double) => onContentSizeChange(t0, t1).runNow()))
    if (onEndReached != null) __obj.updateDynamic("onEndReached")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.AnonDistanceFromEnd) => onEndReached(t0).runNow()))
    if (onEndReachedThreshold != null) __obj.updateDynamic("onEndReachedThreshold")(onEndReachedThreshold.asInstanceOf[js.Any])
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    if (onMomentumScrollBegin != null) __obj.updateDynamic("onMomentumScrollBegin")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMomentumScrollBegin(t0).runNow()))
    if (onMomentumScrollEnd != null) __obj.updateDynamic("onMomentumScrollEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMomentumScrollEnd(t0).runNow()))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponderCapture(t0).runNow()))
    onRefresh.foreach(p => __obj.updateDynamic("onRefresh")(p.toJsFn))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderEnd(t0).runNow()))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderGrant(t0).runNow()))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderMove(t0).runNow()))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderReject(t0).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderRelease(t0).runNow()))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderStart(t0).runNow()))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminate(t0).runNow()))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminationRequest(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onScroll(t0).runNow()))
    onScrollAnimationEnd.foreach(p => __obj.updateDynamic("onScrollAnimationEnd")(p.toJsFn))
    if (onScrollBeginDrag != null) __obj.updateDynamic("onScrollBeginDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onScrollBeginDrag(t0).runNow()))
    if (onScrollEndDrag != null) __obj.updateDynamic("onScrollEndDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onScrollEndDrag(t0).runNow()))
    if (onScrollToIndexFailed != null) __obj.updateDynamic("onScrollToIndexFailed")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.AnonAverageItemLength) => onScrollToIndexFailed(t0).runNow()))
    if (onScrollToTop != null) __obj.updateDynamic("onScrollToTop")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onScrollToTop(t0).runNow()))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponder(t0).runNow()))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponderCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onViewableItemsChanged != null) __obj.updateDynamic("onViewableItemsChanged")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.AnonChanged) => onViewableItemsChanged(t0).runNow()))
    if (overScrollMode != null) __obj.updateDynamic("overScrollMode")(overScrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(pagingEnabled)) __obj.updateDynamic("pagingEnabled")(pagingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pinchGestureEnabled)) __obj.updateDynamic("pinchGestureEnabled")(pinchGestureEnabled.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (progressViewOffset != null) __obj.updateDynamic("progressViewOffset")(progressViewOffset.asInstanceOf[js.Any])
    if (refreshControl != null) __obj.updateDynamic("refreshControl")(refreshControl.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshing)) __obj.updateDynamic("refreshing")(refreshing.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.mod.SectionListRenderItemInfo[SectionT]) => renderItem(t0).runNow()))
    if (renderScrollComponent != null) __obj.updateDynamic("renderScrollComponent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNative.mod.ScrollViewProps) => renderScrollComponent(t0).runNow()))
    if (renderSectionFooter != null) __obj.updateDynamic("renderSectionFooter")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.AnonSection[SectionT]) => renderSectionFooter(t0).runNow()))
    if (renderSectionHeader != null) __obj.updateDynamic("renderSectionHeader")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.AnonSection[SectionT]) => renderSectionHeader(t0).runNow()))
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (scrollEventThrottle != null) __obj.updateDynamic("scrollEventThrottle")(scrollEventThrottle.asInstanceOf[js.Any])
    if (scrollIndicatorInsets != null) __obj.updateDynamic("scrollIndicatorInsets")(scrollIndicatorInsets.asInstanceOf[js.Any])
    if (scrollPerfTag != null) __obj.updateDynamic("scrollPerfTag")(scrollPerfTag.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToOverflowEnabled)) __obj.updateDynamic("scrollToOverflowEnabled")(scrollToOverflowEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollsToTop)) __obj.updateDynamic("scrollsToTop")(scrollsToTop.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (snapToAlignment != null) __obj.updateDynamic("snapToAlignment")(snapToAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToEnd)) __obj.updateDynamic("snapToEnd")(snapToEnd.asInstanceOf[js.Any])
    if (snapToInterval != null) __obj.updateDynamic("snapToInterval")(snapToInterval.asInstanceOf[js.Any])
    if (snapToOffsets != null) __obj.updateDynamic("snapToOffsets")(snapToOffsets.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStart)) __obj.updateDynamic("snapToStart")(snapToStart.asInstanceOf[js.Any])
    if (stickyHeaderIndices != null) __obj.updateDynamic("stickyHeaderIndices")(stickyHeaderIndices.asInstanceOf[js.Any])
    if (!js.isUndefined(stickySectionHeadersEnabled)) __obj.updateDynamic("stickySectionHeadersEnabled")(stickySectionHeadersEnabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (updateCellsBatchingPeriod != null) __obj.updateDynamic("updateCellsBatchingPeriod")(updateCellsBatchingPeriod.asInstanceOf[js.Any])
    if (viewabilityConfig != null) __obj.updateDynamic("viewabilityConfig")(viewabilityConfig.asInstanceOf[js.Any])
    if (viewabilityConfigCallbackPairs != null) __obj.updateDynamic("viewabilityConfigCallbackPairs")(viewabilityConfigCallbackPairs.asInstanceOf[js.Any])
    if (windowSize != null) __obj.updateDynamic("windowSize")(windowSize.asInstanceOf[js.Any])
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNative.mod.SectionListProps[SectionT], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNative.mod.SectionList[SectionT]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNative.mod.SectionListProps[SectionT]])(children: _*)
  }
  @JSImport("react-native", "SectionList")
  @js.native
  object componentImport extends js.Object
  
}


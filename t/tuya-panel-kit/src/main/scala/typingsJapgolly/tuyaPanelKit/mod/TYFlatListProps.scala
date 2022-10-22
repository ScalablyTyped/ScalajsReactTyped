package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.anon.AutoscrollToTopThreshold
import typingsJapgolly.reactNative.anon.AverageItemLength
import typingsJapgolly.reactNative.anon.Changed
import typingsJapgolly.reactNative.anon.DistanceFromEnd
import typingsJapgolly.reactNative.anon.Length
import typingsJapgolly.reactNative.mod.AccessibilityActionEvent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.ListRenderItem
import typingsJapgolly.reactNative.mod.ListRenderItemInfo
import typingsJapgolly.reactNative.mod.NativeScrollEvent
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.PointProp
import typingsJapgolly.reactNative.mod.PointerEvent
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.mod.ViewabilityConfigCallbackPair
import typingsJapgolly.reactNative.mod.ViewabilityConfigCallbackPairs
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`no-hide-descendants`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.`on-drag`
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.always
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.assertive
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.auto
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.automatic
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.black
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.default
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.end
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.fast
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.handled
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.interactive
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.never
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.no
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.polite
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.scrollableAxes
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.start
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.white
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<react-native.react-native.FlatListProps<ItemT>, 'renderItem'> */
trait TYFlatListProps[ItemT /* <: TYFlatListData */] extends StObject {
  
  var CellRendererComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var ItemSeparatorComponent: js.UndefOr[ComponentType[Any] | Null] = js.undefined
  
  var ListEmptyComponent: js.UndefOr[ComponentType[Any] | Element | Null] = js.undefined
  
  var ListFooterComponent: js.UndefOr[ComponentType[Any] | Element | Null] = js.undefined
  
  var ListFooterComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var ListHeaderComponent: js.UndefOr[ComponentType[Any] | Element | Null] = js.undefined
  
  var ListHeaderComponentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var StickyHeaderComponent: js.UndefOr[ComponentType[Any]] = js.undefined
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none_ | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var alwaysBounceHorizontal: js.UndefOr[Boolean] = js.undefined
  
  var alwaysBounceVertical: js.UndefOr[Boolean] = js.undefined
  
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  
  var automaticallyAdjustKeyboardInsets: js.UndefOr[Boolean] = js.undefined
  
  var automaticallyAdjustsScrollIndicatorInsets: js.UndefOr[Boolean] = js.undefined
  
  var bounces: js.UndefOr[Boolean] = js.undefined
  
  var bouncesZoom: js.UndefOr[Boolean] = js.undefined
  
  var canCancelContentTouches: js.UndefOr[Boolean] = js.undefined
  
  var centerContent: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var collapsable: js.UndefOr[Boolean] = js.undefined
  
  var columnWrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 应用于滚动视图内容容器，该容器包装了所有子视图
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description These styles will be applied to the scroll view content container which wraps all of the child views.
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue undefined
    */
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var contentInset: js.UndefOr[Insets] = js.undefined
  
  var contentInsetAdjustmentBehavior: js.UndefOr[automatic | scrollableAxes | never | always] = js.undefined
  
  var contentOffset: js.UndefOr[PointProp] = js.undefined
  
  /**
    * @language zh-CN
    * @description 数据源
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/84c8c92bc47dffbf2df6b0af1b8325573e6b91bc/types/tuya-panel-kit/index.d.ts#L8878">ItemT[]</a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Data source
    * @types <a target="_blank" href="https://github.com/tuya/DefinitelyTyped/blob/84c8c92bc47dffbf2df6b0af1b8325573e6b91bc/types/tuya-panel-kit/index.d.ts#L8878">ItemT[]</a>
    * @defaultValue null
    */
  var data: js.Array[ItemT]
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var decelerationRate: js.UndefOr[fast | normal | Double] = js.undefined
  
  var directionalLockEnabled: js.UndefOr[Boolean] = js.undefined
  
  var disableIntervalMomentum: js.UndefOr[Boolean] = js.undefined
  
  var disableScrollViewPanResponder: js.UndefOr[Boolean] = js.undefined
  
  var disableVirtualization: js.UndefOr[Boolean] = js.undefined
  
  var endFillColor: js.UndefOr[ColorValue] = js.undefined
  
  var extraData: js.UndefOr[Any] = js.undefined
  
  var fadingEdgeLength: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 列表项实例
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description List item instance
    * @defaultValue null
    */
  var flatListRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  var getItem: js.UndefOr[js.Function2[/* data */ Any, /* index */ Double, ItemT]] = js.undefined
  
  var getItemCount: js.UndefOr[js.Function1[/* data */ Any, Double]] = js.undefined
  
  var getItemLayout: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double, Length]
  ] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var horizontal: js.UndefOr[Boolean | Null] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var indicatorStyle: js.UndefOr[default | black | white] = js.undefined
  
  var initialNumToRender: js.UndefOr[Double] = js.undefined
  
  var initialScrollIndex: js.UndefOr[Double | Null] = js.undefined
  
  var invertStickyHeaders: js.UndefOr[Boolean] = js.undefined
  
  var inverted: js.UndefOr[Boolean | Null] = js.undefined
  
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.undefined
  
  var keyboardDismissMode: js.UndefOr[none_ | interactive | `on-drag`] = js.undefined
  
  var keyboardShouldPersistTaps: js.UndefOr[Boolean | always | never | handled] = js.undefined
  
  var legacyImplementation: js.UndefOr[Boolean] = js.undefined
  
  var listKey: js.UndefOr[String] = js.undefined
  
  var maintainVisibleContentPosition: js.UndefOr[Null | AutoscrollToTopThreshold] = js.undefined
  
  var maxToRenderPerBatch: js.UndefOr[Double] = js.undefined
  
  var maximumZoomScale: js.UndefOr[Double] = js.undefined
  
  var minimumZoomScale: js.UndefOr[Double] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  
  var nestedScrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var numColumns: js.UndefOr[Double] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onContentSizeChange: js.UndefOr[js.Function2[/* w */ Double, /* h */ Double, Unit]] = js.undefined
  
  var onEndReached: js.UndefOr[(js.Function1[/* info */ DistanceFromEnd, Unit]) | Null] = js.undefined
  
  var onEndReachedThreshold: js.UndefOr[Double | Null] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onMomentumScrollBegin: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onMomentumScrollEnd: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  
  var onRefresh: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onScrollAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onScrollBeginDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onScrollEndDrag: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onScrollToIndexFailed: js.UndefOr[js.Function1[/* info */ AverageItemLength, Unit]] = js.undefined
  
  var onScrollToTop: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
  
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onViewableItemsChanged: js.UndefOr[(js.Function1[/* info */ Changed, Unit]) | Null] = js.undefined
  
  var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
  
  var pagingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var persistentScrollbar: js.UndefOr[Boolean] = js.undefined
  
  var pinchGestureEnabled: js.UndefOr[Boolean] = js.undefined
  
  var pointerEvents: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.undefined
  
  var progressViewOffset: js.UndefOr[Double] = js.undefined
  
  var refreshControl: js.UndefOr[Element] = js.undefined
  
  var refreshing: js.UndefOr[Boolean | Null] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义列表项
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom list items
    * @defaultValue null
    */
  var renderItem: js.UndefOr[ListRenderItem[ItemT] | Null] = js.undefined
  
  var renderScrollComponent: js.UndefOr[js.Function1[/* props */ ScrollViewProps, Element]] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容是否可以滚动
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Can content scroll
    * @defaultValue true
    */
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollEventThrottle: js.UndefOr[Double] = js.undefined
  
  var scrollIndicatorInsets: js.UndefOr[Insets] = js.undefined
  
  var scrollPerfTag: js.UndefOr[String] = js.undefined
  
  var scrollToOverflowEnabled: js.UndefOr[Boolean] = js.undefined
  
  var scrollsToTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 分割线样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Separator style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var separatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  
  var snapToAlignment: js.UndefOr[start | center | end] = js.undefined
  
  var snapToEnd: js.UndefOr[Boolean] = js.undefined
  
  var snapToInterval: js.UndefOr[Double] = js.undefined
  
  var snapToOffsets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var snapToStart: js.UndefOr[Boolean] = js.undefined
  
  var stickyHeaderHiddenOnScroll: js.UndefOr[Boolean] = js.undefined
  
  var stickyHeaderIndices: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 内容样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Container style
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  
  var updateCellsBatchingPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否使用 ART 实现版本
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is art used to implement the version
    * @defaultValue false
    */
  var useART: js.UndefOr[Boolean] = js.undefined
  
  var viewabilityConfig: js.UndefOr[Any] = js.undefined
  
  var viewabilityConfigCallbackPairs: js.UndefOr[ViewabilityConfigCallbackPairs] = js.undefined
  
  var windowSize: js.UndefOr[Double] = js.undefined
  
  var zoomScale: js.UndefOr[Double] = js.undefined
}
object TYFlatListProps {
  
  inline def apply[ItemT /* <: TYFlatListData */](data: js.Array[ItemT]): TYFlatListProps[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TYFlatListProps[ItemT]]
  }
  
  extension [Self <: TYFlatListProps[?], ItemT /* <: TYFlatListData */](x: Self & TYFlatListProps[ItemT]) {
    
    inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: none_ | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAlwaysBounceHorizontal(value: Boolean): Self = StObject.set(x, "alwaysBounceHorizontal", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBounceHorizontalUndefined: Self = StObject.set(x, "alwaysBounceHorizontal", js.undefined)
    
    inline def setAlwaysBounceVertical(value: Boolean): Self = StObject.set(x, "alwaysBounceVertical", value.asInstanceOf[js.Any])
    
    inline def setAlwaysBounceVerticalUndefined: Self = StObject.set(x, "alwaysBounceVertical", js.undefined)
    
    inline def setAutomaticallyAdjustContentInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustContentInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustContentInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustContentInsets", js.undefined)
    
    inline def setAutomaticallyAdjustKeyboardInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustKeyboardInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustKeyboardInsets", js.undefined)
    
    inline def setAutomaticallyAdjustsScrollIndicatorInsets(value: Boolean): Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setAutomaticallyAdjustsScrollIndicatorInsetsUndefined: Self = StObject.set(x, "automaticallyAdjustsScrollIndicatorInsets", js.undefined)
    
    inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
    
    inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
    
    inline def setBouncesZoom(value: Boolean): Self = StObject.set(x, "bouncesZoom", value.asInstanceOf[js.Any])
    
    inline def setBouncesZoomUndefined: Self = StObject.set(x, "bouncesZoom", js.undefined)
    
    inline def setCanCancelContentTouches(value: Boolean): Self = StObject.set(x, "canCancelContentTouches", value.asInstanceOf[js.Any])
    
    inline def setCanCancelContentTouchesUndefined: Self = StObject.set(x, "canCancelContentTouches", js.undefined)
    
    inline def setCellRendererComponent(value: ComponentType[Any]): Self = StObject.set(x, "CellRendererComponent", value.asInstanceOf[js.Any])
    
    inline def setCellRendererComponentUndefined: Self = StObject.set(x, "CellRendererComponent", js.undefined)
    
    inline def setCenterContent(value: Boolean): Self = StObject.set(x, "centerContent", value.asInstanceOf[js.Any])
    
    inline def setCenterContentUndefined: Self = StObject.set(x, "centerContent", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setColumnWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "columnWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnWrapperStyleNull: Self = StObject.set(x, "columnWrapperStyle", null)
    
    inline def setColumnWrapperStyleUndefined: Self = StObject.set(x, "columnWrapperStyle", js.undefined)
    
    inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setContentInset(value: Insets): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentInsetAdjustmentBehavior(value: automatic | scrollableAxes | never | always): Self = StObject.set(x, "contentInsetAdjustmentBehavior", value.asInstanceOf[js.Any])
    
    inline def setContentInsetAdjustmentBehaviorUndefined: Self = StObject.set(x, "contentInsetAdjustmentBehavior", js.undefined)
    
    inline def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
    
    inline def setContentOffset(value: PointProp): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    inline def setContentOffsetUndefined: Self = StObject.set(x, "contentOffset", js.undefined)
    
    inline def setData(value: js.Array[ItemT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: ItemT*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDecelerationRate(value: fast | normal | Double): Self = StObject.set(x, "decelerationRate", value.asInstanceOf[js.Any])
    
    inline def setDecelerationRateUndefined: Self = StObject.set(x, "decelerationRate", js.undefined)
    
    inline def setDirectionalLockEnabled(value: Boolean): Self = StObject.set(x, "directionalLockEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectionalLockEnabledUndefined: Self = StObject.set(x, "directionalLockEnabled", js.undefined)
    
    inline def setDisableIntervalMomentum(value: Boolean): Self = StObject.set(x, "disableIntervalMomentum", value.asInstanceOf[js.Any])
    
    inline def setDisableIntervalMomentumUndefined: Self = StObject.set(x, "disableIntervalMomentum", js.undefined)
    
    inline def setDisableScrollViewPanResponder(value: Boolean): Self = StObject.set(x, "disableScrollViewPanResponder", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollViewPanResponderUndefined: Self = StObject.set(x, "disableScrollViewPanResponder", js.undefined)
    
    inline def setDisableVirtualization(value: Boolean): Self = StObject.set(x, "disableVirtualization", value.asInstanceOf[js.Any])
    
    inline def setDisableVirtualizationUndefined: Self = StObject.set(x, "disableVirtualization", js.undefined)
    
    inline def setEndFillColor(value: ColorValue): Self = StObject.set(x, "endFillColor", value.asInstanceOf[js.Any])
    
    inline def setEndFillColorUndefined: Self = StObject.set(x, "endFillColor", js.undefined)
    
    inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    inline def setFadingEdgeLength(value: Double): Self = StObject.set(x, "fadingEdgeLength", value.asInstanceOf[js.Any])
    
    inline def setFadingEdgeLengthUndefined: Self = StObject.set(x, "fadingEdgeLength", js.undefined)
    
    inline def setFlatListRef(value: Callback): Self = StObject.set(x, "flatListRef", value.toJsFn)
    
    inline def setFlatListRefUndefined: Self = StObject.set(x, "flatListRef", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setGetItem(value: (/* data */ Any, /* index */ Double) => ItemT): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
    
    inline def setGetItemCount(value: /* data */ Any => Double): Self = StObject.set(x, "getItemCount", js.Any.fromFunction1(value))
    
    inline def setGetItemCountUndefined: Self = StObject.set(x, "getItemCount", js.undefined)
    
    inline def setGetItemLayout(value: (/* data */ js.UndefOr[js.Array[ItemT] | Null], /* index */ Double) => Length): Self = StObject.set(x, "getItemLayout", js.Any.fromFunction2(value))
    
    inline def setGetItemLayoutUndefined: Self = StObject.set(x, "getItemLayout", js.undefined)
    
    inline def setGetItemUndefined: Self = StObject.set(x, "getItem", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalNull: Self = StObject.set(x, "horizontal", null)
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIndicatorStyle(value: default | black | white): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
    
    inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
    
    inline def setInitialNumToRender(value: Double): Self = StObject.set(x, "initialNumToRender", value.asInstanceOf[js.Any])
    
    inline def setInitialNumToRenderUndefined: Self = StObject.set(x, "initialNumToRender", js.undefined)
    
    inline def setInitialScrollIndex(value: Double): Self = StObject.set(x, "initialScrollIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialScrollIndexNull: Self = StObject.set(x, "initialScrollIndex", null)
    
    inline def setInitialScrollIndexUndefined: Self = StObject.set(x, "initialScrollIndex", js.undefined)
    
    inline def setInvertStickyHeaders(value: Boolean): Self = StObject.set(x, "invertStickyHeaders", value.asInstanceOf[js.Any])
    
    inline def setInvertStickyHeadersUndefined: Self = StObject.set(x, "invertStickyHeaders", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedNull: Self = StObject.set(x, "inverted", null)
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setItemSeparatorComponent(value: ComponentType[Any]): Self = StObject.set(x, "ItemSeparatorComponent", value.asInstanceOf[js.Any])
    
    inline def setItemSeparatorComponentNull: Self = StObject.set(x, "ItemSeparatorComponent", null)
    
    inline def setItemSeparatorComponentUndefined: Self = StObject.set(x, "ItemSeparatorComponent", js.undefined)
    
    inline def setKeyExtractor(value: (/* item */ ItemT, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    inline def setKeyExtractorUndefined: Self = StObject.set(x, "keyExtractor", js.undefined)
    
    inline def setKeyboardDismissMode(value: none_ | interactive | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
    
    inline def setKeyboardShouldPersistTaps(value: Boolean | always | never | handled): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
    
    inline def setLegacyImplementation(value: Boolean): Self = StObject.set(x, "legacyImplementation", value.asInstanceOf[js.Any])
    
    inline def setLegacyImplementationUndefined: Self = StObject.set(x, "legacyImplementation", js.undefined)
    
    inline def setListEmptyComponent(value: ComponentType[Any] | Element): Self = StObject.set(x, "ListEmptyComponent", value.asInstanceOf[js.Any])
    
    inline def setListEmptyComponentNull: Self = StObject.set(x, "ListEmptyComponent", null)
    
    inline def setListEmptyComponentUndefined: Self = StObject.set(x, "ListEmptyComponent", js.undefined)
    
    inline def setListEmptyComponentVdomElement(value: VdomElement): Self = StObject.set(x, "ListEmptyComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setListFooterComponent(value: ComponentType[Any] | Element): Self = StObject.set(x, "ListFooterComponent", value.asInstanceOf[js.Any])
    
    inline def setListFooterComponentNull: Self = StObject.set(x, "ListFooterComponent", null)
    
    inline def setListFooterComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListFooterComponentStyle", value.asInstanceOf[js.Any])
    
    inline def setListFooterComponentStyleNull: Self = StObject.set(x, "ListFooterComponentStyle", null)
    
    inline def setListFooterComponentStyleUndefined: Self = StObject.set(x, "ListFooterComponentStyle", js.undefined)
    
    inline def setListFooterComponentUndefined: Self = StObject.set(x, "ListFooterComponent", js.undefined)
    
    inline def setListFooterComponentVdomElement(value: VdomElement): Self = StObject.set(x, "ListFooterComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setListHeaderComponent(value: ComponentType[Any] | Element): Self = StObject.set(x, "ListHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def setListHeaderComponentNull: Self = StObject.set(x, "ListHeaderComponent", null)
    
    inline def setListHeaderComponentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ListHeaderComponentStyle", value.asInstanceOf[js.Any])
    
    inline def setListHeaderComponentStyleNull: Self = StObject.set(x, "ListHeaderComponentStyle", null)
    
    inline def setListHeaderComponentStyleUndefined: Self = StObject.set(x, "ListHeaderComponentStyle", js.undefined)
    
    inline def setListHeaderComponentUndefined: Self = StObject.set(x, "ListHeaderComponent", js.undefined)
    
    inline def setListHeaderComponentVdomElement(value: VdomElement): Self = StObject.set(x, "ListHeaderComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    inline def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    inline def setMaintainVisibleContentPosition(value: AutoscrollToTopThreshold): Self = StObject.set(x, "maintainVisibleContentPosition", value.asInstanceOf[js.Any])
    
    inline def setMaintainVisibleContentPositionNull: Self = StObject.set(x, "maintainVisibleContentPosition", null)
    
    inline def setMaintainVisibleContentPositionUndefined: Self = StObject.set(x, "maintainVisibleContentPosition", js.undefined)
    
    inline def setMaxToRenderPerBatch(value: Double): Self = StObject.set(x, "maxToRenderPerBatch", value.asInstanceOf[js.Any])
    
    inline def setMaxToRenderPerBatchUndefined: Self = StObject.set(x, "maxToRenderPerBatch", js.undefined)
    
    inline def setMaximumZoomScale(value: Double): Self = StObject.set(x, "maximumZoomScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumZoomScaleUndefined: Self = StObject.set(x, "maximumZoomScale", js.undefined)
    
    inline def setMinimumZoomScale(value: Double): Self = StObject.set(x, "minimumZoomScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumZoomScaleUndefined: Self = StObject.set(x, "minimumZoomScale", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setNestedScrollEnabled(value: Boolean): Self = StObject.set(x, "nestedScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setNestedScrollEnabledUndefined: Self = StObject.set(x, "nestedScrollEnabled", js.undefined)
    
    inline def setNumColumns(value: Double): Self = StObject.set(x, "numColumns", value.asInstanceOf[js.Any])
    
    inline def setNumColumnsUndefined: Self = StObject.set(x, "numColumns", js.undefined)
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Callback): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1((t0: /* event */ AccessibilityActionEvent) => value(t0).runNow()))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Callback): Self = StObject.set(x, "onAccessibilityEscape", value.toJsFn)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Callback): Self = StObject.set(x, "onAccessibilityTap", value.toJsFn)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnContentSizeChange(value: (/* w */ Double, /* h */ Double) => Callback): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction2((t0: /* w */ Double, t1: /* h */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setOnEndReached(value: /* info */ DistanceFromEnd => Callback): Self = StObject.set(x, "onEndReached", js.Any.fromFunction1((t0: /* info */ DistanceFromEnd) => value(t0).runNow()))
    
    inline def setOnEndReachedNull: Self = StObject.set(x, "onEndReached", null)
    
    inline def setOnEndReachedThreshold(value: Double): Self = StObject.set(x, "onEndReachedThreshold", value.asInstanceOf[js.Any])
    
    inline def setOnEndReachedThresholdNull: Self = StObject.set(x, "onEndReachedThreshold", null)
    
    inline def setOnEndReachedThresholdUndefined: Self = StObject.set(x, "onEndReachedThreshold", js.undefined)
    
    inline def setOnEndReachedUndefined: Self = StObject.set(x, "onEndReached", js.undefined)
    
    inline def setOnLayout(value: /* event */ LayoutChangeEvent => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: Callback): Self = StObject.set(x, "onMagicTap", value.toJsFn)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMomentumScrollBegin(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): Self = StObject.set(x, "onMomentumScrollBegin", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def setOnMomentumScrollBeginUndefined: Self = StObject.set(x, "onMomentumScrollBegin", js.undefined)
    
    inline def setOnMomentumScrollEnd(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnPointerCancel(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Callback): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnRefresh(value: Callback): Self = StObject.set(x, "onRefresh", value.toJsFn)
    
    inline def setOnRefreshNull: Self = StObject.set(x, "onRefresh", null)
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnScroll(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def setOnScrollAnimationEnd(value: Callback): Self = StObject.set(x, "onScrollAnimationEnd", value.toJsFn)
    
    inline def setOnScrollAnimationEndUndefined: Self = StObject.set(x, "onScrollAnimationEnd", js.undefined)
    
    inline def setOnScrollBeginDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
    
    inline def setOnScrollEndDrag(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): Self = StObject.set(x, "onScrollEndDrag", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def setOnScrollEndDragUndefined: Self = StObject.set(x, "onScrollEndDrag", js.undefined)
    
    inline def setOnScrollToIndexFailed(value: /* info */ AverageItemLength => Callback): Self = StObject.set(x, "onScrollToIndexFailed", js.Any.fromFunction1((t0: /* info */ AverageItemLength) => value(t0).runNow()))
    
    inline def setOnScrollToIndexFailedUndefined: Self = StObject.set(x, "onScrollToIndexFailed", js.undefined)
    
    inline def setOnScrollToTop(value: /* event */ NativeSyntheticEvent[NativeScrollEvent] => Callback): Self = StObject.set(x, "onScrollToTop", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeScrollEvent]) => value(t0).runNow()))
    
    inline def setOnScrollToTopUndefined: Self = StObject.set(x, "onScrollToTop", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnViewableItemsChanged(value: /* info */ Changed => Callback): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1((t0: /* info */ Changed) => value(t0).runNow()))
    
    inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    inline def setOnViewableItemsChangedUndefined: Self = StObject.set(x, "onViewableItemsChanged", js.undefined)
    
    inline def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
    
    inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
    
    inline def setPagingEnabled(value: Boolean): Self = StObject.set(x, "pagingEnabled", value.asInstanceOf[js.Any])
    
    inline def setPagingEnabledUndefined: Self = StObject.set(x, "pagingEnabled", js.undefined)
    
    inline def setPersistentScrollbar(value: Boolean): Self = StObject.set(x, "persistentScrollbar", value.asInstanceOf[js.Any])
    
    inline def setPersistentScrollbarUndefined: Self = StObject.set(x, "persistentScrollbar", js.undefined)
    
    inline def setPinchGestureEnabled(value: Boolean): Self = StObject.set(x, "pinchGestureEnabled", value.asInstanceOf[js.Any])
    
    inline def setPinchGestureEnabledUndefined: Self = StObject.set(x, "pinchGestureEnabled", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setProgressViewOffset(value: Double): Self = StObject.set(x, "progressViewOffset", value.asInstanceOf[js.Any])
    
    inline def setProgressViewOffsetUndefined: Self = StObject.set(x, "progressViewOffset", js.undefined)
    
    inline def setRefreshControl(value: VdomElement): Self = StObject.set(x, "refreshControl", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRefreshControlUndefined: Self = StObject.set(x, "refreshControl", js.undefined)
    
    inline def setRefreshing(value: Boolean): Self = StObject.set(x, "refreshing", value.asInstanceOf[js.Any])
    
    inline def setRefreshingNull: Self = StObject.set(x, "refreshing", null)
    
    inline def setRefreshingUndefined: Self = StObject.set(x, "refreshing", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderItem(value: /* info */ ListRenderItemInfo[ItemT] => Element | Null): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setRenderItemNull: Self = StObject.set(x, "renderItem", null)
    
    inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    
    inline def setRenderScrollComponent(value: /* props */ ScrollViewProps => Element): Self = StObject.set(x, "renderScrollComponent", js.Any.fromFunction1(value))
    
    inline def setRenderScrollComponentUndefined: Self = StObject.set(x, "renderScrollComponent", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setScrollEventThrottle(value: Double): Self = StObject.set(x, "scrollEventThrottle", value.asInstanceOf[js.Any])
    
    inline def setScrollEventThrottleUndefined: Self = StObject.set(x, "scrollEventThrottle", js.undefined)
    
    inline def setScrollIndicatorInsets(value: Insets): Self = StObject.set(x, "scrollIndicatorInsets", value.asInstanceOf[js.Any])
    
    inline def setScrollIndicatorInsetsUndefined: Self = StObject.set(x, "scrollIndicatorInsets", js.undefined)
    
    inline def setScrollPerfTag(value: String): Self = StObject.set(x, "scrollPerfTag", value.asInstanceOf[js.Any])
    
    inline def setScrollPerfTagUndefined: Self = StObject.set(x, "scrollPerfTag", js.undefined)
    
    inline def setScrollToOverflowEnabled(value: Boolean): Self = StObject.set(x, "scrollToOverflowEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollToOverflowEnabledUndefined: Self = StObject.set(x, "scrollToOverflowEnabled", js.undefined)
    
    inline def setScrollsToTop(value: Boolean): Self = StObject.set(x, "scrollsToTop", value.asInstanceOf[js.Any])
    
    inline def setScrollsToTopUndefined: Self = StObject.set(x, "scrollsToTop", js.undefined)
    
    inline def setSeparatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
    
    inline def setSeparatorStyleNull: Self = StObject.set(x, "separatorStyle", null)
    
    inline def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setShowsHorizontalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsHorizontalScrollIndicatorUndefined: Self = StObject.set(x, "showsHorizontalScrollIndicator", js.undefined)
    
    inline def setShowsVerticalScrollIndicator(value: Boolean): Self = StObject.set(x, "showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowsVerticalScrollIndicatorUndefined: Self = StObject.set(x, "showsVerticalScrollIndicator", js.undefined)
    
    inline def setSnapToAlignment(value: start | center | end): Self = StObject.set(x, "snapToAlignment", value.asInstanceOf[js.Any])
    
    inline def setSnapToAlignmentUndefined: Self = StObject.set(x, "snapToAlignment", js.undefined)
    
    inline def setSnapToEnd(value: Boolean): Self = StObject.set(x, "snapToEnd", value.asInstanceOf[js.Any])
    
    inline def setSnapToEndUndefined: Self = StObject.set(x, "snapToEnd", js.undefined)
    
    inline def setSnapToInterval(value: Double): Self = StObject.set(x, "snapToInterval", value.asInstanceOf[js.Any])
    
    inline def setSnapToIntervalUndefined: Self = StObject.set(x, "snapToInterval", js.undefined)
    
    inline def setSnapToOffsets(value: js.Array[Double]): Self = StObject.set(x, "snapToOffsets", value.asInstanceOf[js.Any])
    
    inline def setSnapToOffsetsUndefined: Self = StObject.set(x, "snapToOffsets", js.undefined)
    
    inline def setSnapToOffsetsVarargs(value: Double*): Self = StObject.set(x, "snapToOffsets", js.Array(value*))
    
    inline def setSnapToStart(value: Boolean): Self = StObject.set(x, "snapToStart", value.asInstanceOf[js.Any])
    
    inline def setSnapToStartUndefined: Self = StObject.set(x, "snapToStart", js.undefined)
    
    inline def setStickyHeaderComponent(value: ComponentType[Any]): Self = StObject.set(x, "StickyHeaderComponent", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderComponentUndefined: Self = StObject.set(x, "StickyHeaderComponent", js.undefined)
    
    inline def setStickyHeaderHiddenOnScroll(value: Boolean): Self = StObject.set(x, "stickyHeaderHiddenOnScroll", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderHiddenOnScrollUndefined: Self = StObject.set(x, "stickyHeaderHiddenOnScroll", js.undefined)
    
    inline def setStickyHeaderIndices(value: js.Array[Double]): Self = StObject.set(x, "stickyHeaderIndices", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderIndicesUndefined: Self = StObject.set(x, "stickyHeaderIndices", js.undefined)
    
    inline def setStickyHeaderIndicesVarargs(value: Double*): Self = StObject.set(x, "stickyHeaderIndices", js.Array(value*))
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setUpdateCellsBatchingPeriod(value: Double): Self = StObject.set(x, "updateCellsBatchingPeriod", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellsBatchingPeriodUndefined: Self = StObject.set(x, "updateCellsBatchingPeriod", js.undefined)
    
    inline def setUseART(value: Boolean): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    inline def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    inline def setViewabilityConfig(value: Any): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigCallbackPairs(value: ViewabilityConfigCallbackPairs): Self = StObject.set(x, "viewabilityConfigCallbackPairs", value.asInstanceOf[js.Any])
    
    inline def setViewabilityConfigCallbackPairsUndefined: Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.undefined)
    
    inline def setViewabilityConfigCallbackPairsVarargs(value: ViewabilityConfigCallbackPair*): Self = StObject.set(x, "viewabilityConfigCallbackPairs", js.Array(value*))
    
    inline def setViewabilityConfigUndefined: Self = StObject.set(x, "viewabilityConfig", js.undefined)
    
    inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    
    inline def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    inline def setZoomScaleUndefined: Self = StObject.set(x, "zoomScale", js.undefined)
  }
}

package typingsJapgolly.reactNativeMaps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityStates
import typingsJapgolly.reactNative.mod.AccessibilityTrait
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.button
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_checked
import typingsJapgolly.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeMaps.mod.Camera
import typingsJapgolly.reactNativeMaps.mod.EdgeInsets
import typingsJapgolly.reactNativeMaps.mod.EdgePadding
import typingsJapgolly.reactNativeMaps.mod.EventUserLocation
import typingsJapgolly.reactNativeMaps.mod.MapStyleElement
import typingsJapgolly.reactNativeMaps.mod.MapTypes
import typingsJapgolly.reactNativeMaps.mod.MapViewProps
import typingsJapgolly.reactNativeMaps.mod.Point
import typingsJapgolly.reactNativeMaps.mod.Region
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_MapViewProps1436244682[ComponentRef] () {
  val componentImport: js.Any
  def apply(
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
    cacheEnabled: js.UndefOr[Boolean] = js.undefined,
    camera: Camera = null,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    compassOffset: Point = null,
    customMapStyle: js.Array[MapStyleElement] = null,
    customMapStyleString: String = null,
    followsUserLocation: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    initialCamera: Camera = null,
    initialRegion: Region = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    kmlSrc: String = null,
    legalLabelInsets: EdgeInsets = null,
    liteMode: js.UndefOr[Boolean] = js.undefined,
    loadingBackgroundColor: String = null,
    loadingEnabled: js.UndefOr[Boolean] = js.undefined,
    loadingIndicatorColor: String = null,
    mapPadding: EdgePadding = null,
    mapType: MapTypes = null,
    maxDelta: Int | Double = null,
    maxZoomLevel: Int | Double = null,
    minDelta: Int | Double = null,
    minZoomLevel: Int | Double = null,
    moveOnMarkerPress: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onAccessibilityEscape: js.UndefOr[Callback] = js.undefined,
    onAccessibilityTap: js.UndefOr[Callback] = js.undefined,
    onCalloutPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onKmlReady: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onLayout: /* event */ LayoutChangeEvent => Callback = null,
    onLongPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMagicTap: js.UndefOr[Callback] = js.undefined,
    onMapReady: js.UndefOr[Callback] = js.undefined,
    onMarkerDeselect: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMarkerDrag: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMarkerDragEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMarkerDragStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMarkerPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMarkerSelect: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onPanDrag: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPoiClick: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onRegionChange: /* region */ Region => Callback = null,
    onRegionChangeComplete: /* region */ Region => Callback = null,
    onResponderEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderGrant: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderReject: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderRelease: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminate: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onResponderTerminationRequest: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onStartShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onTouchCancel: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEnd: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchEndCapture: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchMove: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onTouchStart: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onUserLocationChange: /* event */ EventUserLocation => Callback = null,
    pitchEnabled: js.UndefOr[Boolean] = js.undefined,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    provider: google = null,
    region: Region = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    rotateEnabled: js.UndefOr[Boolean] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showsBuildings: js.UndefOr[Boolean] = js.undefined,
    showsCompass: js.UndefOr[Boolean] = js.undefined,
    showsIndoorLevelPicker: js.UndefOr[Boolean] = js.undefined,
    showsIndoors: js.UndefOr[Boolean] = js.undefined,
    showsMyLocationButton: js.UndefOr[Boolean] = js.undefined,
    showsPointsOfInterest: js.UndefOr[Boolean] = js.undefined,
    showsScale: js.UndefOr[Boolean] = js.undefined,
    showsTraffic: js.UndefOr[Boolean] = js.undefined,
    showsUserLocation: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    toolbarEnabled: js.UndefOr[Boolean] = js.undefined,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    userLocationAnnotationTitle: String = null,
    zoomControlEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomEnabled: js.UndefOr[Boolean] = js.undefined,
    zoomTapEnabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MapViewProps, ComponentRef, Unit, MapViewProps] = {
    val __obj = js.Dynamic.literal()
  
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
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (compassOffset != null) __obj.updateDynamic("compassOffset")(compassOffset.asInstanceOf[js.Any])
    if (customMapStyle != null) __obj.updateDynamic("customMapStyle")(customMapStyle.asInstanceOf[js.Any])
    if (customMapStyleString != null) __obj.updateDynamic("customMapStyleString")(customMapStyleString.asInstanceOf[js.Any])
    if (!js.isUndefined(followsUserLocation)) __obj.updateDynamic("followsUserLocation")(followsUserLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (initialCamera != null) __obj.updateDynamic("initialCamera")(initialCamera.asInstanceOf[js.Any])
    if (initialRegion != null) __obj.updateDynamic("initialRegion")(initialRegion.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (kmlSrc != null) __obj.updateDynamic("kmlSrc")(kmlSrc.asInstanceOf[js.Any])
    if (legalLabelInsets != null) __obj.updateDynamic("legalLabelInsets")(legalLabelInsets.asInstanceOf[js.Any])
    if (!js.isUndefined(liteMode)) __obj.updateDynamic("liteMode")(liteMode.asInstanceOf[js.Any])
    if (loadingBackgroundColor != null) __obj.updateDynamic("loadingBackgroundColor")(loadingBackgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(loadingEnabled)) __obj.updateDynamic("loadingEnabled")(loadingEnabled.asInstanceOf[js.Any])
    if (loadingIndicatorColor != null) __obj.updateDynamic("loadingIndicatorColor")(loadingIndicatorColor.asInstanceOf[js.Any])
    if (mapPadding != null) __obj.updateDynamic("mapPadding")(mapPadding.asInstanceOf[js.Any])
    if (mapType != null) __obj.updateDynamic("mapType")(mapType.asInstanceOf[js.Any])
    if (maxDelta != null) __obj.updateDynamic("maxDelta")(maxDelta.asInstanceOf[js.Any])
    if (maxZoomLevel != null) __obj.updateDynamic("maxZoomLevel")(maxZoomLevel.asInstanceOf[js.Any])
    if (minDelta != null) __obj.updateDynamic("minDelta")(minDelta.asInstanceOf[js.Any])
    if (minZoomLevel != null) __obj.updateDynamic("minZoomLevel")(minZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnMarkerPress)) __obj.updateDynamic("moveOnMarkerPress")(moveOnMarkerPress.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onAccessibilityAction(t0).runNow()))
    onAccessibilityEscape.foreach(p => __obj.updateDynamic("onAccessibilityEscape")(p.toJsFn))
    onAccessibilityTap.foreach(p => __obj.updateDynamic("onAccessibilityTap")(p.toJsFn))
    if (onCalloutPress != null) __obj.updateDynamic("onCalloutPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onCalloutPress(t0).runNow()))
    if (onKmlReady != null) __obj.updateDynamic("onKmlReady")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onKmlReady(t0).runNow()))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNative.mod.LayoutChangeEvent) => onLayout(t0).runNow()))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    onMagicTap.foreach(p => __obj.updateDynamic("onMagicTap")(p.toJsFn))
    onMapReady.foreach(p => __obj.updateDynamic("onMapReady")(p.toJsFn))
    if (onMarkerDeselect != null) __obj.updateDynamic("onMarkerDeselect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMarkerDeselect(t0).runNow()))
    if (onMarkerDrag != null) __obj.updateDynamic("onMarkerDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMarkerDrag(t0).runNow()))
    if (onMarkerDragEnd != null) __obj.updateDynamic("onMarkerDragEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMarkerDragEnd(t0).runNow()))
    if (onMarkerDragStart != null) __obj.updateDynamic("onMarkerDragStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMarkerDragStart(t0).runNow()))
    if (onMarkerPress != null) __obj.updateDynamic("onMarkerPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMarkerPress(t0).runNow()))
    if (onMarkerSelect != null) __obj.updateDynamic("onMarkerSelect")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMarkerSelect(t0).runNow()))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponderCapture(t0).runNow()))
    if (onPanDrag != null) __obj.updateDynamic("onPanDrag")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPanDrag(t0).runNow()))
    if (onPoiClick != null) __obj.updateDynamic("onPoiClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPoiClick(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onRegionChange != null) __obj.updateDynamic("onRegionChange")(js.Any.fromFunction1((t0: /* region */ typingsJapgolly.reactNativeMaps.mod.Region) => onRegionChange(t0).runNow()))
    if (onRegionChangeComplete != null) __obj.updateDynamic("onRegionChangeComplete")(js.Any.fromFunction1((t0: /* region */ typingsJapgolly.reactNativeMaps.mod.Region) => onRegionChangeComplete(t0).runNow()))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderEnd(t0).runNow()))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderGrant(t0).runNow()))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderMove(t0).runNow()))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderReject(t0).runNow()))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderRelease(t0).runNow()))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderStart(t0).runNow()))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminate(t0).runNow()))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onResponderTerminationRequest(t0).runNow()))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponder(t0).runNow()))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onStartShouldSetResponderCapture(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchEndCapture(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onTouchStart(t0).runNow()))
    if (onUserLocationChange != null) __obj.updateDynamic("onUserLocationChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactNativeMaps.mod.EventUserLocation) => onUserLocationChange(t0).runNow()))
    if (!js.isUndefined(pitchEnabled)) __obj.updateDynamic("pitchEnabled")(pitchEnabled.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateEnabled)) __obj.updateDynamic("rotateEnabled")(rotateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(showsBuildings)) __obj.updateDynamic("showsBuildings")(showsBuildings.asInstanceOf[js.Any])
    if (!js.isUndefined(showsCompass)) __obj.updateDynamic("showsCompass")(showsCompass.asInstanceOf[js.Any])
    if (!js.isUndefined(showsIndoorLevelPicker)) __obj.updateDynamic("showsIndoorLevelPicker")(showsIndoorLevelPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(showsIndoors)) __obj.updateDynamic("showsIndoors")(showsIndoors.asInstanceOf[js.Any])
    if (!js.isUndefined(showsMyLocationButton)) __obj.updateDynamic("showsMyLocationButton")(showsMyLocationButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showsPointsOfInterest)) __obj.updateDynamic("showsPointsOfInterest")(showsPointsOfInterest.asInstanceOf[js.Any])
    if (!js.isUndefined(showsScale)) __obj.updateDynamic("showsScale")(showsScale.asInstanceOf[js.Any])
    if (!js.isUndefined(showsTraffic)) __obj.updateDynamic("showsTraffic")(showsTraffic.asInstanceOf[js.Any])
    if (!js.isUndefined(showsUserLocation)) __obj.updateDynamic("showsUserLocation")(showsUserLocation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarEnabled)) __obj.updateDynamic("toolbarEnabled")(toolbarEnabled.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (userLocationAnnotationTitle != null) __obj.updateDynamic("userLocationAnnotationTitle")(userLocationAnnotationTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControlEnabled)) __obj.updateDynamic("zoomControlEnabled")(zoomControlEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnabled)) __obj.updateDynamic("zoomEnabled")(zoomEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomTapEnabled)) __obj.updateDynamic("zoomTapEnabled")(zoomTapEnabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaps.mod.MapViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaps.mod.MapViewProps])(children: _*)
  }
}


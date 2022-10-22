package typingsJapgolly.reactNativeMaps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.Camera
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.Details
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.EdgePadding
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.IndoorBuildingEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.IndoorLevelActivatedEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.KmlMapEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.LongPressEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.MapPressEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.MapStyleElement
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.MapType
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.PanDragEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.PoiClickEvent
import typingsJapgolly.reactNativeMaps.libMapViewDottypesMod.UserLocationChangeEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.CalloutPressEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.ClickEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerDeselectEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerDragEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerDragStartEndEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerPressEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.MarkerSelectEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Point
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Provider
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Region
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.always
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.automatic
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.balanced
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.dark
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.high
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.light
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.low
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.never
import typingsJapgolly.reactNativeMaps.reactNativeMapsStrings.passive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_MapViewProps676906321[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
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
  
  inline def cacheEnabled(value: Boolean): this.type = set("cacheEnabled", value.asInstanceOf[js.Any])
  
  inline def camera(value: Camera): this.type = set("camera", value.asInstanceOf[js.Any])
  
  inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
  
  inline def compassOffset(value: Point): this.type = set("compassOffset", value.asInstanceOf[js.Any])
  
  inline def customMapStyle(value: js.Array[MapStyleElement]): this.type = set("customMapStyle", value.asInstanceOf[js.Any])
  
  inline def customMapStyleVarargs(value: MapStyleElement*): this.type = set("customMapStyle", js.Array(value*))
  
  inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  inline def followsUserLocation(value: Boolean): this.type = set("followsUserLocation", value.asInstanceOf[js.Any])
  
  inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
  
  inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
  
  inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
  
  inline def initialCamera(value: Camera): this.type = set("initialCamera", value.asInstanceOf[js.Any])
  
  inline def initialRegion(value: Region): this.type = set("initialRegion", value.asInstanceOf[js.Any])
  
  inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
  
  inline def kmlSrc(value: String): this.type = set("kmlSrc", value.asInstanceOf[js.Any])
  
  inline def legalLabelInsets(value: EdgePadding): this.type = set("legalLabelInsets", value.asInstanceOf[js.Any])
  
  inline def liteMode(value: Boolean): this.type = set("liteMode", value.asInstanceOf[js.Any])
  
  inline def loadingBackgroundColor(value: String): this.type = set("loadingBackgroundColor", value.asInstanceOf[js.Any])
  
  inline def loadingEnabled(value: Boolean): this.type = set("loadingEnabled", value.asInstanceOf[js.Any])
  
  inline def loadingIndicatorColor(value: String): this.type = set("loadingIndicatorColor", value.asInstanceOf[js.Any])
  
  inline def mapPadding(value: EdgePadding): this.type = set("mapPadding", value.asInstanceOf[js.Any])
  
  inline def mapType(value: MapType): this.type = set("mapType", value.asInstanceOf[js.Any])
  
  inline def maxDelta(value: Double): this.type = set("maxDelta", value.asInstanceOf[js.Any])
  
  inline def maxZoomLevel(value: Double): this.type = set("maxZoomLevel", value.asInstanceOf[js.Any])
  
  inline def minDelta(value: Double): this.type = set("minDelta", value.asInstanceOf[js.Any])
  
  inline def minZoomLevel(value: Double): this.type = set("minZoomLevel", value.asInstanceOf[js.Any])
  
  inline def moveOnMarkerPress(value: Boolean): this.type = set("moveOnMarkerPress", value.asInstanceOf[js.Any])
  
  inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
  
  inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
  
  inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
  
  inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
  
  inline def onCalloutPress(value: /* event */ CalloutPressEvent => Callback): this.type = set("onCalloutPress", js.Any.fromFunction1((t0: /* event */ CalloutPressEvent) => value(t0).runNow()))
  
  inline def onDoublePress(value: /* event */ ClickEvent[js.Object] => Callback): this.type = set("onDoublePress", js.Any.fromFunction1((t0: /* event */ ClickEvent[js.Object]) => value(t0).runNow()))
  
  inline def onIndoorBuildingFocused(value: /* event */ IndoorBuildingEvent => Callback): this.type = set("onIndoorBuildingFocused", js.Any.fromFunction1((t0: /* event */ IndoorBuildingEvent) => value(t0).runNow()))
  
  inline def onIndoorLevelActivated(value: /* event */ IndoorLevelActivatedEvent => Callback): this.type = set("onIndoorLevelActivated", js.Any.fromFunction1((t0: /* event */ IndoorLevelActivatedEvent) => value(t0).runNow()))
  
  inline def onKmlReady(value: /* event */ KmlMapEvent => Callback): this.type = set("onKmlReady", js.Any.fromFunction1((t0: /* event */ KmlMapEvent) => value(t0).runNow()))
  
  inline def onLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onLongPress(value: /* event */ LongPressEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ LongPressEvent) => value(t0).runNow()))
  
  inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
  
  inline def onMapLoaded(value: /* event */ NativeSyntheticEvent[js.Object] => Callback): this.type = set("onMapLoaded", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[js.Object]) => value(t0).runNow()))
  
  inline def onMapReady(value: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]] => Callback): this.type = set("onMapReady", js.Any.fromFunction1((t0: /* event */ js.UndefOr[NativeSyntheticEvent[js.Object]]) => value(t0).runNow()))
  
  inline def onMarkerDeselect(value: /* event */ MarkerDeselectEvent => Callback): this.type = set("onMarkerDeselect", js.Any.fromFunction1((t0: /* event */ MarkerDeselectEvent) => value(t0).runNow()))
  
  inline def onMarkerDrag(value: /* event */ MarkerDragEvent => Callback): this.type = set("onMarkerDrag", js.Any.fromFunction1((t0: /* event */ MarkerDragEvent) => value(t0).runNow()))
  
  inline def onMarkerDragEnd(value: /* event */ MarkerDragStartEndEvent => Callback): this.type = set("onMarkerDragEnd", js.Any.fromFunction1((t0: /* event */ MarkerDragStartEndEvent) => value(t0).runNow()))
  
  inline def onMarkerDragStart(value: /* event */ MarkerDragStartEndEvent => Callback): this.type = set("onMarkerDragStart", js.Any.fromFunction1((t0: /* event */ MarkerDragStartEndEvent) => value(t0).runNow()))
  
  inline def onMarkerPress(value: /* event */ MarkerPressEvent => Callback): this.type = set("onMarkerPress", js.Any.fromFunction1((t0: /* event */ MarkerPressEvent) => value(t0).runNow()))
  
  inline def onMarkerSelect(value: /* event */ MarkerSelectEvent => Callback): this.type = set("onMarkerSelect", js.Any.fromFunction1((t0: /* event */ MarkerSelectEvent) => value(t0).runNow()))
  
  inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onPanDrag(value: /* event */ PanDragEvent => Callback): this.type = set("onPanDrag", js.Any.fromFunction1((t0: /* event */ PanDragEvent) => value(t0).runNow()))
  
  inline def onPoiClick(value: /* event */ PoiClickEvent => Callback): this.type = set("onPoiClick", js.Any.fromFunction1((t0: /* event */ PoiClickEvent) => value(t0).runNow()))
  
  inline def onPointerCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerCancelCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerCancelCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerDown(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerDown", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerDownCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerDownCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerEnter(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerEnter", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerEnterCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerEnterCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerLeave(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerLeave", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerLeaveCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerMoveCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerMoveCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerUp(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerUp", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPointerUpCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onPointerUpCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onPress(value: /* event */ MapPressEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ MapPressEvent) => value(t0).runNow()))
  
  inline def onRegionChange(value: (/* region */ Region, /* details */ Details) => Callback): this.type = set("onRegionChange", js.Any.fromFunction2((t0: /* region */ Region, t1: /* details */ Details) => (value(t0, t1)).runNow()))
  
  inline def onRegionChangeComplete(value: (/* region */ Region, /* details */ Details) => Callback): this.type = set("onRegionChangeComplete", js.Any.fromFunction2((t0: /* region */ Region, t1: /* details */ Details) => (value(t0, t1)).runNow()))
  
  inline def onResponderEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderGrant(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderGrant", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderReject(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderReject", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderRelease(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderRelease", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderTerminate(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onResponderTerminate", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onResponderTerminationRequest(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
  
  inline def onStartShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
  
  inline def onStartShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
  
  inline def onTouchCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onTouchEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onTouchEndCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onTouchMove(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onTouchStart(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  
  inline def onUserLocationChange(value: /* event */ UserLocationChangeEvent => Callback): this.type = set("onUserLocationChange", js.Any.fromFunction1((t0: /* event */ UserLocationChangeEvent) => value(t0).runNow()))
  
  inline def paddingAdjustmentBehavior(value: always | automatic | never): this.type = set("paddingAdjustmentBehavior", value.asInstanceOf[js.Any])
  
  inline def pitchEnabled(value: Boolean): this.type = set("pitchEnabled", value.asInstanceOf[js.Any])
  
  inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
  
  inline def provider(value: Provider): this.type = set("provider", value.asInstanceOf[js.Any])
  
  inline def region(value: Region): this.type = set("region", value.asInstanceOf[js.Any])
  
  inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
  
  inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
  
  inline def rotateEnabled(value: Boolean): this.type = set("rotateEnabled", value.asInstanceOf[js.Any])
  
  inline def scrollDuringRotateOrZoomEnabled(value: Boolean): this.type = set("scrollDuringRotateOrZoomEnabled", value.asInstanceOf[js.Any])
  
  inline def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
  
  inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
  
  inline def showsBuildings(value: Boolean): this.type = set("showsBuildings", value.asInstanceOf[js.Any])
  
  inline def showsCompass(value: Boolean): this.type = set("showsCompass", value.asInstanceOf[js.Any])
  
  inline def showsIndoorLevelPicker(value: Boolean): this.type = set("showsIndoorLevelPicker", value.asInstanceOf[js.Any])
  
  inline def showsIndoors(value: Boolean): this.type = set("showsIndoors", value.asInstanceOf[js.Any])
  
  inline def showsMyLocationButton(value: Boolean): this.type = set("showsMyLocationButton", value.asInstanceOf[js.Any])
  
  inline def showsPointsOfInterest(value: Boolean): this.type = set("showsPointsOfInterest", value.asInstanceOf[js.Any])
  
  inline def showsScale(value: Boolean): this.type = set("showsScale", value.asInstanceOf[js.Any])
  
  inline def showsTraffic(value: Boolean): this.type = set("showsTraffic", value.asInstanceOf[js.Any])
  
  inline def showsUserLocation(value: Boolean): this.type = set("showsUserLocation", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
  
  inline def tintColor(value: String): this.type = set("tintColor", value.asInstanceOf[js.Any])
  
  inline def toolbarEnabled(value: Boolean): this.type = set("toolbarEnabled", value.asInstanceOf[js.Any])
  
  inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
  
  inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
  
  inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
  
  inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
  
  inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
  
  inline def userInterfaceStyle(value: light | dark): this.type = set("userInterfaceStyle", value.asInstanceOf[js.Any])
  
  inline def userLocationAnnotationTitle(value: String): this.type = set("userLocationAnnotationTitle", value.asInstanceOf[js.Any])
  
  inline def userLocationCalloutEnabled(value: Boolean): this.type = set("userLocationCalloutEnabled", value.asInstanceOf[js.Any])
  
  inline def userLocationFastestInterval(value: Double): this.type = set("userLocationFastestInterval", value.asInstanceOf[js.Any])
  
  inline def userLocationPriority(value: balanced | high | low | passive): this.type = set("userLocationPriority", value.asInstanceOf[js.Any])
  
  inline def userLocationUpdateInterval(value: Double): this.type = set("userLocationUpdateInterval", value.asInstanceOf[js.Any])
  
  inline def zoomControlEnabled(value: Boolean): this.type = set("zoomControlEnabled", value.asInstanceOf[js.Any])
  
  inline def zoomEnabled(value: Boolean): this.type = set("zoomEnabled", value.asInstanceOf[js.Any])
  
  inline def zoomTapEnabled(value: Boolean): this.type = set("zoomTapEnabled", value.asInstanceOf[js.Any])
}

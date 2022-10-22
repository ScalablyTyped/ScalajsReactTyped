package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.AccessibilityActionInfo
import typingsJapgolly.reactNative.mod.AccessibilityRole
import typingsJapgolly.reactNative.mod.AccessibilityState
import typingsJapgolly.reactNative.mod.AccessibilityValue
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TVParallaxProperties
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsJapgolly.reactNative.reactNativeStrings.assertive
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.no
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.polite
import typingsJapgolly.reactNative.reactNativeStrings.yes
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FillRule
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontObject
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontStretch
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontStyle
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontVariant
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontVariantLigatures
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontWeight
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Linecap
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Linejoin
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TextAnchor
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TextDecoration
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformObject
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.VectorEffect
import typingsJapgolly.reactNativeSvg.libTypescriptLocalSvgMod.LocalProps
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`box-only`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalSvg {
  
  inline def apply(asset: ImageSourcePropType): Builder = {
    val __props = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalProps]))
  }
  
  @JSImport("react-native-svg", "LocalSvg")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
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
    
    inline def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    inline def clipRule(value: FillRule): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    inline def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorValue): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fill(value: ColorValue): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillOpacity(value: NumberProp): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    inline def fillRule(value: FillRule): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def font(value: FontObject): this.type = set("font", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontFeatureSettings(value: String): this.type = set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: NumberProp): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontStretch(value: FontStretch): this.type = set("fontStretch", value.asInstanceOf[js.Any])
    
    inline def fontStyle(value: FontStyle): this.type = set("fontStyle", value.asInstanceOf[js.Any])
    
    inline def fontVariant(value: FontVariant): this.type = set("fontVariant", value.asInstanceOf[js.Any])
    
    inline def fontVariantLigatures(value: FontVariantLigatures): this.type = set("fontVariantLigatures", value.asInstanceOf[js.Any])
    
    inline def fontVariationSettings(value: String): this.type = set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    inline def fontWeight(value: FontWeight): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def height(value: NumberProp): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def kerning(value: NumberProp): this.type = set("kerning", value.asInstanceOf[js.Any])
    
    inline def letterSpacing(value: NumberProp): this.type = set("letterSpacing", value.asInstanceOf[js.Any])
    
    inline def marker(value: String): this.type = set("marker", value.asInstanceOf[js.Any])
    
    inline def markerEnd(value: String): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    inline def markerMid(value: String): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    inline def markerStart(value: String): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    inline def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
    
    inline def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def onAccessibilityAction(value: ReactEventFrom[NodeHandle & Element] => Callback): this.type = set("onAccessibilityAction", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def onAccessibilityEscape(value: Callback): this.type = set("onAccessibilityEscape", value.toJsFn)
    
    inline def onAccessibilityTap(value: Callback): this.type = set("onAccessibilityTap", value.toJsFn)
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onLongPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onMagicTap(value: Callback): this.type = set("onMagicTap", value.toJsFn)
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
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
    
    inline def onPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPressIn(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressIn", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onPressOut(value: /* event */ GestureResponderEvent => Callback): this.type = set("onPressOut", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
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
    
    inline def opacity(value: NumberProp): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    inline def origin(value: NumberArray): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def originVarargs(value: NumberProp*): this.type = set("origin", js.Array(value*))
    
    inline def originX(value: NumberProp): this.type = set("originX", value.asInstanceOf[js.Any])
    
    inline def originY(value: NumberProp): this.type = set("originY", value.asInstanceOf[js.Any])
    
    inline def `override`(value: js.Object): this.type = set("override", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(
      value: `box-none` | typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.none | `box-only` | typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.auto
    ): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def rotation(value: NumberProp): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def scale(value: NumberArray): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleVarargs(value: NumberProp*): this.type = set("scale", js.Array(value*))
    
    inline def scaleX(value: NumberProp): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    inline def scaleY(value: NumberProp): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
    inline def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def skew(value: NumberArray): this.type = set("skew", value.asInstanceOf[js.Any])
    
    inline def skewVarargs(value: NumberProp*): this.type = set("skew", js.Array(value*))
    
    inline def skewX(value: NumberProp): this.type = set("skewX", value.asInstanceOf[js.Any])
    
    inline def skewY(value: NumberProp): this.type = set("skewY", value.asInstanceOf[js.Any])
    
    inline def stroke(value: ColorValue): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeDasharray(value: js.Array[NumberProp] | NumberProp): this.type = set("strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def strokeDasharrayVarargs(value: NumberProp*): this.type = set("strokeDasharray", js.Array(value*))
    
    inline def strokeDashoffset(value: NumberProp): this.type = set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    inline def strokeLinecap(value: Linecap): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def strokeLinejoin(value: Linejoin): this.type = set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def strokeMiterlimit(value: NumberProp): this.type = set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    inline def strokeOpacity(value: NumberProp): this.type = set("strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: NumberProp): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def textAnchor(value: TextAnchor): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    inline def textDecoration(value: TextDecoration): this.type = set("textDecoration", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def transform(value: ColumnMajorTransformMatrix | String | TransformObject): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def translate(value: NumberArray): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def translateVarargs(value: NumberProp*): this.type = set("translate", js.Array(value*))
    
    inline def translateX(value: NumberProp): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    inline def translateY(value: NumberProp): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def vectorEffect(value: VectorEffect): this.type = set("vectorEffect", value.asInstanceOf[js.Any])
    
    inline def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    inline def width(value: NumberProp): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wordSpacing(value: NumberProp): this.type = set("wordSpacing", value.asInstanceOf[js.Any])
    
    inline def x(value: NumberArray): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def xVarargs(value: NumberProp*): this.type = set("x", js.Array(value*))
    
    inline def y(value: NumberArray): this.type = set("y", value.asInstanceOf[js.Any])
    
    inline def yVarargs(value: NumberProp*): this.type = set("y", js.Array(value*))
  }
  
  def withProps(p: LocalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactNativeSvg.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNativeSvg.libTypescriptElementsMaskMod.MaskProps
import typingsJapgolly.reactNativeSvg.libTypescriptElementsMaskMod.TMaskUnits
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FillRule
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Linecap
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Linejoin
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformObject
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.VectorEffect
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`box-only`
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.auto
import typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mask {
  
  @JSImport("react-native-svg", "Mask")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeSvg.mod.Mask] {
    
    inline def clipPath(value: String): this.type = set("clipPath", value.asInstanceOf[js.Any])
    
    inline def clipRule(value: FillRule): this.type = set("clipRule", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    
    inline def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fill(value: ColorValue): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillOpacity(value: NumberProp): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    inline def fillRule(value: FillRule): this.type = set("fillRule", value.asInstanceOf[js.Any])
    
    inline def height(value: NumberProp): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def marker(value: String): this.type = set("marker", value.asInstanceOf[js.Any])
    
    inline def markerEnd(value: String): this.type = set("markerEnd", value.asInstanceOf[js.Any])
    
    inline def markerMid(value: String): this.type = set("markerMid", value.asInstanceOf[js.Any])
    
    inline def markerStart(value: String): this.type = set("markerStart", value.asInstanceOf[js.Any])
    
    inline def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def maskContentUnits(value: TMaskUnits): this.type = set("maskContentUnits", value.asInstanceOf[js.Any])
    
    inline def maskTransform(value: ColumnMajorTransformMatrix | String): this.type = set("maskTransform", value.asInstanceOf[js.Any])
    
    inline def maskUnits(value: TMaskUnits): this.type = set("maskUnits", value.asInstanceOf[js.Any])
    
    inline def onLayout(value: /* event */ LayoutChangeEvent => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* event */ LayoutChangeEvent) => value(t0).runNow()))
    
    inline def onLongPress(value: /* event */ GestureResponderEvent => Callback): this.type = set("onLongPress", js.Any.fromFunction1((t0: /* event */ GestureResponderEvent) => value(t0).runNow()))
    
    inline def onMoveShouldSetResponder(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    inline def onMoveShouldSetResponderCapture(value: ReactEventFrom[NodeHandle & Element] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
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
    
    inline def origin(value: NumberArray): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def originVarargs(value: NumberProp*): this.type = set("origin", js.Array(value*))
    
    inline def originX(value: NumberProp): this.type = set("originX", value.asInstanceOf[js.Any])
    
    inline def originY(value: NumberProp): this.type = set("originY", value.asInstanceOf[js.Any])
    
    inline def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    
    inline def rotation(value: NumberProp): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def scale(value: NumberArray): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def scaleVarargs(value: NumberProp*): this.type = set("scale", js.Array(value*))
    
    inline def scaleX(value: NumberProp): this.type = set("scaleX", value.asInstanceOf[js.Any])
    
    inline def scaleY(value: NumberProp): this.type = set("scaleY", value.asInstanceOf[js.Any])
    
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
    
    inline def transform(value: ColumnMajorTransformMatrix | String | TransformObject): this.type = set("transform", value.asInstanceOf[js.Any])
    
    inline def translate(value: NumberArray): this.type = set("translate", value.asInstanceOf[js.Any])
    
    inline def translateVarargs(value: NumberProp*): this.type = set("translate", js.Array(value*))
    
    inline def translateX(value: NumberProp): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    inline def translateY(value: NumberProp): this.type = set("translateY", value.asInstanceOf[js.Any])
    
    inline def vectorEffect(value: VectorEffect): this.type = set("vectorEffect", value.asInstanceOf[js.Any])
    
    inline def width(value: NumberProp): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: NumberProp): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: NumberProp): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Mask.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MaskProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

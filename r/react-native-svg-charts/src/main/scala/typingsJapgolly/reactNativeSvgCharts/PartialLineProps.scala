package typingsJapgolly.reactNativeSvgCharts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNativeSvg.mod.Color
import typingsJapgolly.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.mod.FillRule
import typingsJapgolly.reactNativeSvg.mod.Linecap
import typingsJapgolly.reactNativeSvg.mod.Linejoin
import typingsJapgolly.reactNativeSvg.mod.NumberArray
import typingsJapgolly.reactNativeSvg.mod.NumberProp
import typingsJapgolly.reactNativeSvg.mod.TransformObject
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-none`
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.`box-only`
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.`non-scaling-stroke`
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.auto
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.default
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.inherit
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.nonScalingStroke
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.none
import typingsJapgolly.reactNativeSvgCharts.reactNativeSvgChartsStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-svg.react-native-svg.LineProps> */
trait PartialLineProps extends js.Object {
  var clipPath: js.UndefOr[String] = js.undefined
  var clipRule: js.UndefOr[FillRule] = js.undefined
  var delayLongPress: js.UndefOr[Double] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var delayPressOut: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Color] = js.undefined
  var fillOpacity: js.UndefOr[NumberProp] = js.undefined
  var fillRule: js.UndefOr[FillRule] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var marker: js.UndefOr[String] = js.undefined
  var markerEnd: js.UndefOr[String] = js.undefined
  var markerMid: js.UndefOr[String] = js.undefined
  var markerStart: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onPress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderEnd: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderMove: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderReject: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Unit]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle with Element], Boolean]] = js.undefined
  var opacity: js.UndefOr[NumberProp] = js.undefined
  var origin: js.UndefOr[NumberArray] = js.undefined
  var originX: js.UndefOr[NumberProp] = js.undefined
  var originY: js.UndefOr[NumberProp] = js.undefined
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  var rotation: js.UndefOr[NumberProp] = js.undefined
  var scale: js.UndefOr[NumberArray] = js.undefined
  var scaleX: js.UndefOr[NumberProp] = js.undefined
  var scaleY: js.UndefOr[NumberProp] = js.undefined
  var skew: js.UndefOr[NumberArray] = js.undefined
  var skewX: js.UndefOr[NumberProp] = js.undefined
  var skewY: js.UndefOr[NumberProp] = js.undefined
  var stroke: js.UndefOr[Color] = js.undefined
  var strokeDasharray: js.UndefOr[js.Array[NumberProp] | NumberProp] = js.undefined
  var strokeDashoffset: js.UndefOr[NumberProp] = js.undefined
  var strokeLinecap: js.UndefOr[Linecap] = js.undefined
  var strokeLinejoin: js.UndefOr[Linejoin] = js.undefined
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.undefined
  var strokeOpacity: js.UndefOr[NumberProp] = js.undefined
  var strokeWidth: js.UndefOr[NumberProp] = js.undefined
  var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformObject] = js.undefined
  var translate: js.UndefOr[NumberArray] = js.undefined
  var translateX: js.UndefOr[NumberProp] = js.undefined
  var translateY: js.UndefOr[NumberProp] = js.undefined
  var vectorEffect: js.UndefOr[none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri] = js.undefined
  var x: js.UndefOr[NumberArray] = js.undefined
  var x1: js.UndefOr[NumberProp] = js.undefined
  var x2: js.UndefOr[NumberProp] = js.undefined
  var y: js.UndefOr[NumberArray] = js.undefined
  var y1: js.UndefOr[NumberProp] = js.undefined
  var y2: js.UndefOr[NumberProp] = js.undefined
}

object PartialLineProps {
  @scala.inline
  def apply(
    clipPath: String = null,
    clipRule: FillRule = null,
    delayLongPress: Int | Double = null,
    delayPressIn: Int | Double = null,
    delayPressOut: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: Color = null,
    fillOpacity: NumberProp = null,
    fillRule: FillRule = null,
    id: String = null,
    marker: String = null,
    markerEnd: String = null,
    markerMid: String = null,
    markerStart: String = null,
    mask: String = null,
    onLongPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onMoveShouldSetResponder: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onMoveShouldSetResponderCapture: ReactEventFrom[NodeHandle with Element] => CallbackTo[Boolean] = null,
    onPress: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressIn: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onPressOut: ReactEventFrom[NodeHandle with Element] => Callback = null,
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
    opacity: NumberProp = null,
    origin: NumberArray = null,
    originX: NumberProp = null,
    originY: NumberProp = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    rotation: NumberProp = null,
    scale: NumberArray = null,
    scaleX: NumberProp = null,
    scaleY: NumberProp = null,
    skew: NumberArray = null,
    skewX: NumberProp = null,
    skewY: NumberProp = null,
    stroke: Color = null,
    strokeDasharray: js.Array[NumberProp] | NumberProp = null,
    strokeDashoffset: NumberProp = null,
    strokeLinecap: Linecap = null,
    strokeLinejoin: Linejoin = null,
    strokeMiterlimit: NumberProp = null,
    strokeOpacity: NumberProp = null,
    strokeWidth: NumberProp = null,
    transform: ColumnMajorTransformMatrix | String | TransformObject = null,
    translate: NumberArray = null,
    translateX: NumberProp = null,
    translateY: NumberProp = null,
    vectorEffect: none | `non-scaling-stroke` | nonScalingStroke | default | inherit | uri = null,
    x: NumberArray = null,
    x1: NumberProp = null,
    x2: NumberProp = null,
    y: NumberArray = null,
    y1: NumberProp = null,
    y2: NumberProp = null
  ): PartialLineProps = {
    val __obj = js.Dynamic.literal()
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onLongPress(t0).runNow()))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponder(t0).runNow()))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onMoveShouldSetResponderCapture(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPress(t0).runNow()))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressIn(t0).runNow()))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onPressOut(t0).runNow()))
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
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (skew != null) __obj.updateDynamic("skew")(skew.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLineProps]
  }
}


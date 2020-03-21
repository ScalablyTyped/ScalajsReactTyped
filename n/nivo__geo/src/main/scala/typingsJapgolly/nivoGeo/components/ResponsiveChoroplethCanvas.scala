package typingsJapgolly.nivoGeo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.nivoGeo.PartialBox
import typingsJapgolly.nivoGeo.PartialTheme
import typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature
import typingsJapgolly.nivoGeo.mod.ChoroplethCanvasProps
import typingsJapgolly.nivoGeo.mod.ChoroplethTooltip
import typingsJapgolly.nivoGeo.mod.DatumMatcher
import typingsJapgolly.nivoGeo.mod.FeatureAccessor
import typingsJapgolly.nivoGeo.mod.GeoProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveChoroplethCanvas {
  def apply(
    data: js.Array[_],
    domain: js.Array[Double],
    features: js.Array[_],
    borderColor: String | (FeatureAccessor[ChoroplethBoundFeature, Double]) = null,
    borderWidth: Double | (FeatureAccessor[ChoroplethBoundFeature, Double]) = null,
    colors: String | js.Array[String] | (FeatureAccessor[_, String]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[ChoroplethBoundFeature, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | (FeatureAccessor[_, String]) = null,
    margin: PartialBox = null,
    `match`: String | DatumMatcher = null,
    onClick: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseEnter: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseLeave: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseMove: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    pixelRatio: Int | Double = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null,
    tooltip: ChoroplethTooltip = null,
    unknownColor: String = null,
    value: String | (FeatureAccessor[_, Double]) = null,
    valueFormat: String | (FeatureAccessor[_, String | Double]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ChoroplethCanvasProps, 
    typingsJapgolly.nivoGeo.mod.ResponsiveChoroplethCanvas, 
    Unit, 
    ChoroplethCanvasProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
  
      if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor.asInstanceOf[js.Any])
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onClick(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseEnter(t0, t1).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseLeave(t0, t1).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseMove(t0, t1).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation.asInstanceOf[js.Any])
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (unknownColor != null) __obj.updateDynamic("unknownColor")(unknownColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoGeo.mod.ChoroplethCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoGeo.mod.ResponsiveChoroplethCanvas](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoGeo.mod.ChoroplethCanvasProps])(children: _*)
  }
  @JSImport("@nivo/geo", "ResponsiveChoroplethCanvas")
  @js.native
  object componentImport extends js.Object
  
}


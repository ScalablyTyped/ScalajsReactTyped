package typingsJapgolly.nivoGeo.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.nivoGeo.PartialBox
import typingsJapgolly.nivoGeo.PartialTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMapCanvasProps extends GeoMapCommonProps {
  var pixelRatio: js.UndefOr[Double] = js.undefined
}

object GeoMapCanvasProps {
  @scala.inline
  def apply(
    features: js.Array[_],
    borderColor: String | (FeatureAccessor[_, Double]) = null,
    borderWidth: Double | (FeatureAccessor[_, Double]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[_, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: PartialBox = null,
    onClick: (/* feature */ js.Any, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseEnter: (/* feature */ js.Any, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseLeave: (/* feature */ js.Any, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    onMouseMove: (/* feature */ js.Any, /* event */ ReactMouseEventFrom[js.Any with Element]) => Callback = null,
    pixelRatio: Int | Double = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null,
    tooltip: GeoMapTooltip = null
  ): GeoMapCanvasProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor.asInstanceOf[js.Any])
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* feature */ js.Any, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onClick(t0, t1).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2((t0: /* feature */ js.Any, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseEnter(t0, t1).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2((t0: /* feature */ js.Any, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseLeave(t0, t1).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2((t0: /* feature */ js.Any, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onMouseMove(t0, t1).runNow()))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation.asInstanceOf[js.Any])
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMapCanvasProps]
  }
}


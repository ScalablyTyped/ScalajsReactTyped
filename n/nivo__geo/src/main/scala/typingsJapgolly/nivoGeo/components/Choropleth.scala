package typingsJapgolly.nivoGeo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.mod.Dimensions
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoGeo.anon.PartialBox
import typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature
import typingsJapgolly.nivoGeo.mod.ChoroplethProps
import typingsJapgolly.nivoGeo.mod.ChoroplethTooltip
import typingsJapgolly.nivoGeo.mod.DatumMatcher
import typingsJapgolly.nivoGeo.mod.FeatureAccessor
import typingsJapgolly.nivoGeo.mod.GeoProjectionType
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Choropleth {
  
  inline def apply(
    data: js.Array[Any],
    domain: js.Array[Double],
    features: js.Array[Any],
    height: Double,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChoroplethProps & Dimensions]))
  }
  
  @JSImport("@nivo/geo", "Choropleth")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.nivoGeo.mod.Choropleth] {
    
    inline def borderColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, Double])): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderColorFunction1(value: ChoroplethBoundFeature => Double): this.type = set("borderColor", js.Any.fromFunction1(value))
    
    inline def borderWidth(value: Double | (FeatureAccessor[ChoroplethBoundFeature, Double])): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def borderWidthFunction1(value: ChoroplethBoundFeature => Double): this.type = set("borderWidth", js.Any.fromFunction1(value))
    
    inline def colors(value: String | js.Array[String] | (FeatureAccessor[Any, String])): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Any => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def enableGraticule(value: Boolean): this.type = set("enableGraticule", value.asInstanceOf[js.Any])
    
    inline def fillColor(value: String | (FeatureAccessor[ChoroplethBoundFeature, String])): this.type = set("fillColor", value.asInstanceOf[js.Any])
    
    inline def fillColorFunction1(value: ChoroplethBoundFeature => String): this.type = set("fillColor", js.Any.fromFunction1(value))
    
    inline def graticuleLineColor(value: String): this.type = set("graticuleLineColor", value.asInstanceOf[js.Any])
    
    inline def graticuleLineWidth(value: Double): this.type = set("graticuleLineWidth", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(value: String | (FeatureAccessor[Any, String])): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: Any => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: PartialBox): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def `match`(value: String | DatumMatcher): this.type = set("match", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* feature */ ChoroplethBoundFeature, t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* feature */ ChoroplethBoundFeature, t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* feature */ ChoroplethBoundFeature, t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* feature */ ChoroplethBoundFeature, /* event */ ReactMouseEventFrom[Any & Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* feature */ ChoroplethBoundFeature, t1: /* event */ ReactMouseEventFrom[Any & Element]) => (value(t0, t1)).runNow()))
    
    inline def projectionRotation(value: js.Tuple3[Double, Double, Double]): this.type = set("projectionRotation", value.asInstanceOf[js.Any])
    
    inline def projectionScale(value: Double): this.type = set("projectionScale", value.asInstanceOf[js.Any])
    
    inline def projectionTranslation(value: js.Tuple2[Double, Double]): this.type = set("projectionTranslation", value.asInstanceOf[js.Any])
    
    inline def projectionType(value: GeoProjectionType): this.type = set("projectionType", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: ChoroplethTooltip): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def unknownColor(value: String): this.type = set("unknownColor", value.asInstanceOf[js.Any])
    
    inline def value(value: String | (FeatureAccessor[Any, Double])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: String | (FeatureAccessor[Any, String | Double])): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueFormatFunction1(value: Any => String | Double): this.type = set("valueFormat", js.Any.fromFunction1(value))
    
    inline def valueFunction1(value: Any => Double): this.type = set("value", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ChoroplethProps & Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

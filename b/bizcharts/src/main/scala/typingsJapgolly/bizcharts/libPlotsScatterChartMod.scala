package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antvG2plot.libPlotsScatterTypesMod.RegressionLineOptions
import typingsJapgolly.antvG2plot.libTypesAttrMod.ShapeStyle
import typingsJapgolly.antvG2plot.libTypesAttrMod.SizeAttr
import typingsJapgolly.antvG2plot.libTypesAttrMod.StyleAttr
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsScatterChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/ScatterChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ScatterOptions & RefAttributes[Any]] = js.native
  
  trait ScatterOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsScatterTypesMod.ScatterOptions
       with BasePlotOptions {
    
    var pointSize: js.UndefOr[SizeAttr] = js.undefined
    
    var trendLine: js.UndefOr[RegressionLineOptions] = js.undefined
    
    var trendline: js.UndefOr[TrendLineAPIOptions] = js.undefined
  }
  object ScatterOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): ScatterOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterOptions]
    }
    
    extension [Self <: ScatterOptions](x: Self) {
      
      inline def setPointSize(value: SizeAttr): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setPointSizeFunction1(value: /* datum */ Datum => Double): Self = StObject.set(x, "pointSize", js.Any.fromFunction1(value))
      
      inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      inline def setTrendLine(value: RegressionLineOptions): Self = StObject.set(x, "trendLine", value.asInstanceOf[js.Any])
      
      inline def setTrendLineUndefined: Self = StObject.set(x, "trendLine", js.undefined)
    }
  }
  
  trait TrendLineAPIOptions
    extends StObject
       with RegressionLineOptions {
    
    var confidenceStyle: js.UndefOr[StyleAttr] = js.undefined
    
    var showConfidence: js.UndefOr[Boolean] = js.undefined
  }
  object TrendLineAPIOptions {
    
    inline def apply(): TrendLineAPIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrendLineAPIOptions]
    }
    
    extension [Self <: TrendLineAPIOptions](x: Self) {
      
      inline def setConfidenceStyle(value: StyleAttr): Self = StObject.set(x, "confidenceStyle", value.asInstanceOf[js.Any])
      
      inline def setConfidenceStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "confidenceStyle", js.Any.fromFunction1(value))
      
      inline def setConfidenceStyleUndefined: Self = StObject.set(x, "confidenceStyle", js.undefined)
      
      inline def setShowConfidence(value: Boolean): Self = StObject.set(x, "showConfidence", value.asInstanceOf[js.Any])
      
      inline def setShowConfidenceUndefined: Self = StObject.set(x, "showConfidence", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[ScatterOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsScatterChartMod.foo` */
  override def _to: ForwardRefExoticComponent[ScatterOptions & RefAttributes[Any]] = default
}

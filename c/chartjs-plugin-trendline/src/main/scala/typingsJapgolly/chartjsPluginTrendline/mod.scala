package typingsJapgolly.chartjsPluginTrendline

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chartJs.mod.ChartType
import typingsJapgolly.chartJs.mod.Plugin
import typingsJapgolly.chartJs.typesBasicMod.AnyObject
import typingsJapgolly.chartjsPluginTrendline.chartjsPluginTrendlineStrings.dotted
import typingsJapgolly.chartjsPluginTrendline.chartjsPluginTrendlineStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chartjs-plugin-trendline", JSImport.Namespace)
  @js.native
  val ^ : Plugin[ChartType, AnyObject] = js.native
  
  trait TrendlineLinearOptions extends StObject {
    
    var lineStyle: dotted | solid
    
    var projection: js.UndefOr[Boolean] = js.undefined
    
    var style: String
    
    var width: Double
  }
  object TrendlineLinearOptions {
    
    inline def apply(lineStyle: dotted | solid, style: String, width: Double): TrendlineLinearOptions = {
      val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendlineLinearOptions]
    }
    
    extension [Self <: TrendlineLinearOptions](x: Self) {
      
      inline def setLineStyle(value: dotted | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: Boolean): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[ChartType, AnyObject]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[ChartType, AnyObject] = ^
  
  /* augmented module */
  object chartJsAugmentingMod {
    
    trait ChartDatasetProperties[TType /* <: ChartType */, TData] extends StObject {
      
      var trendlineLinear: js.UndefOr[TrendlineLinearOptions] = js.undefined
    }
    object ChartDatasetProperties {
      
      inline def apply[TType /* <: ChartType */, TData](): ChartDatasetProperties[TType, TData] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartDatasetProperties[TType, TData]]
      }
      
      extension [Self <: ChartDatasetProperties[?, ?], TType /* <: ChartType */, TData](x: Self & (ChartDatasetProperties[TType, TData])) {
        
        inline def setTrendlineLinear(value: TrendlineLinearOptions): Self = StObject.set(x, "trendlineLinear", value.asInstanceOf[js.Any])
        
        inline def setTrendlineLinearUndefined: Self = StObject.set(x, "trendlineLinear", js.undefined)
      }
    }
  }
}

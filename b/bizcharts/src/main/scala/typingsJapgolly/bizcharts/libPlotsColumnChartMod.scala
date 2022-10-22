package typingsJapgolly.bizcharts

import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsColumnChartMod {
  
  @JSImport("bizcharts/lib/plots/ColumnChart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/plots/ColumnChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ColumnOptions & RefAttributes[Any]] = js.native
  
  inline def polyfill(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ColumnOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsColumnTypesMod.ColumnOptions
       with BasePlotOptions {
    
    /** 请使用seriesField替代 */
    var colorField: js.UndefOr[String] = js.undefined
    
    /** 旧版api，即将废弃 请使用seriesField替代 */
    var stackField: js.UndefOr[String] = js.undefined
  }
  object ColumnOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): ColumnOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOptions]
    }
    
    extension [Self <: ColumnOptions](x: Self) {
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      inline def setStackFieldUndefined: Self = StObject.set(x, "stackField", js.undefined)
    }
  }
}

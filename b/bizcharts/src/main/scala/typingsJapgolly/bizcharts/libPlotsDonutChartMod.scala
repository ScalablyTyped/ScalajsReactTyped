package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antvG2plot.libPlotsPieTypesMod.PieOptions
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.LabelAPIOptions
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.LengendAPIOptions
import typingsJapgolly.bizcharts.libPlotsCoreInterfaceMod.TooltipAPIOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsDonutChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/DonutChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]] = js.native
  
  trait DonutOptions
    extends StObject
       with PieOptions
       with BasePlotOptions {
    
    /** 数据标注label */
    @JSName("label")
    var label_DonutOptions: js.UndefOr[LabelAPIOptions] = js.undefined
    
    /** 图例 */
    @JSName("legend")
    var legend_DonutOptions: js.UndefOr[LengendAPIOptions] = js.undefined
    
    /** 图表提示框 */
    @JSName("tooltip")
    var tooltip_DonutOptions: js.UndefOr[TooltipAPIOptions] = js.undefined
  }
  object DonutOptions {
    
    inline def apply(angleField: String, colorField: String, data: js.Array[Record[String, Any]]): DonutOptions = {
      val __obj = js.Dynamic.literal(angleField = angleField.asInstanceOf[js.Any], colorField = colorField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DonutOptions]
    }
    
    extension [Self <: DonutOptions](x: Self) {
      
      inline def setLabel(value: LabelAPIOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLegend(value: LengendAPIOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setTooltip(value: TooltipAPIOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsDonutChartMod.foo` */
  override def _to: ForwardRefExoticComponent[DonutOptions & RefAttributes[Any]] = default
}

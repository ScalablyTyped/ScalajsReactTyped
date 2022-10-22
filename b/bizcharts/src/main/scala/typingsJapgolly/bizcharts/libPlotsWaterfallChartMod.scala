package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWaterfallChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/WaterfallChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]] = js.native
  
  trait WaterfallOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsWaterfallTypesMod.WaterfallOptions
       with BasePlotOptions
  object WaterfallOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): WaterfallOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaterfallOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsWaterfallChartMod.foo` */
  override def _to: ForwardRefExoticComponent[WaterfallOptions & RefAttributes[Any]] = default
}

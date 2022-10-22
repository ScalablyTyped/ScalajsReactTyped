package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsHistogramChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/HistogramChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HistogramOptions & RefAttributes[Any]] = js.native
  
  trait HistogramOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsHistogramTypesMod.HistogramOptions
       with BasePlotOptions
  object HistogramOptions {
    
    inline def apply(binField: String, data: js.Array[Record[String, Any]]): HistogramOptions = {
      val __obj = js.Dynamic.literal(binField = binField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[HistogramOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsHistogramChartMod.foo` */
  override def _to: ForwardRefExoticComponent[HistogramOptions & RefAttributes[Any]] = default
}

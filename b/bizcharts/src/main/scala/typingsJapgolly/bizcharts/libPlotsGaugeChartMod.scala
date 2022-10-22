package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsGaugeChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/GaugeChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[GaugeOptions & RefAttributes[Any]] = js.native
  
  trait GaugeOptions
    extends StObject
       with BasePlotOptions
       with typingsJapgolly.antvG2plot.libPlotsGaugeTypesMod.GaugeOptions {
    
    /** 该属性是g2Plot@1.0属性，即将废弃，请使用percent替代 */
    var value: js.UndefOr[Double] = js.undefined
  }
  object GaugeOptions {
    
    inline def apply(percent: Double): GaugeOptions = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaugeOptions]
    }
    
    extension [Self <: GaugeOptions](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[GaugeOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsGaugeChartMod.foo` */
  override def _to: ForwardRefExoticComponent[GaugeOptions & RefAttributes[Any]] = default
}

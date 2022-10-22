package typingsJapgolly.bizcharts

import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsAreaChartMod {
  
  @JSImport("bizcharts/lib/plots/AreaChart", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bizcharts/lib/plots/AreaChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AreaOptions & RefAttributes[Any]] = js.native
  
  inline def polyfill(opt: AreaOptions): AreaOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(opt.asInstanceOf[js.Any]).asInstanceOf[AreaOptions]
  
  trait AreaOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsAreaTypesMod.AreaOptions
       with BasePlotOptions {
    
    /** 旧版api，即将废弃 请使用seriesField替代 */
    var stackField: js.UndefOr[String] = js.undefined
  }
  object AreaOptions {
    
    inline def apply(data: js.Array[Record[String, Any]]): AreaOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[AreaOptions]
    }
    
    extension [Self <: AreaOptions](x: Self) {
      
      inline def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      inline def setStackFieldUndefined: Self = StObject.set(x, "stackField", js.undefined)
    }
  }
}

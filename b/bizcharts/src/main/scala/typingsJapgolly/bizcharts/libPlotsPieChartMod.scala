package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPieChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PieChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PieOptions & RefAttributes[Any]] = js.native
  
  trait PieOptions
    extends StObject
       with typingsJapgolly.antvG2plot.libPlotsPieTypesMod.PieOptions
       with BasePlotOptions
  object PieOptions {
    
    inline def apply(angleField: String, colorField: String, data: js.Array[Record[String, Any]]): PieOptions = {
      val __obj = js.Dynamic.literal(angleField = angleField.asInstanceOf[js.Any], colorField = colorField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[PieOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsPieChartMod.foo` */
  override def _to: ForwardRefExoticComponent[PieOptions & RefAttributes[Any]] = default
}

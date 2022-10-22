package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libCreatePlotMod.BasePlotOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsProgressChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/ProgressChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]] = js.native
  
  trait ProgressOptions
    extends StObject
       with BasePlotOptions
       with typingsJapgolly.antvG2plot.libPlotsProgressTypesMod.ProgressOptions
  object ProgressOptions {
    
    inline def apply(percent: Double): ProgressOptions = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressOptions]
    }
  }
  
  type _To = ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsProgressChartMod.foo` */
  override def _to: ForwardRefExoticComponent[ProgressOptions & RefAttributes[Any]] = default
}

package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libPlotsBarChartMod.BarOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPercentStackedBarChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PercentStackedBarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PercentStackedBarOptions & RefAttributes[Any]] = js.native
  
  type PercentStackedBarOptions = BarOptions
  
  type _To = ForwardRefExoticComponent[PercentStackedBarOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsPercentStackedBarChartMod.foo` */
  override def _to: ForwardRefExoticComponent[PercentStackedBarOptions & RefAttributes[Any]] = default
}

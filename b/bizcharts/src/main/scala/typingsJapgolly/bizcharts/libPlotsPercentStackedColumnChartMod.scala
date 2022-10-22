package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libPlotsColumnChartMod.ColumnOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPercentStackedColumnChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PercentStackedColumnChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]] = js.native
  
  type PercentStackedColumnOptions = ColumnOptions
  
  type _To = ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsPercentStackedColumnChartMod.foo` */
  override def _to: ForwardRefExoticComponent[PercentStackedColumnOptions & RefAttributes[Any]] = default
}

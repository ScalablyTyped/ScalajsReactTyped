package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.libPlotsColumnChartMod.ColumnOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsStackedColumnChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/StackedColumnChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StackedColumnOptions & RefAttributes[Any]] = js.native
  
  type StackedColumnOptions = ColumnOptions
  
  type _To = ForwardRefExoticComponent[StackedColumnOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsStackedColumnChartMod.foo` */
  override def _to: ForwardRefExoticComponent[StackedColumnOptions & RefAttributes[Any]] = default
}

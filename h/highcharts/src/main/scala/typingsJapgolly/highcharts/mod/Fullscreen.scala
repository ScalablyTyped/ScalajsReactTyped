package typingsJapgolly.highcharts.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.highcharts.modulesExportingMod.highchartsAugmentingMod.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles displaying chart's container in the fullscreen mode.
  *
  * **Note**: Fullscreen is not supported on iPhone due to iOS limitations.
  */
trait Fullscreen extends StObject {
  
  /**
    * Chart managed by the fullscreen controller.
    */
  var chart: Chart
  
  /**
    * Stops displaying the chart in fullscreen mode. Exporting module
    * required.
    */
  def close(): Unit
  
  /**
    * The flag is set to `true` when the chart is displayed in the
    * fullscreen mode.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays the chart in fullscreen mode. When fired customly by user
    * before exporting context button is created, button's text will not be
    * replaced - it's on the user side. Exporting module required.
    */
  def open(): Unit
  
  /**
    * Toggles displaying the chart in fullscreen mode. By default, when the
    * exporting module is enabled, a context button with a drop down menu
    * in the upper right corner accesses this function. Exporting module
    * required.
    */
  def toggle(): Unit
}
object Fullscreen {
  
  inline def apply(chart: Chart, close: Callback, open: Callback, toggle: Callback): Fullscreen = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], close = close.toJsFn, open = open.toJsFn, toggle = toggle.toJsFn)
    __obj.asInstanceOf[Fullscreen]
  }
  
  extension [Self <: Fullscreen](x: Self) {
    
    inline def setChart(value: Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}

package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.Class
import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer_
  extends StObject
     with Class {
  
  def hide(): Unit
  
  var map: Map
  
  var options: LayerOptions
  
  def show(): Unit
}
object Layer_ {
  
  inline def apply(hide: Callback, map: Map, options: LayerOptions, show: Callback): Layer_ = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], show = show.toJsFn)
    __obj.asInstanceOf[Layer_]
  }
  
  extension [Self <: Layer_](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: LayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}

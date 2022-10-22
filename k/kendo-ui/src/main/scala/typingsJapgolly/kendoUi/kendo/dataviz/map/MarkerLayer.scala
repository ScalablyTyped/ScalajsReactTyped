package typingsJapgolly.kendoUi.kendo.dataviz.map

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLayer
  extends StObject
     with Layer_ {
  
  def add(marker: Marker): Unit
  
  def clear(): Unit
  
  var items: Any
  
  @JSName("options")
  var options_MarkerLayer: MarkerLayerOptions
  
  def remove(marker: Marker): Unit
  
  def setDataSource(dataSource: Any): Unit
}
object MarkerLayer {
  
  inline def apply(
    add: Marker => Callback,
    clear: Callback,
    hide: Callback,
    items: Any,
    map: Map,
    options: MarkerLayerOptions,
    remove: Marker => Callback,
    setDataSource: Any => Callback,
    show: Callback
  ): MarkerLayer = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: Marker) => add(t0).runNow()), clear = clear.toJsFn, hide = hide.toJsFn, items = items.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: Marker) => remove(t0).runNow()), setDataSource = js.Any.fromFunction1((t0: Any) => setDataSource(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[MarkerLayer]
  }
  
  extension [Self <: MarkerLayer](x: Self) {
    
    inline def setAdd(value: Marker => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: Marker) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: MarkerLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Marker => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Marker) => value(t0).runNow()))
    
    inline def setSetDataSource(value: Any => Callback): Self = StObject.set(x, "setDataSource", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

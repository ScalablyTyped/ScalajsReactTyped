package typingsJapgolly.leaflet.mod

import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileErrorEvent
  extends StObject
     with TileEvent {
  
  var error: js.Error
}
object TileErrorEvent {
  
  inline def apply(
    coords: Coords,
    error: js.Error,
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    tile: HTMLImageElement,
    `type`: String
  ): TileErrorEvent = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileErrorEvent]
  }
  
  extension [Self <: TileErrorEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerContainer extends StObject {
  
  var addLayer: AddLayerHandler
  
  var removeLayer: RemoveLayerHandler
}
object LayerContainer {
  
  inline def apply(
    addLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback,
    removeLayer: /* layer */ Layer => Callback
  ): LayerContainer = {
    val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (addLayer(t0, t1, t2)).runNow()), removeLayer = js.Any.fromFunction1((t0: /* layer */ Layer) => removeLayer(t0).runNow()))
    __obj.asInstanceOf[LayerContainer]
  }
  
  extension [Self <: LayerContainer](x: Self) {
    
    inline def setAddLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "addLayer", js.Any.fromFunction3((t0: /* layer */ Layer, t1: /* name */ String, t2: /* checked */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveLayer(value: /* layer */ Layer => Callback): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1((t0: /* layer */ Layer) => value(t0).runNow()))
  }
}

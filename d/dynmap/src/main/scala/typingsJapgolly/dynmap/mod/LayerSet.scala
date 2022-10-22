package typingsJapgolly.dynmap.mod

import typingsJapgolly.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerSet extends StObject {
  
  var layer: Layer
  
  var name: String
  
  var priority: Double
}
object LayerSet {
  
  inline def apply(layer: Layer, name: String, priority: Double): LayerSet = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerSet]
  }
  
  extension [Self <: LayerSet](x: Self) {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}

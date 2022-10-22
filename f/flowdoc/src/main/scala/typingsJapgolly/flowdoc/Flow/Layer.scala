package typingsJapgolly.flowdoc.Flow

import typingsJapgolly.flowdoc.Node
import typingsJapgolly.flowdoc.flowdocStrings.HOTSPOT
import typingsJapgolly.flowdoc.flowdocStrings.LAYER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer
  extends StObject
     with Node {
  
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  var position: Point
  
  var size: Size
  
  @JSName("type")
  var type_Layer: LAYER | HOTSPOT
}
object Layer {
  
  inline def apply(id: String, name: String, position: Point, size: Size, `type`: LAYER | HOTSPOT): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: LAYER | HOTSPOT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

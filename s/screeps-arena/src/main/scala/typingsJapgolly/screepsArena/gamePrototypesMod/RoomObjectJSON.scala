package typingsJapgolly.screepsArena.gamePrototypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomObjectJSON extends StObject {
  
  var id: Double
  
  var x: Double
  
  var y: Double
}
object RoomObjectJSON {
  
  inline def apply(id: Double, x: Double, y: Double): RoomObjectJSON = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomObjectJSON]
  }
  
  extension [Self <: RoomObjectJSON](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

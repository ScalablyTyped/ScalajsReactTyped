package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var pos: RoomPosition
  
  var range: Double
}
object Range {
  
  inline def apply(pos: RoomPosition, range: Double): Range = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}

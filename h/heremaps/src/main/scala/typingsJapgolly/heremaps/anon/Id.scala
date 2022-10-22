package typingsJapgolly.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var _type: String
  
  var id: String
  
  var instruction: String
  
  var length: Double
  
  var note: js.Array[String]
  
  var position: Latitude
  
  var shape: js.Array[String]
  
  var travelTime: Double
}
object Id {
  
  inline def apply(
    _type: String,
    id: String,
    instruction: String,
    length: Double,
    note: js.Array[String],
    position: Latitude,
    shape: js.Array[String],
    travelTime: Double
  ): Id = {
    val __obj = js.Dynamic.literal(_type = _type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[String]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteVarargs(value: String*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPosition(value: Latitude): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShape(value: js.Array[String]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setTravelTime(value: Double): Self = StObject.set(x, "travelTime", value.asInstanceOf[js.Any])
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
  }
}

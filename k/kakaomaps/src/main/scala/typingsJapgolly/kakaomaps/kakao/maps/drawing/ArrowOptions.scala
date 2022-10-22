package typingsJapgolly.kakaomaps.kakao.maps.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowOptions extends StObject {
  
  var draggable: Boolean
  
  var editable: Boolean
  
  var hintStrokeOpacity: Double
  
  var hintStrokeStyle: String
  
  var removable: Boolean
  
  var startArrow: Boolean
  
  var strokeColor: String
  
  var strokeOpacity: Double
  
  var strokeStyle: String
  
  var strokeWeight: Double
}
object ArrowOptions {
  
  inline def apply(
    draggable: Boolean,
    editable: Boolean,
    hintStrokeOpacity: Double,
    hintStrokeStyle: String,
    removable: Boolean,
    startArrow: Boolean,
    strokeColor: String,
    strokeOpacity: Double,
    strokeStyle: String,
    strokeWeight: Double
  ): ArrowOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], hintStrokeOpacity = hintStrokeOpacity.asInstanceOf[js.Any], hintStrokeStyle = hintStrokeStyle.asInstanceOf[js.Any], removable = removable.asInstanceOf[js.Any], startArrow = startArrow.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowOptions]
  }
  
  extension [Self <: ArrowOptions](x: Self) {
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setHintStrokeOpacity(value: Double): Self = StObject.set(x, "hintStrokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setHintStrokeStyle(value: String): Self = StObject.set(x, "hintStrokeStyle", value.asInstanceOf[js.Any])
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setStartArrow(value: Boolean): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
  }
}

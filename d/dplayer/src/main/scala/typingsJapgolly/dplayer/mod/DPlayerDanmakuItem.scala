package typingsJapgolly.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayerDanmakuItem extends StObject {
  
  var color: String
  
  var text: String
  
  var `type`: DirectionType
}
object DPlayerDanmakuItem {
  
  inline def apply(color: String, text: String, `type`: DirectionType): DPlayerDanmakuItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmakuItem]
  }
  
  extension [Self <: DPlayerDanmakuItem](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: DirectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

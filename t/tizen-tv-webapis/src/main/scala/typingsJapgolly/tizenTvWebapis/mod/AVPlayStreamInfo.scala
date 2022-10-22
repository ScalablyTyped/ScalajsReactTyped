package typingsJapgolly.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVPlayStreamInfo extends StObject {
  
  var extra_info: String
  
  var index: Double
  
  var `type`: AVPlayStreamType
}
object AVPlayStreamInfo {
  
  inline def apply(extra_info: String, index: Double, `type`: AVPlayStreamType): AVPlayStreamInfo = {
    val __obj = js.Dynamic.literal(extra_info = extra_info.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVPlayStreamInfo]
  }
  
  extension [Self <: AVPlayStreamInfo](x: Self) {
    
    inline def setExtra_info(value: String): Self = StObject.set(x, "extra_info", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: AVPlayStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

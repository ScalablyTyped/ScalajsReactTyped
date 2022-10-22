package typingsJapgolly.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var height: Double | Null
  
  var url: String
  
  var width: Double | Null
}
object Image {
  
  inline def apply(url: String): Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], height = null, width = null)
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
  }
}

package typingsJapgolly.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: String
  
  var index: Double
  
  var pagePath: String
  
  var text: String
}
object From {
  
  inline def apply(from: String, index: Double, pagePath: String, text: String): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}

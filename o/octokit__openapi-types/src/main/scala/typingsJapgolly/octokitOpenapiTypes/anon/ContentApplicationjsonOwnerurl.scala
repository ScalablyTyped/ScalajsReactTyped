package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOwnerurl extends StObject {
  
  var content: ApplicationjsonOwnerurl
}
object ContentApplicationjsonOwnerurl {
  
  inline def apply(content: ApplicationjsonOwnerurl): ContentApplicationjsonOwnerurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOwnerurl]
  }
  
  extension [Self <: ContentApplicationjsonOwnerurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonOwnerurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

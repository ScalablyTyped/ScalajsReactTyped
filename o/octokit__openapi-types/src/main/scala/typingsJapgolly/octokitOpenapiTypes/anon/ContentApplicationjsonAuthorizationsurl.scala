package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorizationsurl extends StObject {
  
  var content: ApplicationjsonAuthorizationsurl
}
object ContentApplicationjsonAuthorizationsurl {
  
  inline def apply(content: ApplicationjsonAuthorizationsurl): ContentApplicationjsonAuthorizationsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorizationsurl]
  }
  
  extension [Self <: ContentApplicationjsonAuthorizationsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonAuthorizationsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

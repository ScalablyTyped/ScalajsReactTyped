package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIgnored extends StObject {
  
  var content: ApplicationjsonIgnored
}
object ContentApplicationjsonIgnored {
  
  inline def apply(content: ApplicationjsonIgnored): ContentApplicationjsonIgnored = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIgnored]
  }
  
  extension [Self <: ContentApplicationjsonIgnored](x: Self) {
    
    inline def setContent(value: ApplicationjsonIgnored): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMaintainers extends StObject {
  
  var content: ApplicationjsonMaintainers
}
object ContentApplicationjsonMaintainers {
  
  inline def apply(content: ApplicationjsonMaintainers): ContentApplicationjsonMaintainers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMaintainers]
  }
  
  extension [Self <: ContentApplicationjsonMaintainers](x: Self) {
    
    inline def setContent(value: ApplicationjsonMaintainers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

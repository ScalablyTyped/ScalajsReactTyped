package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonErrors extends StObject {
  
  var content: ApplicationjsonErrors
}
object ContentApplicationjsonErrors {
  
  inline def apply(content: ApplicationjsonErrors): ContentApplicationjsonErrors = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonErrors]
  }
  
  extension [Self <: ContentApplicationjsonErrors](x: Self) {
    
    inline def setContent(value: ApplicationjsonErrors): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

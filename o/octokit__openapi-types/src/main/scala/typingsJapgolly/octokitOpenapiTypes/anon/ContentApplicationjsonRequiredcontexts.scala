package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRequiredcontexts extends StObject {
  
  var content: ApplicationjsonRequiredcontexts
}
object ContentApplicationjsonRequiredcontexts {
  
  inline def apply(content: ApplicationjsonRequiredcontexts): ContentApplicationjsonRequiredcontexts = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRequiredcontexts]
  }
  
  extension [Self <: ContentApplicationjsonRequiredcontexts](x: Self) {
    
    inline def setContent(value: ApplicationjsonRequiredcontexts): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExcludeattachments extends StObject {
  
  var content: ApplicationjsonExcludeattachments
}
object ContentApplicationjsonExcludeattachments {
  
  inline def apply(content: ApplicationjsonExcludeattachments): ContentApplicationjsonExcludeattachments = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExcludeattachments]
  }
  
  extension [Self <: ContentApplicationjsonExcludeattachments](x: Self) {
    
    inline def setContent(value: ApplicationjsonExcludeattachments): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

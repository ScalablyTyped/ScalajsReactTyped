package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArtifactsTotalcount extends StObject {
  
  var content: ApplicationjsonArtifactsTotalcount
}
object ContentApplicationjsonArtifactsTotalcount {
  
  inline def apply(content: ApplicationjsonArtifactsTotalcount): ContentApplicationjsonArtifactsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArtifactsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonArtifactsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonArtifactsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

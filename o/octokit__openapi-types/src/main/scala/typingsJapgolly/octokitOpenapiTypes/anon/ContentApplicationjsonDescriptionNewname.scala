package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDescriptionNewname extends StObject {
  
  var content: ApplicationjsonDescriptionNewname
}
object ContentApplicationjsonDescriptionNewname {
  
  inline def apply(content: ApplicationjsonDescriptionNewname): ContentApplicationjsonDescriptionNewname = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDescriptionNewname]
  }
  
  extension [Self <: ContentApplicationjsonDescriptionNewname](x: Self) {
    
    inline def setContent(value: ApplicationjsonDescriptionNewname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

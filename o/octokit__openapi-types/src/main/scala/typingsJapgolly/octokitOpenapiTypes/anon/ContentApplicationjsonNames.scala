package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNames extends StObject {
  
  var content: ApplicationjsonNames
}
object ContentApplicationjsonNames {
  
  inline def apply(content: ApplicationjsonNames): ContentApplicationjsonNames = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNames]
  }
  
  extension [Self <: ContentApplicationjsonNames](x: Self) {
    
    inline def setContent(value: ApplicationjsonNames): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

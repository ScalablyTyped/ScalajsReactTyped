package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoriesArray extends StObject {
  
  var content: ApplicationjsonRepositoriesArray
}
object ContentApplicationjsonRepositoriesArray {
  
  inline def apply(content: ApplicationjsonRepositoriesArray): ContentApplicationjsonRepositoriesArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoriesArray]
  }
  
  extension [Self <: ContentApplicationjsonRepositoriesArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonRepositoriesArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

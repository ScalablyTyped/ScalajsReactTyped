package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositoriesRepositoryselection extends StObject {
  
  var content: ApplicationjsonRepositoriesRepositoryselection
}
object ContentApplicationjsonRepositoriesRepositoryselection {
  
  inline def apply(content: ApplicationjsonRepositoriesRepositoryselection): ContentApplicationjsonRepositoriesRepositoryselection = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositoriesRepositoryselection]
  }
  
  extension [Self <: ContentApplicationjsonRepositoriesRepositoryselection](x: Self) {
    
    inline def setContent(value: ApplicationjsonRepositoriesRepositoryselection): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.protractorHttpMock.anon

import typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.HEAD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regex extends StObject {
  
  var method: HEAD
  
  var path: String
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object Regex {
  
  inline def apply(path: String): Regex = {
    val __obj = js.Dynamic.literal(method = "HEAD", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  
  extension [Self <: Regex](x: Self) {
    
    inline def setMethod(value: HEAD): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}

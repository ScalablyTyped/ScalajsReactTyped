package typingsJapgolly.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: Domain
  
  var title: Domain
}
object Content {
  
  inline def apply(content: Domain, title: Domain): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: Domain): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Domain): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

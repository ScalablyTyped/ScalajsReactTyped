package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content100 extends StObject {
  
  var content: `100`
}
object Content100 {
  
  inline def apply(content: `100`): Content100 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content100]
  }
  
  extension [Self <: Content100](x: Self) {
    
    inline def setContent(value: `100`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content42 extends StObject {
  
  var content: `42`
}
object Content42 {
  
  inline def apply(content: `42`): Content42 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content42]
  }
  
  extension [Self <: Content42](x: Self) {
    
    inline def setContent(value: `42`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

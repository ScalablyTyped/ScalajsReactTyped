package typingsJapgolly.jqueryBase64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var base64: JQueryBase64Static
}
object JQueryStatic {
  
  inline def apply(base64: JQueryBase64Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setBase64(value: JQueryBase64Static): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
  }
}

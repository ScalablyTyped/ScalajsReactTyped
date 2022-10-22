package typingsJapgolly.reactNativeSvg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uri extends StObject {
  
  var uri: String | Null
}
object Uri {
  
  inline def apply(): Uri = {
    val __obj = js.Dynamic.literal(uri = null)
    __obj.asInstanceOf[Uri]
  }
  
  extension [Self <: Uri](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
  }
}

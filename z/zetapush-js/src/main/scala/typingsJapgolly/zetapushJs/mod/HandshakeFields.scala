package typingsJapgolly.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandshakeFields extends StObject {
  
  var ext: Any
}
object HandshakeFields {
  
  inline def apply(ext: Any): HandshakeFields = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeFields]
  }
  
  extension [Self <: HandshakeFields](x: Self) {
    
    inline def setExt(value: Any): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
  }
}

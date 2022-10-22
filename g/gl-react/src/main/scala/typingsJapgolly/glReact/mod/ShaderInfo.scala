package typingsJapgolly.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderInfo extends StObject {
  
  var frag: String
  
  var vert: String
}
object ShaderInfo {
  
  inline def apply(frag: String, vert: String): ShaderInfo = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderInfo]
  }
  
  extension [Self <: ShaderInfo](x: Self) {
    
    inline def setFrag(value: String): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setVert(value: String): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
  }
}

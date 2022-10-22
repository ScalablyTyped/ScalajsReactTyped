package typingsJapgolly.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderDefinition extends StObject {
  
  var frag: String
  
  var vert: js.UndefOr[String] = js.undefined
}
object ShaderDefinition {
  
  inline def apply(frag: String): ShaderDefinition = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefinition]
  }
  
  extension [Self <: ShaderDefinition](x: Self) {
    
    inline def setFrag(value: String): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setVert(value: String): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    
    inline def setVertUndefined: Self = StObject.set(x, "vert", js.undefined)
  }
}

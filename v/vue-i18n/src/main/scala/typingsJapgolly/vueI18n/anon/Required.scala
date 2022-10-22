package typingsJapgolly.vueI18n.anon

import typingsJapgolly.std.DateConstructor
import typingsJapgolly.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: Boolean
  
  var `type`: js.Array[NumberConstructor | DateConstructor]
}
object Required {
  
  inline def apply(required: Boolean, `type`: js.Array[NumberConstructor | DateConstructor]): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[NumberConstructor | DateConstructor]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (NumberConstructor | DateConstructor)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}

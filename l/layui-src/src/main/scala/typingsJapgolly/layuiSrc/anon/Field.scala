package typingsJapgolly.layuiSrc.anon

import typingsJapgolly.layuiSrc.layuiSrcStrings.`null`
import typingsJapgolly.layuiSrc.layuiSrcStrings.asc
import typingsJapgolly.layuiSrc.layuiSrcStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  var field: String
  
  var `type`: js.UndefOr[`null` | desc | asc] = js.undefined
}
object Field {
  
  inline def apply(field: String): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setType(value: `null` | desc | asc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

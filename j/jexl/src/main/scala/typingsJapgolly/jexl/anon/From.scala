package typingsJapgolly.jexl.anon

import typingsJapgolly.jexl.astMod.Ast
import typingsJapgolly.jexl.jexlStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From
  extends StObject
     with Ast {
  
  var from: js.UndefOr[Ast] = js.undefined
  
  var relative: js.UndefOr[Boolean] = js.undefined
  
  var `type`: Identifier
  
  var value: String
}
object From {
  
  inline def apply(value: String): From = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: Ast): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

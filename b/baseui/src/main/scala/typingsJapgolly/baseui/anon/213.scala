package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.ES
import typingsJapgolly.baseui.baseuiStrings.Plussign34
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `213` extends StObject {
  
  val dialCode: Plussign34
  
  val id: ES
  
  val label: /* Spain (España) */ String
}
object `213` {
  
  inline def apply(): `213` = {
    val __obj = js.Dynamic.literal(dialCode = "+34", id = "ES", label = "Spain (Espa\u00F1a)")
    __obj.asInstanceOf[`213`]
  }
  
  extension [Self <: `213`](x: Self) {
    
    inline def setDialCode(value: Plussign34): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: ES): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Spain (España) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.CI
import typingsJapgolly.baseui.baseuiStrings.Plussign225
import typingsJapgolly.baseui.baseuiStrings.`Côte dRightsinglequotationmarkIvoire`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  val dialCode: Plussign225
  
  val id: CI
  
  val label: `Côte dRightsinglequotationmarkIvoire`
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal(dialCode = "+225", id = "CI", label = "C\u00F4te d\u2019Ivoire")
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def setDialCode(value: Plussign225): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: CI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Côte dRightsinglequotationmarkIvoire`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

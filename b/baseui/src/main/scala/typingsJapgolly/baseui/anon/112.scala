package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.IE
import typingsJapgolly.baseui.baseuiStrings.Ireland
import typingsJapgolly.baseui.baseuiStrings.Plussign353
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  val dialCode: Plussign353
  
  val id: IE
  
  val label: Ireland
}
object `112` {
  
  inline def apply(): `112` = {
    val __obj = js.Dynamic.literal(dialCode = "+353", id = "IE", label = "Ireland")
    __obj.asInstanceOf[`112`]
  }
  
  extension [Self <: `112`](x: Self) {
    
    inline def setDialCode(value: Plussign353): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: IE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Ireland): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

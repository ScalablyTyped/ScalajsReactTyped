package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign65
import typingsJapgolly.baseui.baseuiStrings.SG
import typingsJapgolly.baseui.baseuiStrings.Singapore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204` extends StObject {
  
  val dialCode: Plussign65
  
  val id: SG
  
  val label: Singapore
}
object `204` {
  
  inline def apply(): `204` = {
    val __obj = js.Dynamic.literal(dialCode = "+65", id = "SG", label = "Singapore")
    __obj.asInstanceOf[`204`]
  }
  
  extension [Self <: `204`](x: Self) {
    
    inline def setDialCode(value: Plussign65): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Singapore): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

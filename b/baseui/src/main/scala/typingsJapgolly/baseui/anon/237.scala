package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign256
import typingsJapgolly.baseui.baseuiStrings.UG
import typingsJapgolly.baseui.baseuiStrings.Uganda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `237` extends StObject {
  
  val dialCode: Plussign256
  
  val id: UG
  
  val label: Uganda
}
object `237` {
  
  inline def apply(): `237` = {
    val __obj = js.Dynamic.literal(dialCode = "+256", id = "UG", label = "Uganda")
    __obj.asInstanceOf[`237`]
  }
  
  extension [Self <: `237`](x: Self) {
    
    inline def setDialCode(value: Plussign256): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: UG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Uganda): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

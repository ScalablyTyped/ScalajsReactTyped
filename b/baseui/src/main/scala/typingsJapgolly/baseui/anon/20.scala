package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AR
import typingsJapgolly.baseui.baseuiStrings.Argentina
import typingsJapgolly.baseui.baseuiStrings.Plussign54
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  val dialCode: Plussign54
  
  val id: AR
  
  val label: Argentina
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal(dialCode = "+54", id = "AR", label = "Argentina")
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setDialCode(value: Plussign54): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Argentina): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

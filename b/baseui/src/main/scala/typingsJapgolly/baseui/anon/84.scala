package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.FR
import typingsJapgolly.baseui.baseuiStrings.France
import typingsJapgolly.baseui.baseuiStrings.Plussign33
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  val dialCode: Plussign33
  
  val id: FR
  
  val label: France
}
object `84` {
  
  inline def apply(): `84` = {
    val __obj = js.Dynamic.literal(dialCode = "+33", id = "FR", label = "France")
    __obj.asInstanceOf[`84`]
  }
  
  extension [Self <: `84`](x: Self) {
    
    inline def setDialCode(value: Plussign33): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FR): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: France): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

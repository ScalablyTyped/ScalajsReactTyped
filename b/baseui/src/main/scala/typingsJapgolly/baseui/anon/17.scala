package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AO
import typingsJapgolly.baseui.baseuiStrings.Angola
import typingsJapgolly.baseui.baseuiStrings.Plussign244
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  val dialCode: Plussign244
  
  val id: AO
  
  val label: Angola
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(dialCode = "+244", id = "AO", label = "Angola")
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setDialCode(value: Plussign244): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AO): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Angola): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

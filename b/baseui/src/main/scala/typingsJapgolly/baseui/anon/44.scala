package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.BF
import typingsJapgolly.baseui.baseuiStrings.Plussign226
import typingsJapgolly.baseui.baseuiStrings.`Burkina Faso`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  val dialCode: Plussign226
  
  val id: BF
  
  val label: `Burkina Faso`
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal(dialCode = "+226", id = "BF", label = "Burkina Faso")
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setDialCode(value: Plussign226): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: BF): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `Burkina Faso`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

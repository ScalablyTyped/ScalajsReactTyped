package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign685
import typingsJapgolly.baseui.baseuiStrings.Samoa
import typingsJapgolly.baseui.baseuiStrings.WS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `196` extends StObject {
  
  val dialCode: Plussign685
  
  val id: WS
  
  val label: Samoa
}
object `196` {
  
  inline def apply(): `196` = {
    val __obj = js.Dynamic.literal(dialCode = "+685", id = "WS", label = "Samoa")
    __obj.asInstanceOf[`196`]
  }
  
  extension [Self <: `196`](x: Self) {
    
    inline def setDialCode(value: Plussign685): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: WS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Samoa): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

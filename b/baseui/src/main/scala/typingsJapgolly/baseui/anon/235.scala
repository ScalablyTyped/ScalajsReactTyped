package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign688
import typingsJapgolly.baseui.baseuiStrings.TV
import typingsJapgolly.baseui.baseuiStrings.Tuvalu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `235` extends StObject {
  
  val dialCode: Plussign688
  
  val id: TV
  
  val label: Tuvalu
}
object `235` {
  
  inline def apply(): `235` = {
    val __obj = js.Dynamic.literal(dialCode = "+688", id = "TV", label = "Tuvalu")
    __obj.asInstanceOf[`235`]
  }
  
  extension [Self <: `235`](x: Self) {
    
    inline def setDialCode(value: Plussign688): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: TV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Tuvalu): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

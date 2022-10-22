package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.JE
import typingsJapgolly.baseui.baseuiStrings.Jersey
import typingsJapgolly.baseui.baseuiStrings.Plussign44
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  val dialCode: Plussign44
  
  val id: JE
  
  val label: Jersey
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal(dialCode = "+44", id = "JE", label = "Jersey")
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setDialCode(value: Plussign44): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: JE): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Jersey): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

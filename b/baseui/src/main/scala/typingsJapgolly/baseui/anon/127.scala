package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.LV
import typingsJapgolly.baseui.baseuiStrings.Plussign371
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  val dialCode: Plussign371
  
  val id: LV
  
  val label: /* Latvia (Latvija) */ String
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal(dialCode = "+371", id = "LV", label = "Latvia (Latvija)")
    __obj.asInstanceOf[`127`]
  }
  
  extension [Self <: `127`](x: Self) {
    
    inline def setDialCode(value: Plussign371): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: LV): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: /* Latvia (Latvija) */ String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign1340
import typingsJapgolly.baseui.baseuiStrings.VI
import typingsJapgolly.baseui.baseuiStrings.`UDotSDot Virgin Islands`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `236` extends StObject {
  
  val dialCode: Plussign1340
  
  val id: VI
  
  val label: `UDotSDot Virgin Islands`
}
object `236` {
  
  inline def apply(): `236` = {
    val __obj = js.Dynamic.literal(dialCode = "+1340", id = "VI", label = "U.S. Virgin Islands")
    __obj.asInstanceOf[`236`]
  }
  
  extension [Self <: `236`](x: Self) {
    
    inline def setDialCode(value: Plussign1340): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: VI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `UDotSDot Virgin Islands`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

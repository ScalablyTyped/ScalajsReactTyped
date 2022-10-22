package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.FM
import typingsJapgolly.baseui.baseuiStrings.Micronesia
import typingsJapgolly.baseui.baseuiStrings.Plussign691
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  val dialCode: Plussign691
  
  val id: FM
  
  val label: Micronesia
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal(dialCode = "+691", id = "FM", label = "Micronesia")
    __obj.asInstanceOf[`149`]
  }
  
  extension [Self <: `149`](x: Self) {
    
    inline def setDialCode(value: Plussign691): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: FM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Micronesia): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

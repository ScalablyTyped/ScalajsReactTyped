package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Plussign378
import typingsJapgolly.baseui.baseuiStrings.SM
import typingsJapgolly.baseui.baseuiStrings.`San Marino`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  val dialCode: Plussign378
  
  val id: SM
  
  val label: `San Marino`
}
object `197` {
  
  inline def apply(): `197` = {
    val __obj = js.Dynamic.literal(dialCode = "+378", id = "SM", label = "San Marino")
    __obj.asInstanceOf[`197`]
  }
  
  extension [Self <: `197`](x: Self) {
    
    inline def setDialCode(value: Plussign378): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: SM): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `San Marino`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

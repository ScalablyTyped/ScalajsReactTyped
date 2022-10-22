package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.AS
import typingsJapgolly.baseui.baseuiStrings.Plussign1684
import typingsJapgolly.baseui.baseuiStrings.`American Samoa`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdLabel extends StObject {
  
  val dialCode: Plussign1684
  
  val id: AS
  
  val label: `American Samoa`
}
object IdLabel {
  
  inline def apply(): IdLabel = {
    val __obj = js.Dynamic.literal(dialCode = "+1684", id = "AS", label = "American Samoa")
    __obj.asInstanceOf[IdLabel]
  }
  
  extension [Self <: IdLabel](x: Self) {
    
    inline def setDialCode(value: Plussign1684): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: AS): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: `American Samoa`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

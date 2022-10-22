package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.Andorra
import typingsJapgolly.baseui.baseuiStrings.Plussign376
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialCodeIdLabel extends StObject {
  
  val dialCode: Plussign376
  
  val id: typingsJapgolly.baseui.baseuiStrings.AD
  
  val label: Andorra
}
object DialCodeIdLabel {
  
  inline def apply(): DialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = "+376", id = "AD", label = "Andorra")
    __obj.asInstanceOf[DialCodeIdLabel]
  }
  
  extension [Self <: DialCodeIdLabel](x: Self) {
    
    inline def setDialCode(value: Plussign376): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: typingsJapgolly.baseui.baseuiStrings.AD): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Andorra): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

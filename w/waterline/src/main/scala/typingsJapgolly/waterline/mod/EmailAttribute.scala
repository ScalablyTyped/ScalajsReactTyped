package typingsJapgolly.waterline.mod

import typingsJapgolly.waterline.waterlineStrings.email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailAttribute
  extends StObject
     with BaseAttribute[String]
     with _Attribute {
  
  @JSName("type")
  var type_EmailAttribute: email
}
object EmailAttribute {
  
  inline def apply(): EmailAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("email")
    __obj.asInstanceOf[EmailAttribute]
  }
  
  extension [Self <: EmailAttribute](x: Self) {
    
    inline def setType(value: email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.waterline.mod

import typingsJapgolly.waterline.waterlineStrings.date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateAttribute
  extends StObject
     with BaseAttribute[js.Date]
     with _Attribute {
  
  @JSName("type")
  var type_DateAttribute: date
}
object DateAttribute {
  
  inline def apply(): DateAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date")
    __obj.asInstanceOf[DateAttribute]
  }
  
  extension [Self <: DateAttribute](x: Self) {
    
    inline def setType(value: date): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

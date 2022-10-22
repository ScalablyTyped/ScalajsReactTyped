package typingsJapgolly.htmlValidator.mod

import typingsJapgolly.htmlValidator.htmlValidatorStrings.info
import typingsJapgolly.htmlValidator.htmlValidatorStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationMessageBasicInfoObject extends StObject {
  
  var subType: js.UndefOr[warning] = js.undefined
  
  var `type`: info
}
object ValidationMessageBasicInfoObject {
  
  inline def apply(): ValidationMessageBasicInfoObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("info")
    __obj.asInstanceOf[ValidationMessageBasicInfoObject]
  }
  
  extension [Self <: ValidationMessageBasicInfoObject](x: Self) {
    
    inline def setSubType(value: warning): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setType(value: info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

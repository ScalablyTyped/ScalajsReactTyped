package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSettingResult extends StObject {
  
  /**
    * The query result of the current service setting.
    */
  var ServiceSetting: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.ServiceSetting] = js.undefined
}
object GetServiceSettingResult {
  
  inline def apply(): GetServiceSettingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingResult]
  }
  
  extension [Self <: GetServiceSettingResult](x: Self) {
    
    inline def setServiceSetting(value: ServiceSetting): Self = StObject.set(x, "ServiceSetting", value.asInstanceOf[js.Any])
    
    inline def setServiceSettingUndefined: Self = StObject.set(x, "ServiceSetting", js.undefined)
  }
}

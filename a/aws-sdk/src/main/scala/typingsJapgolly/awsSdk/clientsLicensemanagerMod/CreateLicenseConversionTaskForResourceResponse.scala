package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseConversionTaskForResourceResponse extends StObject {
  
  /**
    * The ID of the created license type conversion task.
    */
  var LicenseConversionTaskId: js.UndefOr[typingsJapgolly.awsSdk.clientsLicensemanagerMod.LicenseConversionTaskId] = js.undefined
}
object CreateLicenseConversionTaskForResourceResponse {
  
  inline def apply(): CreateLicenseConversionTaskForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLicenseConversionTaskForResourceResponse]
  }
  
  extension [Self <: CreateLicenseConversionTaskForResourceResponse](x: Self) {
    
    inline def setLicenseConversionTaskId(value: LicenseConversionTaskId): Self = StObject.set(x, "LicenseConversionTaskId", value.asInstanceOf[js.Any])
    
    inline def setLicenseConversionTaskIdUndefined: Self = StObject.set(x, "LicenseConversionTaskId", js.undefined)
  }
}

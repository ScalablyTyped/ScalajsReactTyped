package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLicenseManagerReportGeneratorRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the report generator to be deleted.
    */
  var LicenseManagerReportGeneratorArn: String
}
object DeleteLicenseManagerReportGeneratorRequest {
  
  inline def apply(LicenseManagerReportGeneratorArn: String): DeleteLicenseManagerReportGeneratorRequest = {
    val __obj = js.Dynamic.literal(LicenseManagerReportGeneratorArn = LicenseManagerReportGeneratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLicenseManagerReportGeneratorRequest]
  }
  
  extension [Self <: DeleteLicenseManagerReportGeneratorRequest](x: Self) {
    
    inline def setLicenseManagerReportGeneratorArn(value: String): Self = StObject.set(x, "LicenseManagerReportGeneratorArn", value.asInstanceOf[js.Any])
  }
}

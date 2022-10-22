package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LogsConfigurationResult extends StObject {
  
  /**
    * A value that describes whether S3 data event logs are automatically enabled for new members of the organization.
    */
  var Status: DataSourceStatus
}
object S3LogsConfigurationResult {
  
  inline def apply(Status: DataSourceStatus): S3LogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogsConfigurationResult]
  }
  
  extension [Self <: S3LogsConfigurationResult](x: Self) {
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}

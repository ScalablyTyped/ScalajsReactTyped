package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowLogsConfigurationResult extends StObject {
  
  /**
    * Denotes whether VPC flow logs is enabled as a data source.
    */
  var Status: DataSourceStatus
}
object FlowLogsConfigurationResult {
  
  inline def apply(Status: DataSourceStatus): FlowLogsConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogsConfigurationResult]
  }
  
  extension [Self <: FlowLogsConfigurationResult](x: Self) {
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}

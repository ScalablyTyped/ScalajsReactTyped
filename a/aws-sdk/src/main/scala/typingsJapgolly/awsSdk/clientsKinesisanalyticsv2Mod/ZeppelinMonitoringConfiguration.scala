package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZeppelinMonitoringConfiguration extends StObject {
  
  /**
    * The verbosity of the CloudWatch Logs for an application.
    */
  var LogLevel: typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.LogLevel
}
object ZeppelinMonitoringConfiguration {
  
  inline def apply(LogLevel: LogLevel): ZeppelinMonitoringConfiguration = {
    val __obj = js.Dynamic.literal(LogLevel = LogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeppelinMonitoringConfiguration]
  }
  
  extension [Self <: ZeppelinMonitoringConfiguration](x: Self) {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
  }
}

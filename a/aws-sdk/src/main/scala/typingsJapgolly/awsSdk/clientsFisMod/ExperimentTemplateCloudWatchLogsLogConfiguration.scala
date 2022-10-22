package typingsJapgolly.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateCloudWatchLogsLogConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs log group.
    */
  var logGroupArn: js.UndefOr[CloudWatchLogGroupArn] = js.undefined
}
object ExperimentTemplateCloudWatchLogsLogConfiguration {
  
  inline def apply(): ExperimentTemplateCloudWatchLogsLogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateCloudWatchLogsLogConfiguration]
  }
  
  extension [Self <: ExperimentTemplateCloudWatchLogsLogConfiguration](x: Self) {
    
    inline def setLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "logGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "logGroupArn", js.undefined)
  }
}

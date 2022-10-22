package typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationCloudWatchLoggingOptionResponse extends StObject {
  
  /**
    * The application's ARN.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The new version ID of the Kinesis Data Analytics application. Kinesis Data Analytics updates the ApplicationVersionId each time you change the CloudWatch logging options. 
    */
  var ApplicationVersionId: js.UndefOr[typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  
  /**
    * The descriptions of the current CloudWatch logging options for the Kinesis Data Analytics application.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[
    typingsJapgolly.awsSdk.clientsKinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions
  ] = js.undefined
}
object AddApplicationCloudWatchLoggingOptionResponse {
  
  inline def apply(): AddApplicationCloudWatchLoggingOptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationCloudWatchLoggingOptionResponse]
  }
  
  extension [Self <: AddApplicationCloudWatchLoggingOptionResponse](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    inline def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionDescriptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.undefined)
    
    inline def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = StObject.set(x, "CloudWatchLoggingOptionDescriptions", js.Array(value*))
  }
}

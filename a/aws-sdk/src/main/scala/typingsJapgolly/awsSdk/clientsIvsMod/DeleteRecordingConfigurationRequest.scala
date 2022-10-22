package typingsJapgolly.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecordingConfigurationRequest extends StObject {
  
  /**
    * ARN of the recording configuration to be deleted.
    */
  var arn: RecordingConfigurationArn
}
object DeleteRecordingConfigurationRequest {
  
  inline def apply(arn: RecordingConfigurationArn): DeleteRecordingConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecordingConfigurationRequest]
  }
  
  extension [Self <: DeleteRecordingConfigurationRequest](x: Self) {
    
    inline def setArn(value: RecordingConfigurationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}

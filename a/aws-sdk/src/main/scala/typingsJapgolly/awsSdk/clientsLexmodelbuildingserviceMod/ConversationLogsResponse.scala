package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationLogsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to write your logs to CloudWatch Logs or an S3 bucket.
    */
  var iamRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The settings for your conversation logs. You can log text, audio, or both.
    */
  var logSettings: js.UndefOr[LogSettingsResponseList] = js.undefined
}
object ConversationLogsResponse {
  
  inline def apply(): ConversationLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationLogsResponse]
  }
  
  extension [Self <: ConversationLogsResponse](x: Self) {
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
    
    inline def setLogSettings(value: LogSettingsResponseList): Self = StObject.set(x, "logSettings", value.asInstanceOf[js.Any])
    
    inline def setLogSettingsUndefined: Self = StObject.set(x, "logSettings", js.undefined)
    
    inline def setLogSettingsVarargs(value: LogSettingsResponse*): Self = StObject.set(x, "logSettings", js.Array(value*))
  }
}

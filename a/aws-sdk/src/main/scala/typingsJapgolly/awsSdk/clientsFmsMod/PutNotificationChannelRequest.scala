package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutNotificationChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record Firewall Manager activity. 
    */
  var SnsRoleName: ResourceArn
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from Firewall Manager.
    */
  var SnsTopicArn: ResourceArn
}
object PutNotificationChannelRequest {
  
  inline def apply(SnsRoleName: ResourceArn, SnsTopicArn: ResourceArn): PutNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(SnsRoleName = SnsRoleName.asInstanceOf[js.Any], SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutNotificationChannelRequest]
  }
  
  extension [Self <: PutNotificationChannelRequest](x: Self) {
    
    inline def setSnsRoleName(value: ResourceArn): Self = StObject.set(x, "SnsRoleName", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArn(value: ResourceArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
  }
}

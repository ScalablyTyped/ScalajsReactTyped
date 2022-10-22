package typingsJapgolly.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChannel extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that gives Amazon Textract publishing permissions to the Amazon SNS topic. 
    */
  var RoleArn: typingsJapgolly.awsSdk.clientsTextractMod.RoleArn
  
  /**
    * The Amazon SNS topic that Amazon Textract posts the completion status to.
    */
  var SNSTopicArn: typingsJapgolly.awsSdk.clientsTextractMod.SNSTopicArn
}
object NotificationChannel {
  
  inline def apply(RoleArn: RoleArn, SNSTopicArn: SNSTopicArn): NotificationChannel = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChannel]
  }
  
  extension [Self <: NotificationChannel](x: Self) {
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSNSTopicArn(value: SNSTopicArn): Self = StObject.set(x, "SNSTopicArn", value.asInstanceOf[js.Any])
  }
}

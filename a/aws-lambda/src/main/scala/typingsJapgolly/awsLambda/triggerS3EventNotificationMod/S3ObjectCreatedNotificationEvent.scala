package typingsJapgolly.awsLambda.triggerS3EventNotificationMod

import typingsJapgolly.awsLambda.awsLambdaStrings.`Object Created`
import typingsJapgolly.awsLambda.awsLambdaStrings.awsDots3
import typingsJapgolly.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectCreatedNotificationEvent
  extends StObject
     with EventBridgeEvent[`Object Created`, S3ObjectCreatedNotificationEventDetail]
     with S3NotificationEvent {
  
  @JSName("source")
  var source_S3ObjectCreatedNotificationEvent: awsDots3
}
object S3ObjectCreatedNotificationEvent {
  
  inline def apply(
    account: String,
    detail: S3ObjectCreatedNotificationEventDetail,
    id: String,
    region: String,
    resources: js.Array[String],
    time: String,
    version: String
  ): S3ObjectCreatedNotificationEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.s3", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")("Object Created")
    __obj.asInstanceOf[S3ObjectCreatedNotificationEvent]
  }
  
  extension [Self <: S3ObjectCreatedNotificationEvent](x: Self) {
    
    inline def setSource(value: awsDots3): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.awsLambda.triggerS3EventNotificationMod

import typingsJapgolly.awsLambda.anon.Etag
import typingsJapgolly.awsLambda.anon.NameString
import typingsJapgolly.awsLambda.awsLambdaStrings.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectACLUpdatedNotificationEventDetail extends StObject {
  
  var bucket: NameString
  
  var `object`: Etag
  
  var `request-id`: String
  
  var requester: String
  
  var `source-ip-address`: String
  
  var version: `0`
}
object S3ObjectACLUpdatedNotificationEventDetail {
  
  inline def apply(
    bucket: NameString,
    `object`: Etag,
    `request-id`: String,
    requester: String,
    `source-ip-address`: String
  ): S3ObjectACLUpdatedNotificationEventDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-ip-address")(`source-ip-address`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectACLUpdatedNotificationEventDetail]
  }
  
  extension [Self <: S3ObjectACLUpdatedNotificationEventDetail](x: Self) {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Etag): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: String): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def `setSource-ip-address`(value: String): Self = StObject.set(x, "source-ip-address", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

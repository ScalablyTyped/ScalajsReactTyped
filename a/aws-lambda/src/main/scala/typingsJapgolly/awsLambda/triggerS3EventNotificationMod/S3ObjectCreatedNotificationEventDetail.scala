package typingsJapgolly.awsLambda.triggerS3EventNotificationMod

import typingsJapgolly.awsLambda.anon.NameString
import typingsJapgolly.awsLambda.anon.Sequencer
import typingsJapgolly.awsLambda.awsLambdaStrings.CompleteMultipartUpload
import typingsJapgolly.awsLambda.awsLambdaStrings.CopyObject
import typingsJapgolly.awsLambda.awsLambdaStrings.PutObject
import typingsJapgolly.awsLambda.awsLambdaStrings.`0`
import typingsJapgolly.awsLambda.awsLambdaStrings.`POST Object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectCreatedNotificationEventDetail extends StObject {
  
  var bucket: NameString
  
  var `object`: Sequencer
  
  var reason: PutObject | (`POST Object`) | CopyObject | CompleteMultipartUpload
  
  var `request-id`: String
  
  var requester: String
  
  var `source-ip-address`: String
  
  var version: `0`
}
object S3ObjectCreatedNotificationEventDetail {
  
  inline def apply(
    bucket: NameString,
    `object`: Sequencer,
    reason: PutObject | (`POST Object`) | CopyObject | CompleteMultipartUpload,
    `request-id`: String,
    requester: String,
    `source-ip-address`: String
  ): S3ObjectCreatedNotificationEventDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-ip-address")(`source-ip-address`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectCreatedNotificationEventDetail]
  }
  
  extension [Self <: S3ObjectCreatedNotificationEventDetail](x: Self) {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Sequencer): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReason(value: PutObject | (`POST Object`) | CopyObject | CompleteMultipartUpload): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: String): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def `setSource-ip-address`(value: String): Self = StObject.set(x, "source-ip-address", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

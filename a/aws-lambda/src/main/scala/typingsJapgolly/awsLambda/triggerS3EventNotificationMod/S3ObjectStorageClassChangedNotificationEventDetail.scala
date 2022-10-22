package typingsJapgolly.awsLambda.triggerS3EventNotificationMod

import typingsJapgolly.awsLambda.anon.EtagKey
import typingsJapgolly.awsLambda.anon.NameString
import typingsJapgolly.awsLambda.awsLambdaStrings.DEEP_ARCHIVE
import typingsJapgolly.awsLambda.awsLambdaStrings.GLACIER
import typingsJapgolly.awsLambda.awsLambdaStrings.GLACIER_IR
import typingsJapgolly.awsLambda.awsLambdaStrings.INTELLIGENT_TIERING
import typingsJapgolly.awsLambda.awsLambdaStrings.ONEZONE_IA
import typingsJapgolly.awsLambda.awsLambdaStrings.OUTPOSTS
import typingsJapgolly.awsLambda.awsLambdaStrings.REDUCED_REDUNDANCY
import typingsJapgolly.awsLambda.awsLambdaStrings.STANDARD
import typingsJapgolly.awsLambda.awsLambdaStrings.STANDARD_IA
import typingsJapgolly.awsLambda.awsLambdaStrings.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectStorageClassChangedNotificationEventDetail extends StObject {
  
  var bucket: NameString
  
  var `destination-storage-class`: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | GLACIER | DEEP_ARCHIVE | OUTPOSTS | GLACIER_IR
  
  var `object`: EtagKey
  
  var `request-id`: String
  
  var requester: String
  
  var version: `0`
}
object S3ObjectStorageClassChangedNotificationEventDetail {
  
  inline def apply(
    bucket: NameString,
    `destination-storage-class`: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | GLACIER | DEEP_ARCHIVE | OUTPOSTS | GLACIER_IR,
    `object`: EtagKey,
    `request-id`: String,
    requester: String
  ): S3ObjectStorageClassChangedNotificationEventDetail = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], version = "0")
    __obj.updateDynamic("destination-storage-class")(`destination-storage-class`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-id")(`request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectStorageClassChangedNotificationEventDetail]
  }
  
  extension [Self <: S3ObjectStorageClassChangedNotificationEventDetail](x: Self) {
    
    inline def setBucket(value: NameString): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def `setDestination-storage-class`(
      value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | INTELLIGENT_TIERING | GLACIER | DEEP_ARCHIVE | OUTPOSTS | GLACIER_IR
    ): Self = StObject.set(x, "destination-storage-class", value.asInstanceOf[js.Any])
    
    inline def setObject(value: EtagKey): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def `setRequest-id`(value: String): Self = StObject.set(x, "request-id", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: String): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `0`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

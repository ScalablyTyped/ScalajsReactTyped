package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCelebrityRecognitionRequest extends StObject {
  
  /**
    * Idempotent token used to identify the start request. If you use the same token with multiple StartCelebrityRecognition requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidently started more than once. 
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.ClientRequestToken] = js.undefined
  
  /**
    * An identifier you specify that's returned in the completion notification that's published to your Amazon Simple Notification Service topic. For example, you can use JobTag to group related jobs and identify them in the completion notification.
    */
  var JobTag: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.JobTag] = js.undefined
  
  /**
    * The Amazon SNS topic ARN that you want Amazon Rekognition Video to publish the completion status of the celebrity recognition analysis to. The Amazon SNS topic must have a topic name that begins with AmazonRekognition if you are using the AmazonRekognitionServiceRole permissions policy.
    */
  var NotificationChannel: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.NotificationChannel] = js.undefined
  
  /**
    * The video in which you want to recognize celebrities. The video must be stored in an Amazon S3 bucket.
    */
  var Video: typingsJapgolly.awsSdk.clientsRekognitionMod.Video
}
object StartCelebrityRecognitionRequest {
  
  inline def apply(Video: Video): StartCelebrityRecognitionRequest = {
    val __obj = js.Dynamic.literal(Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCelebrityRecognitionRequest]
  }
  
  extension [Self <: StartCelebrityRecognitionRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setJobTag(value: JobTag): Self = StObject.set(x, "JobTag", value.asInstanceOf[js.Any])
    
    inline def setJobTagUndefined: Self = StObject.set(x, "JobTag", js.undefined)
    
    inline def setNotificationChannel(value: NotificationChannel): Self = StObject.set(x, "NotificationChannel", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUndefined: Self = StObject.set(x, "NotificationChannel", js.undefined)
    
    inline def setVideo(value: Video): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}

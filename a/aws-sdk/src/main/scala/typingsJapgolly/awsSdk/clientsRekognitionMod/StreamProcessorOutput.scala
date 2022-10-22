package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorOutput extends StObject {
  
  /**
    * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition stream processor streams the analysis results.
    */
  var KinesisDataStream: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.KinesisDataStream] = js.undefined
  
  /**
    *  The Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference results of a video analysis operation. 
    */
  var S3Destination: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.S3Destination] = js.undefined
}
object StreamProcessorOutput {
  
  inline def apply(): StreamProcessorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorOutput]
  }
  
  extension [Self <: StreamProcessorOutput](x: Self) {
    
    inline def setKinesisDataStream(value: KinesisDataStream): Self = StObject.set(x, "KinesisDataStream", value.asInstanceOf[js.Any])
    
    inline def setKinesisDataStreamUndefined: Self = StObject.set(x, "KinesisDataStream", js.undefined)
    
    inline def setS3Destination(value: S3Destination): Self = StObject.set(x, "S3Destination", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationUndefined: Self = StObject.set(x, "S3Destination", js.undefined)
  }
}

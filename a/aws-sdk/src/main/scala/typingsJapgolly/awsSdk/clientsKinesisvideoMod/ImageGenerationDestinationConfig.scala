package typingsJapgolly.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageGenerationDestinationConfig extends StObject {
  
  /**
    * The AWS Region of the S3 bucket where images will be delivered. This DestinationRegion must match the Region where the stream is located.
    */
  var DestinationRegion: typingsJapgolly.awsSdk.clientsKinesisvideoMod.DestinationRegion
  
  /**
    * The Uniform Resource Idenifier (URI) that identifies where the images will be delivered.
    */
  var Uri: DestinationUri
}
object ImageGenerationDestinationConfig {
  
  inline def apply(DestinationRegion: DestinationRegion, Uri: DestinationUri): ImageGenerationDestinationConfig = {
    val __obj = js.Dynamic.literal(DestinationRegion = DestinationRegion.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageGenerationDestinationConfig]
  }
  
  extension [Self <: ImageGenerationDestinationConfig](x: Self) {
    
    inline def setDestinationRegion(value: DestinationRegion): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    inline def setUri(value: DestinationUri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}

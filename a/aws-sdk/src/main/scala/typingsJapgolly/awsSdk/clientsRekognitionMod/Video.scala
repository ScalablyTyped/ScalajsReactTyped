package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /**
    * The Amazon S3 bucket name and file name for the video.
    */
  var S3Object: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.S3Object] = js.undefined
}
object Video {
  
  inline def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  extension [Self <: Video](x: Self) {
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}

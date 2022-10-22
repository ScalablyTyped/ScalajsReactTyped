package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * Blob of image bytes up to 5 MBs.
    */
  var Bytes: js.UndefOr[ImageBlob] = js.undefined
  
  /**
    * Identifies an S3 object as the image source.
    */
  var S3Object: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.S3Object] = js.undefined
}
object Image {
  
  inline def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setBytes(value: ImageBlob): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "Bytes", js.undefined)
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}

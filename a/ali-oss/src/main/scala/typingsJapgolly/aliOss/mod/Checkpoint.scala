package typingsJapgolly.aliOss.mod

import typingsJapgolly.aliOss.anon.Etag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkpoint extends StObject {
  
  var doneParts: js.Array[Etag]
  
  /** The file object selected by the user, if the browser is restarted, it needs the user to manually trigger the settings */
  var file: Any
  
  var fileSize: Double
  
  /** object key */
  var name: String
  
  var partSize: Double
  
  var uploadId: String
}
object Checkpoint {
  
  inline def apply(
    doneParts: js.Array[Etag],
    file: Any,
    fileSize: Double,
    name: String,
    partSize: Double,
    uploadId: String
  ): Checkpoint = {
    val __obj = js.Dynamic.literal(doneParts = doneParts.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partSize = partSize.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkpoint]
  }
  
  extension [Self <: Checkpoint](x: Self) {
    
    inline def setDoneParts(value: js.Array[Etag]): Self = StObject.set(x, "doneParts", value.asInstanceOf[js.Any])
    
    inline def setDonePartsVarargs(value: Etag*): Self = StObject.set(x, "doneParts", js.Array(value*))
    
    inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}

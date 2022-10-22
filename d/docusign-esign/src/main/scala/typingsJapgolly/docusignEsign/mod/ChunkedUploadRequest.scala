package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkedUploadRequest extends StObject {
  
  /**
    * The id of the chunked upload.
    *
    * **Note**: This property is ignored in requests, and overridden with an auto-generated value in responses.
    */
  var chunkedUploadId: js.UndefOr[String] = js.undefined
  
  /**
    * A Base64-encoded representation of the content hat is used to upload the file.
    *
    * Maximum size: 50 MB. However, data is also subject to REST API limits regarding request sizes, and Internet Information Systems
    * (IIS) might place further constraints on file size.
    */
  var data: js.UndefOr[String] = js.undefined
}
object ChunkedUploadRequest {
  
  inline def apply(): ChunkedUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkedUploadRequest]
  }
  
  extension [Self <: ChunkedUploadRequest](x: Self) {
    
    inline def setChunkedUploadId(value: String): Self = StObject.set(x, "chunkedUploadId", value.asInstanceOf[js.Any])
    
    inline def setChunkedUploadIdUndefined: Self = StObject.set(x, "chunkedUploadId", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}

package typingsJapgolly.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultipartUploadsOutput extends StObject {
  
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is null.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of in-progress multipart uploads.
    */
  var UploadsList: js.UndefOr[typingsJapgolly.awsSdk.clientsGlacierMod.UploadsList] = js.undefined
}
object ListMultipartUploadsOutput {
  
  inline def apply(): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  
  extension [Self <: ListMultipartUploadsOutput](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setUploadsList(value: UploadsList): Self = StObject.set(x, "UploadsList", value.asInstanceOf[js.Any])
    
    inline def setUploadsListUndefined: Self = StObject.set(x, "UploadsList", js.undefined)
    
    inline def setUploadsListVarargs(value: UploadListElement*): Self = StObject.set(x, "UploadsList", js.Array(value*))
  }
}

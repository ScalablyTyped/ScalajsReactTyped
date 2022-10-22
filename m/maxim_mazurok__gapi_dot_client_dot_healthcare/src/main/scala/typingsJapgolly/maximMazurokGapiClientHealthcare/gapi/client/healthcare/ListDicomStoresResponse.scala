package typingsJapgolly.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDicomStoresResponse extends StObject {
  
  /** The returned DICOM stores. Won't be more DICOM stores than the value of page_size in the request. */
  var dicomStores: js.UndefOr[js.Array[DicomStore]] = js.undefined
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDicomStoresResponse {
  
  inline def apply(): ListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDicomStoresResponse]
  }
  
  extension [Self <: ListDicomStoresResponse](x: Self) {
    
    inline def setDicomStores(value: js.Array[DicomStore]): Self = StObject.set(x, "dicomStores", value.asInstanceOf[js.Any])
    
    inline def setDicomStoresUndefined: Self = StObject.set(x, "dicomStores", js.undefined)
    
    inline def setDicomStoresVarargs(value: DicomStore*): Self = StObject.set(x, "dicomStores", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

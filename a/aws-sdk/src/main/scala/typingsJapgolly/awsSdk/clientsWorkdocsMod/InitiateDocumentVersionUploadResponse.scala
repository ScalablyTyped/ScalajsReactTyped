package typingsJapgolly.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateDocumentVersionUploadResponse extends StObject {
  
  /**
    * The document metadata.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.undefined
  
  /**
    * The upload metadata.
    */
  var UploadMetadata: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkdocsMod.UploadMetadata] = js.undefined
}
object InitiateDocumentVersionUploadResponse {
  
  inline def apply(): InitiateDocumentVersionUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
  }
  
  extension [Self <: InitiateDocumentVersionUploadResponse](x: Self) {
    
    inline def setMetadata(value: DocumentMetadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setUploadMetadata(value: UploadMetadata): Self = StObject.set(x, "UploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadMetadataUndefined: Self = StObject.set(x, "UploadMetadata", js.undefined)
  }
}

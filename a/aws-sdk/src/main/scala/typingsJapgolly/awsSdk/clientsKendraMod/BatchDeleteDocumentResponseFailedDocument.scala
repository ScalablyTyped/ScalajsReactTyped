package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDocumentResponseFailedDocument extends StObject {
  
  /**
    * The error code for why the document couldn't be removed from the index.
    */
  var ErrorCode: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.ErrorCode] = js.undefined
  
  /**
    * An explanation for why the document couldn't be removed from the index.
    */
  var ErrorMessage: js.UndefOr[typingsJapgolly.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
  
  /**
    * The identifier of the document that couldn't be removed from the index.
    */
  var Id: js.UndefOr[DocumentId] = js.undefined
}
object BatchDeleteDocumentResponseFailedDocument {
  
  inline def apply(): BatchDeleteDocumentResponseFailedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDocumentResponseFailedDocument]
  }
  
  extension [Self <: BatchDeleteDocumentResponseFailedDocument](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV3alpha1ReloadDocumentOperationMetadata extends StObject {
  
  /** The generic information of the operation. */
  var genericMetadata: js.UndefOr[GoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata] = js.undefined
}
object GoogleCloudDialogflowV3alpha1ReloadDocumentOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV3alpha1ReloadDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV3alpha1ReloadDocumentOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV3alpha1ReloadDocumentOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: GoogleCloudDialogflowV3alpha1GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}

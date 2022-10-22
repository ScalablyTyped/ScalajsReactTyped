package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AugmentedManifestsListItem extends StObject {
  
  /**
    * The S3 prefix to the annotation files that are referred in the augmented manifest file.
    */
  var AnnotationDataS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The JSON attribute that contains the annotations for your training documents. The number of attribute names that you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained labeling job. If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the job was created in Ground Truth. If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in the chain. Each LabelAttributeName key provides the annotations from an individual job.
    */
  var AttributeNames: AttributeNamesList
  
  /**
    * The type of augmented manifest. PlainTextDocument or SemiStructuredDocument. If you don't specify, the default is PlainTextDocument.     PLAIN_TEXT_DOCUMENT A document type that represents any unicode text that is encoded in UTF-8.    SEMI_STRUCTURED_DOCUMENT A document type with positional and structural context, like a PDF. For training with Amazon Comprehend, only PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX and TXT.  
    */
  var DocumentType: js.UndefOr[AugmentedManifestsDocumentTypeFormat] = js.undefined
  
  /**
    * The Amazon S3 location of the augmented manifest file.
    */
  var S3Uri: typingsJapgolly.awsSdk.clientsComprehendMod.S3Uri
  
  /**
    * The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
    */
  var SourceDocumentsS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The purpose of the data you've provided in the augmented manifest. You can either train or test this data. If you don't specify, the default is train. TRAIN - all of the documents in the manifest will be used for training. If no test documents are provided, Amazon Comprehend will automatically reserve a portion of the training documents for testing.  TEST - all of the documents in the manifest will be used for testing.
    */
  var Split: js.UndefOr[typingsJapgolly.awsSdk.clientsComprehendMod.Split] = js.undefined
}
object AugmentedManifestsListItem {
  
  inline def apply(AttributeNames: AttributeNamesList, S3Uri: S3Uri): AugmentedManifestsListItem = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AugmentedManifestsListItem]
  }
  
  extension [Self <: AugmentedManifestsListItem](x: Self) {
    
    inline def setAnnotationDataS3Uri(value: S3Uri): Self = StObject.set(x, "AnnotationDataS3Uri", value.asInstanceOf[js.Any])
    
    inline def setAnnotationDataS3UriUndefined: Self = StObject.set(x, "AnnotationDataS3Uri", js.undefined)
    
    inline def setAttributeNames(value: AttributeNamesList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesVarargs(value: AttributeNamesListItem*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setDocumentType(value: AugmentedManifestsDocumentTypeFormat): Self = StObject.set(x, "DocumentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "DocumentType", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setSourceDocumentsS3Uri(value: S3Uri): Self = StObject.set(x, "SourceDocumentsS3Uri", value.asInstanceOf[js.Any])
    
    inline def setSourceDocumentsS3UriUndefined: Self = StObject.set(x, "SourceDocumentsS3Uri", js.undefined)
    
    inline def setSplit(value: Split): Self = StObject.set(x, "Split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "Split", js.undefined)
  }
}

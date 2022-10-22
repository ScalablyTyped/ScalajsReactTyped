package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1p1alpha1LabelTextEntityExtractionOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1p1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}

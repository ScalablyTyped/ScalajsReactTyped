package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1alpha1LabelImageBoundingPolyOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1alpha1LabelImageBoundingPolyOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1alpha1LabelImageBoundingPolyOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1alpha1LabelImageBoundingPolyOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1alpha1LabelImageBoundingPolyOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}

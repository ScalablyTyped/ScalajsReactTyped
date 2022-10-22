package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata extends StObject {
  
  /** Basic human annotation config. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1p2alpha1LabelImageOrientedBoundingBoxOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1p2alpha1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}

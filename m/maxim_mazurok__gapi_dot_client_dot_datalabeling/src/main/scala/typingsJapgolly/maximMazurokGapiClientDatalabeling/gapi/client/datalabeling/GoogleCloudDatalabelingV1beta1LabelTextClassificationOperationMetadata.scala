package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata extends StObject {
  
  /** Basic human annotation config used in labeling request. */
  var basicConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1HumanAnnotationConfig] = js.undefined
}
object GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1LabelTextClassificationOperationMetadata](x: Self) {
    
    inline def setBasicConfig(value: GoogleCloudDatalabelingV1beta1HumanAnnotationConfig): Self = StObject.set(x, "basicConfig", value.asInstanceOf[js.Any])
    
    inline def setBasicConfigUndefined: Self = StObject.set(x, "basicConfig", js.undefined)
  }
}

package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1OutputConfig extends StObject {
  
  /** Output to a file in Cloud Storage. Should be used for labeling output other than image segmentation. */
  var gcsDestination: js.UndefOr[GoogleCloudDatalabelingV1beta1GcsDestination] = js.undefined
  
  /** Output to a folder in Cloud Storage. Should be used for image segmentation or document de-identification labeling outputs. */
  var gcsFolderDestination: js.UndefOr[GoogleCloudDatalabelingV1beta1GcsFolderDestination] = js.undefined
}
object GoogleCloudDatalabelingV1beta1OutputConfig {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1OutputConfig]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1OutputConfig](x: Self) {
    
    inline def setGcsDestination(value: GoogleCloudDatalabelingV1beta1GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
    
    inline def setGcsFolderDestination(value: GoogleCloudDatalabelingV1beta1GcsFolderDestination): Self = StObject.set(x, "gcsFolderDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsFolderDestinationUndefined: Self = StObject.set(x, "gcsFolderDestination", js.undefined)
  }
}

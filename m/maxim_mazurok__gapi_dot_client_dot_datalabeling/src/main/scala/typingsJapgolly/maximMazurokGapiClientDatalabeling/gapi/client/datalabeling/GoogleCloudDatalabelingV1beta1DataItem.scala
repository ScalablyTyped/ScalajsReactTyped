package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1DataItem extends StObject {
  
  /** The image payload, a container of the image bytes/uri. */
  var imagePayload: js.UndefOr[GoogleCloudDatalabelingV1beta1ImagePayload] = js.undefined
  
  /** Output only. Name of the data item, in format of: projects/{project_id}/datasets/{dataset_id}/dataItems/{data_item_id} */
  var name: js.UndefOr[String] = js.undefined
  
  /** The text payload, a container of text content. */
  var textPayload: js.UndefOr[GoogleCloudDatalabelingV1beta1TextPayload] = js.undefined
  
  /** The video payload, a container of the video uri. */
  var videoPayload: js.UndefOr[GoogleCloudDatalabelingV1beta1VideoPayload] = js.undefined
}
object GoogleCloudDatalabelingV1beta1DataItem {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1DataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1DataItem]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1DataItem](x: Self) {
    
    inline def setImagePayload(value: GoogleCloudDatalabelingV1beta1ImagePayload): Self = StObject.set(x, "imagePayload", value.asInstanceOf[js.Any])
    
    inline def setImagePayloadUndefined: Self = StObject.set(x, "imagePayload", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTextPayload(value: GoogleCloudDatalabelingV1beta1TextPayload): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    inline def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    inline def setVideoPayload(value: GoogleCloudDatalabelingV1beta1VideoPayload): Self = StObject.set(x, "videoPayload", value.asInstanceOf[js.Any])
    
    inline def setVideoPayloadUndefined: Self = StObject.set(x, "videoPayload", js.undefined)
  }
}

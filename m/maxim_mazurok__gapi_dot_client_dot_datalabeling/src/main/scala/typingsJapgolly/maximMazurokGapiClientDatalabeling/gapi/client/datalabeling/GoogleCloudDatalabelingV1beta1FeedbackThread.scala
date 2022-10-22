package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1FeedbackThread extends StObject {
  
  /** Metadata regarding the feedback thread. */
  var feedbackThreadMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata] = js.undefined
  
  /** Name of the feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}' */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1FeedbackThread {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1FeedbackThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1FeedbackThread]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1FeedbackThread](x: Self) {
    
    inline def setFeedbackThreadMetadata(value: GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata): Self = StObject.set(x, "feedbackThreadMetadata", value.asInstanceOf[js.Any])
    
    inline def setFeedbackThreadMetadataUndefined: Self = StObject.set(x, "feedbackThreadMetadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

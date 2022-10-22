package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1BigQuerySource extends StObject {
  
  /**
    * Required. BigQuery URI to a table, up to 2,000 characters long. If you specify the URI of a table that does not exist, Data Labeling Service creates a table at the URI with the
    * correct schema when you create your EvaluationJob. If you specify the URI of a table that already exists, it must have the [correct
    * schema](/ml-engine/docs/continuous-evaluation/create-job#table-schema). Provide the table URI in the following format: "bq://{your_project_id}/
    * {your_dataset_name}/{your_table_name}" [Learn more](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
    */
  var inputUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1BigQuerySource {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1BigQuerySource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1BigQuerySource]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1BigQuerySource](x: Self) {
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
  }
}

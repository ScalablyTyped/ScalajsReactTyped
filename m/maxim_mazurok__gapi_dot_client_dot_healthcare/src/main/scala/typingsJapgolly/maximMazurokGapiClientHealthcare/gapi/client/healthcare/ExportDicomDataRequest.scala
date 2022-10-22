package typingsJapgolly.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDicomDataRequest extends StObject {
  
  /**
    * The BigQuery output destination. You can only export to a BigQuery dataset that's in the same project as the DICOM store you're exporting from. The Cloud Healthcare Service Agent
    * requires two IAM roles on the BigQuery location: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.
    */
  var bigqueryDestination: js.UndefOr[GoogleCloudHealthcareV1DicomBigQueryDestination] = js.undefined
  
  /** The Cloud Storage output destination. The Cloud Healthcare Service Agent requires the `roles/storage.objectAdmin` Cloud IAM roles on the Cloud Storage location. */
  var gcsDestination: js.UndefOr[GoogleCloudHealthcareV1DicomGcsDestination] = js.undefined
}
object ExportDicomDataRequest {
  
  inline def apply(): ExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDicomDataRequest]
  }
  
  extension [Self <: ExportDicomDataRequest](x: Self) {
    
    inline def setBigqueryDestination(value: GoogleCloudHealthcareV1DicomBigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: GoogleCloudHealthcareV1DicomGcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}

package typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to export resources.
  */
@js.native
trait SchemaExportResourcesRequest extends js.Object {
  /**
    * The BigQuery output destination.  The BigQuery location requires two IAM
    * roles: `roles/bigquery.dataEditor` and `roles/bigquery.jobUser`.  The
    * output will be one BigQuery table per resource type.
    */
  var bigqueryDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirBigQueryDestination] = js.native
  /**
    * The Cloud Storage output destination.  The Cloud Storage location
    * requires the `roles/storage.objectAdmin` Cloud IAM role.  The exported
    * outputs are organized by FHIR resource types. The server will create one
    * object per resource type. Each object contains newline delimited JSON,
    * and each line is a FHIR resource.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination] = js.native
}

object SchemaExportResourcesRequest {
  @scala.inline
  def apply(
    bigqueryDestination: SchemaGoogleCloudHealthcareV1alpha2FhirBigQueryDestination = null,
    gcsDestination: SchemaGoogleCloudHealthcareV1alpha2FhirRestGcsDestination = null
  ): SchemaExportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestination != null) __obj.updateDynamic("bigqueryDestination")(bigqueryDestination.asInstanceOf[js.Any])
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportResourcesRequest]
  }
}


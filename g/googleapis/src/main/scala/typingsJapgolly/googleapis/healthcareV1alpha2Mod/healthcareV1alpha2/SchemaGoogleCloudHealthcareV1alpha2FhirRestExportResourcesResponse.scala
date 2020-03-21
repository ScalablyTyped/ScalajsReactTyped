package typingsJapgolly.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Final response of exporting resources. This structure will be included in
  * the response to describe the detailed outcome. It will only be included
  * when the operation finishes.
  */
@js.native
trait SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse extends js.Object {
  /**
    * The name of the FHIR store where resources have been exported, in the
    * format
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`.
    */
  var fhirStore: js.UndefOr[String] = js.native
  /**
    * The total number of resources exported from the requested FHIR store.
    */
  var resourceCount: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse {
  @scala.inline
  def apply(fhirStore: String = null, resourceCount: String = null): SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (fhirStore != null) __obj.updateDynamic("fhirStore")(fhirStore.asInstanceOf[js.Any])
    if (resourceCount != null) __obj.updateDynamic("resourceCount")(resourceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudHealthcareV1alpha2FhirRestExportResourcesResponse]
  }
}


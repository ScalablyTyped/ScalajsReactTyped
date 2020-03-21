package typingsJapgolly.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list Cloud Dataflow jobs.  This may be a partial
  * response, depending on the page size in the ListJobsRequest.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  /**
    * Zero or more messages describing the [regional endpoints]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var failedLocation: js.UndefOr[js.Array[SchemaFailedLocation]] = js.native
  /**
    * A subset of the requested job information.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * Set if there may be more results than fit in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobsResponse {
  @scala.inline
  def apply(
    failedLocation: js.Array[SchemaFailedLocation] = null,
    jobs: js.Array[SchemaJob] = null,
    nextPageToken: String = null
  ): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (failedLocation != null) __obj.updateDynamic("failedLocation")(failedLocation.asInstanceOf[js.Any])
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
}


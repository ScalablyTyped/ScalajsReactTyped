package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationsAccessReportResponse extends js.Object {
  /**
    * An object that contains details about the most recent attempt to access the service.
    */
  var AccessDetails: js.UndefOr[typingsJapgolly.awsSdk.iamMod.AccessDetails] = js.native
  var ErrorDetails: js.UndefOr[typingsJapgolly.awsSdk.iamMod.ErrorDetails] = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed. This field is null if the job is still in progress, as indicated by a job status value of IN_PROGRESS.
    */
  var JobCompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: js.Date = js.native
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[markerType] = js.native
  /**
    * The number of services that the applicable SCPs allow account principals to access.
    */
  var NumberOfServicesAccessible: js.UndefOr[integerType] = js.native
  /**
    * The number of services that account principals are allowed but did not attempt to access.
    */
  var NumberOfServicesNotAccessed: js.UndefOr[integerType] = js.native
}

object GetOrganizationsAccessReportResponse {
  @scala.inline
  def apply(
    JobCreationDate: js.Date,
    JobStatus: jobStatusType,
    AccessDetails: AccessDetails = null,
    ErrorDetails: ErrorDetails = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    JobCompletionDate: js.Date = null,
    Marker: markerType = null,
    NumberOfServicesAccessible: Int | Double = null,
    NumberOfServicesNotAccessed: Int | Double = null
  ): GetOrganizationsAccessReportResponse = {
    val __obj = js.Dynamic.literal(JobCreationDate = JobCreationDate.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any])
    if (AccessDetails != null) __obj.updateDynamic("AccessDetails")(AccessDetails.asInstanceOf[js.Any])
    if (ErrorDetails != null) __obj.updateDynamic("ErrorDetails")(ErrorDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (JobCompletionDate != null) __obj.updateDynamic("JobCompletionDate")(JobCompletionDate.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (NumberOfServicesAccessible != null) __obj.updateDynamic("NumberOfServicesAccessible")(NumberOfServicesAccessible.asInstanceOf[js.Any])
    if (NumberOfServicesNotAccessed != null) __obj.updateDynamic("NumberOfServicesNotAccessed")(NumberOfServicesNotAccessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationsAccessReportResponse]
  }
}


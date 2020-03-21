package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportJobResponse extends js.Object {
  /**
    * The unique identifier for the application that's associated with the import job.
    */
  var ApplicationId: string = js.native
  /**
    * The number of pieces that were processed successfully (completed) by the import job, as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[integer] = js.native
  /**
    * The date, in ISO 8601 format, when the import job was completed.
    */
  var CompletionDate: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the import job was created.
    */
  var CreationDate: string = js.native
  /**
    * The resource settings that apply to the import job.
    */
  var Definition: ImportJobResource = js.native
  /**
    * The number of pieces that weren't processed successfully (failed) by the import job, as of the time of the request.
    */
  var FailedPieces: js.UndefOr[integer] = js.native
  /**
    * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the import job, if any.
    */
  var Failures: js.UndefOr[ListOfString] = js.native
  /**
    * The unique identifier for the import job.
    */
  var Id: string = js.native
  /**
    * The status of the import job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more pieces in the job.
    */
  var JobStatus: typingsJapgolly.awsSdk.pinpointMod.JobStatus = js.native
  /**
    * The total number of endpoint definitions that weren't processed successfully (failed) by the import job, typically because an error, such as a syntax error, occurred.
    */
  var TotalFailures: js.UndefOr[integer] = js.native
  /**
    * The total number of pieces that must be processed to complete the import job. Each piece consists of an approximately equal portion of the endpoint definitions that are part of the import job.
    */
  var TotalPieces: js.UndefOr[integer] = js.native
  /**
    * The total number of endpoint definitions that were processed by the import job.
    */
  var TotalProcessed: js.UndefOr[integer] = js.native
  /**
    * The job type. This value is IMPORT for import jobs.
    */
  var Type: string = js.native
}

object ImportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: string,
    CreationDate: string,
    Definition: ImportJobResource,
    Id: string,
    JobStatus: JobStatus,
    Type: string,
    CompletedPieces: Int | Double = null,
    CompletionDate: string = null,
    FailedPieces: Int | Double = null,
    Failures: ListOfString = null,
    TotalFailures: Int | Double = null,
    TotalPieces: Int | Double = null,
    TotalProcessed: Int | Double = null
  ): ImportJobResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], JobStatus = JobStatus.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (CompletedPieces != null) __obj.updateDynamic("CompletedPieces")(CompletedPieces.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (FailedPieces != null) __obj.updateDynamic("FailedPieces")(FailedPieces.asInstanceOf[js.Any])
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    if (TotalFailures != null) __obj.updateDynamic("TotalFailures")(TotalFailures.asInstanceOf[js.Any])
    if (TotalPieces != null) __obj.updateDynamic("TotalPieces")(TotalPieces.asInstanceOf[js.Any])
    if (TotalProcessed != null) __obj.updateDynamic("TotalProcessed")(TotalProcessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobResponse]
  }
}


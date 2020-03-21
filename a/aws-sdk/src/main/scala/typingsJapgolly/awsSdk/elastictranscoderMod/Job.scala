package typingsJapgolly.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the job.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The identifier that Elastic Transcoder assigned to the job. You use this value to get settings for the job or to delete the job.
    */
  var Id: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Id] = js.native
  /**
    * A section of the request or response body that provides information about the file that is being transcoded.
    */
  var Input: js.UndefOr[JobInput] = js.native
  /**
    * Information about the files that you're transcoding. If you specified multiple files for this job, Elastic Transcoder stitches the files together to make one output.
    */
  var Inputs: js.UndefOr[JobInputs] = js.native
  /**
    * If you specified one output for a job, information about that output. If you specified multiple outputs for a job, the Output object lists information about the first output. This duplicates the information that is listed for the first output in the Outputs object.  Outputs recommended instead.  A section of the request or response body that provides information about the transcoded (target) file. 
    */
  var Output: js.UndefOr[JobOutput] = js.native
  /**
    * The value, if any, that you want Elastic Transcoder to prepend to the names of all files that this job creates, including output files, thumbnails, and playlists. We recommend that you add a / or some other delimiter to the end of the OutputKeyPrefix.
    */
  var OutputKeyPrefix: js.UndefOr[Key] = js.native
  /**
    * Information about the output files. We recommend that you use the Outputs syntax for all jobs, even when you want Elastic Transcoder to transcode a file into only one format. Do not use both the Outputs and Output syntaxes in the same request. You can create a maximum of 30 outputs per job.  If you specify more than one output for a job, Elastic Transcoder creates the files for each output in the order in which you specify them in the job.
    */
  var Outputs: js.UndefOr[JobOutputs] = js.native
  /**
    *  The Id of the pipeline that you want Elastic Transcoder to use for transcoding. The pipeline determines several settings, including the Amazon S3 bucket from which Elastic Transcoder gets the files to transcode and the bucket into which Elastic Transcoder puts the transcoded files. 
    */
  var PipelineId: js.UndefOr[Id] = js.native
  /**
    *  Outputs in Fragmented MP4 or MPEG-TS format only.  If you specify a preset in PresetId for which the value of Container is fmp4 (Fragmented MP4) or ts (MPEG-TS), Playlists contains information about the master playlists that you want Elastic Transcoder to create. The maximum number of master playlists in a job is 30.
    */
  var Playlists: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Playlists] = js.native
  /**
    *  The status of the job: Submitted, Progressing, Complete, Canceled, or Error. 
    */
  var Status: js.UndefOr[JobStatus] = js.native
  /**
    * Details about the timing of a job.
    */
  var Timing: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Timing] = js.native
  /**
    * User-defined metadata that you want to associate with an Elastic Transcoder job. You specify metadata in key/value pairs, and you can add up to 10 key/value pairs per job. Elastic Transcoder does not guarantee that key/value pairs are returned in the same order in which you specify them. Metadata keys and values must use characters from the following list:    0-9     A-Z and a-z     Space    The following symbols: _.:/=+-%@   
    */
  var UserMetadata: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.UserMetadata] = js.native
}

object Job {
  @scala.inline
  def apply(
    Arn: String = null,
    Id: Id = null,
    Input: JobInput = null,
    Inputs: JobInputs = null,
    Output: JobOutput = null,
    OutputKeyPrefix: Key = null,
    Outputs: JobOutputs = null,
    PipelineId: Id = null,
    Playlists: Playlists = null,
    Status: JobStatus = null,
    Timing: Timing = null,
    UserMetadata: UserMetadata = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    if (OutputKeyPrefix != null) __obj.updateDynamic("OutputKeyPrefix")(OutputKeyPrefix.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    if (PipelineId != null) __obj.updateDynamic("PipelineId")(PipelineId.asInstanceOf[js.Any])
    if (Playlists != null) __obj.updateDynamic("Playlists")(Playlists.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Timing != null) __obj.updateDynamic("Timing")(Timing.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}


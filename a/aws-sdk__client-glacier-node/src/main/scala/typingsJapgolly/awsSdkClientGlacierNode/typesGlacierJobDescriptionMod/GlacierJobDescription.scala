package typingsJapgolly.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod

import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ArchiveRetrieval
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Failed
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InProgress
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InventoryRetrieval
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Select
import typingsJapgolly.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Succeeded
import typingsJapgolly.awsSdkClientGlacierNode.typesInventoryRetrievalJobDescriptionMod.InventoryRetrievalJobDescription
import typingsJapgolly.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation
import typingsJapgolly.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierJobDescription extends js.Object {
  /**
    * <p>The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or <code>Select</code>. </p>
    */
  var Action: js.UndefOr[ArchiveRetrieval | InventoryRetrieval | Select | String] = js.undefined
  /**
    * <p>The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.</p>
    */
  var ArchiveId: js.UndefOr[String] = js.undefined
  /**
    * <p>The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.</p>
    */
  var ArchiveSHA256TreeHash: js.UndefOr[String] = js.undefined
  /**
    * <p>For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.</p>
    */
  var ArchiveSizeInBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>The job status. When a job is completed, you get the job's output using Get Job Output (GET output).</p>
    */
  var Completed: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The UTC time that the job request completed. While the job is in progress, the value is null.</p>
    */
  var CompletionDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example <code>"2012-03-20T17:03:43.221Z"</code>.</p>
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>Parameters used for range inventory retrieval.</p>
    */
  var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.undefined
  /**
    * <p>For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an archive retrieval or select job, this value is null.</p>
    */
  var InventorySizeInBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>The job description provided when initiating the job.</p>
    */
  var JobDescription: js.UndefOr[String] = js.undefined
  /**
    * <p>An opaque string that identifies an Amazon Glacier job.</p>
    */
  var JobId: js.UndefOr[String] = js.undefined
  /**
    * <p>Contains the job output location.</p>
    */
  var JobOutputPath: js.UndefOr[String] = js.undefined
  /**
    * <p>Contains the location where the data from the select job is stored.</p>
    */
  var OutputLocation: js.UndefOr[typingsJapgolly.awsSdkClientGlacierNode.typesOutputLocationMod.OutputLocation] = js.undefined
  /**
    * <p>The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. </p>
    */
  var RetrievalByteRange: js.UndefOr[String] = js.undefined
  /**
    * <p>For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.</p> <p>The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an archive specified a tree-hash aligned range, then this field returns a value.</p> <p>If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.</p> <p>This field is null for the following:</p> <ul> <li> <p>Archive retrieval jobs that specify a range that is not tree-hash aligned</p> </li> </ul> <ul> <li> <p>Archival jobs that specify a range that is equal to the whole archive, when the job status is <code>InProgress</code> </p> </li> </ul> <ul> <li> <p>Inventory jobs</p> </li> <li> <p>Select jobs</p> </li> </ul>
    */
  var SHA256TreeHash: js.UndefOr[String] = js.undefined
  /**
    * <p>An Amazon SNS topic that receives notification.</p>
    */
  var SNSTopic: js.UndefOr[String] = js.undefined
  /**
    * <p>Contains the parameters used for a select.</p>
    */
  var SelectParameters: js.UndefOr[
    typingsJapgolly.awsSdkClientGlacierNode.typesSelectParametersMod.SelectParameters
  ] = js.undefined
  /**
    * <p>The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the status of the job.</p>
    */
  var StatusCode: js.UndefOr[InProgress | Succeeded | Failed | String] = js.undefined
  /**
    * <p>A friendly message that describes the job status.</p>
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * <p>The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>, <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.</p>
    */
  var Tier: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.</p>
    */
  var VaultARN: js.UndefOr[String] = js.undefined
}

object GlacierJobDescription {
  @scala.inline
  def apply(
    Action: ArchiveRetrieval | InventoryRetrieval | Select | String = null,
    ArchiveId: String = null,
    ArchiveSHA256TreeHash: String = null,
    ArchiveSizeInBytes: Int | Double = null,
    Completed: js.UndefOr[Boolean] = js.undefined,
    CompletionDate: String = null,
    CreationDate: String = null,
    InventoryRetrievalParameters: InventoryRetrievalJobDescription = null,
    InventorySizeInBytes: Int | Double = null,
    JobDescription: String = null,
    JobId: String = null,
    JobOutputPath: String = null,
    OutputLocation: OutputLocation = null,
    RetrievalByteRange: String = null,
    SHA256TreeHash: String = null,
    SNSTopic: String = null,
    SelectParameters: SelectParameters = null,
    StatusCode: InProgress | Succeeded | Failed | String = null,
    StatusMessage: String = null,
    Tier: String = null,
    VaultARN: String = null
  ): GlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ArchiveId != null) __obj.updateDynamic("ArchiveId")(ArchiveId.asInstanceOf[js.Any])
    if (ArchiveSHA256TreeHash != null) __obj.updateDynamic("ArchiveSHA256TreeHash")(ArchiveSHA256TreeHash.asInstanceOf[js.Any])
    if (ArchiveSizeInBytes != null) __obj.updateDynamic("ArchiveSizeInBytes")(ArchiveSizeInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(Completed)) __obj.updateDynamic("Completed")(Completed.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (InventoryRetrievalParameters != null) __obj.updateDynamic("InventoryRetrievalParameters")(InventoryRetrievalParameters.asInstanceOf[js.Any])
    if (InventorySizeInBytes != null) __obj.updateDynamic("InventorySizeInBytes")(InventorySizeInBytes.asInstanceOf[js.Any])
    if (JobDescription != null) __obj.updateDynamic("JobDescription")(JobDescription.asInstanceOf[js.Any])
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    if (JobOutputPath != null) __obj.updateDynamic("JobOutputPath")(JobOutputPath.asInstanceOf[js.Any])
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation.asInstanceOf[js.Any])
    if (RetrievalByteRange != null) __obj.updateDynamic("RetrievalByteRange")(RetrievalByteRange.asInstanceOf[js.Any])
    if (SHA256TreeHash != null) __obj.updateDynamic("SHA256TreeHash")(SHA256TreeHash.asInstanceOf[js.Any])
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic.asInstanceOf[js.Any])
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters.asInstanceOf[js.Any])
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlacierJobDescription]
  }
}


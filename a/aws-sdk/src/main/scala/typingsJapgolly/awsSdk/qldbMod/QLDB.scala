package typingsJapgolly.awsSdk.qldbMod

import typingsJapgolly.awsSdk.configMod.ConfigBase
import typingsJapgolly.awsSdk.errorMod.AWSError
import typingsJapgolly.awsSdk.requestMod.Request
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QLDB extends Service {
  @JSName("config")
  var config_QLDB: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new ledger in your AWS account.
    */
  def createLedger(): Request[CreateLedgerResponse, AWSError] = js.native
  def createLedger(callback: js.Function2[/* err */ AWSError, /* data */ CreateLedgerResponse, Unit]): Request[CreateLedgerResponse, AWSError] = js.native
  /**
    * Creates a new ledger in your AWS account.
    */
  def createLedger(params: CreateLedgerRequest): Request[CreateLedgerResponse, AWSError] = js.native
  def createLedger(
    params: CreateLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLedgerResponse, Unit]
  ): Request[CreateLedgerResponse, AWSError] = js.native
  /**
    * Deletes a ledger and all of its contents. This action is irreversible. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  def deleteLedger(): Request[js.Object, AWSError] = js.native
  def deleteLedger(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a ledger and all of its contents. This action is irreversible. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  def deleteLedger(params: DeleteLedgerRequest): Request[js.Object, AWSError] = js.native
  def deleteLedger(
    params: DeleteLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns information about a journal export job, including the ledger name, export ID, when it was created, current status, and its start and end time export parameters. If the export job with the given ExportId doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException.
    */
  def describeJournalS3Export(): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  def describeJournalS3Export(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJournalS3ExportResponse, Unit]): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  /**
    * Returns information about a journal export job, including the ledger name, export ID, when it was created, current status, and its start and end time export parameters. If the export job with the given ExportId doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException.
    */
  def describeJournalS3Export(params: DescribeJournalS3ExportRequest): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  def describeJournalS3Export(
    params: DescribeJournalS3ExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJournalS3ExportResponse, Unit]
  ): Request[DescribeJournalS3ExportResponse, AWSError] = js.native
  /**
    * Returns information about a ledger, including its state and when it was created.
    */
  def describeLedger(): Request[DescribeLedgerResponse, AWSError] = js.native
  def describeLedger(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLedgerResponse, Unit]): Request[DescribeLedgerResponse, AWSError] = js.native
  /**
    * Returns information about a ledger, including its state and when it was created.
    */
  def describeLedger(params: DescribeLedgerRequest): Request[DescribeLedgerResponse, AWSError] = js.native
  def describeLedger(
    params: DescribeLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLedgerResponse, Unit]
  ): Request[DescribeLedgerResponse, AWSError] = js.native
  /**
    * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage Service (Amazon S3) bucket. The data is written as files in Amazon Ion format. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name is in CREATING status, then throws ResourcePreconditionNotMetException. You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export requests throw LimitExceededException.
    */
  def exportJournalToS3(): Request[ExportJournalToS3Response, AWSError] = js.native
  def exportJournalToS3(callback: js.Function2[/* err */ AWSError, /* data */ ExportJournalToS3Response, Unit]): Request[ExportJournalToS3Response, AWSError] = js.native
  /**
    * Exports journal contents within a date and time range from a ledger into a specified Amazon Simple Storage Service (Amazon S3) bucket. The data is written as files in Amazon Ion format. If the ledger with the given Name doesn't exist, then throws ResourceNotFoundException. If the ledger with the given Name is in CREATING status, then throws ResourcePreconditionNotMetException. You can initiate up to two concurrent journal export requests for each ledger. Beyond this limit, journal export requests throw LimitExceededException.
    */
  def exportJournalToS3(params: ExportJournalToS3Request): Request[ExportJournalToS3Response, AWSError] = js.native
  def exportJournalToS3(
    params: ExportJournalToS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ ExportJournalToS3Response, Unit]
  ): Request[ExportJournalToS3Response, AWSError] = js.native
  /**
    * Returns a journal block object at a specified address in a ledger. Also returns a proof of the specified block for verification if DigestTipAddress is provided. If the specified ledger doesn't exist or is in DELETING status, then throws ResourceNotFoundException. If the specified ledger is in CREATING status, then throws ResourcePreconditionNotMetException. If no block exists with the specified address, then throws InvalidParameterException.
    */
  def getBlock(): Request[GetBlockResponse, AWSError] = js.native
  def getBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetBlockResponse, Unit]): Request[GetBlockResponse, AWSError] = js.native
  /**
    * Returns a journal block object at a specified address in a ledger. Also returns a proof of the specified block for verification if DigestTipAddress is provided. If the specified ledger doesn't exist or is in DELETING status, then throws ResourceNotFoundException. If the specified ledger is in CREATING status, then throws ResourcePreconditionNotMetException. If no block exists with the specified address, then throws InvalidParameterException.
    */
  def getBlock(params: GetBlockRequest): Request[GetBlockResponse, AWSError] = js.native
  def getBlock(
    params: GetBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBlockResponse, Unit]
  ): Request[GetBlockResponse, AWSError] = js.native
  /**
    * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash value and a block address.
    */
  def getDigest(): Request[GetDigestResponse, AWSError] = js.native
  def getDigest(callback: js.Function2[/* err */ AWSError, /* data */ GetDigestResponse, Unit]): Request[GetDigestResponse, AWSError] = js.native
  /**
    * Returns the digest of a ledger at the latest committed block in the journal. The response includes a 256-bit hash value and a block address.
    */
  def getDigest(params: GetDigestRequest): Request[GetDigestResponse, AWSError] = js.native
  def getDigest(
    params: GetDigestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDigestResponse, Unit]
  ): Request[GetDigestResponse, AWSError] = js.native
  /**
    * Returns a revision data object for a specified document ID and block address. Also returns a proof of the specified revision for verification if DigestTipAddress is provided.
    */
  def getRevision(): Request[GetRevisionResponse, AWSError] = js.native
  def getRevision(callback: js.Function2[/* err */ AWSError, /* data */ GetRevisionResponse, Unit]): Request[GetRevisionResponse, AWSError] = js.native
  /**
    * Returns a revision data object for a specified document ID and block address. Also returns a proof of the specified revision for verification if DigestTipAddress is provided.
    */
  def getRevision(params: GetRevisionRequest): Request[GetRevisionResponse, AWSError] = js.native
  def getRevision(
    params: GetRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRevisionResponse, Unit]
  ): Request[GetRevisionResponse, AWSError] = js.native
  /**
    * Returns an array of journal export job descriptions for all ledgers that are associated with the current AWS account and Region. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3Exports multiple times.
    */
  def listJournalS3Exports(): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  def listJournalS3Exports(callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsResponse, Unit]): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  /**
    * Returns an array of journal export job descriptions for all ledgers that are associated with the current AWS account and Region. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3Exports multiple times.
    */
  def listJournalS3Exports(params: ListJournalS3ExportsRequest): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  def listJournalS3Exports(
    params: ListJournalS3ExportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsResponse, Unit]
  ): Request[ListJournalS3ExportsResponse, AWSError] = js.native
  /**
    * Returns an array of journal export job descriptions for a specified ledger. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3ExportsForLedger multiple times.
    */
  def listJournalS3ExportsForLedger(): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  def listJournalS3ExportsForLedger(callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsForLedgerResponse, Unit]): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  /**
    * Returns an array of journal export job descriptions for a specified ledger. This action returns a maximum of MaxResults items, and is paginated so that you can retrieve all the items by calling ListJournalS3ExportsForLedger multiple times.
    */
  def listJournalS3ExportsForLedger(params: ListJournalS3ExportsForLedgerRequest): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  def listJournalS3ExportsForLedger(
    params: ListJournalS3ExportsForLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJournalS3ExportsForLedgerResponse, Unit]
  ): Request[ListJournalS3ExportsForLedgerResponse, AWSError] = js.native
  /**
    * Returns an array of ledger summaries that are associated with the current AWS account and Region. This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling ListLedgers multiple times.
    */
  def listLedgers(): Request[ListLedgersResponse, AWSError] = js.native
  def listLedgers(callback: js.Function2[/* err */ AWSError, /* data */ ListLedgersResponse, Unit]): Request[ListLedgersResponse, AWSError] = js.native
  /**
    * Returns an array of ledger summaries that are associated with the current AWS account and Region. This action returns a maximum of 100 items and is paginated so that you can retrieve all the items by calling ListLedgers multiple times.
    */
  def listLedgers(params: ListLedgersRequest): Request[ListLedgersResponse, AWSError] = js.native
  def listLedgers(
    params: ListLedgersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLedgersResponse, Unit]
  ): Request[ListLedgersResponse, AWSError] = js.native
  /**
    * Returns all tags for a specified Amazon QLDB resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns all tags for a specified Amazon QLDB resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a specified Amazon QLDB resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and returns an error.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a specified Amazon QLDB resource. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and returns an error.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a specified Amazon QLDB resource. You can specify up to 50 tag keys to remove.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates properties on a ledger.
    */
  def updateLedger(): Request[UpdateLedgerResponse, AWSError] = js.native
  def updateLedger(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLedgerResponse, Unit]): Request[UpdateLedgerResponse, AWSError] = js.native
  /**
    * Updates properties on a ledger.
    */
  def updateLedger(params: UpdateLedgerRequest): Request[UpdateLedgerResponse, AWSError] = js.native
  def updateLedger(
    params: UpdateLedgerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLedgerResponse, Unit]
  ): Request[UpdateLedgerResponse, AWSError] = js.native
}


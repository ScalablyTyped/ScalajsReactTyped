package typingsJapgolly.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJournalToS3Request extends js.Object {
  /**
    * The exclusive end date and time for the range of journal contents that you want to export. The ExclusiveEndTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z  The ExclusiveEndTime must be less than or equal to the current UTC date and time.
    */
  var ExclusiveEndTime: js.Date = js.native
  /**
    * The inclusive start date and time for the range of journal contents that you want to export. The InclusiveStartTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z  The InclusiveStartTime must be before ExclusiveEndTime. If you provide an InclusiveStartTime that is before the ledger's CreationDateTime, Amazon QLDB defaults it to the ledger's CreationDateTime.
    */
  var InclusiveStartTime: js.Date = js.native
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption of your exported data.  
    */
  var RoleArn: Arn = js.native
  /**
    * The configuration settings of the Amazon S3 bucket destination for your export request.
    */
  var S3ExportConfiguration: typingsJapgolly.awsSdk.qldbMod.S3ExportConfiguration = js.native
}

object ExportJournalToS3Request {
  @scala.inline
  def apply(
    ExclusiveEndTime: js.Date,
    InclusiveStartTime: js.Date,
    Name: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration
  ): ExportJournalToS3Request = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime.asInstanceOf[js.Any], InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3ExportConfiguration = S3ExportConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportJournalToS3Request]
  }
}


package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mod.Timestamp
import typingsJapgolly.mangopay2NodejsSdk.mod.disputeDocument.DisputeDocumentType
import typingsJapgolly.mangopay2NodejsSdk.mod.disputeDocument.DocumentStatus
import typingsJapgolly.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.disputeDocument.DisputeDocumentData> */
trait PartialDisputeDocumentDat extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.undefined
  var DisputeId: js.UndefOr[String] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var ProcessedDate: js.UndefOr[Timestamp] = js.undefined
  var RefusedReasonMessage: js.UndefOr[String] = js.undefined
  var RefusedReasonType: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType] = js.undefined
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var Type: js.UndefOr[DisputeDocumentType] = js.undefined
  var UserId: js.UndefOr[String] = js.undefined
}

object PartialDisputeDocumentDat {
  @scala.inline
  def apply(
    CreationDate: Int | Double = null,
    DisputeId: String = null,
    Id: String = null,
    ProcessedDate: Int | Double = null,
    RefusedReasonMessage: String = null,
    RefusedReasonType: RefusedReasonType = null,
    Status: DocumentStatus = null,
    Tag: String = null,
    Type: DisputeDocumentType = null,
    UserId: String = null
  ): PartialDisputeDocumentDat = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DisputeId != null) __obj.updateDynamic("DisputeId")(DisputeId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ProcessedDate != null) __obj.updateDynamic("ProcessedDate")(ProcessedDate.asInstanceOf[js.Any])
    if (RefusedReasonMessage != null) __obj.updateDynamic("RefusedReasonMessage")(RefusedReasonMessage.asInstanceOf[js.Any])
    if (RefusedReasonType != null) __obj.updateDynamic("RefusedReasonType")(RefusedReasonType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDisputeDocumentDat]
  }
}


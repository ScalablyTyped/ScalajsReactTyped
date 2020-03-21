package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustsRequest extends js.Object {
  /**
    * The Directory ID of the AWS directory that is a part of the requested trust relationship.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The maximum number of objects to return.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeTrustsResult.NextToken value from a previous call to DescribeTrusts. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * A list of identifiers of the trust relationships for which to obtain the information. If this member is null, all trust relationships that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TrustIds: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.TrustIds] = js.native
}

object DescribeTrustsRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null,
    TrustIds: TrustIds = null
  ): DescribeTrustsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TrustIds != null) __obj.updateDynamic("TrustIds")(TrustIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustsRequest]
  }
}


package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainControllersRequest extends js.Object {
  /**
    * Identifier of the directory for which to retrieve the domain controller information.
    */
  var DirectoryId: typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * A list of identifiers for the domain controllers whose information will be provided.
    */
  var DomainControllerIds: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.DomainControllerIds] = js.native
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.Limit] = js.native
  /**
    * The DescribeDomainControllers.NextToken value from a previous call to DescribeDomainControllers. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeDomainControllersRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    DomainControllerIds: DomainControllerIds = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    if (DomainControllerIds != null) __obj.updateDynamic("DomainControllerIds")(DomainControllerIds.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainControllersRequest]
  }
}


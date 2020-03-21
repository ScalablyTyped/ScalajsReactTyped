package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrustResult extends js.Object {
  var RequestId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.RequestId] = js.native
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.TrustId] = js.native
}

object UpdateTrustResult {
  @scala.inline
  def apply(RequestId: RequestId = null, TrustId: TrustId = null): UpdateTrustResult = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (TrustId != null) __obj.updateDynamic("TrustId")(TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustResult]
  }
}


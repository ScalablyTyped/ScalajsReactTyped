package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesFailoverRequest extends js.Object {
  /** Failover Context. */
  var failoverContext: js.UndefOr[FailoverContext] = js.undefined
}

object InstancesFailoverRequest {
  @scala.inline
  def apply(failoverContext: FailoverContext = null): InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    if (failoverContext != null) __obj.updateDynamic("failoverContext")(failoverContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesFailoverRequest]
  }
}


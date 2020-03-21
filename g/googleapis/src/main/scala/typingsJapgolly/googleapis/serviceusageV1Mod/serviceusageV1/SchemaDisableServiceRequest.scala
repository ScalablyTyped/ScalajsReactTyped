package typingsJapgolly.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `DisableService` method.
  */
@js.native
trait SchemaDisableServiceRequest extends js.Object {
  /**
    * Indicates if services that are enabled and which depend on this service
    * should also be disabled. If not set, an error will be generated if any
    * enabled services depend on the service to be disabled. When set, the
    * service, and any enabled services that depend on it, will be disabled
    * together.
    */
  var disableDependentServices: js.UndefOr[Boolean] = js.native
}

object SchemaDisableServiceRequest {
  @scala.inline
  def apply(disableDependentServices: js.UndefOr[Boolean] = js.undefined): SchemaDisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableDependentServices)) __obj.updateDynamic("disableDependentServices")(disableDependentServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisableServiceRequest]
  }
}


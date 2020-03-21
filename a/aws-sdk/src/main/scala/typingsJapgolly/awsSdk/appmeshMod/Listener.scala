package typingsJapgolly.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[HealthCheckPolicy] = js.native
  /**
    * The port mapping information for the listener.
    */
  var portMapping: PortMapping = js.native
}

object Listener {
  @scala.inline
  def apply(portMapping: PortMapping, healthCheck: HealthCheckPolicy = null): Listener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
}


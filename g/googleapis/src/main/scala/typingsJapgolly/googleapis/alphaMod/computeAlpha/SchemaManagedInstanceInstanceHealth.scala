package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceInstanceHealth extends js.Object {
  /**
    * [Output Only] The current detailed instance health state.
    */
  var detailedHealthState: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL for the health check that verifies whether the
    * instance is healthy.
    */
  var healthCheck: js.UndefOr[String] = js.native
  /**
    * [Output Only] The current instance health state.
    */
  var healthState: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceInstanceHealth {
  @scala.inline
  def apply(detailedHealthState: String = null, healthCheck: String = null, healthState: String = null): SchemaManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    if (detailedHealthState != null) __obj.updateDynamic("detailedHealthState")(detailedHealthState.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (healthState != null) __obj.updateDynamic("healthState")(healthState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedInstanceInstanceHealth]
  }
}


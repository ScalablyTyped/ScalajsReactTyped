package typingsJapgolly.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * On-premises instance configuration.
  */
@js.native
trait SchemaOnPremisesConfiguration extends js.Object {
  /**
    * The host and port of the on-premises instance in host:port format
    */
  var hostPort: js.UndefOr[String] = js.native
  /**
    * This is always sql#onPremisesConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOnPremisesConfiguration {
  @scala.inline
  def apply(hostPort: String = null, kind: String = null): SchemaOnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (hostPort != null) __obj.updateDynamic("hostPort")(hostPort.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOnPremisesConfiguration]
  }
}


package typingsJapgolly.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine network accessConfig. Identical to the accessConfig on
  * corresponding Compute Engine resource.
  */
@js.native
trait SchemaAccessConfig extends js.Object {
  /**
    * Name of this access configuration.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An external IP address associated with this instance.
    */
  var natIp: js.UndefOr[String] = js.native
  /**
    * Type of this access configuration file. Currently only ONE_TO_ONE_NAT is
    * supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAccessConfig {
  @scala.inline
  def apply(name: String = null, natIp: String = null, `type`: String = null): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (natIp != null) __obj.updateDynamic("natIp")(natIp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccessConfig]
  }
}


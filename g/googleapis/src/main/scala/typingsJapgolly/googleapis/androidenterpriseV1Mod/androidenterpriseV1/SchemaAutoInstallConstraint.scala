package typingsJapgolly.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The auto-install constraint. Defines a set of restrictions for
  * installation. At least one of the fields must be set.
  */
@js.native
trait SchemaAutoInstallConstraint extends js.Object {
  /**
    * Charging state constraint.
    */
  var chargingStateConstraint: js.UndefOr[String] = js.native
  /**
    * Device idle state constraint.
    */
  var deviceIdleStateConstraint: js.UndefOr[String] = js.native
  /**
    * Network type constraint.
    */
  var networkTypeConstraint: js.UndefOr[String] = js.native
}

object SchemaAutoInstallConstraint {
  @scala.inline
  def apply(
    chargingStateConstraint: String = null,
    deviceIdleStateConstraint: String = null,
    networkTypeConstraint: String = null
  ): SchemaAutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    if (chargingStateConstraint != null) __obj.updateDynamic("chargingStateConstraint")(chargingStateConstraint.asInstanceOf[js.Any])
    if (deviceIdleStateConstraint != null) __obj.updateDynamic("deviceIdleStateConstraint")(deviceIdleStateConstraint.asInstanceOf[js.Any])
    if (networkTypeConstraint != null) __obj.updateDynamic("networkTypeConstraint")(networkTypeConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoInstallConstraint]
  }
}


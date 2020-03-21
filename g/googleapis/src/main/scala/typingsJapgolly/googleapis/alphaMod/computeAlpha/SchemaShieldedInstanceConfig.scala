package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Shielded Instance options.
  */
@js.native
trait SchemaShieldedInstanceConfig extends js.Object {
  /**
    * Defines whether the instance has integrity monitoring enabled.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the instance has Secure Boot enabled.
    */
  var enableSecureBoot: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the instance has the vTPM enabled.
    */
  var enableVtpm: js.UndefOr[Boolean] = js.native
}

object SchemaShieldedInstanceConfig {
  @scala.inline
  def apply(
    enableIntegrityMonitoring: js.UndefOr[Boolean] = js.undefined,
    enableSecureBoot: js.UndefOr[Boolean] = js.undefined,
    enableVtpm: js.UndefOr[Boolean] = js.undefined
  ): SchemaShieldedInstanceConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableIntegrityMonitoring)) __obj.updateDynamic("enableIntegrityMonitoring")(enableIntegrityMonitoring.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSecureBoot)) __obj.updateDynamic("enableSecureBoot")(enableSecureBoot.asInstanceOf[js.Any])
    if (!js.isUndefined(enableVtpm)) __obj.updateDynamic("enableVtpm")(enableVtpm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShieldedInstanceConfig]
  }
}


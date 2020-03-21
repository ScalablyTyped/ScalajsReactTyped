package typingsJapgolly.googleapis.resellerV1Mod.resellerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a subscription renewal settings.
  */
@js.native
trait SchemaRenewalSettings extends js.Object {
  /**
    * Identifies the resource as a subscription renewal setting. Value:
    * subscriptions#renewalSettings
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Renewal settings for the annual commitment plan. For more detailed
    * information, see renewal options in the administrator help center. When
    * renewing a subscription, the renewalType is a required property.
    */
  var renewalType: js.UndefOr[String] = js.native
}

object SchemaRenewalSettings {
  @scala.inline
  def apply(kind: String = null, renewalType: String = null): SchemaRenewalSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (renewalType != null) __obj.updateDynamic("renewalType")(renewalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRenewalSettings]
  }
}


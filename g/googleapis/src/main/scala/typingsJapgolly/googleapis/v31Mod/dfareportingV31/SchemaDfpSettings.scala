package typingsJapgolly.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Ad Manager Settings
  */
@js.native
trait SchemaDfpSettings extends js.Object {
  /**
    * Ad Manager network code for this directory site.
    */
  var dfpNetworkCode: js.UndefOr[String] = js.native
  /**
    * Ad Manager network name for this directory site.
    */
  var dfpNetworkName: js.UndefOr[String] = js.native
  /**
    * Whether this directory site accepts programmatic placements.
    */
  var programmaticPlacementAccepted: js.UndefOr[Boolean] = js.native
  /**
    * Whether this directory site accepts publisher-paid tags.
    */
  var pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.native
  /**
    * Whether this directory site is available only via Publisher Portal.
    */
  var publisherPortalOnly: js.UndefOr[Boolean] = js.native
}

object SchemaDfpSettings {
  @scala.inline
  def apply(
    dfpNetworkCode: String = null,
    dfpNetworkName: String = null,
    programmaticPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    pubPaidPlacementAccepted: js.UndefOr[Boolean] = js.undefined,
    publisherPortalOnly: js.UndefOr[Boolean] = js.undefined
  ): SchemaDfpSettings = {
    val __obj = js.Dynamic.literal()
    if (dfpNetworkCode != null) __obj.updateDynamic("dfpNetworkCode")(dfpNetworkCode.asInstanceOf[js.Any])
    if (dfpNetworkName != null) __obj.updateDynamic("dfpNetworkName")(dfpNetworkName.asInstanceOf[js.Any])
    if (!js.isUndefined(programmaticPlacementAccepted)) __obj.updateDynamic("programmaticPlacementAccepted")(programmaticPlacementAccepted.asInstanceOf[js.Any])
    if (!js.isUndefined(pubPaidPlacementAccepted)) __obj.updateDynamic("pubPaidPlacementAccepted")(pubPaidPlacementAccepted.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherPortalOnly)) __obj.updateDynamic("publisherPortalOnly")(publisherPortalOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDfpSettings]
  }
}


package typingsJapgolly.reactGtmModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagManagerArgs extends DataLayerArgs {
  /**
    * Used to set environments.
    */
  var auth: js.UndefOr[String] = js.undefined
  /**
    * Additional events such as 'gtm.start': new Date().getTime(),event:'gtm.js'.
    */
  var events: js.UndefOr[js.Object] = js.undefined
  /**
    * GTM id, must be something like GTM-000000.
    */
  var gtmId: String
  /**
    * Used to set environments, something like env-00.
    */
  var preview: js.UndefOr[String] = js.undefined
}

object TagManagerArgs {
  @scala.inline
  def apply(
    gtmId: String,
    auth: String = null,
    dataLayer: js.Object = null,
    dataLayerName: String = null,
    events: js.Object = null,
    preview: String = null
  ): TagManagerArgs = {
    val __obj = js.Dynamic.literal(gtmId = gtmId.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (dataLayer != null) __obj.updateDynamic("dataLayer")(dataLayer.asInstanceOf[js.Any])
    if (dataLayerName != null) __obj.updateDynamic("dataLayerName")(dataLayerName.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagManagerArgs]
  }
}


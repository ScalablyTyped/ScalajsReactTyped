package typingsJapgolly.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomOverlayOptions extends js.Object {
  /**
    * Specifies if the custom overlay should be rendered above or below the label layer of the map. When above,
    * elements in the overlay can be clickable. Default: True
    *
    * This can only be set when creating the overlay.
    */
  var beneathLabels: js.UndefOr[Boolean] = js.undefined
}

object ICustomOverlayOptions {
  @scala.inline
  def apply(beneathLabels: js.UndefOr[Boolean] = js.undefined): ICustomOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beneathLabels)) __obj.updateDynamic("beneathLabels")(beneathLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomOverlayOptions]
  }
}


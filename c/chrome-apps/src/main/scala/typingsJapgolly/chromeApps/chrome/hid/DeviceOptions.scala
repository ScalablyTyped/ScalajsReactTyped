package typingsJapgolly.chromeApps.chrome.hid

import typingsJapgolly.chromeApps.chrome.deprecated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOptions extends js.Object {
  /**
    * A device matching any given filter will be returned.
    * An empty filter list will return all devices the app has permission for.
    * @since Chrome 39
    */
  var filters: js.UndefOr[js.Array[DeviceFilter]] = js.undefined
  /**
    * Equivalent to setting DeviceFilter.productId.
    * @deprecated Deprecated since Chrome 39.
    */
  var productId: js.UndefOr[deprecated] = js.undefined
  /**
    * Equivalent to setting DeviceFilter.vendorId.
    * @deprecated Deprecated since Chrome 39
    */
  var vendorId: js.UndefOr[deprecated] = js.undefined
}

object DeviceOptions {
  @scala.inline
  def apply(
    filters: js.Array[DeviceFilter] = null,
    productId: js.UndefOr[scala.Nothing] = js.undefined,
    vendorId: js.UndefOr[scala.Nothing] = js.undefined
  ): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(productId)) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (!js.isUndefined(vendorId)) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOptions]
  }
}


package typingsJapgolly.amplitudeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCarrier extends js.Object {
  var carrier: js.UndefOr[Boolean] = js.undefined
  var city: js.UndefOr[Boolean] = js.undefined
  var country: js.UndefOr[Boolean] = js.undefined
  var device_manufacturer: js.UndefOr[Boolean] = js.undefined
  var device_model: js.UndefOr[Boolean] = js.undefined
  var dma: js.UndefOr[Boolean] = js.undefined
  var ip_address: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[Boolean] = js.undefined
  var os_name: js.UndefOr[Boolean] = js.undefined
  var os_version: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[Boolean] = js.undefined
  var region: js.UndefOr[Boolean] = js.undefined
  var version_name: js.UndefOr[Boolean] = js.undefined
}

object AnonCarrier {
  @scala.inline
  def apply(
    carrier: js.UndefOr[Boolean] = js.undefined,
    city: js.UndefOr[Boolean] = js.undefined,
    country: js.UndefOr[Boolean] = js.undefined,
    device_manufacturer: js.UndefOr[Boolean] = js.undefined,
    device_model: js.UndefOr[Boolean] = js.undefined,
    dma: js.UndefOr[Boolean] = js.undefined,
    ip_address: js.UndefOr[Boolean] = js.undefined,
    language: js.UndefOr[Boolean] = js.undefined,
    os_name: js.UndefOr[Boolean] = js.undefined,
    os_version: js.UndefOr[Boolean] = js.undefined,
    platform: js.UndefOr[Boolean] = js.undefined,
    region: js.UndefOr[Boolean] = js.undefined,
    version_name: js.UndefOr[Boolean] = js.undefined
  ): AnonCarrier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(carrier)) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (!js.isUndefined(city)) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (!js.isUndefined(country)) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(device_manufacturer)) __obj.updateDynamic("device_manufacturer")(device_manufacturer.asInstanceOf[js.Any])
    if (!js.isUndefined(device_model)) __obj.updateDynamic("device_model")(device_model.asInstanceOf[js.Any])
    if (!js.isUndefined(dma)) __obj.updateDynamic("dma")(dma.asInstanceOf[js.Any])
    if (!js.isUndefined(ip_address)) __obj.updateDynamic("ip_address")(ip_address.asInstanceOf[js.Any])
    if (!js.isUndefined(language)) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (!js.isUndefined(os_name)) __obj.updateDynamic("os_name")(os_name.asInstanceOf[js.Any])
    if (!js.isUndefined(os_version)) __obj.updateDynamic("os_version")(os_version.asInstanceOf[js.Any])
    if (!js.isUndefined(platform)) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(region)) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(version_name)) __obj.updateDynamic("version_name")(version_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCarrier]
  }
}


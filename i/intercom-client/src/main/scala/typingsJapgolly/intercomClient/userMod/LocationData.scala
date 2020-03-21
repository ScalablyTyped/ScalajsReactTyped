package typingsJapgolly.intercomClient.userMod

import typingsJapgolly.intercomClient.intercomClientStrings.location_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationData extends js.Object {
  var city_name: String | Null
  var continent_code: String | Null
  var country_code: String | Null
  var country_name: String | Null
  var latitude: Double | Null
  var longitude: Double | Null
  var postal_code: String | Null
  var region_name: String | Null
  var timezone: String | Null
  var `type`: location_data
}

object LocationData {
  @scala.inline
  def apply(
    `type`: location_data,
    city_name: String = null,
    continent_code: String = null,
    country_code: String = null,
    country_name: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    postal_code: String = null,
    region_name: String = null,
    timezone: String = null
  ): LocationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (city_name != null) __obj.updateDynamic("city_name")(city_name.asInstanceOf[js.Any])
    if (continent_code != null) __obj.updateDynamic("continent_code")(continent_code.asInstanceOf[js.Any])
    if (country_code != null) __obj.updateDynamic("country_code")(country_code.asInstanceOf[js.Any])
    if (country_name != null) __obj.updateDynamic("country_name")(country_name.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code.asInstanceOf[js.Any])
    if (region_name != null) __obj.updateDynamic("region_name")(region_name.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
}


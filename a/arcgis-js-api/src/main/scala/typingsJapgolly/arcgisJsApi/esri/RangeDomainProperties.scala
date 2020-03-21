package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inherited
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDomainProperties extends DomainProperties {
  /**
    * The maximum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * The minimum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue)
    */
  var minValue: js.UndefOr[Double] = js.undefined
}

object RangeDomainProperties {
  @scala.inline
  def apply(
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    name: String = null,
    `type`: range | `coded-value` | inherited = null
  ): RangeDomainProperties = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDomainProperties]
  }
}


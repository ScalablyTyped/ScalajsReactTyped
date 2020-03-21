package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inherited
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodedValueDomainProperties extends DomainProperties {
  /**
    * An array of the coded values in the domain. See the object specification table below for the properties each item in the array should contain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html#codedValues)
    */
  var codedValues: js.UndefOr[js.Array[CodedValueDomainCodedValues]] = js.undefined
}

object CodedValueDomainProperties {
  @scala.inline
  def apply(
    codedValues: js.Array[CodedValueDomainCodedValues] = null,
    name: String = null,
    `type`: range | `coded-value` | inherited = null
  ): CodedValueDomainProperties = {
    val __obj = js.Dynamic.literal()
    if (codedValues != null) __obj.updateDynamic("codedValues")(codedValues.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodedValueDomainProperties]
  }
}


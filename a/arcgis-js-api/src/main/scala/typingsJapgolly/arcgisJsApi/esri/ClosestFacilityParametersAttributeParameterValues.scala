package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosestFacilityParametersAttributeParameterValues extends Object {
  /**
    * The name of the attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeName: String
  /**
    * The parameter name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var parameterName: String
  /**
    * The parameter value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var value: String
}

object ClosestFacilityParametersAttributeParameterValues {
  @scala.inline
  def apply(
    attributeName: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    parameterName: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    value: String
  ): ClosestFacilityParametersAttributeParameterValues = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ClosestFacilityParametersAttributeParameterValues]
  }
}


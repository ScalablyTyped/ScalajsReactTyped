package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameterValues extends Object {
  /**
    * The parameter name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#parameterValues)
    */
  var name: String
  /**
    * Single value or array of values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#parameterValues)
    */
  var value: String | (js.Array[js.Date | Double | String]) | Double | js.Date
}

object QueryParameterValues {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    name: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    value: String | (js.Array[js.Date | Double | String]) | Double | js.Date
  ): QueryParameterValues = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[QueryParameterValues]
  }
}


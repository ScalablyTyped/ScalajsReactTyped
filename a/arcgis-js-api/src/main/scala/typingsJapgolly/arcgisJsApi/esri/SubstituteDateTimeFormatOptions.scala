package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubstituteDateTimeFormatOptions extends Object {
  /**
    * The date format options for the [Intl.DateTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DateTimeFormat) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var intlOptions: DateTimeFormatOptions
  /**
    * The type of this format. The value is always `"date"`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-intl.html#SubstituteDateTimeFormatOptions)
    */
  var `type`: date
}

object SubstituteDateTimeFormatOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    intlOptions: DateTimeFormatOptions,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: date
  ): SubstituteDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], intlOptions = intlOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstituteDateTimeFormatOptions]
  }
}


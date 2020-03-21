package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureViewModelLastEditInfo extends Object {
  /**
    * Date that the edit was performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var date: String
  /**
    * The type of edit that was performed on the feature.  **Possible values:** edit | create
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var `type`: String
  /**
    * User who performed the last edit on a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var user: String
}

object FeatureViewModelLastEditInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    date: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: String,
    user: String
  ): FeatureViewModelLastEditInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureViewModelLastEditInfo]
  }
}


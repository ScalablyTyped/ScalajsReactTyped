package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditFieldsInfo extends Object {
  /**
    * The name of the field that stores the date and time the feature was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var creationDateField: String
  /**
    * The name of the field that stores the name of the user who created the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var creatorField: String
  /**
    * The name of the field that stores the date and time the feature was last edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var editDateField: String
  /**
    * The name of the field that stores the name of the user who last edited the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditFieldsInfo)
    */
  var editorField: String
}

object EditFieldsInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    creationDateField: String,
    creatorField: String,
    editDateField: String,
    editorField: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): EditFieldsInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], creationDateField = creationDateField.asInstanceOf[js.Any], creatorField = creatorField.asInstanceOf[js.Any], editDateField = editDateField.asInstanceOf[js.Any], editorField = editorField.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[EditFieldsInfo]
  }
}


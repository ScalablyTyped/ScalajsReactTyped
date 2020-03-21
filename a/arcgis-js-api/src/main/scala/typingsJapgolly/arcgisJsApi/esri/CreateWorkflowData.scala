package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkflowData extends Object {
  /**
    * The [creationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#CreationInfo) provides the feature template and layer when creating a new feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData)
    */
  var creationInfo: CreationInfo
  /**
    * The edits used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData)
    */
  var edits: Edits
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#CreateWorkflowData)
    */
  var viewModel: EditorViewModel
}

object CreateWorkflowData {
  @scala.inline
  def apply(
    constructor: js.Function,
    creationInfo: CreationInfo,
    edits: Edits,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    viewModel: EditorViewModel
  ): CreateWorkflowData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], creationInfo = creationInfo.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[CreateWorkflowData]
  }
}


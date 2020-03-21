package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkflowData extends Object {
  /**
    * An array of features to be updated. This is only relevant when there are multiple candidates to update.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var candidates: js.Array[Graphic]
  /**
    * The object that matches the feature being updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var editableItem: EditableItem
  /**
    * The edits used to keep track of a feature being modified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var edits: Edits
  /**
    * The associated [EditorViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html) for this workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#UpdateWorkflowData)
    */
  var viewModel: EditorViewModel
}

object UpdateWorkflowData {
  @scala.inline
  def apply(
    candidates: js.Array[Graphic],
    constructor: js.Function,
    editableItem: EditableItem,
    edits: Edits,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    viewModel: EditorViewModel
  ): UpdateWorkflowData = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], editableItem = editableItem.asInstanceOf[js.Any], edits = edits.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[UpdateWorkflowData]
  }
}


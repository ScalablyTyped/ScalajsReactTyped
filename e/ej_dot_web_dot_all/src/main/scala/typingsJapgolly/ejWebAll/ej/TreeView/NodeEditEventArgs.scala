package typingsJapgolly.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeEditEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the element
    */
  var id: js.UndefOr[String] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the newText of the element
    */
  var newText: js.UndefOr[String] = js.undefined
  /** returns the given target node values
    */
  var nodeDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the oldText of the element
    */
  var oldText: js.UndefOr[String] = js.undefined
  /** returns the target element, the given node to be cut
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NodeEditEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    id: String = null,
    model: Model = null,
    newText: String = null,
    nodeDetails: js.Any = null,
    oldText: String = null,
    target: js.Any = null,
    `type`: String = null
  ): NodeEditEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (newText != null) __obj.updateDynamic("newText")(newText.asInstanceOf[js.Any])
    if (nodeDetails != null) __obj.updateDynamic("nodeDetails")(nodeDetails.asInstanceOf[js.Any])
    if (oldText != null) __obj.updateDynamic("oldText")(oldText.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeEditEventArgs]
  }
}


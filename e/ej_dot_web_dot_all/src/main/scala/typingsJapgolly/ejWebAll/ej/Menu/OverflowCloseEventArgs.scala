package typingsJapgolly.ejWebAll.ej.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowCloseEventArgs extends js.Object {
  /** if the event should be cancelled ; otherwise ,false
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the event object
    */
  var e: js.UndefOr[js.Any] = js.undefined
  /** returns the menu model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OverflowCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    e: js.Any = null,
    model: Model = null,
    `type`: String = null
  ): OverflowCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowCloseEventArgs]
  }
}


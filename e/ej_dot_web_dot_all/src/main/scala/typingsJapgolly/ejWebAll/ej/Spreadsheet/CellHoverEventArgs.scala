package typingsJapgolly.ejWebAll.ej.Spreadsheet

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellHoverEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the target element.
    */
  var target: js.UndefOr[HTMLElement] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CellHoverEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    target: HTMLElement = null,
    `type`: String = null
  ): CellHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHoverEventArgs]
  }
}


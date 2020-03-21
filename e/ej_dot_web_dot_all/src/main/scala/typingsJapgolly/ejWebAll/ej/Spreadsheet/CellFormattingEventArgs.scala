package typingsJapgolly.ejWebAll.ej.Spreadsheet

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellFormattingEventArgs extends js.Object {
  /** Returns the cell index.
    */
  var Cell: js.UndefOr[Double] = js.undefined
  /** Returns the applied style format object
    */
  var Format: js.UndefOr[js.Any] = js.undefined
  /** Returns the sheet index
    */
  var SheetIdx: js.UndefOr[Double] = js.undefined
  /** Returns the name of the CSS theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
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

object CellFormattingEventArgs {
  @scala.inline
  def apply(
    Cell: Int | Double = null,
    Format: js.Any = null,
    SheetIdx: Int | Double = null,
    cssClass: String = null,
    model: Model = null,
    target: HTMLElement = null,
    `type`: String = null
  ): CellFormattingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (SheetIdx != null) __obj.updateDynamic("SheetIdx")(SheetIdx.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellFormattingEventArgs]
  }
}


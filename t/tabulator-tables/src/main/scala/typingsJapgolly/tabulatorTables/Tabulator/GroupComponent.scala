package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupComponent extends js.Object {
  /** The getElement function returns the DOM node for the group header. */
  def getElement(): HTMLElement
  /** Returns the string of the field that all rows in this group have been grouped by. (if a function is used to group the rows rather than a field, this function will return false) */
  def getField(): String
  /** The getKey function returns the unique key that is shared between all rows in this group. */
  def getKey(): js.Any
  /** The getParentGroup function returns the GroupComponent for the parent group of this group. if no parent exists, this function will return false */
  def getParentGroup(): GroupComponent | `false`
  /** The getRows function returns an array of RowComponent objects, one for each row in the group */
  def getRows(): js.Array[RowComponent]
  /** The getSubGroups function returns an array of GroupComponent objects, one for each sub group of this group. */
  def getSubGroups(): js.Array[GroupComponent]
  /** The getTable function returns the Tabulator object for the table containing the group */
  def getTable(): typingsJapgolly.tabulatorTables.Tabulator
  /**  The getVisibility function returns a boolean to show if the group is visible, a value of true means it is visible.*/
  def getVisibility(): Boolean
  /** The hide function hides the group if it is visible. */
  def hide(): Unit
  /** The show function shows the group if it is hidden. */
  def show(): Unit
  /** The toggle function toggles the visibility of the group, switching between hidden and visible. */
  def toggle(): Unit
}

object GroupComponent {
  @scala.inline
  def apply(
    getElement: CallbackTo[HTMLElement],
    getField: CallbackTo[String],
    getKey: CallbackTo[js.Any],
    getParentGroup: CallbackTo[GroupComponent | `false`],
    getRows: CallbackTo[js.Array[RowComponent]],
    getSubGroups: CallbackTo[js.Array[GroupComponent]],
    getTable: CallbackTo[typingsJapgolly.tabulatorTables.Tabulator],
    getVisibility: CallbackTo[Boolean],
    hide: Callback,
    show: Callback,
    toggle: Callback
  ): GroupComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElement")(getElement.toJsFn)
    __obj.updateDynamic("getField")(getField.toJsFn)
    __obj.updateDynamic("getKey")(getKey.toJsFn)
    __obj.updateDynamic("getParentGroup")(getParentGroup.toJsFn)
    __obj.updateDynamic("getRows")(getRows.toJsFn)
    __obj.updateDynamic("getSubGroups")(getSubGroups.toJsFn)
    __obj.updateDynamic("getTable")(getTable.toJsFn)
    __obj.updateDynamic("getVisibility")(getVisibility.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[GroupComponent]
  }
}


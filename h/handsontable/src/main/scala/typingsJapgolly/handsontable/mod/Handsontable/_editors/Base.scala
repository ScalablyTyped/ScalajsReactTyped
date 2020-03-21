package typingsJapgolly.handsontable.mod.Handsontable._editors

import org.scalajs.dom.raw.HTMLTableCellElement
import typingsJapgolly.handsontable.handsontableStrings._empty
import typingsJapgolly.handsontable.handsontableStrings.`bottom-left-corner`
import typingsJapgolly.handsontable.handsontableStrings.`top-left-corner`
import typingsJapgolly.handsontable.handsontableStrings.bottom
import typingsJapgolly.handsontable.handsontableStrings.left
import typingsJapgolly.handsontable.handsontableStrings.top
import typingsJapgolly.handsontable.mod.Handsontable.CellProperties
import typingsJapgolly.handsontable.mod._Handsontable.Core
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var TD: HTMLTableCellElement = js.native
  var cellProperties: CellProperties = js.native
  var col: Double = js.native
  var hot: Core = js.native
  var instance: Core = js.native
  var originalValue: js.Any = js.native
  var prop: String | Double = js.native
  var row: Double = js.native
  var state: EditorState = js.native
  def beginEditing(): Unit = js.native
  def beginEditing(initialValue: js.Any): Unit = js.native
  def beginEditing(initialValue: js.Any, event: Event_): Unit = js.native
  def cancelChanges(): Unit = js.native
  def checkEditorSection(): `top-left-corner` | top | `bottom-left-corner` | bottom | left | _empty = js.native
  def close(): Unit = js.native
  def discardEditor(): Unit = js.native
  def discardEditor(validationResult: Boolean): Unit = js.native
  def enableFullEditMode(): Unit = js.native
  def extend[T /* <: Base */](): T = js.native
  def finishEditing(): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean): Unit = js.native
  def finishEditing(restoreOriginalValue: Boolean, ctrlDown: Boolean, callback: js.Function0[Unit]): Unit = js.native
  def focus(): Unit = js.native
  def getEditedCell(): HTMLTableCellElement | Null = js.native
  def getEditedCellsZIndex(): String = js.native
  def getValue(): js.Any = js.native
  def init(): Unit = js.native
  def isInFullEditMode(): Boolean = js.native
  def isOpened(): Boolean = js.native
  def isWaiting(): Boolean = js.native
  def open(): Unit = js.native
  def open(event: Event_): Unit = js.native
  def prepare(
    row: Double,
    col: Double,
    prop: String,
    TD: HTMLTableCellElement,
    originalValue: js.Any,
    cellProperties: CellProperties
  ): Unit = js.native
  def prepare(
    row: Double,
    col: Double,
    prop: Double,
    TD: HTMLTableCellElement,
    originalValue: js.Any,
    cellProperties: CellProperties
  ): Unit = js.native
  def saveValue(): Unit = js.native
  def saveValue(`val`: js.Any): Unit = js.native
  def saveValue(`val`: js.Any, ctrlDown: Boolean): Unit = js.native
  def setValue(): Unit = js.native
  def setValue(newValue: js.Any): Unit = js.native
}


package typingsJapgolly.vscodeLanguageserverTypes.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditChange extends js.Object {
  /**
    * Adds a text edit.
    * @param edit the text edit to add.
    */
  def add(edit: TextEdit): Unit
  /**
    * Gets all text edits for this change.
    *
    * @return An array of text edits.
    */
  def all(): js.Array[TextEdit]
  /**
    * Clears the edits for this change.
    */
  def clear(): Unit
  /**
    * Delete the text at the given range.
    *
    * @param range A range.
    */
  def delete(range: Range): Unit
  /**
    * Insert the given text at the given position.
    *
    * @param position A position.
    * @param newText A string.
    */
  def insert(position: Position, newText: String): Unit
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param range A range.
    * @param newText A string.
    */
  def replace(range: Range, newText: String): Unit
}

object TextEditChange {
  @scala.inline
  def apply(
    add: TextEdit => Callback,
    all: CallbackTo[js.Array[TextEdit]],
    clear: Callback,
    delete: Range => Callback,
    insert: (Position, String) => Callback,
    replace: (Range, String) => Callback
  ): TextEditChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit) => add(t0).runNow()))
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.vscodeLanguageserverTypes.mod.Range) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: typingsJapgolly.vscodeLanguageserverTypes.mod.Position, t1: java.lang.String) => insert(t0, t1).runNow()))
    __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: typingsJapgolly.vscodeLanguageserverTypes.mod.Range, t1: java.lang.String) => replace(t0, t1).runNow()))
    __obj.asInstanceOf[TextEditChange]
  }
}


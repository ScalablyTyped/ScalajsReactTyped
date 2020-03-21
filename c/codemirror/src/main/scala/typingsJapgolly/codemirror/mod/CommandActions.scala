package typingsJapgolly.codemirror.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandActions extends js.Object {
  def closeTag(cm: Editor): Unit
  /** If something is selected, indent it by one indent unit. If nothing is selected, insert a tab character. */
  def defaultTabTab(cm: Editor): Unit
  /** Delete the character after the cursor. */
  def delCharAfter(cm: Editor): Unit
  /** Delete the character before the cursor. */
  def delCharBefore(cm: Editor): Unit
  /** Delete to the start of the group after the cursor. */
  def delGroupAfter(cm: Editor): Unit
  /** Delete to the left of the group before the cursor. */
  def delGroupBefore(cm: Editor): Unit
  /** Delete the part of the line before the cursor. */
  def delLineLeft(cm: Editor): Unit
  /** Delete up to the end of the word after the cursor. */
  def delWordAfter(cm: Editor): Unit
  /** Delete up to the start of the word before the cursor. */
  def delWordBefore(cm: Editor): Unit
  /** Delete the part of the line from the left side of the visual line the cursor is on to the cursor. */
  def delWrappedLineLeft(cm: Editor): Unit
  /** Delete the part of the line from the cursor to the right side of the visual line the cursor is on. */
  def delWrappedLineRight(cm: Editor): Unit
  /** Deletes the whole line under the cursor, including newline at the end. */
  def deleteLine(cm: Editor): Unit
  /** Move the cursor one character left, going to the previous line when hitting the start of line. */
  def goCharLeft(cm: Editor): Unit
  /** Move the cursor one character right, going to the next line when hitting the end of line. */
  def goCharRight(cm: Editor): Unit
  /** Move the cursor one character left, but don't cross line boundaries. */
  def goColumnLeft(cm: Editor): Unit
  /** Move the cursor one character right, don't cross line boundaries. */
  def goColumnRight(cm: Editor): Unit
  /** Move the cursor to the end of the document. */
  def goDocEnd(cm: Editor): Unit
  /** Move the cursor to the start of the document. */
  def goDocStart(cm: Editor): Unit
  /** Move to the left of the group before the cursor. A group is a stretch of word characters, a stretch of punctuation characters, a newline, or a stretch of more than one whitespace character. */
  def goGroupLeft(cm: Editor): Unit
  /** Move to the right of the group after the cursor (see above). */
  def goGroupRight(cm: Editor): Unit
  /** Move down one line. */
  def goLineDown(cm: Editor): Unit
  /** Move the cursor to the end of the line. */
  def goLineEnd(cm: Editor): Unit
  /** Move the cursor to the left side of the visual line it is on. If this line is wrapped, that may not be the start of the line. */
  def goLineLeft(cm: Editor): Unit
  /** Move the cursor to the left side of the visual line it is on. If that takes it to the start of the line, behave like goLineStartSmart. */
  def goLineLeftSmart(cm: Editor): Unit
  /** Move the cursor to the right side of the visual line it is on. */
  def goLineRight(cm: Editor): Unit
  /** Move the cursor to the start of the line. */
  def goLineStart(cm: Editor): Unit
  /** Move to the start of the text on the line, or if we are already there, to the actual start of the line (including whitespace). */
  def goLineStartSmart(cm: Editor): Unit
  /** Move the cursor up one line. */
  def goLineUp(cm: Editor): Unit
  /** Move the cursor down one screen, and scroll down by the same distance. */
  def goPageDown(cm: Editor): Unit
  /** Move the cursor up one screen, and scroll up by the same distance. */
  def goPageUp(cm: Editor): Unit
  /** Move the cursor to the start of the previous word. */
  def goWordLeft(cm: Editor): Unit
  /** Move the cursor to the end of the next word. */
  def goWordRight(cm: Editor): Unit
  /** Auto-indent the current line or selection. */
  def indentAuto(cm: Editor): Unit
  /** Dedent the current line or selection by one indent unit. */
  def indentLess(cm: Editor): Unit
  /** Indent the current line or selection by one indent unit. */
  def indentMore(cm: Editor): Unit
  /** Insert the amount of spaces that match the width a tab at the cursor position would have. */
  def insertSoftTab(cm: Editor): Unit
  /** Insert a tab character at the cursor. */
  def insertTab(cm: Editor): Unit
  /** Emacs-style line killing. Deletes the part of the line after the cursor. If that consists only of whitespace, the newline at the end of the line is also deleted. */
  def killLine(cm: Editor): Unit
  /** Insert a newline and auto-indent the new line. */
  def newlineAndIndent(cm: Editor): Unit
  /** Redo the last undone change. */
  def redo(cm: Editor): Unit
  /** Redo the last change to the selection, or the last text change if no selection changes remain. */
  def redoSelection(cm: Editor): Unit
  /** Select the whole content of the editor. */
  def selectAll(cm: Editor): Unit
  /** When multiple selections are present, this deselects all but the primary selection. */
  def singleSelection(cm: Editor): Unit
  /**
    * You can bind a key to in order to jump to the tag matching the one under the cursor.
    */
  def toMatchingTag(cm: Editor): Unit
  /** Flip the overwrite flag. */
  def toggleOverwrite(cm: Editor): Unit
  /** Swap the characters before and after the cursor. */
  def transposeChars(cm: Editor): Unit
  /** Undo the last change. Note that, because browsers still don't make it possible for scripts to react to or customize the context menu, selecting undo (or redo) from the context menu in a CodeMirror instance does not work. */
  def undo(cm: Editor): Unit
  /** Undo the last change to the selection, or if there are no selection-only changes at the top of the history, undo the last change. */
  def undoSelection(cm: Editor): Unit
}

object CommandActions {
  @scala.inline
  def apply(
    closeTag: Editor => Callback,
    defaultTabTab: Editor => Callback,
    delCharAfter: Editor => Callback,
    delCharBefore: Editor => Callback,
    delGroupAfter: Editor => Callback,
    delGroupBefore: Editor => Callback,
    delLineLeft: Editor => Callback,
    delWordAfter: Editor => Callback,
    delWordBefore: Editor => Callback,
    delWrappedLineLeft: Editor => Callback,
    delWrappedLineRight: Editor => Callback,
    deleteLine: Editor => Callback,
    goCharLeft: Editor => Callback,
    goCharRight: Editor => Callback,
    goColumnLeft: Editor => Callback,
    goColumnRight: Editor => Callback,
    goDocEnd: Editor => Callback,
    goDocStart: Editor => Callback,
    goGroupLeft: Editor => Callback,
    goGroupRight: Editor => Callback,
    goLineDown: Editor => Callback,
    goLineEnd: Editor => Callback,
    goLineLeft: Editor => Callback,
    goLineLeftSmart: Editor => Callback,
    goLineRight: Editor => Callback,
    goLineStart: Editor => Callback,
    goLineStartSmart: Editor => Callback,
    goLineUp: Editor => Callback,
    goPageDown: Editor => Callback,
    goPageUp: Editor => Callback,
    goWordLeft: Editor => Callback,
    goWordRight: Editor => Callback,
    indentAuto: Editor => Callback,
    indentLess: Editor => Callback,
    indentMore: Editor => Callback,
    insertSoftTab: Editor => Callback,
    insertTab: Editor => Callback,
    killLine: Editor => Callback,
    newlineAndIndent: Editor => Callback,
    redo: Editor => Callback,
    redoSelection: Editor => Callback,
    selectAll: Editor => Callback,
    singleSelection: Editor => Callback,
    toMatchingTag: Editor => Callback,
    toggleOverwrite: Editor => Callback,
    transposeChars: Editor => Callback,
    undo: Editor => Callback,
    undoSelection: Editor => Callback
  ): CommandActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeTag")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => closeTag(t0).runNow()))
    __obj.updateDynamic("defaultTabTab")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => defaultTabTab(t0).runNow()))
    __obj.updateDynamic("delCharAfter")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delCharAfter(t0).runNow()))
    __obj.updateDynamic("delCharBefore")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delCharBefore(t0).runNow()))
    __obj.updateDynamic("delGroupAfter")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delGroupAfter(t0).runNow()))
    __obj.updateDynamic("delGroupBefore")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delGroupBefore(t0).runNow()))
    __obj.updateDynamic("delLineLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delLineLeft(t0).runNow()))
    __obj.updateDynamic("delWordAfter")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delWordAfter(t0).runNow()))
    __obj.updateDynamic("delWordBefore")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delWordBefore(t0).runNow()))
    __obj.updateDynamic("delWrappedLineLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delWrappedLineLeft(t0).runNow()))
    __obj.updateDynamic("delWrappedLineRight")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => delWrappedLineRight(t0).runNow()))
    __obj.updateDynamic("deleteLine")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => deleteLine(t0).runNow()))
    __obj.updateDynamic("goCharLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goCharLeft(t0).runNow()))
    __obj.updateDynamic("goCharRight")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goCharRight(t0).runNow()))
    __obj.updateDynamic("goColumnLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goColumnLeft(t0).runNow()))
    __obj.updateDynamic("goColumnRight")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goColumnRight(t0).runNow()))
    __obj.updateDynamic("goDocEnd")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goDocEnd(t0).runNow()))
    __obj.updateDynamic("goDocStart")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goDocStart(t0).runNow()))
    __obj.updateDynamic("goGroupLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goGroupLeft(t0).runNow()))
    __obj.updateDynamic("goGroupRight")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goGroupRight(t0).runNow()))
    __obj.updateDynamic("goLineDown")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineDown(t0).runNow()))
    __obj.updateDynamic("goLineEnd")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineEnd(t0).runNow()))
    __obj.updateDynamic("goLineLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineLeft(t0).runNow()))
    __obj.updateDynamic("goLineLeftSmart")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineLeftSmart(t0).runNow()))
    __obj.updateDynamic("goLineRight")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineRight(t0).runNow()))
    __obj.updateDynamic("goLineStart")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineStart(t0).runNow()))
    __obj.updateDynamic("goLineStartSmart")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineStartSmart(t0).runNow()))
    __obj.updateDynamic("goLineUp")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goLineUp(t0).runNow()))
    __obj.updateDynamic("goPageDown")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goPageDown(t0).runNow()))
    __obj.updateDynamic("goPageUp")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goPageUp(t0).runNow()))
    __obj.updateDynamic("goWordLeft")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goWordLeft(t0).runNow()))
    __obj.updateDynamic("goWordRight")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => goWordRight(t0).runNow()))
    __obj.updateDynamic("indentAuto")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => indentAuto(t0).runNow()))
    __obj.updateDynamic("indentLess")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => indentLess(t0).runNow()))
    __obj.updateDynamic("indentMore")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => indentMore(t0).runNow()))
    __obj.updateDynamic("insertSoftTab")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => insertSoftTab(t0).runNow()))
    __obj.updateDynamic("insertTab")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => insertTab(t0).runNow()))
    __obj.updateDynamic("killLine")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => killLine(t0).runNow()))
    __obj.updateDynamic("newlineAndIndent")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => newlineAndIndent(t0).runNow()))
    __obj.updateDynamic("redo")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => redo(t0).runNow()))
    __obj.updateDynamic("redoSelection")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => redoSelection(t0).runNow()))
    __obj.updateDynamic("selectAll")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => selectAll(t0).runNow()))
    __obj.updateDynamic("singleSelection")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => singleSelection(t0).runNow()))
    __obj.updateDynamic("toMatchingTag")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => toMatchingTag(t0).runNow()))
    __obj.updateDynamic("toggleOverwrite")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => toggleOverwrite(t0).runNow()))
    __obj.updateDynamic("transposeChars")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => transposeChars(t0).runNow()))
    __obj.updateDynamic("undo")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => undo(t0).runNow()))
    __obj.updateDynamic("undoSelection")(js.Any.fromFunction1((t0: typingsJapgolly.codemirror.mod.Editor) => undoSelection(t0).runNow()))
    __obj.asInstanceOf[CommandActions]
  }
}


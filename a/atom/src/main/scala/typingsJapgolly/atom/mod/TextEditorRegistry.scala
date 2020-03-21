package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorRegistry extends js.Object {
  /** Register a TextEditor. */
  def add(editor: TextEditor): Disposable
  // Managing Text Editors
  /** Remove all editors from the registry. */
  def clear(): Unit
  /** Remove any grammar override that has been set for the given TextEditor. */
  def clearGrammarOverride(editor: TextEditor): Unit
  /**
    *  Retrieve the grammar scope name that has been set as a grammar override
    *  for the given TextEditor.
    */
  def getGrammarOverride(editor: TextEditor): String | Null
  /** Keep a TextEditor's configuration in sync with Atom's settings. */
  def maintainConfig(editor: TextEditor): Disposable
  /**
    *  Set a TextEditor's grammar based on its path and content, and continue
    *  to update its grammar as gramamrs are added or updated, or the editor's
    *  file path changes.
    */
  def maintainGrammar(editor: TextEditor): Disposable
  // Event Subscription
  /** Invoke the given callback with all the current and future registered TextEditors. */
  def observe(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable
  /** Remove the given TextEditor from the registry. */
  def remove(editor: TextEditor): Boolean
  /**
    *  Force a TextEditor to use a different grammar than the one that would
    *  otherwise be selected for it.
    */
  def setGrammarOverride(editor: TextEditor, scopeName: String): Unit
}

object TextEditorRegistry {
  @scala.inline
  def apply(
    add: TextEditor => CallbackTo[Disposable],
    clear: Callback,
    clearGrammarOverride: TextEditor => Callback,
    getGrammarOverride: TextEditor => CallbackTo[String | Null],
    maintainConfig: TextEditor => CallbackTo[Disposable],
    maintainGrammar: TextEditor => CallbackTo[Disposable],
    observe: js.Function1[/* editor */ TextEditor, Unit] => CallbackTo[Disposable],
    remove: TextEditor => CallbackTo[Boolean],
    setGrammarOverride: (TextEditor, String) => Callback
  ): TextEditorRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => add(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("clearGrammarOverride")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => clearGrammarOverride(t0).runNow()))
    __obj.updateDynamic("getGrammarOverride")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => getGrammarOverride(t0).runNow()))
    __obj.updateDynamic("maintainConfig")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => maintainConfig(t0).runNow()))
    __obj.updateDynamic("maintainGrammar")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => maintainGrammar(t0).runNow()))
    __obj.updateDynamic("observe")(js.Any.fromFunction1((t0: js.Function1[/* editor */ typingsJapgolly.atom.mod.TextEditor, scala.Unit]) => observe(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextEditor) => remove(t0).runNow()))
    __obj.updateDynamic("setGrammarOverride")(js.Any.fromFunction2((t0: typingsJapgolly.atom.mod.TextEditor, t1: java.lang.String) => setGrammarOverride(t0, t1).runNow()))
    __obj.asInstanceOf[TextEditorRegistry]
  }
}


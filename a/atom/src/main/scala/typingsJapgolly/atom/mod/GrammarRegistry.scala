package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarRegistry extends js.Object {
  /**
    *  Add a grammar to this registry.
    *  A 'grammar-added' event is emitted after the grammar is added.
    *  @param grammar The Grammar to add. This should be a value previously returned
    *  from ::readGrammar or ::readGrammarSync.
    *  @return Returns a Disposable on which `.dispose()` can be called to remove
    *  the grammar.
    */
  def addGrammar(grammar: Grammar): Disposable
  /**
    *  Force a TextBuffer to use a different grammar than the one that would otherwise
    *  be selected for it.
    *  @param buffer The buffer whose grammar will be set.
    *  @param languageId The identifier of the desired language.
    *  @return Returns a boolean that indicates whether the language was successfully
    * found.
    */
  def assignLanguageMode(buffer: TextBuffer, languageId: String): Boolean
  /**
    *  Remove any language mode override that has been set for the given TextBuffer.
    *  This will assign to the buffer the best language mode available.
    */
  def autoAssignLanguageMode(buffer: TextBuffer): Unit
  /**
    *  Convert compact tags representation into convenient, space-inefficient tokens.
    *  @param lineText The text of the tokenized line.
    *  @param tags The tags returned from a call to Grammar::tokenizeLine().
    *  @return An array of Token instances decoded from the given tags.
    */
  def decodeTokens(lineText: String, tags: js.Array[Double | String]): js.Array[GrammarToken]
  /**
    *  Returns a number representing how well the grammar matches the
    *  `filePath` and `contents`.
    *  @param grammar The grammar to score.
    *  @param filePath A string file path.
    *  @param contents A string of text for that file path.
    */
  def getGrammarScore(grammar: Grammar, filePath: String, contents: String): Double
  // Managing Grammars
  /**
    *  Get all the grammars in this registry.
    *  @return A non-empty array of Grammar instances.
    */
  def getGrammars(): js.Array[Grammar]
  /**
    *  Get a grammar with the given scope name.
    *  @param scopeName A string such as `source.js`.
    *  @return A Grammar or undefined.
    */
  def grammarForScopeName(scopeName: String): js.UndefOr[Grammar]
  /**
    *  Read a grammar asynchronously and add it to the registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @param callback The function to be invoked once the Grammar has been read in
    *  and added to the registry.
    */
  def loadGrammar(
    grammarPath: String,
    callback: js.Function2[/* error */ js.Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]
  ): Unit
  /**
    *  Read a grammar synchronously and add it to this registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @return The newly loaded Grammar.
    */
  def loadGrammarSync(grammarPath: String): Grammar
  /**
    *  Set a TextBuffer's language mode based on its path and content, and continue
    *  to update its language mode as grammars are added or updated, or the buffer's
    *  file path changes.
    *  @param buffer The buffer whose language mode will be maintained.
    *  @return A Disposable that can be used to stop updating the buffer's
    *  language mode.
    */
  def maintainLanguageMode(buffer: TextBuffer): Disposable
  // Event Subscription
  /**
    *  Invoke the given callback when a grammar is added to the registry.
    *  @param callback The callback to be invoked whenever a grammar is added.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidAddGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable
  /**
    *  Invoke the given callback when a grammar is removed from the registry.
    *  @param callback The callback to be invoked whenever a grammar is removed.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidRemoveGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable
  /**
    *  Invoke the given callback when a grammar is updated due to a grammar it
    *  depends on being added or removed from the registry.
    *  @param callback The callback to be invoked whenever a grammar is updated.
    *  @return A Disposable on which `.dispose()` can be called to unsubscribe.
    */
  def onDidUpdateGrammar(callback: js.Function1[/* grammar */ Grammar, Unit]): Disposable
  /**
    *  Read a grammar asynchronously but don't add it to the registry.
    *  @param grammarPath The absolute file path to the grammar.
    *  @param callback The function to be invoked once the Grammar has been read in.
    */
  def readGrammar(
    grammarPath: String,
    callback: js.Function2[/* error */ js.Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]
  ): Unit
  /**
    *  Read a grammar synchronously but don't add it to the registry.
    *  @param grammarPath The absolute file path to a grammar.
    *  @return The newly loaded Grammar.
    */
  def readGrammarSync(grammarPath: String): Grammar
  /**
    *  Remove the given grammar from this registry.
    *  @param grammar The grammar to remove. This should be a grammar previously
    *  added to the registry from ::addGrammar.
    */
  def removeGrammar(grammar: Grammar): Unit
  /**
    *  Remove the grammar with the given scope name.
    *  @param scopeName A string such as `source.js`.
    *  @return Returns the removed Grammar or undefined.
    */
  def removeGrammarForScopeName(scopeName: String): js.UndefOr[Grammar]
  /**
    *  Select a grammar for the given file path and file contents.
    *
    *  This picks the best match by checking the file path and contents against
    *  each grammar.
    *  @param filePath A string file path.
    *  @param fileContents A string of text for that file path.
    */
  def selectGrammar(filePath: String, fileContents: String): Grammar
}

object GrammarRegistry {
  @scala.inline
  def apply(
    addGrammar: Grammar => CallbackTo[Disposable],
    assignLanguageMode: (TextBuffer, String) => CallbackTo[Boolean],
    autoAssignLanguageMode: TextBuffer => Callback,
    decodeTokens: (String, js.Array[Double | String]) => CallbackTo[js.Array[GrammarToken]],
    getGrammarScore: (Grammar, String, String) => CallbackTo[Double],
    getGrammars: CallbackTo[js.Array[Grammar]],
    grammarForScopeName: String => CallbackTo[js.UndefOr[Grammar]],
    loadGrammar: (String, js.Function2[/* error */ js.Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]) => Callback,
    loadGrammarSync: String => CallbackTo[Grammar],
    maintainLanguageMode: TextBuffer => CallbackTo[Disposable],
    onDidAddGrammar: js.Function1[/* grammar */ Grammar, Unit] => CallbackTo[Disposable],
    onDidRemoveGrammar: js.Function1[/* grammar */ Grammar, Unit] => CallbackTo[Disposable],
    onDidUpdateGrammar: js.Function1[/* grammar */ Grammar, Unit] => CallbackTo[Disposable],
    readGrammar: (String, js.Function2[/* error */ js.Error | Null, /* grammar */ js.UndefOr[Grammar], Unit]) => Callback,
    readGrammarSync: String => CallbackTo[Grammar],
    removeGrammar: Grammar => Callback,
    removeGrammarForScopeName: String => CallbackTo[js.UndefOr[Grammar]],
    selectGrammar: (String, String) => CallbackTo[Grammar]
  ): GrammarRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addGrammar")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.Grammar) => addGrammar(t0).runNow()))
    __obj.updateDynamic("assignLanguageMode")(js.Any.fromFunction2((t0: typingsJapgolly.atom.mod.TextBuffer, t1: java.lang.String) => assignLanguageMode(t0, t1).runNow()))
    __obj.updateDynamic("autoAssignLanguageMode")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextBuffer) => autoAssignLanguageMode(t0).runNow()))
    __obj.updateDynamic("decodeTokens")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[scala.Double | java.lang.String]) => decodeTokens(t0, t1).runNow()))
    __obj.updateDynamic("getGrammarScore")(js.Any.fromFunction3((t0: typingsJapgolly.atom.mod.Grammar, t1: java.lang.String, t2: java.lang.String) => getGrammarScore(t0, t1, t2).runNow()))
    __obj.updateDynamic("getGrammars")(getGrammars.toJsFn)
    __obj.updateDynamic("grammarForScopeName")(js.Any.fromFunction1((t0: java.lang.String) => grammarForScopeName(t0).runNow()))
    __obj.updateDynamic("loadGrammar")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* error */ js.Error | scala.Null, 
  /* grammar */ js.UndefOr[typingsJapgolly.atom.mod.Grammar], 
  scala.Unit]) => loadGrammar(t0, t1).runNow()))
    __obj.updateDynamic("loadGrammarSync")(js.Any.fromFunction1((t0: java.lang.String) => loadGrammarSync(t0).runNow()))
    __obj.updateDynamic("maintainLanguageMode")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.TextBuffer) => maintainLanguageMode(t0).runNow()))
    __obj.updateDynamic("onDidAddGrammar")(js.Any.fromFunction1((t0: js.Function1[/* grammar */ typingsJapgolly.atom.mod.Grammar, scala.Unit]) => onDidAddGrammar(t0).runNow()))
    __obj.updateDynamic("onDidRemoveGrammar")(js.Any.fromFunction1((t0: js.Function1[/* grammar */ typingsJapgolly.atom.mod.Grammar, scala.Unit]) => onDidRemoveGrammar(t0).runNow()))
    __obj.updateDynamic("onDidUpdateGrammar")(js.Any.fromFunction1((t0: js.Function1[/* grammar */ typingsJapgolly.atom.mod.Grammar, scala.Unit]) => onDidUpdateGrammar(t0).runNow()))
    __obj.updateDynamic("readGrammar")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* error */ js.Error | scala.Null, 
  /* grammar */ js.UndefOr[typingsJapgolly.atom.mod.Grammar], 
  scala.Unit]) => readGrammar(t0, t1).runNow()))
    __obj.updateDynamic("readGrammarSync")(js.Any.fromFunction1((t0: java.lang.String) => readGrammarSync(t0).runNow()))
    __obj.updateDynamic("removeGrammar")(js.Any.fromFunction1((t0: typingsJapgolly.atom.mod.Grammar) => removeGrammar(t0).runNow()))
    __obj.updateDynamic("removeGrammarForScopeName")(js.Any.fromFunction1((t0: java.lang.String) => removeGrammarForScopeName(t0).runNow()))
    __obj.updateDynamic("selectGrammar")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => selectGrammar(t0, t1).runNow()))
    __obj.asInstanceOf[GrammarRegistry]
  }
}


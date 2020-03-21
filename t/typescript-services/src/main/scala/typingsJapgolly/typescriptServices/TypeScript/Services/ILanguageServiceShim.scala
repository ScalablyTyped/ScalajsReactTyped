package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServiceShim extends IShim {
  var languageService: ILanguageService
  def cleanupSemanticCache(): Unit
  def getBraceMatchingAtPosition(fileName: String, position: Double): String
  def getBreakpointStatementAtPosition(fileName: String, position: Double): String
  def getCompilerOptionsDiagnostics(): String
  def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): String
  def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): String
  def getDefinitionAtPosition(fileName: String, position: Double): String
  def getEmitOutput(fileName: String): String
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: String): String
  def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: String): String
  def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: String): String
  def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: String): String
  def getImplementorsAtPosition(fileName: String, position: Double): String
  def getIndentationAtPosition(fileName: String, position: Double, options: String): String
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): String
  def getNavigateToItems(searchValue: String): String
  def getOccurrencesAtPosition(fileName: String, position: Double): String
  def getOutliningRegions(fileName: String): String
  def getReferencesAtPosition(fileName: String, position: Double): String
  def getScriptLexicalStructure(fileName: String): String
  def getSemanticDiagnostics(fileName: String): String
  def getSignatureAtPosition(fileName: String, position: Double): String
  def getSyntacticDiagnostics(fileName: String): String
  def getTypeAtPosition(fileName: String, position: Double): String
  def refresh(throwOnError: Boolean): Unit
}

object ILanguageServiceShim {
  @scala.inline
  def apply(
    cleanupSemanticCache: Callback,
    dispose: js.Any => Callback,
    getBraceMatchingAtPosition: (String, Double) => CallbackTo[String],
    getBreakpointStatementAtPosition: (String, Double) => CallbackTo[String],
    getCompilerOptionsDiagnostics: CallbackTo[String],
    getCompletionEntryDetails: (String, Double, String) => CallbackTo[String],
    getCompletionsAtPosition: (String, Double, Boolean) => CallbackTo[String],
    getDefinitionAtPosition: (String, Double) => CallbackTo[String],
    getEmitOutput: String => CallbackTo[String],
    getFormattingEditsAfterKeystroke: (String, Double, String, String) => CallbackTo[String],
    getFormattingEditsForDocument: (String, Double, Double, String) => CallbackTo[String],
    getFormattingEditsForRange: (String, Double, Double, String) => CallbackTo[String],
    getFormattingEditsOnPaste: (String, Double, Double, String) => CallbackTo[String],
    getImplementorsAtPosition: (String, Double) => CallbackTo[String],
    getIndentationAtPosition: (String, Double, String) => CallbackTo[String],
    getNameOrDottedNameSpan: (String, Double, Double) => CallbackTo[String],
    getNavigateToItems: String => CallbackTo[String],
    getOccurrencesAtPosition: (String, Double) => CallbackTo[String],
    getOutliningRegions: String => CallbackTo[String],
    getReferencesAtPosition: (String, Double) => CallbackTo[String],
    getScriptLexicalStructure: String => CallbackTo[String],
    getSemanticDiagnostics: String => CallbackTo[String],
    getSignatureAtPosition: (String, Double) => CallbackTo[String],
    getSyntacticDiagnostics: String => CallbackTo[String],
    getTypeAtPosition: (String, Double) => CallbackTo[String],
    languageService: ILanguageService,
    refresh: Boolean => Callback
  ): ILanguageServiceShim = {
    val __obj = js.Dynamic.literal(languageService = languageService.asInstanceOf[js.Any])
    __obj.updateDynamic("cleanupSemanticCache")(cleanupSemanticCache.toJsFn)
    __obj.updateDynamic("dispose")(js.Any.fromFunction1((t0: js.Any) => dispose(t0).runNow()))
    __obj.updateDynamic("getBraceMatchingAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getBraceMatchingAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getBreakpointStatementAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getBreakpointStatementAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getCompilerOptionsDiagnostics")(getCompilerOptionsDiagnostics.toJsFn)
    __obj.updateDynamic("getCompletionEntryDetails")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: java.lang.String) => getCompletionEntryDetails(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCompletionsAtPosition")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Boolean) => getCompletionsAtPosition(t0, t1, t2).runNow()))
    __obj.updateDynamic("getDefinitionAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getDefinitionAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getEmitOutput")(js.Any.fromFunction1((t0: java.lang.String) => getEmitOutput(t0).runNow()))
    __obj.updateDynamic("getFormattingEditsAfterKeystroke")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: java.lang.String, t3: java.lang.String) => getFormattingEditsAfterKeystroke(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getFormattingEditsForDocument")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: java.lang.String) => getFormattingEditsForDocument(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getFormattingEditsForRange")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: java.lang.String) => getFormattingEditsForRange(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getFormattingEditsOnPaste")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: java.lang.String) => getFormattingEditsOnPaste(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getImplementorsAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getImplementorsAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getIndentationAtPosition")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: java.lang.String) => getIndentationAtPosition(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNameOrDottedNameSpan")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => getNameOrDottedNameSpan(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNavigateToItems")(js.Any.fromFunction1((t0: java.lang.String) => getNavigateToItems(t0).runNow()))
    __obj.updateDynamic("getOccurrencesAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getOccurrencesAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getOutliningRegions")(js.Any.fromFunction1((t0: java.lang.String) => getOutliningRegions(t0).runNow()))
    __obj.updateDynamic("getReferencesAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getReferencesAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getScriptLexicalStructure")(js.Any.fromFunction1((t0: java.lang.String) => getScriptLexicalStructure(t0).runNow()))
    __obj.updateDynamic("getSemanticDiagnostics")(js.Any.fromFunction1((t0: java.lang.String) => getSemanticDiagnostics(t0).runNow()))
    __obj.updateDynamic("getSignatureAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getSignatureAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getSyntacticDiagnostics")(js.Any.fromFunction1((t0: java.lang.String) => getSyntacticDiagnostics(t0).runNow()))
    __obj.updateDynamic("getTypeAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getTypeAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("refresh")(js.Any.fromFunction1((t0: scala.Boolean) => refresh(t0).runNow()))
    __obj.asInstanceOf[ILanguageServiceShim]
  }
}


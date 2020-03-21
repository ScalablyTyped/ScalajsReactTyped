package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.Diagnostic
import typingsJapgolly.typescriptServices.TypeScript.EmitOutput
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import typingsJapgolly.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageService extends js.Object {
  def cleanupSemanticCache(): Unit
  def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan]
  def getBreakpointStatementAtPosition(fileName: String, position: Double): SpanInfo
  def getCompilerOptionsDiagnostics(): js.Array[Diagnostic]
  def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): CompletionEntryDetails
  def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): CompletionInfo
  def getDefinitionAtPosition(fileName: String, position: Double): js.Array[DefinitionInfo]
  def getEmitOutput(fileName: String): EmitOutput
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: FormatCodeOptions): js.Array[TextEdit]
  def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit]
  def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit]
  def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit]
  def getImplementorsAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry]
  def getIndentationAtPosition(fileName: String, position: Double, options: EditorOptions): Double
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): SpanInfo
  def getNavigateToItems(searchValue: String): js.Array[NavigateToItem]
  def getOccurrencesAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry]
  def getOutliningRegions(fileName: String): js.Array[TextSpan]
  def getReferencesAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry]
  def getScriptLexicalStructure(fileName: String): js.Array[NavigateToItem]
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic]
  def getSignatureAtPosition(fileName: String, position: Double): SignatureInfo
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic]
  def getSyntaxTree(fileName: String): SyntaxTree
  def getTypeAtPosition(fileName: String, position: Double): TypeInfo
  def refresh(): Unit
}

object ILanguageService {
  @scala.inline
  def apply(
    cleanupSemanticCache: Callback,
    getBraceMatchingAtPosition: (String, Double) => CallbackTo[js.Array[TextSpan]],
    getBreakpointStatementAtPosition: (String, Double) => CallbackTo[SpanInfo],
    getCompilerOptionsDiagnostics: CallbackTo[js.Array[Diagnostic]],
    getCompletionEntryDetails: (String, Double, String) => CallbackTo[CompletionEntryDetails],
    getCompletionsAtPosition: (String, Double, Boolean) => CallbackTo[CompletionInfo],
    getDefinitionAtPosition: (String, Double) => CallbackTo[js.Array[DefinitionInfo]],
    getEmitOutput: String => CallbackTo[EmitOutput],
    getFormattingEditsAfterKeystroke: (String, Double, String, FormatCodeOptions) => CallbackTo[js.Array[TextEdit]],
    getFormattingEditsForDocument: (String, Double, Double, FormatCodeOptions) => CallbackTo[js.Array[TextEdit]],
    getFormattingEditsForRange: (String, Double, Double, FormatCodeOptions) => CallbackTo[js.Array[TextEdit]],
    getFormattingEditsOnPaste: (String, Double, Double, FormatCodeOptions) => CallbackTo[js.Array[TextEdit]],
    getImplementorsAtPosition: (String, Double) => CallbackTo[js.Array[ReferenceEntry]],
    getIndentationAtPosition: (String, Double, EditorOptions) => CallbackTo[Double],
    getNameOrDottedNameSpan: (String, Double, Double) => CallbackTo[SpanInfo],
    getNavigateToItems: String => CallbackTo[js.Array[NavigateToItem]],
    getOccurrencesAtPosition: (String, Double) => CallbackTo[js.Array[ReferenceEntry]],
    getOutliningRegions: String => CallbackTo[js.Array[TextSpan]],
    getReferencesAtPosition: (String, Double) => CallbackTo[js.Array[ReferenceEntry]],
    getScriptLexicalStructure: String => CallbackTo[js.Array[NavigateToItem]],
    getSemanticDiagnostics: String => CallbackTo[js.Array[Diagnostic]],
    getSignatureAtPosition: (String, Double) => CallbackTo[SignatureInfo],
    getSyntacticDiagnostics: String => CallbackTo[js.Array[Diagnostic]],
    getSyntaxTree: String => CallbackTo[SyntaxTree],
    getTypeAtPosition: (String, Double) => CallbackTo[TypeInfo],
    refresh: Callback
  ): ILanguageService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanupSemanticCache")(cleanupSemanticCache.toJsFn)
    __obj.updateDynamic("getBraceMatchingAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getBraceMatchingAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getBreakpointStatementAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getBreakpointStatementAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getCompilerOptionsDiagnostics")(getCompilerOptionsDiagnostics.toJsFn)
    __obj.updateDynamic("getCompletionEntryDetails")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: java.lang.String) => getCompletionEntryDetails(t0, t1, t2).runNow()))
    __obj.updateDynamic("getCompletionsAtPosition")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Boolean) => getCompletionsAtPosition(t0, t1, t2).runNow()))
    __obj.updateDynamic("getDefinitionAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getDefinitionAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getEmitOutput")(js.Any.fromFunction1((t0: java.lang.String) => getEmitOutput(t0).runNow()))
    __obj.updateDynamic("getFormattingEditsAfterKeystroke")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: java.lang.String, t3: typingsJapgolly.typescriptServices.TypeScript.Services.FormatCodeOptions) => getFormattingEditsAfterKeystroke(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getFormattingEditsForDocument")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.typescriptServices.TypeScript.Services.FormatCodeOptions) => getFormattingEditsForDocument(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getFormattingEditsForRange")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.typescriptServices.TypeScript.Services.FormatCodeOptions) => getFormattingEditsForRange(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getFormattingEditsOnPaste")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.typescriptServices.TypeScript.Services.FormatCodeOptions) => getFormattingEditsOnPaste(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getImplementorsAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getImplementorsAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getIndentationAtPosition")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: typingsJapgolly.typescriptServices.TypeScript.Services.EditorOptions) => getIndentationAtPosition(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNameOrDottedNameSpan")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => getNameOrDottedNameSpan(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNavigateToItems")(js.Any.fromFunction1((t0: java.lang.String) => getNavigateToItems(t0).runNow()))
    __obj.updateDynamic("getOccurrencesAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getOccurrencesAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getOutliningRegions")(js.Any.fromFunction1((t0: java.lang.String) => getOutliningRegions(t0).runNow()))
    __obj.updateDynamic("getReferencesAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getReferencesAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getScriptLexicalStructure")(js.Any.fromFunction1((t0: java.lang.String) => getScriptLexicalStructure(t0).runNow()))
    __obj.updateDynamic("getSemanticDiagnostics")(js.Any.fromFunction1((t0: java.lang.String) => getSemanticDiagnostics(t0).runNow()))
    __obj.updateDynamic("getSignatureAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getSignatureAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("getSyntacticDiagnostics")(js.Any.fromFunction1((t0: java.lang.String) => getSyntacticDiagnostics(t0).runNow()))
    __obj.updateDynamic("getSyntaxTree")(js.Any.fromFunction1((t0: java.lang.String) => getSyntaxTree(t0).runNow()))
    __obj.updateDynamic("getTypeAtPosition")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => getTypeAtPosition(t0, t1).runNow()))
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[ILanguageService]
  }
}


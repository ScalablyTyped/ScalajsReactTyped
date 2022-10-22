package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.CallHierarchyProvider
import typingsJapgolly.vscode.mod.CodeActionProvider
import typingsJapgolly.vscode.mod.CodeActionProviderMetadata
import typingsJapgolly.vscode.mod.CodeLensProvider
import typingsJapgolly.vscode.mod.CompletionItemProvider
import typingsJapgolly.vscode.mod.DeclarationProvider
import typingsJapgolly.vscode.mod.DefinitionProvider
import typingsJapgolly.vscode.mod.DiagnosticChangeEvent
import typingsJapgolly.vscode.mod.DiagnosticCollection
import typingsJapgolly.vscode.mod.DocumentColorProvider
import typingsJapgolly.vscode.mod.DocumentDropEditProvider
import typingsJapgolly.vscode.mod.DocumentFormattingEditProvider
import typingsJapgolly.vscode.mod.DocumentHighlightProvider
import typingsJapgolly.vscode.mod.DocumentLinkProvider
import typingsJapgolly.vscode.mod.DocumentRangeFormattingEditProvider
import typingsJapgolly.vscode.mod.DocumentRangeSemanticTokensProvider
import typingsJapgolly.vscode.mod.DocumentSelector
import typingsJapgolly.vscode.mod.DocumentSemanticTokensProvider
import typingsJapgolly.vscode.mod.DocumentSymbolProvider
import typingsJapgolly.vscode.mod.DocumentSymbolProviderMetadata
import typingsJapgolly.vscode.mod.EvaluatableExpressionProvider
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.FoldingRangeProvider
import typingsJapgolly.vscode.mod.HoverProvider
import typingsJapgolly.vscode.mod.ImplementationProvider
import typingsJapgolly.vscode.mod.InlayHintsProvider
import typingsJapgolly.vscode.mod.InlineCompletionItemProvider
import typingsJapgolly.vscode.mod.InlineValuesProvider
import typingsJapgolly.vscode.mod.LanguageConfiguration
import typingsJapgolly.vscode.mod.LanguageStatusItem
import typingsJapgolly.vscode.mod.LinkedEditingRangeProvider
import typingsJapgolly.vscode.mod.OnTypeFormattingEditProvider
import typingsJapgolly.vscode.mod.ReferenceProvider
import typingsJapgolly.vscode.mod.RenameProvider
import typingsJapgolly.vscode.mod.SelectionRangeProvider
import typingsJapgolly.vscode.mod.SignatureHelpProvider
import typingsJapgolly.vscode.mod.SignatureHelpProviderMetadata
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TypeDefinitionProvider
import typingsJapgolly.vscode.mod.TypeHierarchyProvider
import typingsJapgolly.vscode.mod.WorkspaceSymbolProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languages {
  
  @JSGlobal("vscode.languages")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDiagnosticCollection(): DiagnosticCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticCollection")().asInstanceOf[DiagnosticCollection]
  inline def createDiagnosticCollection(name: String): DiagnosticCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiagnosticCollection")(name.asInstanceOf[js.Any]).asInstanceOf[DiagnosticCollection]
  
  inline def createLanguageStatusItem(id: String, selector: DocumentSelector): LanguageStatusItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageStatusItem")(id.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[LanguageStatusItem]
  
  inline def getDiagnostics(): js.Array[
    js.Tuple2[typingsJapgolly.vscode.mod.Uri, js.Array[typingsJapgolly.vscode.mod.Diagnostic]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnostics")().asInstanceOf[js.Array[
    js.Tuple2[typingsJapgolly.vscode.mod.Uri, js.Array[typingsJapgolly.vscode.mod.Diagnostic]]
  ]]
  inline def getDiagnostics(resource: typingsJapgolly.vscode.mod.Uri): js.Array[typingsJapgolly.vscode.mod.Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnostics")(resource.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.vscode.mod.Diagnostic]]
  
  inline def getLanguages(): Thenable[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[Thenable[js.Array[String]]]
  
  inline def `match`(selector: DocumentSelector, document: TextDocument): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(selector.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("vscode.languages.onDidChangeDiagnostics")
  @js.native
  val onDidChangeDiagnostics: Event[DiagnosticChangeEvent] = js.native
  
  inline def registerCallHierarchyProvider(selector: DocumentSelector, provider: CallHierarchyProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallHierarchyProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerCodeActionsProvider(selector: DocumentSelector, provider: CodeActionProvider[typingsJapgolly.vscode.mod.CodeAction]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerCodeActionsProvider(
    selector: DocumentSelector,
    provider: CodeActionProvider[typingsJapgolly.vscode.mod.CodeAction],
    metadata: CodeActionProviderMetadata
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerCodeLensProvider(selector: DocumentSelector, provider: CodeLensProvider[typingsJapgolly.vscode.mod.CodeLens]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerColorProvider(selector: DocumentSelector, provider: DocumentColorProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerCompletionItemProvider(
    selector: DocumentSelector,
    provider: CompletionItemProvider[typingsJapgolly.vscode.mod.CompletionItem],
    triggerCharacters: String*
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")((scala.List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).`++`(triggerCharacters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDeclarationProvider(selector: DocumentSelector, provider: DeclarationProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDefinitionProvider(selector: DocumentSelector, provider: DefinitionProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentDropEditProvider(selector: DocumentSelector, provider: DocumentDropEditProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentDropEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentFormattingEditProvider(selector: DocumentSelector, provider: DocumentFormattingEditProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentHighlightProvider(selector: DocumentSelector, provider: DocumentHighlightProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentLinkProvider(
    selector: DocumentSelector,
    provider: DocumentLinkProvider[typingsJapgolly.vscode.mod.DocumentLink]
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentLinkProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentRangeFormattingEditProvider(selector: DocumentSelector, provider: DocumentRangeFormattingEditProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentRangeSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentRangeSemanticTokensProvider,
    legend: typingsJapgolly.vscode.mod.SemanticTokensLegend
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentSemanticTokensProvider(
    selector: DocumentSelector,
    provider: DocumentSemanticTokensProvider,
    legend: typingsJapgolly.vscode.mod.SemanticTokensLegend
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], legend.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDocumentSymbolProvider(selector: DocumentSelector, provider: DocumentSymbolProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerDocumentSymbolProvider(
    selector: DocumentSelector,
    provider: DocumentSymbolProvider,
    metaData: DocumentSymbolProviderMetadata
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metaData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerEvaluatableExpressionProvider(selector: DocumentSelector, provider: EvaluatableExpressionProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEvaluatableExpressionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerFoldingRangeProvider(selector: DocumentSelector, provider: FoldingRangeProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerHoverProvider(selector: DocumentSelector, provider: HoverProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerImplementationProvider(selector: DocumentSelector, provider: ImplementationProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerInlayHintsProvider(selector: DocumentSelector, provider: InlayHintsProvider[typingsJapgolly.vscode.mod.InlayHint]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlayHintsProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerInlineCompletionItemProvider(selector: DocumentSelector, provider: InlineCompletionItemProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineCompletionItemProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerInlineValuesProvider(selector: DocumentSelector, provider: InlineValuesProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineValuesProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerLinkedEditingRangeProvider(selector: DocumentSelector, provider: LinkedEditingRangeProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkedEditingRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerOnTypeFormattingEditProvider(
    selector: DocumentSelector,
    provider: OnTypeFormattingEditProvider,
    firstTriggerCharacter: String,
    moreTriggerCharacter: String*
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")((scala.List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], firstTriggerCharacter.asInstanceOf[js.Any])).`++`(moreTriggerCharacter.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerReferenceProvider(selector: DocumentSelector, provider: ReferenceProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerRenameProvider(selector: DocumentSelector, provider: RenameProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerSelectionRangeProvider(selector: DocumentSelector, provider: SelectionRangeProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerSignatureHelpProvider(
    selector: DocumentSelector,
    provider: SignatureHelpProvider,
    metadata: SignatureHelpProviderMetadata
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerSignatureHelpProvider(selector: DocumentSelector, provider: SignatureHelpProvider, triggerCharacters: String*): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")((scala.List(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).`++`(triggerCharacters.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerTypeDefinitionProvider(selector: DocumentSelector, provider: TypeDefinitionProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerTypeHierarchyProvider(selector: DocumentSelector, provider: TypeHierarchyProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeHierarchyProvider")(selector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerWorkspaceSymbolProvider(provider: WorkspaceSymbolProvider[typingsJapgolly.vscode.mod.SymbolInformation]): typingsJapgolly.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerWorkspaceSymbolProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def setLanguageConfiguration(language: String, configuration: LanguageConfiguration): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(language.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def setTextDocumentLanguage(document: TextDocument, languageId: String): Thenable[TextDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextDocumentLanguage")(document.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextDocument]]
}

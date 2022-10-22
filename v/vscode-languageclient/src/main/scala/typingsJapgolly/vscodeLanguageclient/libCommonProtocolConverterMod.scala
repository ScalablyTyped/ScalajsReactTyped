package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CallHierarchyItem
import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.CodeActionKind
import typingsJapgolly.vscode.mod.CodeLens
import typingsJapgolly.vscode.mod.DiagnosticSeverity
import typingsJapgolly.vscode.mod.DocumentHighlightKind
import typingsJapgolly.vscode.mod.FoldingRangeKind
import typingsJapgolly.vscode.mod.Hover
import typingsJapgolly.vscode.mod.Location
import typingsJapgolly.vscode.mod.LocationLink
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.SemanticTokensEdits
import typingsJapgolly.vscode.mod.TextEdit
import typingsJapgolly.vscode.mod.TypeHierarchyItem
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeLanguageclient.libCommonProtocolCompletionItemMod.default
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotlinkedEditingRangeMod.LinkedEditingRanges
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.GlobPattern
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyIncomingCall
import typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyOutgoingCall
import typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
import typingsJapgolly.vscodeLanguageserverTypes.mod.Color
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation
import typingsJapgolly.vscodeLanguageserverTypes.mod.Command
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList
import typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Definition
import typingsJapgolly.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic
import typingsJapgolly.vscodeLanguageserverTypes.mod.DiagnosticTag
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentSymbol
import typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange
import typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint
import typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValue
import typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokens
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokensEdit
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokensLegend
import typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureHelp
import typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolKind
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolTag
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolConverterMod {
  
  @JSImport("vscode-languageclient/lib/common/protocolConverter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConverter(uriConverter: Unit, trustMarkdown: Boolean, supportHtml: Boolean): Converter = (^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")(uriConverter.asInstanceOf[js.Any], trustMarkdown.asInstanceOf[js.Any], supportHtml.asInstanceOf[js.Any])).asInstanceOf[Converter]
  inline def createConverter(uriConverter: URIConverter, trustMarkdown: Boolean, supportHtml: Boolean): Converter = (^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")(uriConverter.asInstanceOf[js.Any], trustMarkdown.asInstanceOf[js.Any], supportHtml.asInstanceOf[js.Any])).asInstanceOf[Converter]
  
  @js.native
  trait Converter extends StObject {
    
    def asCallHierarchyIncomingCall(item: CallHierarchyIncomingCall): js.Promise[typingsJapgolly.vscode.mod.CallHierarchyIncomingCall] = js.native
    def asCallHierarchyIncomingCall(item: CallHierarchyIncomingCall, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.CallHierarchyIncomingCall] = js.native
    
    def asCallHierarchyIncomingCalls(): js.Promise[Unit] = js.native
    def asCallHierarchyIncomingCalls(items: js.Array[CallHierarchyIncomingCall]): js.Promise[js.Array[typingsJapgolly.vscode.mod.CallHierarchyIncomingCall]] = js.native
    def asCallHierarchyIncomingCalls(items: js.Array[CallHierarchyIncomingCall], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.CallHierarchyIncomingCall]] = js.native
    def asCallHierarchyIncomingCalls(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asCallHierarchyItem(): js.UndefOr[CallHierarchyItem] = js.native
    def asCallHierarchyItem(item: Null): Unit = js.native
    def asCallHierarchyItem(item: typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyItem): js.UndefOr[CallHierarchyItem] = js.native
    @JSName("asCallHierarchyItem")
    def asCallHierarchyItem_CallHierarchyItem(item: typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyItem): CallHierarchyItem = js.native
    
    def asCallHierarchyItems(): js.Promise[Unit] = js.native
    def asCallHierarchyItems(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyItem]): js.Promise[js.Array[CallHierarchyItem]] = js.native
    def asCallHierarchyItems(
      items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyItem],
      token: CancellationToken
    ): js.Promise[js.Array[CallHierarchyItem]] = js.native
    def asCallHierarchyItems(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asCallHierarchyOutgoingCall(item: CallHierarchyOutgoingCall): js.Promise[typingsJapgolly.vscode.mod.CallHierarchyOutgoingCall] = js.native
    def asCallHierarchyOutgoingCall(item: CallHierarchyOutgoingCall, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.CallHierarchyOutgoingCall] = js.native
    
    def asCallHierarchyOutgoingCalls(): js.Promise[Unit] = js.native
    def asCallHierarchyOutgoingCalls(items: js.Array[CallHierarchyOutgoingCall]): js.Promise[js.Array[typingsJapgolly.vscode.mod.CallHierarchyOutgoingCall]] = js.native
    def asCallHierarchyOutgoingCalls(items: js.Array[CallHierarchyOutgoingCall], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.CallHierarchyOutgoingCall]] = js.native
    def asCallHierarchyOutgoingCalls(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asCodeAction(): js.Promise[Unit] = js.native
    def asCodeAction(item: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asCodeAction(item: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asCodeAction(item: CodeAction): js.Promise[typingsJapgolly.vscode.mod.CodeAction] = js.native
    def asCodeAction(item: CodeAction, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.CodeAction] = js.native
    
    def asCodeActionKind(): js.UndefOr[CodeActionKind] = js.native
    def asCodeActionKind(item: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind): js.UndefOr[CodeActionKind] = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_CodeActionKind(item: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind): CodeActionKind = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_Unit(): Unit = js.native
    
    def asCodeActionKinds(): js.UndefOr[js.Array[CodeActionKind]] = js.native
    def asCodeActionKinds(item: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind]): js.UndefOr[js.Array[CodeActionKind]] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Array(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind]): js.Array[CodeActionKind] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Unit(): Unit = js.native
    
    def asCodeActionResult(items: js.Array[Command | CodeAction]): js.Promise[
        js.Array[typingsJapgolly.vscode.mod.Command | typingsJapgolly.vscode.mod.CodeAction]
      ] = js.native
    def asCodeActionResult(items: js.Array[Command | CodeAction], token: CancellationToken): js.Promise[
        js.Array[typingsJapgolly.vscode.mod.Command | typingsJapgolly.vscode.mod.CodeAction]
      ] = js.native
    
    def asCodeLens(): js.UndefOr[CodeLens] = js.native
    def asCodeLens(item: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens): js.UndefOr[CodeLens] = js.native
    @JSName("asCodeLens")
    def asCodeLens_CodeLens(item: typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens): CodeLens = js.native
    @JSName("asCodeLens")
    def asCodeLens_Unit(): Unit = js.native
    
    def asCodeLenses(): js.Promise[Unit] = js.native
    def asCodeLenses(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens]): js.Promise[js.Array[CodeLens]] = js.native
    def asCodeLenses(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens], token: CancellationToken): js.Promise[js.Array[CodeLens]] = js.native
    def asCodeLenses(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asCodeLenses(items: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asColor(color: Color): typingsJapgolly.vscode.mod.Color = js.native
    
    def asColorInformation(ci: ColorInformation): typingsJapgolly.vscode.mod.ColorInformation = js.native
    
    def asColorInformations(): js.Promise[Unit] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Promise[js.Array[typingsJapgolly.vscode.mod.ColorInformation]] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.ColorInformation]] = js.native
    def asColorInformations(colorPresentations: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asColorInformations(colorPresentations: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asColorPresentation(cp: ColorPresentation): typingsJapgolly.vscode.mod.ColorPresentation = js.native
    
    def asColorPresentations(): js.Promise[Unit] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): js.Promise[js.Array[typingsJapgolly.vscode.mod.ColorPresentation]] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.ColorPresentation]] = js.native
    def asColorPresentations(colorPresentations: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asColorPresentations(colorPresentations: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asCommand(item: Command): typingsJapgolly.vscode.mod.Command = js.native
    
    def asCommands(): js.Promise[Unit] = js.native
    def asCommands(items: js.Array[Command]): js.Promise[js.Array[typingsJapgolly.vscode.mod.Command]] = js.native
    def asCommands(items: js.Array[Command], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.Command]] = js.native
    def asCommands(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asCommands(items: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asCompletionItem(item: CompletionItem): default = js.native
    def asCompletionItem(item: CompletionItem, defaultCommitCharacters: js.Array[String]): default = js.native
    
    def asCompletionResult(): js.Promise[Unit] = js.native
    def asCompletionResult(value: js.Array[CompletionItem]): js.Promise[js.Array[typingsJapgolly.vscode.mod.CompletionItem]] = js.native
    def asCompletionResult(value: js.Array[CompletionItem], allCommitCharacters: js.Array[String]): js.Promise[js.Array[typingsJapgolly.vscode.mod.CompletionItem]] = js.native
    def asCompletionResult(value: js.Array[CompletionItem], allCommitCharacters: js.Array[String], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.CompletionItem]] = js.native
    def asCompletionResult(value: js.Array[CompletionItem], allCommitCharacters: Unit, token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.CompletionItem]] = js.native
    def asCompletionResult(value: Null, allCommitCharacters: js.Array[String]): js.Promise[Unit] = js.native
    def asCompletionResult(value: Null, allCommitCharacters: js.Array[String], token: CancellationToken): js.Promise[Unit] = js.native
    def asCompletionResult(value: Null, allCommitCharacters: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asCompletionResult(value: Unit, allCommitCharacters: js.Array[String]): js.Promise[Unit] = js.native
    def asCompletionResult(value: Unit, allCommitCharacters: js.Array[String], token: CancellationToken): js.Promise[Unit] = js.native
    def asCompletionResult(value: Unit, allCommitCharacters: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asCompletionResult(value: CompletionList): js.Promise[
        typingsJapgolly.vscode.mod.CompletionList[typingsJapgolly.vscode.mod.CompletionItem]
      ] = js.native
    def asCompletionResult(value: CompletionList, allCommitCharacters: js.Array[String]): js.Promise[
        typingsJapgolly.vscode.mod.CompletionList[typingsJapgolly.vscode.mod.CompletionItem]
      ] = js.native
    def asCompletionResult(value: CompletionList, allCommitCharacters: js.Array[String], token: CancellationToken): js.Promise[
        typingsJapgolly.vscode.mod.CompletionList[typingsJapgolly.vscode.mod.CompletionItem]
      ] = js.native
    def asCompletionResult(value: CompletionList, allCommitCharacters: Unit, token: CancellationToken): js.Promise[
        typingsJapgolly.vscode.mod.CompletionList[typingsJapgolly.vscode.mod.CompletionItem]
      ] = js.native
    
    def asDeclarationResult(): js.Promise[Unit] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.Promise[js.Array[LocationLink]] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink], token: CancellationToken): js.Promise[js.Array[LocationLink]] = js.native
    def asDeclarationResult(item: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asDeclarationResult(item: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asDeclarationResult(item: Declaration): js.Promise[Location | js.Array[Location]] = js.native
    def asDeclarationResult(item: Declaration, token: CancellationToken): js.Promise[Location | js.Array[Location]] = js.native
    
    def asDefinitionResult(): js.Promise[Unit] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink]): js.Promise[js.Array[typingsJapgolly.vscode.mod.DefinitionLink]] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.DefinitionLink]] = js.native
    def asDefinitionResult(item: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asDefinitionResult(item: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asDefinitionResult(item: Definition): js.Promise[typingsJapgolly.vscode.mod.Definition] = js.native
    def asDefinitionResult(item: Definition, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.Definition] = js.native
    
    def asDiagnostic(diagnostic: Diagnostic): typingsJapgolly.vscode.mod.Diagnostic = js.native
    
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    
    def asDiagnosticTag(tag: DiagnosticTag): js.UndefOr[typingsJapgolly.vscode.mod.DiagnosticTag] = js.native
    
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Promise[js.Array[typingsJapgolly.vscode.mod.Diagnostic]] = js.native
    def asDiagnostics(diagnostics: js.Array[Diagnostic], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.Diagnostic]] = js.native
    
    def asDocumentHighlight(item: DocumentHighlight): typingsJapgolly.vscode.mod.DocumentHighlight = js.native
    
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    
    def asDocumentHighlights(): js.Promise[Unit] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.Promise[js.Array[typingsJapgolly.vscode.mod.DocumentHighlight]] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.DocumentHighlight]] = js.native
    def asDocumentHighlights(values: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asDocumentHighlights(values: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asDocumentLink(item: DocumentLink): typingsJapgolly.vscode.mod.DocumentLink = js.native
    
    def asDocumentLinks(): js.Promise[Unit] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.Promise[js.Array[typingsJapgolly.vscode.mod.DocumentLink]] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.DocumentLink]] = js.native
    def asDocumentLinks(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asDocumentLinks(items: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asDocumentSelector(value: DocumentSelector): typingsJapgolly.vscode.mod.DocumentSelector = js.native
    
    def asDocumentSymbol(value: DocumentSymbol): typingsJapgolly.vscode.mod.DocumentSymbol = js.native
    def asDocumentSymbol(value: DocumentSymbol, token: CancellationToken): typingsJapgolly.vscode.mod.DocumentSymbol = js.native
    
    def asDocumentSymbols(): js.Promise[Unit] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.Promise[js.Array[typingsJapgolly.vscode.mod.DocumentSymbol]] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.DocumentSymbol]] = js.native
    def asDocumentSymbols(value: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asDocumentSymbols(value: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asFoldingRange(r: FoldingRange): typingsJapgolly.vscode.mod.FoldingRange = js.native
    
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    
    def asFoldingRanges(): js.Promise[Unit] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.Promise[js.Array[typingsJapgolly.vscode.mod.FoldingRange]] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.FoldingRange]] = js.native
    def asFoldingRanges(foldingRanges: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asFoldingRanges(foldingRanges: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asGlobPattern(pattern: GlobPattern): js.UndefOr[typingsJapgolly.vscode.mod.GlobPattern] = js.native
    
    def asHover(): js.UndefOr[Hover] = js.native
    def asHover(hover: typingsJapgolly.vscodeLanguageserverTypes.mod.Hover): Hover = js.native
    @JSName("asHover")
    def asHover_Union(hover: typingsJapgolly.vscodeLanguageserverTypes.mod.Hover): js.UndefOr[Hover] = js.native
    @JSName("asHover")
    def asHover_Unit(): Unit = js.native
    
    def asInlayHint(value: InlayHint): js.Promise[typingsJapgolly.vscode.mod.InlayHint] = js.native
    def asInlayHint(value: InlayHint, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.InlayHint] = js.native
    
    def asInlayHints(): js.Promise[Unit] = js.native
    def asInlayHints(values: js.Array[InlayHint]): js.Promise[js.Array[typingsJapgolly.vscode.mod.InlayHint]] = js.native
    def asInlayHints(values: js.Array[InlayHint], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.InlayHint]] = js.native
    def asInlayHints(values: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asInlayHints(values: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asInlineValue(value: InlineValue): typingsJapgolly.vscode.mod.InlineValue = js.native
    
    def asInlineValues(): js.Promise[Unit] = js.native
    def asInlineValues(values: js.Array[InlineValue]): js.Promise[js.Array[typingsJapgolly.vscode.mod.InlineValue]] = js.native
    def asInlineValues(values: js.Array[InlineValue], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.InlineValue]] = js.native
    def asInlineValues(values: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asInlineValues(values: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asLinkedEditingRanges(): js.Promise[Unit] = js.native
    def asLinkedEditingRanges(value: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asLinkedEditingRanges(value: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asLinkedEditingRanges(value: LinkedEditingRanges): js.Promise[typingsJapgolly.vscode.mod.LinkedEditingRanges] = js.native
    def asLinkedEditingRanges(value: LinkedEditingRanges, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.LinkedEditingRanges] = js.native
    
    def asLocation(): js.UndefOr[Location] = js.native
    def asLocation(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Location): js.UndefOr[Location] = js.native
    @JSName("asLocation")
    def asLocation_Location(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Location): Location = js.native
    @JSName("asLocation")
    def asLocation_Unit(): Unit = js.native
    
    def asParameterInformation(item: ParameterInformation): typingsJapgolly.vscode.mod.ParameterInformation = js.native
    
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Promise[js.Array[typingsJapgolly.vscode.mod.ParameterInformation]] = js.native
    def asParameterInformations(item: js.Array[ParameterInformation], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.ParameterInformation]] = js.native
    
    def asPosition(): js.UndefOr[Position] = js.native
    def asPosition(value: typingsJapgolly.vscodeLanguageserverTypes.mod.Position): js.UndefOr[Position] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: typingsJapgolly.vscodeLanguageserverTypes.mod.Position): Position = js.native
    @JSName("asPosition")
    def asPosition_Unit(): Unit = js.native
    
    def asRange(): js.UndefOr[Range] = js.native
    def asRange(value: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): js.UndefOr[Range] = js.native
    @JSName("asRange")
    def asRange_Range(value: typingsJapgolly.vscodeLanguageserverTypes.mod.Range): Range = js.native
    @JSName("asRange")
    def asRange_Unit(): Unit = js.native
    
    def asRanges(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Range]): js.Promise[js.Array[Range]] = js.native
    def asRanges(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Range], token: CancellationToken): js.Promise[js.Array[Range]] = js.native
    
    def asReferences(): js.Promise[Unit] = js.native
    def asReferences(values: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Location]): js.Promise[js.Array[Location]] = js.native
    def asReferences(values: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Location], token: CancellationToken): js.Promise[js.Array[Location]] = js.native
    def asReferences(values: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asReferences(values: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asSelectionRange(selectionRange: SelectionRange): typingsJapgolly.vscode.mod.SelectionRange = js.native
    
    def asSelectionRanges(): js.Promise[Unit] = js.native
    def asSelectionRanges(selectionRanges: js.Array[SelectionRange]): js.Promise[js.Array[typingsJapgolly.vscode.mod.SelectionRange]] = js.native
    def asSelectionRanges(selectionRanges: js.Array[SelectionRange], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.SelectionRange]] = js.native
    def asSelectionRanges(selectionRanges: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asSelectionRanges(selectionRanges: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asSemanticTokens(): js.Promise[Unit] = js.native
    def asSemanticTokens(value: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asSemanticTokens(value: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asSemanticTokens(value: SemanticTokens): js.Promise[typingsJapgolly.vscode.mod.SemanticTokens] = js.native
    def asSemanticTokens(value: SemanticTokens, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.SemanticTokens] = js.native
    
    def asSemanticTokensEdit(value: SemanticTokensEdit): typingsJapgolly.vscode.mod.SemanticTokensEdit = js.native
    
    def asSemanticTokensEdits(): js.Promise[Unit] = js.native
    def asSemanticTokensEdits(value: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asSemanticTokensEdits(value: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asSemanticTokensEdits(value: SemanticTokensDelta): js.Promise[SemanticTokensEdits] = js.native
    def asSemanticTokensEdits(value: SemanticTokensDelta, token: CancellationToken): js.Promise[SemanticTokensEdits] = js.native
    
    def asSemanticTokensLegend(value: SemanticTokensLegend): typingsJapgolly.vscode.mod.SemanticTokensLegend = js.native
    
    def asSignatureHelp(): js.Promise[Unit] = js.native
    def asSignatureHelp(item: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asSignatureHelp(item: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asSignatureHelp(item: SignatureHelp): js.Promise[typingsJapgolly.vscode.mod.SignatureHelp] = js.native
    def asSignatureHelp(item: SignatureHelp, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.SignatureHelp] = js.native
    
    def asSignatureInformation(item: SignatureInformation): js.Promise[typingsJapgolly.vscode.mod.SignatureInformation] = js.native
    def asSignatureInformation(item: SignatureInformation, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.SignatureInformation] = js.native
    
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Promise[js.Array[typingsJapgolly.vscode.mod.SignatureInformation]] = js.native
    def asSignatureInformations(items: js.Array[SignatureInformation], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.SignatureInformation]] = js.native
    
    def asSymbolInformation(item: SymbolInformation): typingsJapgolly.vscode.mod.SymbolInformation = js.native
    def asSymbolInformation(item: WorkspaceSymbol): typingsJapgolly.vscode.mod.SymbolInformation = js.native
    
    def asSymbolInformations(): js.Promise[Unit] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation | WorkspaceSymbol]): js.Promise[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation | WorkspaceSymbol], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asSymbolInformations(values: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asSymbolKind(item: SymbolKind): typingsJapgolly.vscode.mod.SymbolKind = js.native
    
    def asSymbolTag(item: SymbolTag): js.UndefOr[typingsJapgolly.vscode.mod.SymbolTag] = js.native
    
    def asSymbolTags(): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.SymbolTag]] = js.native
    def asSymbolTags(items: js.Array[SymbolTag]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.SymbolTag]] = js.native
    @JSName("asSymbolTags")
    def asSymbolTags_Array(items: js.Array[SymbolTag]): js.Array[typingsJapgolly.vscode.mod.SymbolTag] = js.native
    @JSName("asSymbolTags")
    def asSymbolTags_Unit(): Unit = js.native
    
    def asTextEdit(): js.UndefOr[TextEdit] = js.native
    def asTextEdit(edit: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit): TextEdit = js.native
    @JSName("asTextEdit")
    def asTextEdit_Union(edit: typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit): js.UndefOr[TextEdit] = js.native
    @JSName("asTextEdit")
    def asTextEdit_Unit(): Unit = js.native
    
    def asTextEdits(): js.Promise[Unit] = js.native
    def asTextEdits(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit]): js.Promise[js.Array[TextEdit]] = js.native
    def asTextEdits(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit], token: CancellationToken): js.Promise[js.Array[TextEdit]] = js.native
    def asTextEdits(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asTextEdits(items: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asTypeHierarchyItem(): js.UndefOr[TypeHierarchyItem] = js.native
    def asTypeHierarchyItem(item: Null): Unit = js.native
    def asTypeHierarchyItem(item: typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem): js.UndefOr[TypeHierarchyItem] = js.native
    @JSName("asTypeHierarchyItem")
    def asTypeHierarchyItem_TypeHierarchyItem(item: typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem): TypeHierarchyItem = js.native
    
    def asTypeHierarchyItems(): js.Promise[Unit] = js.native
    def asTypeHierarchyItems(items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem]): js.Promise[js.Array[TypeHierarchyItem]] = js.native
    def asTypeHierarchyItems(
      items: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem],
      token: CancellationToken
    ): js.Promise[js.Array[TypeHierarchyItem]] = js.native
    def asTypeHierarchyItems(items: Null, token: CancellationToken): js.Promise[Unit] = js.native
    
    def asUri(value: String): Uri = js.native
    
    def asWorkspaceEdit(): js.Promise[Unit] = js.native
    def asWorkspaceEdit(item: Null, token: CancellationToken): js.Promise[Unit] = js.native
    def asWorkspaceEdit(item: Unit, token: CancellationToken): js.Promise[Unit] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit): js.Promise[typingsJapgolly.vscode.mod.WorkspaceEdit] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit, token: CancellationToken): js.Promise[typingsJapgolly.vscode.mod.WorkspaceEdit] = js.native
  }
  
  type URIConverter = js.Function1[/* value */ String, Uri]
}

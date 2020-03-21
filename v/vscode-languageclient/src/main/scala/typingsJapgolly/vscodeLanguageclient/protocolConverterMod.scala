package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CompletionList
import typingsJapgolly.vscode.mod.Declaration
import typingsJapgolly.vscode.mod.Definition
import typingsJapgolly.vscode.mod.DiagnosticSeverity
import typingsJapgolly.vscode.mod.DocumentHighlightKind
import typingsJapgolly.vscode.mod.FoldingRangeKind
import typingsJapgolly.vscode.mod.Location
import typingsJapgolly.vscode.mod.LocationLink
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeLanguageclient.protocolCompletionItemMod.default
import typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
import typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionKind
import typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens
import typingsJapgolly.vscodeLanguageserverTypes.mod.Color
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation
import typingsJapgolly.vscodeLanguageserverTypes.mod.Command
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentSymbol
import typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange
import typingsJapgolly.vscodeLanguageserverTypes.mod.Hover
import typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.Position
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureHelp
import typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolConverter", JSImport.Namespace)
@js.native
object protocolConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
    def asCodeAction(item: CodeAction): js.UndefOr[typingsJapgolly.vscode.mod.CodeAction] = js.native
    def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKind(item: CodeActionKind): js.UndefOr[typingsJapgolly.vscode.mod.CodeActionKind] = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_CodeActionKind(item: CodeActionKind): typingsJapgolly.vscode.mod.CodeActionKind = js.native
    def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKinds(item: js.Array[CodeActionKind]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.CodeActionKind]] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Array(items: js.Array[CodeActionKind]): js.Array[typingsJapgolly.vscode.mod.CodeActionKind] = js.native
    @JSName("asCodeAction")
    def asCodeAction_CodeAction(item: CodeAction): typingsJapgolly.vscode.mod.CodeAction = js.native
    def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLens(item: CodeLens): js.UndefOr[typingsJapgolly.vscode.mod.CodeLens] = js.native
    @JSName("asCodeLens")
    def asCodeLens_CodeLens(item: CodeLens): typingsJapgolly.vscode.mod.CodeLens = js.native
    def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLenses(items: js.Array[CodeLens]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.CodeLens]] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Array(items: js.Array[CodeLens]): js.Array[typingsJapgolly.vscode.mod.CodeLens] = js.native
    def asColor(color: Color): typingsJapgolly.vscode.mod.Color = js.native
    def asColorInformation(ci: ColorInformation): typingsJapgolly.vscode.mod.ColorInformation = js.native
    def asColorInformations(): js.UndefOr[scala.Nothing] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Array[typingsJapgolly.vscode.mod.ColorInformation] = js.native
    @JSName("asColorInformations")
    def asColorInformations_Array(): js.Array[typingsJapgolly.vscode.mod.ColorInformation] = js.native
    def asColorPresentation(cp: ColorPresentation): typingsJapgolly.vscode.mod.ColorPresentation = js.native
    def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): js.UndefOr[scala.Nothing] = js.native
    @JSName("asColorPresentations")
    def asColorPresentations_Array(colorPresentations: js.Array[ColorPresentation]): js.Array[typingsJapgolly.vscode.mod.ColorPresentation] = js.native
    def asCommand(item: Command): typingsJapgolly.vscode.mod.Command = js.native
    def asCommands(): js.UndefOr[scala.Nothing] = js.native
    def asCommands(items: js.Array[Command]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Command]] = js.native
    @JSName("asCommands")
    def asCommands_Array(items: js.Array[Command]): js.Array[typingsJapgolly.vscode.mod.Command] = js.native
    def asCompletionItem(item: CompletionItem): default = js.native
    def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
    def asCompletionResult(result: js.Array[CompletionItem]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.CompletionItem] | CompletionList] = js.native
    def asCompletionResult(result: typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.CompletionItem] | CompletionList] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Array(result: js.Array[CompletionItem]): js.Array[typingsJapgolly.vscode.mod.CompletionItem] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_CompletionList(result: typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList): CompletionList = js.native
    def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.UndefOr[Declaration] = js.native
    def asDeclarationResult(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration): Location | js.Array[Location] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Array(item: js.Array[DeclarationLink]): js.Array[LocationLink] = js.native
    def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink]): js.UndefOr[Definition | js.Array[typingsJapgolly.vscode.mod.DefinitionLink]] = js.native
    def asDefinitionResult(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Definition): Definition = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Array(item: js.Array[DefinitionLink]): js.Array[typingsJapgolly.vscode.mod.DefinitionLink] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Union(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Definition): js.UndefOr[Definition | js.Array[typingsJapgolly.vscode.mod.DefinitionLink]] = js.native
    def asDiagnostic(diagnostic: Diagnostic): typingsJapgolly.vscode.mod.Diagnostic = js.native
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[typingsJapgolly.vscode.mod.Diagnostic] = js.native
    def asDocumentHighlight(item: DocumentHighlight): typingsJapgolly.vscode.mod.DocumentHighlight = js.native
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.DocumentHighlight]] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Array(values: js.Array[DocumentHighlight]): js.Array[typingsJapgolly.vscode.mod.DocumentHighlight] = js.native
    def asDocumentLink(item: DocumentLink): typingsJapgolly.vscode.mod.DocumentLink = js.native
    def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.DocumentLink]] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Array(items: js.Array[DocumentLink]): js.Array[typingsJapgolly.vscode.mod.DocumentLink] = js.native
    def asDocumentSymbol(value: DocumentSymbol): typingsJapgolly.vscode.mod.DocumentSymbol = js.native
    def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.DocumentSymbol]] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Array(value: js.Array[DocumentSymbol]): js.Array[typingsJapgolly.vscode.mod.DocumentSymbol] = js.native
    def asFoldingRange(r: FoldingRange): typingsJapgolly.vscode.mod.FoldingRange = js.native
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.FoldingRange]] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Array(foldingRanges: js.Array[FoldingRange]): js.Array[typingsJapgolly.vscode.mod.FoldingRange] = js.native
    def asHover(): js.UndefOr[scala.Nothing] = js.native
    def asHover(hover: Hover): typingsJapgolly.vscode.mod.Hover = js.native
    @JSName("asHover")
    def asHover_Union(hover: Hover): js.UndefOr[typingsJapgolly.vscode.mod.Hover] = js.native
    def asLocation(): js.UndefOr[scala.Nothing] = js.native
    def asLocation(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Location): js.UndefOr[Location] = js.native
    @JSName("asLocation")
    def asLocation_Location(item: typingsJapgolly.vscodeLanguageserverTypes.mod.Location): Location = js.native
    def asParameterInformation(item: ParameterInformation): typingsJapgolly.vscode.mod.ParameterInformation = js.native
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Array[typingsJapgolly.vscode.mod.ParameterInformation] = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): js.UndefOr[typingsJapgolly.vscode.mod.Position] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typingsJapgolly.vscode.mod.Position = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): js.UndefOr[typingsJapgolly.vscode.mod.Range] = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typingsJapgolly.vscode.mod.Range = js.native
    def asReferences(): js.UndefOr[js.Array[Location]] = js.native
    def asReferences(values: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Location]): js.UndefOr[js.Array[Location]] = js.native
    @JSName("asReferences")
    def asReferences_Array(values: js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Location]): js.Array[Location] = js.native
    def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
    def asSignatureHelp(item: SignatureHelp): typingsJapgolly.vscode.mod.SignatureHelp = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_Union(item: SignatureHelp): js.UndefOr[typingsJapgolly.vscode.mod.SignatureHelp] = js.native
    def asSignatureInformation(item: SignatureInformation): typingsJapgolly.vscode.mod.SignatureInformation = js.native
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Array[typingsJapgolly.vscode.mod.SignatureInformation] = js.native
    def asSymbolInformation(item: SymbolInformation): typingsJapgolly.vscode.mod.SymbolInformation = js.native
    def asSymbolInformation(item: SymbolInformation, uri: Uri): typingsJapgolly.vscode.mod.SymbolInformation = js.native
    def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.UndefOr[scala.Nothing], uri: Uri): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation], uri: Uri): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Null, uri: Uri): js.UndefOr[scala.Nothing] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation]): js.Array[typingsJapgolly.vscode.mod.SymbolInformation] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation], uri: Uri): js.Array[typingsJapgolly.vscode.mod.SymbolInformation] = js.native
    def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdit(edit: TextEdit): typingsJapgolly.vscode.mod.TextEdit = js.native
    @JSName("asTextEdit")
    def asTextEdit_Union(edit: TextEdit): js.UndefOr[typingsJapgolly.vscode.mod.TextEdit] = js.native
    def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdits(items: js.Array[TextEdit]): js.UndefOr[js.Array[typingsJapgolly.vscode.mod.TextEdit]] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Array(items: js.Array[TextEdit]): js.Array[typingsJapgolly.vscode.mod.TextEdit] = js.native
    def asUri(value: String): Uri = js.native
    def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit): typingsJapgolly.vscode.mod.WorkspaceEdit = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_Union(item: WorkspaceEdit): js.UndefOr[typingsJapgolly.vscode.mod.WorkspaceEdit] = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ String, Uri]
}


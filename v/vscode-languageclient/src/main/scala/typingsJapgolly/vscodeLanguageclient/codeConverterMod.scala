package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CodeActionContext
import typingsJapgolly.vscode.mod.CodeLens
import typingsJapgolly.vscode.mod.Command
import typingsJapgolly.vscode.mod.CompletionContext
import typingsJapgolly.vscode.mod.CompletionItem
import typingsJapgolly.vscode.mod.Diagnostic
import typingsJapgolly.vscode.mod.DiagnosticSeverity
import typingsJapgolly.vscode.mod.DocumentLink
import typingsJapgolly.vscode.mod.FormattingOptions
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TextDocumentChangeEvent
import typingsJapgolly.vscode.mod.TextDocumentWillSaveEvent
import typingsJapgolly.vscode.mod.TextEdit
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typingsJapgolly.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/codeConverter", JSImport.Namespace)
@js.native
object codeConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    def asCodeActionContext(context: CodeActionContext): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
    def asCodeLens(item: CodeLens): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens = js.native
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    def asCommand(item: Command): typingsJapgolly.vscodeLanguageserverTypes.mod.Command = js.native
    def asCompletionItem(item: CompletionItem): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    def asDiagnostic(item: Diagnostic): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    def asDiagnostics(items: js.Array[Diagnostic]): js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic] = js.native
    def asDocumentLink(item: DocumentLink): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = js.native
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    def asDocumentSymbolParams(textDocument: TextDocument): js.Any = js.native
    def asFormattingOptions(item: FormattingOptions): typingsJapgolly.vscodeLanguageserverTypes.mod.FormattingOptions = js.native
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    def asPosition(): Null = js.native
    def asPosition(value: Position): js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typingsJapgolly.vscodeLanguageserverTypes.mod.Position = js.native
    @JSName("asPosition")
    def asPosition_Union(): js.UndefOr[scala.Nothing] = js.native
    def asRange(): Null = js.native
    def asRange(value: Range): js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.Range | Null] = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typingsJapgolly.vscodeLanguageserverTypes.mod.Range = js.native
    @JSName("asRange")
    def asRange_Union(): js.UndefOr[scala.Nothing] = js.native
    def asReferenceParams(textDocument: TextDocument, position: Position, options: AnonIncludeDeclaration): ReferenceParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    def asTextEdit(edit: TextEdit): typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit = js.native
    def asUri(uri: Uri): String = js.native
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    def asWorkerPosition(position: Position): typingsJapgolly.vscodeLanguageserverTypes.mod.Position = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ Uri, String]
}


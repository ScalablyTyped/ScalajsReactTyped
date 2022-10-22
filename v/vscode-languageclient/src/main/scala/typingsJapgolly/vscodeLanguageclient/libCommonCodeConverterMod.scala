package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CallHierarchyItem
import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.CodeAction
import typingsJapgolly.vscode.mod.CodeActionContext
import typingsJapgolly.vscode.mod.CodeLens
import typingsJapgolly.vscode.mod.Command
import typingsJapgolly.vscode.mod.CompletionContext
import typingsJapgolly.vscode.mod.CompletionItem
import typingsJapgolly.vscode.mod.Diagnostic
import typingsJapgolly.vscode.mod.DiagnosticSeverity
import typingsJapgolly.vscode.mod.DiagnosticTag
import typingsJapgolly.vscode.mod.DocumentLink
import typingsJapgolly.vscode.mod.FileCreateEvent
import typingsJapgolly.vscode.mod.FileDeleteEvent
import typingsJapgolly.vscode.mod.FileRenameEvent
import typingsJapgolly.vscode.mod.FormattingOptions
import typingsJapgolly.vscode.mod.InlayHint
import typingsJapgolly.vscode.mod.InlineValueContext
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.SignatureHelpContext
import typingsJapgolly.vscode.mod.SymbolInformation
import typingsJapgolly.vscode.mod.SymbolKind
import typingsJapgolly.vscode.mod.SymbolTag
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TextDocumentChangeEvent
import typingsJapgolly.vscode.mod.TextDocumentWillSaveEvent
import typingsJapgolly.vscode.mod.TextEdit
import typingsJapgolly.vscode.mod.TypeHierarchyItem
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeLanguageclient.anon.IncludeDeclaration
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.CreateFilesParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.DeleteFilesParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.RenameFilesParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidCloseTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidOpenTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.Location
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextDocumentItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCodeConverterMod {
  
  @JSImport("vscode-languageclient/lib/common/codeConverter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConverter(): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")().asInstanceOf[Converter]
  inline def createConverter(uriConverter: URIConverter): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("createConverter")(uriConverter.asInstanceOf[js.Any]).asInstanceOf[Converter]
  
  @js.native
  trait Converter extends StObject {
    
    def asCallHierarchyItem(value: CallHierarchyItem): typingsJapgolly.vscodeLanguageserverTypes.mod.CallHierarchyItem = js.native
    
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    
    def asCodeAction(item: CodeAction): js.Promise[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction] = js.native
    def asCodeAction(item: CodeAction, token: CancellationToken): js.Promise[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction] = js.native
    
    def asCodeActionContext(context: CodeActionContext): js.Promise[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext] = js.native
    def asCodeActionContext(context: CodeActionContext, token: CancellationToken): js.Promise[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeActionContext] = js.native
    
    def asCodeLens(item: CodeLens): typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens = js.native
    
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    
    def asCommand(item: Command): typingsJapgolly.vscodeLanguageserverTypes.mod.Command = js.native
    
    def asCompletionItem(item: CompletionItem): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    def asCompletionItem(item: CompletionItem, labelDetailsSupport: Boolean): typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    
    def asDiagnostic(item: Diagnostic): typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic = js.native
    
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    
    def asDiagnosticTag(value: DiagnosticTag): js.UndefOr[Double] = js.native
    
    def asDiagnostics(items: js.Array[Diagnostic]): js.Promise[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]] = js.native
    def asDiagnostics(items: js.Array[Diagnostic], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Diagnostic]] = js.native
    
    def asDidCreateFilesParams(event: FileCreateEvent): CreateFilesParams = js.native
    
    def asDidDeleteFilesParams(event: FileDeleteEvent): DeleteFilesParams = js.native
    
    def asDidRenameFilesParams(event: FileRenameEvent): RenameFilesParams = js.native
    
    def asDocumentLink(item: DocumentLink): typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink = js.native
    
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    
    def asDocumentSymbolParams(textDocument: TextDocument): DocumentSymbolParams = js.native
    
    def asFormattingOptions(options: FormattingOptions, fileOptions: FileFormattingOptions): typingsJapgolly.vscodeLanguageserverTypes.mod.FormattingOptions = js.native
    
    def asInlayHint(value: InlayHint): typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint = js.native
    
    def asInlineValueContext(context: InlineValueContext): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueContext = js.native
    
    def asLocation(): js.UndefOr[Location | Null] = js.native
    def asLocation(value: Null): Null = js.native
    def asLocation(value: Unit): Unit = js.native
    def asLocation(value: typingsJapgolly.vscode.mod.Location): Location = js.native
    @JSName("asLocation")
    def asLocation_Union(value: typingsJapgolly.vscode.mod.Location): js.UndefOr[Location | Null] = js.native
    
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    
    def asPosition(): js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    def asPosition(value: Null): Null = js.native
    def asPosition(value: Unit): Unit = js.native
    def asPosition(value: Position): js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typingsJapgolly.vscodeLanguageserverTypes.mod.Position = js.native
    
    def asPositions(value: js.Array[Position]): js.Promise[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Position]] = js.native
    def asPositions(value: js.Array[Position], token: CancellationToken): js.Promise[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Position]] = js.native
    
    def asRange(): js.UndefOr[Range | Null] = js.native
    def asRange(value: Null): Null = js.native
    def asRange(value: Unit): Unit = js.native
    def asRange(value: typingsJapgolly.vscode.mod.Range): js.UndefOr[Range | Null] = js.native
    @JSName("asRange")
    def asRange_Range(value: typingsJapgolly.vscode.mod.Range): Range = js.native
    
    def asReferenceParams(textDocument: TextDocument, position: Position, options: IncludeDeclaration): ReferenceParams = js.native
    
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    
    def asSignatureHelpParams(textDocument: TextDocument, position: Position, context: SignatureHelpContext): SignatureHelpParams = js.native
    
    def asSymbolKind(item: SymbolKind): typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolKind = js.native
    
    def asSymbolTag(item: SymbolTag): typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolTag = js.native
    
    def asSymbolTags(items: js.Array[SymbolTag]): js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolTag] = js.native
    
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    
    def asTextDocumentItem(textDocument: TextDocument): TextDocumentItem = js.native
    
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    
    def asTextEdit(edit: TextEdit): typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit = js.native
    
    def asTypeHierarchyItem(value: TypeHierarchyItem): typingsJapgolly.vscodeLanguageserverTypes.mod.TypeHierarchyItem = js.native
    
    def asUri(uri: Uri): String = js.native
    
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    
    def asWillCreateFilesParams(event: FileCreateEvent): CreateFilesParams = js.native
    
    def asWillDeleteFilesParams(event: FileDeleteEvent): DeleteFilesParams = js.native
    
    def asWillRenameFilesParams(event: FileRenameEvent): RenameFilesParams = js.native
    
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    
    def asWorkerPosition(position: Position): typingsJapgolly.vscodeLanguageserverTypes.mod.Position = js.native
    
    def asWorkspaceSymbol(item: SymbolInformation): WorkspaceSymbol = js.native
  }
  
  trait FileFormattingOptions extends StObject {
    
    var insertFinalNewline: js.UndefOr[Boolean] = js.undefined
    
    var trimFinalNewlines: js.UndefOr[Boolean] = js.undefined
    
    var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
  }
  object FileFormattingOptions {
    
    inline def apply(): FileFormattingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileFormattingOptions]
    }
    
    extension [Self <: FileFormattingOptions](x: Self) {
      
      inline def setInsertFinalNewline(value: Boolean): Self = StObject.set(x, "insertFinalNewline", value.asInstanceOf[js.Any])
      
      inline def setInsertFinalNewlineUndefined: Self = StObject.set(x, "insertFinalNewline", js.undefined)
      
      inline def setTrimFinalNewlines(value: Boolean): Self = StObject.set(x, "trimFinalNewlines", value.asInstanceOf[js.Any])
      
      inline def setTrimFinalNewlinesUndefined: Self = StObject.set(x, "trimFinalNewlines", js.undefined)
      
      inline def setTrimTrailingWhitespace(value: Boolean): Self = StObject.set(x, "trimTrailingWhitespace", value.asInstanceOf[js.Any])
      
      inline def setTrimTrailingWhitespaceUndefined: Self = StObject.set(x, "trimTrailingWhitespace", js.undefined)
    }
  }
  
  type URIConverter = js.Function1[/* value */ Uri, String]
}

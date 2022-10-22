package typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod

import typingsJapgolly.vscode.mod.CallHierarchyProvider
import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.CodeAction
import typingsJapgolly.vscode.mod.CodeActionProvider
import typingsJapgolly.vscode.mod.CompletionItem
import typingsJapgolly.vscode.mod.CompletionItemProvider
import typingsJapgolly.vscode.mod.DeclarationProvider
import typingsJapgolly.vscode.mod.DefinitionProvider
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.DocumentColorProvider
import typingsJapgolly.vscode.mod.DocumentFormattingEditProvider
import typingsJapgolly.vscode.mod.DocumentHighlightProvider
import typingsJapgolly.vscode.mod.DocumentLink
import typingsJapgolly.vscode.mod.DocumentLinkProvider
import typingsJapgolly.vscode.mod.DocumentRangeFormattingEditProvider
import typingsJapgolly.vscode.mod.DocumentSymbolProvider
import typingsJapgolly.vscode.mod.FoldingRangeProvider
import typingsJapgolly.vscode.mod.HoverProvider
import typingsJapgolly.vscode.mod.ImplementationProvider
import typingsJapgolly.vscode.mod.LinkedEditingRangeProvider
import typingsJapgolly.vscode.mod.OnTypeFormattingEditProvider
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.ReferenceProvider
import typingsJapgolly.vscode.mod.RenameProvider
import typingsJapgolly.vscode.mod.SelectionRangeProvider
import typingsJapgolly.vscode.mod.SignatureHelpProvider
import typingsJapgolly.vscode.mod.SymbolInformation
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TextEdit
import typingsJapgolly.vscode.mod.TypeDefinitionProvider
import typingsJapgolly.vscode.mod.TypeHierarchyProvider
import typingsJapgolly.vscode.mod.WorkspaceSymbolProvider
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.GenericNotificationHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.GenericRequestHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler0
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler0
import typingsJapgolly.vscodeJsonrpc.libCommonMessagesMod.MessageSignature
import typingsJapgolly.vscodeLanguageclient.anon.DynamicFeatureFileOperati
import typingsJapgolly.vscodeLanguageclient.anon.DynamicFeatureFileOperatiDispose
import typingsJapgolly.vscodeLanguageclient.anon.DynamicFeatureFileOperatiFillClientCapabilities
import typingsJapgolly.vscodeLanguageclient.anon.DynamicFeatureFileOperatiFillInitializeParams
import typingsJapgolly.vscodeLanguageclient.anon.DynamicFeatureFileOperatiGetState
import typingsJapgolly.vscodeLanguageclient.anon.DynamicFeatureFileOperatiInitialize
import typingsJapgolly.vscodeLanguageclient.libCommonCodeConverterMod.Converter
import typingsJapgolly.vscodeLanguageclient.libCommonCodeLensMod.CodeLensProviderShape
import typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.DiagnosticProviderShape
import typingsJapgolly.vscodeLanguageclient.libCommonInlayHintMod.InlayHintsProviderShape
import typingsJapgolly.vscodeLanguageclient.libCommonInlineValueMod.InlineValueProviderShape
import typingsJapgolly.vscodeLanguageclient.libCommonNotebookMod.NotebookDocumentProviderShape
import typingsJapgolly.vscodeLanguageclient.libCommonSemanticTokensMod.SemanticTokensProviderShape
import typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidChangeTextDocumentFeatureShape
import typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidCloseTextDocumentFeatureShape
import typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidOpenTextDocumentFeatureShape
import typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidSaveTextDocumentFeatureShape
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.force
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.notebookDocumentSlashsync
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeAction
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcodeLens
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashcompletion
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdeclaration
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdiagnostic
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidChange
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidClose
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidOpen
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdidSave
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentColor
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentLink
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentSymbol
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashfoldingRange
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashhover
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashimplementation
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashinlayHint
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashinlineValue
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashlinkedEditingRange
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashonTypeFormatting
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareCallHierarchy
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareTypeHierarchy
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrename
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashselectionRange
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokens
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsignatureHelp
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashtypeDefinition
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSaveWaitUntil
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidCreateFiles
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidDeleteFiles
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidRenameFiles
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashsymbol
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillCreateFiles
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillDeleteFiles
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashwillRenameFiles
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotnotebookMod.NotebookDocumentSyncRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType0
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProgressType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType0
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolRequestType0
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureClient[M, CO] extends StObject {
  
  var clientOptions: CO = js.native
  
  var code2ProtocolConverter: Converter = js.native
  
  def error(message: String): Unit = js.native
  def error(message: String, data: Any): Unit = js.native
  def error(message: String, data: Any, showNotification: Boolean): Unit = js.native
  def error(message: String, data: Unit, showNotification: Boolean): Unit = js.native
  @JSName("error")
  def error_force(message: String, data: Any, showNotification: force): Unit = js.native
  @JSName("error")
  def error_force(message: String, data: Unit, showNotification: force): Unit = js.native
  
  @JSName("getFeature")
  def getFeature_notebookDocumentsync(request: notebookDocumentSlashsync): js.UndefOr[
    DynamicFeature[NotebookDocumentSyncRegistrationOptions] & NotebookDocumentProviderShape
  ] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcodeAction(request: textDocumentSlashcodeAction): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CodeActionProvider[CodeAction]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcodeLens(request: textDocumentSlashcodeLens): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CodeLensProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentcompletion(request: textDocumentSlashcompletion): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CompletionItemProvider[CompletionItem]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdeclaration(request: textDocumentSlashdeclaration): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DeclarationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdefinition(request: textDocumentSlashdefinition): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdiagnostic(request: textDocumentSlashdiagnostic): js.UndefOr[
    DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DiagnosticProviderShape]
  ] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidChange(request: textDocumentSlashdidChange): DidChangeTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidClose(request: textDocumentSlashdidClose): DidCloseTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidOpen(request: textDocumentSlashdidOpen): DidOpenTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdidSave(request: textDocumentSlashdidSave): DidSaveTextDocumentFeatureShape = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentColor(request: textDocumentSlashdocumentColor): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentColorProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentHighlight(request: textDocumentSlashdocumentHighlight): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentHighlightProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentLink(request: textDocumentSlashdocumentLink): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentLinkProvider[DocumentLink]] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentdocumentSymbol(request: textDocumentSlashdocumentSymbol): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentSymbolProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentfoldingRange(request: textDocumentSlashfoldingRange): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[FoldingRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentformatting(request: textDocumentSlashformatting): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenthover(request: textDocumentSlashhover): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[HoverProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentimplementation(request: textDocumentSlashimplementation): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[ImplementationProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentinlayHint(request: textDocumentSlashinlayHint): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[InlayHintsProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentinlineValue(request: textDocumentSlashinlineValue): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[InlineValueProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentlinkedEditingRange(request: textDocumentSlashlinkedEditingRange): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[LinkedEditingRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentonTypeFormatting(request: textDocumentSlashonTypeFormatting): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[OnTypeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentprepareCallHierarchy(request: textDocumentSlashprepareCallHierarchy): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[CallHierarchyProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentprepareTypeHierarchy(request: textDocumentSlashprepareTypeHierarchy): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[TypeHierarchyProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrangeFormatting(request: textDocumentSlashrangeFormatting): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[DocumentRangeFormattingEditProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentreferences(request: textDocumentSlashreferences): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[ReferenceProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentrename(request: textDocumentSlashrename): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[RenameProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentselectionRange(request: textDocumentSlashselectionRange): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[SelectionRangeProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentsemanticTokens(request: textDocumentSlashsemanticTokens): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[SemanticTokensProviderShape] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentsignatureHelp(request: textDocumentSlashsignatureHelp): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[SignatureHelpProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumenttypeDefinition(request: textDocumentSlashtypeDefinition): DynamicFeature[TextDocumentRegistrationOptions] & TextDocumentProviderFeature[TypeDefinitionProvider] = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSave(request: textDocumentSlashwillSave): DynamicFeature[TextDocumentRegistrationOptions] & (TextDocumentSendFeature[js.Function1[/* textDocument */ TextDocument, js.Promise[Unit]]]) = js.native
  @JSName("getFeature")
  def getFeature_textDocumentwillSaveWaitUntil(request: textDocumentSlashwillSaveWaitUntil): DynamicFeature[TextDocumentRegistrationOptions] & (TextDocumentSendFeature[
    js.Function1[/* textDocument */ TextDocument, ProviderResult[js.Array[TextEdit]]]
  ]) = js.native
  @JSName("getFeature")
  def getFeature_workspacedidCreateFiles(request: workspaceSlashdidCreateFiles): DynamicFeatureFileOperati = js.native
  @JSName("getFeature")
  def getFeature_workspacedidDeleteFiles(request: workspaceSlashdidDeleteFiles): DynamicFeatureFileOperatiFillClientCapabilities = js.native
  @JSName("getFeature")
  def getFeature_workspacedidRenameFiles(request: workspaceSlashdidRenameFiles): DynamicFeatureFileOperatiDispose = js.native
  @JSName("getFeature")
  def getFeature_workspacesymbol(request: workspaceSlashsymbol): DynamicFeature[TextDocumentRegistrationOptions] & WorkspaceProviderFeature[WorkspaceSymbolProvider[SymbolInformation]] = js.native
  @JSName("getFeature")
  def getFeature_workspacewillCreateFiles(request: workspaceSlashwillCreateFiles): DynamicFeatureFileOperatiFillInitializeParams = js.native
  @JSName("getFeature")
  def getFeature_workspacewillDeleteFiles(request: workspaceSlashwillDeleteFiles): DynamicFeatureFileOperatiInitialize = js.native
  @JSName("getFeature")
  def getFeature_workspacewillRenameFiles(request: workspaceSlashwillRenameFiles): DynamicFeatureFileOperatiGetState = js.native
  
  def handleFailedRequest[T](`type`: MessageSignature, token: Unit, error: Any, defaultValue: T): T = js.native
  def handleFailedRequest[T](`type`: MessageSignature, token: Unit, error: Any, defaultValue: T, showNotification: Boolean): T = js.native
  def handleFailedRequest[T](`type`: MessageSignature, token: CancellationToken, error: Any, defaultValue: T): T = js.native
  def handleFailedRequest[T](
    `type`: MessageSignature,
    token: CancellationToken,
    error: Any,
    defaultValue: T,
    showNotification: Boolean
  ): T = js.native
  
  def hasDedicatedTextSynchronizationFeature(textDocument: TextDocument): Boolean = js.native
  
  def info(message: String): Unit = js.native
  def info(message: String, data: Any): Unit = js.native
  def info(message: String, data: Any, showNotification: Boolean): Unit = js.native
  def info(message: String, data: Unit, showNotification: Boolean): Unit = js.native
  
  def isRunning(): Boolean = js.native
  
  var middleware: M = js.native
  
  def onNotification(method: String, handler: GenericNotificationHandler): Disposable = js.native
  def onNotification(`type`: NotificationType0, handler: NotificationHandler0): Disposable = js.native
  def onNotification[P](`type`: NotificationType[P], handler: NotificationHandler[P]): Disposable = js.native
  def onNotification[RO](`type`: ProtocolNotificationType0[RO], handler: NotificationHandler0): Disposable = js.native
  def onNotification[P, RO](`type`: ProtocolNotificationType[P, RO], handler: NotificationHandler[P]): Disposable = js.native
  
  def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
  def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
  
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Disposable = js.native
  def onRequest[R, E](`type`: RequestType0[R, E], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[P, R, E](`type`: RequestType[P, R, E], handler: RequestHandler[P, R, E]): Disposable = js.native
  def onRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], handler: RequestHandler[P, R, E]): Disposable = js.native
  
  var protocol2CodeConverter: typingsJapgolly.vscodeLanguageclient.libCommonProtocolConverterMod.Converter = js.native
  
  def sendNotification(method: String): js.Promise[Unit] = js.native
  def sendNotification(method: String, params: Any): js.Promise[Unit] = js.native
  def sendNotification(`type`: NotificationType0): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P]): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P], params: P): js.Promise[Unit] = js.native
  def sendNotification[RO](`type`: ProtocolNotificationType0[RO]): js.Promise[Unit] = js.native
  def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO]): js.Promise[Unit] = js.native
  def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO], params: P): js.Promise[Unit] = js.native
  
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, param: Any, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E]): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P, token: CancellationToken): js.Promise[R] = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  def stop(): js.Promise[Unit] = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, data: Any): Unit = js.native
  def warn(message: String, data: Any, showNotification: Boolean): Unit = js.native
  def warn(message: String, data: Unit, showNotification: Boolean): Unit = js.native
}

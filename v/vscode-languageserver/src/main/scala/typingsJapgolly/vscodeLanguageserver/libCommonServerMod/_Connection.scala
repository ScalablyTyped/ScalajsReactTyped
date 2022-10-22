package typingsJapgolly.vscodeLanguageserver.libCommonServerMod

import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.GenericNotificationHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.GenericRequestHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler0
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler0
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.StarNotificationHandler
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.StarRequestHandler
import typingsJapgolly.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typingsJapgolly.vscodeLanguageserver.anon.Placeholder
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.ColorPresentationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotcolorProviderMod.DocumentColorParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeConfigurationParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidCloseTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidOpenTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFormattingParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentLinkParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentOnTypeFormattingParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ExecuteCommandParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.HoverParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeError
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeResult
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializedParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PrepareRenameParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.PublishDiagnosticsParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ReferenceParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkspaceSymbolParams
import typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType0
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProgressType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType0
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolRequestType0
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType0
import typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
import typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation
import typingsJapgolly.vscodeLanguageserverTypes.mod.Command
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList
import typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Definition
import typingsJapgolly.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentSymbol
import typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange
import typingsJapgolly.vscodeLanguageserverTypes.mod.Hover
import typingsJapgolly.vscodeLanguageserverTypes.mod.Location
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import typingsJapgolly.vscodeLanguageserverTypes.mod.SelectionRange
import typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureHelp
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation
import typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace, PLanguages, PNotebooks] extends StObject {
  
  /**
    * A property to provide access to client specific features like registering
    * for requests or notifications.
    */
  var client: RemoteClient & PClient = js.native
  
  /**
    * A property to provide access to console specific features.
    */
  var console: RemoteConsole & PConsole = js.native
  
  /**
    * Disposes the connection
    */
  def dispose(): Unit = js.native
  
  /**
    * A property to provide access to language specific features.
    */
  var languages: Languages & PLanguages = js.native
  
  /**
    * Start listening on the input stream for messages to process.
    */
  def listen(): Unit = js.native
  
  /**
    * A property to provide access to notebook specific features.
    */
  var notebooks: Notebooks & PNotebooks = js.native
  
  /**
    * Installs a handler for the `CodeAction` request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeAction(
    handler: ServerRequestHandler[
      CodeActionParams, 
      js.UndefOr[(js.Array[Command | CodeAction]) | Null], 
      js.Array[Command | CodeAction], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `CodeAction` resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeActionResolve(handler: RequestHandler[CodeAction, CodeAction, Unit]): Disposable = js.native
  
  /**
    * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
    * computing the commands is expensive implementers should only return code lens objects with the
    * range set and handle the resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLens(
    handler: ServerRequestHandler[CodeLensParams, js.UndefOr[js.Array[CodeLens] | Null], js.Array[CodeLens], Unit]
  ): Disposable = js.native
  
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * the onCodeLens has been called.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLensResolve(handler: RequestHandler[CodeLens, CodeLens, Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onColorPresentation(
    handler: ServerRequestHandler[
      ColorPresentationParams, 
      js.UndefOr[js.Array[ColorPresentation] | Null], 
      js.Array[ColorPresentation], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `Completion` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletion(
    handler: ServerRequestHandler[
      CompletionParams, 
      js.UndefOr[js.Array[CompletionItem] | CompletionList | Null], 
      js.Array[CompletionItem], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `CompletionResolve` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletionResolve(handler: RequestHandler[CompletionItem, CompletionItem, Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the `Declaration` request.
    *
    * @param handler The corresponding handler.
    */
  def onDeclaration(
    handler: ServerRequestHandler[
      DeclarationParams, 
      js.UndefOr[Declaration | js.Array[DeclarationLink] | Null], 
      js.Array[DeclarationLink | Location], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onDefinition(
    handler: ServerRequestHandler[
      DefinitionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | Location], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `DidChangeConfiguration` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeConfiguration(handler: NotificationHandler[DidChangeConfigurationParams]): Disposable = js.native
  
  /**
    * Installs a handler for the `DidChangeTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeTextDocument(handler: NotificationHandler[DidChangeTextDocumentParams]): Disposable = js.native
  
  /**
    * Installs a handler for the `DidChangeWatchedFiles` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeWatchedFiles(handler: NotificationHandler[DidChangeWatchedFilesParams]): Disposable = js.native
  
  /**
    * Installs a handler for the `DidCloseTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidCloseTextDocument(handler: NotificationHandler[DidCloseTextDocumentParams]): Disposable = js.native
  
  /**
    * Installs a handler for the `DidOpenTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidOpenTextDocument(handler: NotificationHandler[DidOpenTextDocumentParams]): Disposable = js.native
  
  /**
    * Installs a handler for the `DidSaveTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidSaveTextDocument(handler: NotificationHandler[DidSaveTextDocumentParams]): Disposable = js.native
  
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentColor(
    handler: ServerRequestHandler[
      DocumentColorParams, 
      js.UndefOr[js.Array[ColorInformation] | Null], 
      js.Array[ColorInformation], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the document formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentFormatting(
    handler: ServerRequestHandler[DocumentFormattingParams, js.UndefOr[js.Array[TextEdit] | Null], scala.Nothing, Unit]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `DocumentHighlight` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentHighlight(
    handler: ServerRequestHandler[
      DocumentHighlightParams, 
      js.UndefOr[js.Array[DocumentHighlight] | Null], 
      js.Array[DocumentHighlight], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the document links resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinkResolve(handler: RequestHandler[DocumentLink, js.UndefOr[DocumentLink | Null], Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the document links request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinks(
    handler: ServerRequestHandler[
      DocumentLinkParams, 
      js.UndefOr[js.Array[DocumentLink] | Null], 
      js.Array[DocumentLink], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the document on type formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentOnTypeFormatting(
    handler: RequestHandler[DocumentOnTypeFormattingParams, js.UndefOr[js.Array[TextEdit] | Null], Unit]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the document range formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentRangeFormatting(
    handler: ServerRequestHandler[
      DocumentRangeFormattingParams, 
      js.UndefOr[js.Array[TextEdit] | Null], 
      scala.Nothing, 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `DocumentSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentSymbol(
    handler: ServerRequestHandler[
      DocumentSymbolParams, 
      js.UndefOr[(js.Array[DocumentSymbol | SymbolInformation]) | Null], 
      js.Array[DocumentSymbol | SymbolInformation], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the execute command request.
    *
    * @param handler The corresponding handler.
    */
  def onExecuteCommand(handler: ServerRequestHandler[ExecuteCommandParams, js.UndefOr[Any | Null], scala.Nothing, Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the exit notification.
    *
    * @param handler The exit handler.
    */
  def onExit(handler: NotificationHandler0): Disposable = js.native
  
  /**
    * Installs a handler for the folding ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onFoldingRanges(
    handler: ServerRequestHandler[
      FoldingRangeParams, 
      js.UndefOr[js.Array[FoldingRange] | Null], 
      js.Array[FoldingRange], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `Hover` request.
    *
    * @param handler The corresponding handler.
    */
  def onHover(handler: ServerRequestHandler[HoverParams, js.UndefOr[Hover | Null], scala.Nothing, Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the `Implementation` request.
    *
    * @param handler The corresponding handler.
    */
  def onImplementation(
    handler: ServerRequestHandler[
      ImplementationParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | Location], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the initialize request.
    *
    * @param handler The initialize handler.
    */
  def onInitialize(
    handler: ServerRequestHandler[InitializeParams, InitializeResult[Any], scala.Nothing, InitializeError]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the initialized notification.
    *
    * @param handler The initialized handler.
    */
  def onInitialized(handler: NotificationHandler[InitializedParams]): Disposable = js.native
  
  /**
    * Installs a notification handler that is invoked if no specific notification handler can be found.
    *
    * @param handler a handler that handles all notifications.
    */
  def onNotification(handler: StarNotificationHandler): Disposable = js.native
  /**
    * Installs a notification handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onNotification(method: String, handler: GenericNotificationHandler): Disposable = js.native
  def onNotification(`type`: NotificationType0, handler: NotificationHandler0): Disposable = js.native
  def onNotification[P](`type`: NotificationType[P], handler: NotificationHandler[P]): Disposable = js.native
  /**
    * Installs a notification handler described by the given [NotificationType](#NotificationType).
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param handler The handler to install.
    */
  def onNotification[RO](`type`: ProtocolNotificationType0[RO], handler: NotificationHandler0): Disposable = js.native
  def onNotification[P, RO](`type`: ProtocolNotificationType[P, RO], handler: NotificationHandler[P]): Disposable = js.native
  
  /**
    * Installs a handler for the prepare rename request.
    *
    * @param handler The corresponding handler.
    */
  def onPrepareRename(handler: RequestHandler[PrepareRenameParams, js.UndefOr[Range | Placeholder | Null], Unit]): Disposable = js.native
  
  /**
    * Installs a progress handler for a given token.
    * @param type the progress type
    * @param token the token
    * @param handler the handler
    */
  def onProgress[P](`type`: ProgressType[P], token: String, handler: NotificationHandler[P]): Disposable = js.native
  def onProgress[P](`type`: ProgressType[P], token: Double, handler: NotificationHandler[P]): Disposable = js.native
  
  /**
    * Installs a handler for the `References` request.
    *
    * @param handler The corresponding handler.
    */
  def onReferences(
    handler: ServerRequestHandler[ReferenceParams, js.UndefOr[js.Array[Location] | Null], js.Array[Location], Unit]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the rename request.
    *
    * @param handler The corresponding handler.
    */
  def onRenameRequest(handler: ServerRequestHandler[RenameParams, js.UndefOr[WorkspaceEdit | Null], scala.Nothing, Unit]): Disposable = js.native
  
  /**
    * Installs a request handler that is invoked if no specific request handler can be found.
    *
    * @param handler a handler that handles all requests.
    */
  def onRequest(handler: StarRequestHandler): Disposable = js.native
  /**
    * Installs a request handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Disposable = js.native
  def onRequest[P, R, E](`type`: RequestType[P, R, E], handler: RequestHandler[P, R, E]): Disposable = js.native
  /**
    * Installs a request handler described by the given [RequestType](#RequestType).
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param handler The handler to install
    */
  def onRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[R, PR, E, RO](`type`: RequestType0[R, E], handler: RequestHandler0[R, E]): Disposable = js.native
  def onRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], handler: RequestHandler[P, R, E]): Disposable = js.native
  
  /**
    * Installs a handler for the selection ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onSelectionRanges(
    handler: ServerRequestHandler[
      SelectionRangeParams, 
      js.UndefOr[js.Array[SelectionRange] | Null], 
      js.Array[SelectionRange], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the shutdown request.
    *
    * @param handler The initialize handler.
    */
  def onShutdown(handler: RequestHandler0[Unit, Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the `SignatureHelp` request.
    *
    * @param handler The corresponding handler.
    */
  def onSignatureHelp(
    handler: ServerRequestHandler[SignatureHelpParams, js.UndefOr[SignatureHelp | Null], scala.Nothing, Unit]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `Type Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onTypeDefinition(
    handler: ServerRequestHandler[
      TypeDefinitionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      js.Array[DefinitionLink | Location], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `WillSaveTextDocument` notification.
    *
    * Note that this notification is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSave` capability or you've
    * dynamically registered for the `textDocument/willSave` method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocument(handler: NotificationHandler[WillSaveTextDocumentParams]): Disposable = js.native
  
  /**
    * Installs a handler for the `WillSaveTextDocumentWaitUntil` request.
    *
    * Note that this request is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSaveWaitUntil` capability,
    * or you've dynamically registered for the `textDocument/willSaveWaitUntil`
    * method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocumentWaitUntil(handler: RequestHandler[WillSaveTextDocumentParams, js.UndefOr[js.Array[TextEdit] | Null], Unit]): Disposable = js.native
  
  /**
    * Installs a handler for the `WorkspaceSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspaceSymbol(
    handler: ServerRequestHandler[
      WorkspaceSymbolParams, 
      js.UndefOr[(js.Array[SymbolInformation | WorkspaceSymbol]) | Null], 
      js.Array[SymbolInformation], 
      Unit
    ]
  ): Disposable = js.native
  
  /**
    * Installs a handler for the `WorkspaceSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspaceSymbolResolve(handler: ServerRequestHandler[WorkspaceSymbol, WorkspaceSymbol, scala.Nothing, Unit]): Disposable = js.native
  
  /**
    * Sends diagnostics computed for a given document to VSCode to render them in the
    * user interface.
    *
    * @param params The diagnostic parameters.
    */
  def sendDiagnostics(params: PublishDiagnosticsParams): js.Promise[Unit] = js.native
  
  /**
    * Send a notification to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The notification's parameters.
    */
  def sendNotification(method: String): js.Promise[Unit] = js.native
  def sendNotification(method: String, params: Any): js.Promise[Unit] = js.native
  def sendNotification(`type`: NotificationType0): js.Promise[Unit] = js.native
  def sendNotification[P](`type`: NotificationType[P], params: P): js.Promise[Unit] = js.native
  /**
    * Send a notification to the client.
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param params The notification's parameters.
    */
  def sendNotification[RO](`type`: ProtocolNotificationType0[RO]): js.Promise[Unit] = js.native
  def sendNotification[P, RO](`type`: ProtocolNotificationType[P, RO], params: P): js.Promise[Unit] = js.native
  
  /**
    * Sends progress.
    * @param type the progress type
    * @param token the token to use
    * @param value the progress value
    */
  def sendProgress[P](`type`: ProgressType[P], token: String, value: P): js.Promise[Unit] = js.native
  def sendProgress[P](`type`: ProgressType[P], token: Double, value: P): js.Promise[Unit] = js.native
  
  /**
    * Send a request to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The request's parameters.
    */
  def sendRequest[R](method: String): js.Promise[R] = js.native
  def sendRequest[R](method: String, params: Any): js.Promise[R] = js.native
  def sendRequest[R](method: String, params: Any, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R](method: String, token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E]): js.Promise[R] = js.native
  def sendRequest[R, E](`type`: RequestType0[R, E], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, E](`type`: RequestType[P, R, E], params: P, token: CancellationToken): js.Promise[R] = js.native
  /**
    * Send a request to the client.
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param params The request's parameters.
    */
  def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO]): js.Promise[R] = js.native
  def sendRequest[R, PR, E, RO](`type`: ProtocolRequestType0[R, PR, E, RO], token: CancellationToken): js.Promise[R] = js.native
  def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P): js.Promise[R] = js.native
  def sendRequest[P, R, PR, E, RO](`type`: ProtocolRequestType[P, R, PR, E, RO], params: P, token: CancellationToken): js.Promise[R] = js.native
  
  /**
    * A property to provide access to telemetry specific features.
    */
  var telemetry: Telemetry & PTelemetry = js.native
  
  /**
    * A property to provide access to tracer specific features.
    */
  var tracer: RemoteTracer & PTracer = js.native
  
  /**
    * A property to provide access to windows specific features.
    */
  var window: RemoteWindow & PWindow = js.native
  
  /**
    * A property to provide access to workspace specific features.
    */
  var workspace: RemoteWorkspace & PWorkspace = js.native
}

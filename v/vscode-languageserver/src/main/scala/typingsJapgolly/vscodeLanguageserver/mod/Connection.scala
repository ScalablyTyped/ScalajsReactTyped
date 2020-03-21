package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeJsonrpc.mod.GenericNotificationHandler
import typingsJapgolly.vscodeJsonrpc.mod.GenericRequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.NotificationHandler
import typingsJapgolly.vscodeJsonrpc.mod.NotificationHandler0
import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler0
import typingsJapgolly.vscodeJsonrpc.mod.StarNotificationHandler
import typingsJapgolly.vscodeJsonrpc.mod.StarRequestHandler
import typingsJapgolly.vscodeLanguageserver.AnonPlaceholder
import typingsJapgolly.vscodeLanguageserver.Thenable
import typingsJapgolly.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidChangeConfigurationParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidChangeWatchedFilesParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializedParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.PublishDiagnosticsParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Definition
import typingsJapgolly.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] extends js.Object {
  /**
    * A proxy interface for the language client interface to register for requests or
    * notifications.
    */
  var client: RemoteClient with PClient = js.native
  /**
    * A proxy for VSCode's development console. See [RemoteConsole](#RemoteConsole)
    */
  var console: RemoteConsole with PConsole = js.native
  /**
    * A proxy to send telemetry events to the client.
    */
  var telemetry: Telemetry with PTelemetry = js.native
  /**
    * A proxy to send trace events to the client.
    */
  var tracer: typingsJapgolly.vscodeJsonrpc.mod.Tracer with PTracer = js.native
  /**
    * A proxy for VSCode's window. See [RemoteWindow](#RemoteWindow)
    */
  var window: RemoteWindow with PWindow = js.native
  /**
    * A proxy to talk to the client's workspace.
    */
  var workspace: RemoteWorkspace with PWorkspace = js.native
  /**
    * Disposes the connection
    */
  def dispose(): Unit = js.native
  /**
    * Start listening on the input stream for messages to process.
    */
  def listen(): Unit = js.native
  /**
    * Installs a handler for the `CodeAction` request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeAction(
    handler: RequestHandler[
      CodeActionParams, 
      js.UndefOr[
        (js.Array[
          typingsJapgolly.vscodeLanguageserverTypes.mod.Command | typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Compute a list of [lenses](#CodeLens). This call should return as fast as possible and if
    * computing the commands is expensive implementers should only return code lens objects with the
    * range set and handle the resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLens(
    handler: RequestHandler[
      CodeLensParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * This function will be called for each visible code lens, usually when scrolling and after
    * the onCodeLens has been called.
    *
    * @param handler The corresponding handler.
    */
  def onCodeLensResolve(
    handler: RequestHandler[
      typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens, 
      typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onColorPresentation(
    handler: RequestHandler[
      ColorPresentationParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Completion` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletion(
    handler: RequestHandler[
      CompletionParams, 
      js.UndefOr[
        js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem] | typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `CompletionResolve` request.
    *
    * @param handler The corresponding handler.
    */
  def onCompletionResolve(
    handler: RequestHandler[
      typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem, 
      typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem, 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Declaration` request.
    *
    * @param handler The corresponding handler.
    */
  def onDeclaration(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[Declaration | js.Array[DeclarationLink] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onDefinition(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[Definition | js.Array[DefinitionLink] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `DidChangeConfiguration` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeConfiguration(handler: NotificationHandler[DidChangeConfigurationParams]): Unit = js.native
  /**
    * Installs a handler for the `DidChangeTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeTextDocument(handler: NotificationHandler[DidChangeTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `DidChangeWatchedFiles` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidChangeWatchedFiles(handler: NotificationHandler[DidChangeWatchedFilesParams]): Unit = js.native
  /**
    * Installs a handler for the `DidCloseTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidCloseTextDocument(handler: NotificationHandler[DidCloseTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `DidOpenTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidOpenTextDocument(handler: NotificationHandler[DidOpenTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the `DidSaveTextDocument` notification.
    *
    * @param handler The corresponding handler.
    */
  def onDidSaveTextDocument(handler: NotificationHandler[DidSaveTextDocumentParams]): Unit = js.native
  /**
    * Installs a handler for the document color request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentColor(
    handler: RequestHandler[
      DocumentColorParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentFormatting(
    handler: RequestHandler[
      DocumentFormattingParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `DocumentHighlight` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentHighlight(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document links resolve request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinkResolve(
    handler: RequestHandler[
      typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink, 
      js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document links request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentLinks(
    handler: RequestHandler[
      DocumentLinkParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document on type formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentOnTypeFormatting(
    handler: RequestHandler[
      DocumentOnTypeFormattingParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the document range formatting request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentRangeFormatting(
    handler: RequestHandler[
      DocumentRangeFormattingParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `DocumentSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onDocumentSymbol(
    handler: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentSymbolParams */ _, 
      js.UndefOr[
        (js.Array[
          typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation
        ]) | Null
      ], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the execute command request.
    *
    * @param handler The corresponding handler.
    */
  def onExecuteCommand(handler: RequestHandler[ExecuteCommandParams, js.UndefOr[_ | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the exit notification.
    *
    * @param handler The exit handler.
    */
  def onExit(handler: NotificationHandler0): Unit = js.native
  /**
    * Installs a handler for the folding ranges request.
    *
    * @param handler The corresponding handler.
    */
  def onFoldingRanges(
    handler: RequestHandler[
      FoldingRangeParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.FoldingRange] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Hover` request.
    *
    * @param handler The corresponding handler.
    */
  def onHover(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.Hover | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `Implementation` request.
    *
    * @param handler The corresponding handler.
    */
  def onImplementation(handler: RequestHandler[TextDocumentPositionParams, js.UndefOr[Definition | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the initialize request.
    *
    * @param handler The initialize handler.
    */
  def onInitialize(
    handler: RequestHandler[
      InitializeParams, 
      InitializeResult, 
      typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeError
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the initialized notification.
    *
    * @param handler The initialized handler.
    */
  def onInitialized(handler: NotificationHandler[InitializedParams]): Unit = js.native
  /**
    * Installs a notification handler that is invoked if no specific notification handler can be found.
    *
    * @param handler a handler that handles all notifications.
    */
  def onNotification(handler: StarNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onNotification(method: String, handler: GenericNotificationHandler): Unit = js.native
  /**
    * Installs a notification handler described by the given [NotificationType](#NotificationType).
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param handler The handler to install.
    */
  def onNotification[RO](
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType0[RO],
    handler: NotificationHandler0
  ): Unit = js.native
  def onNotification[P, RO](
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType[P, RO],
    handler: NotificationHandler[P]
  ): Unit = js.native
  /**
    * Installs a handler for the prepare rename request.
    *
    * @param handler The corresponding handler.
    */
  def onPrepareRename(
    handler: RequestHandler[
      TextDocumentPositionParams, 
      js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.Range | AnonPlaceholder | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `References` request.
    *
    * @param handler The corresponding handler.
    */
  def onReferences(
    handler: RequestHandler[
      ReferenceParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Location] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the rename request.
    *
    * @param handler The corresponding handler.
    */
  def onRenameRequest(
    handler: RequestHandler[
      RenameParams, 
      js.UndefOr[typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a request handler that is invoked if no specific request handler can be found.
    *
    * @param handler a handler that handles all requests.
    */
  def onRequest(handler: StarRequestHandler): Unit = js.native
  /**
    * Installs a request handler for the given method.
    *
    * @param method The method to register a request handler for.
    * @param handler The handler to install.
    */
  def onRequest[R, E](method: String, handler: GenericRequestHandler[R, E]): Unit = js.native
  /**
    * Installs a request handler described by the given [RequestType](#RequestType).
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param handler The handler to install
    */
  def onRequest[R, E, RO](
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    handler: RequestHandler0[R, E]
  ): Unit = js.native
  def onRequest[P, R, E, RO](
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    handler: RequestHandler[P, R, E]
  ): Unit = js.native
  /**
    * Installs a handler for the shutdown request.
    *
    * @param handler The initialize handler.
    */
  def onShutdown(handler: RequestHandler0[Unit, Unit]): Unit = js.native
  /**
    * Installs a handler for the `SignatureHelp` request.
    *
    * @param handler The corresponding handler.
    */
  def onSignatureHelp(handler: RequestHandler[TextDocumentPositionParams, js.UndefOr[SignatureHelp | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the `Type Definition` request.
    *
    * @param handler The corresponding handler.
    */
  def onTypeDefinition(handler: RequestHandler[TextDocumentPositionParams, js.UndefOr[Definition | Null], Unit]): Unit = js.native
  /**
    * Installs a handler for the `WillSaveTextDocument` notification.
    *
    * Note that this notification is opt-in. The client will not send it unless
    * your server has the `textDocumentSync.willSave` capability or you've
    * dynamically registered for the `textDocument/willSave` method.
    *
    * @param handler The corresponding handler.
    */
  def onWillSaveTextDocument(handler: NotificationHandler[WillSaveTextDocumentParams]): Unit = js.native
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
  def onWillSaveTextDocumentWaitUntil(
    handler: RequestHandler[
      WillSaveTextDocumentParams, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Installs a handler for the `WorkspaceSymbol` request.
    *
    * @param handler The corresponding handler.
    */
  def onWorkspaceSymbol(
    handler: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceSymbolParams */ _, 
      js.UndefOr[js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolInformation] | Null], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Sends diagnostics computed for a given document to VSCode to render them in the
    * user interface.
    *
    * @param params The diagnostic parameters.
    */
  def sendDiagnostics(params: PublishDiagnosticsParams): Unit = js.native
  /**
    * Send a notification to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The notification's parameters.
    */
  def sendNotification(method: String): Unit = js.native
  def sendNotification(method: String, params: js.Any): Unit = js.native
  /**
    * Send a notification to the client.
    *
    * @param type The [NotificationType](#NotificationType) describing the notification.
    * @param params The notification's parameters.
    */
  def sendNotification[RO](`type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType0[RO]): Unit = js.native
  def sendNotification[P, RO](`type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.NotificationType[P, RO], params: P): Unit = js.native
  /**
    * Send a request to the client.
    *
    * @param method The method to invoke on the client.
    * @param params The request's parameters.
    */
  def sendRequest[R](method: String): Thenable[R] = js.native
  def sendRequest[R](method: String, params: js.Any): Thenable[R] = js.native
  def sendRequest[R](
    method: String,
    params: js.Any,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[R](method: String, token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken): Thenable[R] = js.native
  /**
    * Send a request to the client.
    *
    * @param type The [RequestType](#RequestType) describing the request.
    * @param params The request's parameters.
    */
  def sendRequest[R, E, RO](`type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO]): Thenable[R] = js.native
  def sendRequest[R, E, RO](
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType0[R, E, RO],
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](`type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO], params: P): Thenable[R] = js.native
  def sendRequest[P, R, E, RO](
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.RequestType[P, R, E, RO],
    params: P,
    token: typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
  ): Thenable[R] = js.native
}


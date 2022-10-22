package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.anon.Increment
import typingsJapgolly.vscode.anon.PreserveFocus
import typingsJapgolly.vscode.anon.QuickPickOptionscanPickMa
import typingsJapgolly.vscode.anon.SupportsMultipleEditorsPerDocument
import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.ColorTheme
import typingsJapgolly.vscode.mod.CustomDocument
import typingsJapgolly.vscode.mod.CustomEditorProvider
import typingsJapgolly.vscode.mod.CustomReadonlyEditorProvider
import typingsJapgolly.vscode.mod.CustomTextEditorProvider
import typingsJapgolly.vscode.mod.DecorationRenderOptions
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.ExtensionTerminalOptions
import typingsJapgolly.vscode.mod.FileDecorationProvider
import typingsJapgolly.vscode.mod.InputBox
import typingsJapgolly.vscode.mod.InputBoxOptions
import typingsJapgolly.vscode.mod.MessageOptions
import typingsJapgolly.vscode.mod.NotebookDocument
import typingsJapgolly.vscode.mod.NotebookDocumentShowOptions
import typingsJapgolly.vscode.mod.NotebookEditor
import typingsJapgolly.vscode.mod.NotebookEditorSelectionChangeEvent
import typingsJapgolly.vscode.mod.NotebookEditorVisibleRangesChangeEvent
import typingsJapgolly.vscode.mod.OpenDialogOptions
import typingsJapgolly.vscode.mod.OutputChannel
import typingsJapgolly.vscode.mod.Progress
import typingsJapgolly.vscode.mod.ProgressOptions
import typingsJapgolly.vscode.mod.QuickPick
import typingsJapgolly.vscode.mod.QuickPickItem
import typingsJapgolly.vscode.mod.QuickPickOptions
import typingsJapgolly.vscode.mod.SaveDialogOptions
import typingsJapgolly.vscode.mod.StatusBarItem
import typingsJapgolly.vscode.mod.TabGroups
import typingsJapgolly.vscode.mod.Terminal
import typingsJapgolly.vscode.mod.TerminalLinkProvider
import typingsJapgolly.vscode.mod.TerminalOptions
import typingsJapgolly.vscode.mod.TerminalProfileProvider
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TextDocumentShowOptions
import typingsJapgolly.vscode.mod.TextEditor
import typingsJapgolly.vscode.mod.TextEditorDecorationType
import typingsJapgolly.vscode.mod.TextEditorOptionsChangeEvent
import typingsJapgolly.vscode.mod.TextEditorSelectionChangeEvent
import typingsJapgolly.vscode.mod.TextEditorViewColumnChangeEvent
import typingsJapgolly.vscode.mod.TextEditorVisibleRangesChangeEvent
import typingsJapgolly.vscode.mod.TreeDataProvider
import typingsJapgolly.vscode.mod.TreeView
import typingsJapgolly.vscode.mod.TreeViewOptions
import typingsJapgolly.vscode.mod.UriHandler
import typingsJapgolly.vscode.mod.WebviewOptions
import typingsJapgolly.vscode.mod.WebviewPanel
import typingsJapgolly.vscode.mod.WebviewPanelOptions
import typingsJapgolly.vscode.mod.WebviewPanelSerializer
import typingsJapgolly.vscode.mod.WebviewViewProvider
import typingsJapgolly.vscode.mod.WindowState
import typingsJapgolly.vscode.mod.WorkspaceFolder
import typingsJapgolly.vscode.mod.WorkspaceFolderPickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object window {
  
  @JSGlobal("vscode.window")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("vscode.window.activeColorTheme")
  @js.native
  def activeColorTheme: ColorTheme = js.native
  inline def activeColorTheme_=(x: ColorTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeColorTheme")(x.asInstanceOf[js.Any])
  
  @JSGlobal("vscode.window.activeNotebookEditor")
  @js.native
  val activeNotebookEditor: js.UndefOr[NotebookEditor] = js.native
  
  @JSGlobal("vscode.window.activeTerminal")
  @js.native
  val activeTerminal: js.UndefOr[Terminal] = js.native
  
  @JSGlobal("vscode.window.activeTextEditor")
  @js.native
  def activeTextEditor: js.UndefOr[TextEditor] = js.native
  inline def activeTextEditor_=(x: js.UndefOr[TextEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeTextEditor")(x.asInstanceOf[js.Any])
  
  inline def createInputBox(): InputBox = ^.asInstanceOf[js.Dynamic].applyDynamic("createInputBox")().asInstanceOf[InputBox]
  
  inline def createOutputChannel(name: String): OutputChannel = ^.asInstanceOf[js.Dynamic].applyDynamic("createOutputChannel")(name.asInstanceOf[js.Any]).asInstanceOf[OutputChannel]
  inline def createOutputChannel(name: String, languageId: String): OutputChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("createOutputChannel")(name.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[OutputChannel]
  
  inline def createQuickPick[T /* <: QuickPickItem */](): QuickPick[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQuickPick")().asInstanceOf[QuickPick[T]]
  
  inline def createStatusBarItem(): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")().asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(alignment: Unit, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(alignment: typingsJapgolly.vscode.mod.StatusBarAlignment): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any]).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(alignment: typingsJapgolly.vscode.mod.StatusBarAlignment, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String): StatusBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any]).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String, alignment: Unit, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String, alignment: typingsJapgolly.vscode.mod.StatusBarAlignment): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  inline def createStatusBarItem(id: String, alignment: typingsJapgolly.vscode.mod.StatusBarAlignment, priority: Double): StatusBarItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createStatusBarItem")(id.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[StatusBarItem]
  
  inline def createTerminal(): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")().asInstanceOf[Terminal]
  inline def createTerminal(name: String): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: String, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: String, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: Unit, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: String, shellPath: Unit, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: String, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: String, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: Unit, shellArgs: String): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(name: Unit, shellPath: Unit, shellArgs: js.Array[String]): Terminal = (^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(name.asInstanceOf[js.Any], shellPath.asInstanceOf[js.Any], shellArgs.asInstanceOf[js.Any])).asInstanceOf[Terminal]
  inline def createTerminal(options: ExtensionTerminalOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(options.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  inline def createTerminal(options: TerminalOptions): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("createTerminal")(options.asInstanceOf[js.Any]).asInstanceOf[Terminal]
  
  inline def createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextEditorDecorationType")(options.asInstanceOf[js.Any]).asInstanceOf[TextEditorDecorationType]
  
  inline def createTreeView[T](viewId: String, options: TreeViewOptions[T]): TreeView[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTreeView")(viewId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TreeView[T]]
  
  inline def createWebviewPanel(viewType: String, title: String, showOptions: PreserveFocus): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  inline def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: PreserveFocus,
    options: WebviewPanelOptions & WebviewOptions
  ): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  inline def createWebviewPanel(viewType: String, title: String, showOptions: typingsJapgolly.vscode.mod.ViewColumn): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  inline def createWebviewPanel(
    viewType: String,
    title: String,
    showOptions: typingsJapgolly.vscode.mod.ViewColumn,
    options: WebviewPanelOptions & WebviewOptions
  ): WebviewPanel = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebviewPanel")(viewType.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebviewPanel]
  
  @JSGlobal("vscode.window.onDidChangeActiveColorTheme")
  @js.native
  val onDidChangeActiveColorTheme: Event[ColorTheme] = js.native
  
  @JSGlobal("vscode.window.onDidChangeActiveNotebookEditor")
  @js.native
  val onDidChangeActiveNotebookEditor: Event[js.UndefOr[NotebookEditor]] = js.native
  
  @JSGlobal("vscode.window.onDidChangeActiveTerminal")
  @js.native
  val onDidChangeActiveTerminal: Event[js.UndefOr[Terminal]] = js.native
  
  @JSGlobal("vscode.window.onDidChangeActiveTextEditor")
  @js.native
  val onDidChangeActiveTextEditor: Event[js.UndefOr[TextEditor]] = js.native
  
  @JSGlobal("vscode.window.onDidChangeNotebookEditorSelection")
  @js.native
  val onDidChangeNotebookEditorSelection: Event[NotebookEditorSelectionChangeEvent] = js.native
  
  @JSGlobal("vscode.window.onDidChangeNotebookEditorVisibleRanges")
  @js.native
  val onDidChangeNotebookEditorVisibleRanges: Event[NotebookEditorVisibleRangesChangeEvent] = js.native
  
  @JSGlobal("vscode.window.onDidChangeTerminalState")
  @js.native
  val onDidChangeTerminalState: Event[Terminal] = js.native
  
  @JSGlobal("vscode.window.onDidChangeTextEditorOptions")
  @js.native
  val onDidChangeTextEditorOptions: Event[TextEditorOptionsChangeEvent] = js.native
  
  @JSGlobal("vscode.window.onDidChangeTextEditorSelection")
  @js.native
  val onDidChangeTextEditorSelection: Event[TextEditorSelectionChangeEvent] = js.native
  
  @JSGlobal("vscode.window.onDidChangeTextEditorViewColumn")
  @js.native
  val onDidChangeTextEditorViewColumn: Event[TextEditorViewColumnChangeEvent] = js.native
  
  @JSGlobal("vscode.window.onDidChangeTextEditorVisibleRanges")
  @js.native
  val onDidChangeTextEditorVisibleRanges: Event[TextEditorVisibleRangesChangeEvent] = js.native
  
  @JSGlobal("vscode.window.onDidChangeVisibleNotebookEditors")
  @js.native
  val onDidChangeVisibleNotebookEditors: Event[js.Array[NotebookEditor]] = js.native
  
  @JSGlobal("vscode.window.onDidChangeVisibleTextEditors")
  @js.native
  val onDidChangeVisibleTextEditors: Event[js.Array[TextEditor]] = js.native
  
  @JSGlobal("vscode.window.onDidChangeWindowState")
  @js.native
  val onDidChangeWindowState: Event[WindowState] = js.native
  
  @JSGlobal("vscode.window.onDidCloseTerminal")
  @js.native
  val onDidCloseTerminal: Event[Terminal] = js.native
  
  @JSGlobal("vscode.window.onDidOpenTerminal")
  @js.native
  val onDidOpenTerminal: Event[Terminal] = js.native
  
  inline def registerCustomEditorProvider(viewType: String, provider: CustomEditorProvider[CustomDocument]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerCustomEditorProvider(
    viewType: String,
    provider: CustomEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerCustomEditorProvider(viewType: String, provider: CustomReadonlyEditorProvider[CustomDocument]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerCustomEditorProvider(
    viewType: String,
    provider: CustomReadonlyEditorProvider[CustomDocument],
    options: SupportsMultipleEditorsPerDocument
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerCustomEditorProvider(viewType: String, provider: CustomTextEditorProvider, options: SupportsMultipleEditorsPerDocument): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomEditorProvider")(viewType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerFileDecorationProvider(provider: FileDecorationProvider): typingsJapgolly.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFileDecorationProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerTerminalLinkProvider(provider: TerminalLinkProvider[typingsJapgolly.vscode.mod.TerminalLink]): typingsJapgolly.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTerminalLinkProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerTerminalProfileProvider(id: String, provider: TerminalProfileProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTerminalProfileProvider")(id.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerTreeDataProvider[T](viewId: String, treeDataProvider: TreeDataProvider[T]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTreeDataProvider")(viewId.asInstanceOf[js.Any], treeDataProvider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerUriHandler(handler: UriHandler): typingsJapgolly.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUriHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerWebviewPanelSerializer(viewType: String, serializer: WebviewPanelSerializer[Any]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewPanelSerializer")(viewType.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewViewProvider")(viewId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerWebviewViewProvider(viewId: String, provider: WebviewViewProvider, options: typingsJapgolly.vscode.anon.WebviewOptions): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerWebviewViewProvider")(viewId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def setStatusBarMessage(text: String): typingsJapgolly.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def setStatusBarMessage(text: String, hideAfterTimeout: Double): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any], hideAfterTimeout.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def setStatusBarMessage(text: String, hideWhenDone: Thenable[Any]): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatusBarMessage")(text.asInstanceOf[js.Any], hideWhenDone.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def showErrorMessage[T /* <: String */](message: String, items: T*): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(scala.List(message.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showErrorMessage[T /* <: String */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")((scala.List(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showInformationMessage[T /* <: String */](message: String, items: T*): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(scala.List(message.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showInformationMessage[T /* <: String */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")((scala.List(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showInputBox(): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")().asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showInputBox(options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showInputBox(options: InputBoxOptions): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showInputBox(options: InputBoxOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showInputBox")(options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  inline def showNotebookDocument(document: NotebookDocument): Thenable[NotebookEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Thenable[NotebookEditor]]
  inline def showNotebookDocument(document: NotebookDocument, options: NotebookDocumentShowOptions): Thenable[NotebookEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(document.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[NotebookEditor]]
  
  inline def showOpenDialog(): Thenable[js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Uri]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")().asInstanceOf[Thenable[js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Uri]]]]
  inline def showOpenDialog(options: OpenDialogOptions): Thenable[js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Uri]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showOpenDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Uri]]]]
  
  inline def showQuickPick(items: js.Array[String]): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: js.Array[String], options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptions): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: js.Array[String], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]]): Thenable[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: Unit, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[String]]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  inline def showQuickPick(items: Thenable[js.Array[String]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[String]]]
  
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T]): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: Unit, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: js.Array[T], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]]): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: Unit, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptionscanPickMa, token: CancellationToken): Thenable[js.UndefOr[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[js.Array[T]]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showQuickPick_T[T /* <: QuickPickItem */](items: Thenable[js.Array[T]], options: QuickPickOptions, token: CancellationToken): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showQuickPick")(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showSaveDialog(): Thenable[js.UndefOr[typingsJapgolly.vscode.mod.Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")().asInstanceOf[Thenable[js.UndefOr[typingsJapgolly.vscode.mod.Uri]]]
  inline def showSaveDialog(options: SaveDialogOptions): Thenable[js.UndefOr[typingsJapgolly.vscode.mod.Uri]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showSaveDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[typingsJapgolly.vscode.mod.Uri]]]
  
  inline def showTextDocument(document: TextDocument): Thenable[TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, column: Unit, preserveFocus: Boolean): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any], preserveFocus.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, column: typingsJapgolly.vscode.mod.ViewColumn): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, column: typingsJapgolly.vscode.mod.ViewColumn, preserveFocus: Boolean): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], column.asInstanceOf[js.Any], preserveFocus.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(document: TextDocument, options: TextDocumentShowOptions): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(document.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(uri: typingsJapgolly.vscode.mod.Uri): Thenable[TextEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[Thenable[TextEditor]]
  inline def showTextDocument(uri: typingsJapgolly.vscode.mod.Uri, options: TextDocumentShowOptions): Thenable[TextEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showTextDocument")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Thenable[TextEditor]]
  
  inline def showWarningMessage[T /* <: String */](message: String, items: T*): Thenable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")(scala.List(message.asInstanceOf[js.Any]).`++`(items.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Thenable[js.UndefOr[T]]]
  inline def showWarningMessage[T /* <: String */](message: String, options: MessageOptions, items: T*): Thenable[js.UndefOr[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWarningMessage")((scala.List(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Thenable[js.UndefOr[T]]]
  
  inline def showWorkspaceFolderPick(): Thenable[js.UndefOr[WorkspaceFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkspaceFolderPick")().asInstanceOf[Thenable[js.UndefOr[WorkspaceFolder]]]
  inline def showWorkspaceFolderPick(options: WorkspaceFolderPickOptions): Thenable[js.UndefOr[WorkspaceFolder]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWorkspaceFolderPick")(options.asInstanceOf[js.Any]).asInstanceOf[Thenable[js.UndefOr[WorkspaceFolder]]]
  
  @JSGlobal("vscode.window.state")
  @js.native
  val state: WindowState = js.native
  
  @JSGlobal("vscode.window.tabGroups")
  @js.native
  val tabGroups: TabGroups = js.native
  
  @JSGlobal("vscode.window.terminals")
  @js.native
  val terminals: js.Array[Terminal] = js.native
  
  @JSGlobal("vscode.window.visibleNotebookEditors")
  @js.native
  val visibleNotebookEditors: js.Array[NotebookEditor] = js.native
  
  @JSGlobal("vscode.window.visibleTextEditors")
  @js.native
  def visibleTextEditors: js.Array[TextEditor] = js.native
  inline def visibleTextEditors_=(x: js.Array[TextEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visibleTextEditors")(x.asInstanceOf[js.Any])
  
  inline def withProgress[R](
    options: ProgressOptions,
    task: js.Function2[/* progress */ Progress[Increment], /* token */ CancellationToken, Thenable[R]]
  ): Thenable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withProgress")(options.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Thenable[R]]
  
  inline def withScmProgress[R](task: js.Function1[/* progress */ Progress[Double], Thenable[R]]): Thenable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withScmProgress")(task.asInstanceOf[js.Any]).asInstanceOf[Thenable[R]]
}

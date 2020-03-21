package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscode.mod.CompletionContext
import typingsJapgolly.vscode.mod.Definition
import typingsJapgolly.vscode.mod.DefinitionLink
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.SignatureHelp
import typingsJapgolly.vscode.mod.TextDocumentChangeEvent
import typingsJapgolly.vscode.mod.TextDocumentWillSaveEvent
import typingsJapgolly.vscode.mod.Uri
import typingsJapgolly.vscodeJsonrpc.Thenable
import typingsJapgolly.vscodeLanguageclient.AnonIncludeDeclaration
import typingsJapgolly.vscodeLanguageclient.AnonPlaceholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Middleware extends js.Object {
  var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, Unit]] = js.undefined
  var didClose: js.UndefOr[NextSignature[typingsJapgolly.vscode.mod.TextDocument, Unit]] = js.undefined
  var didOpen: js.UndefOr[NextSignature[typingsJapgolly.vscode.mod.TextDocument, Unit]] = js.undefined
  var didSave: js.UndefOr[NextSignature[typingsJapgolly.vscode.mod.TextDocument, Unit]] = js.undefined
  var handleDiagnostics: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typingsJapgolly.vscode.mod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ]
  ] = js.undefined
  var prepareRename: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.Range | AnonPlaceholder]
    ]
  ] = js.undefined
  var provideCodeActions: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* range */ typingsJapgolly.vscode.mod.Range, 
      /* context */ typingsJapgolly.vscode.mod.CodeActionContext, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[
        js.Array[typingsJapgolly.vscode.mod.Command | typingsJapgolly.vscode.mod.CodeAction]
      ]
    ]
  ] = js.undefined
  var provideCodeLenses: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.CodeLens]]
    ]
  ] = js.undefined
  var provideCompletionItem: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* context */ CompletionContext, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[
        js.Array[typingsJapgolly.vscode.mod.CompletionItem] | typingsJapgolly.vscode.mod.CompletionList
      ]
    ]
  ] = js.undefined
  var provideDefinition: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ]
  ] = js.undefined
  var provideDocumentFormattingEdits: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentHighlights: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.DocumentHighlight]]
    ]
  ] = js.undefined
  var provideDocumentLinks: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.DocumentLink]]
    ]
  ] = js.undefined
  var provideDocumentRangeFormattingEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* range */ typingsJapgolly.vscode.mod.Range, 
      /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
    ]
  ] = js.undefined
  var provideDocumentSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[
          typingsJapgolly.vscode.mod.DocumentSymbol | typingsJapgolly.vscode.mod.SymbolInformation
        ]
      ]
    ]
  ] = js.undefined
  var provideHover: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.Hover]
    ]
  ] = js.undefined
  var provideOnTypeFormattingEdits: js.UndefOr[
    js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* ch */ String, 
      /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
    ]
  ] = js.undefined
  var provideReferences: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* options */ AnonIncludeDeclaration, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.Location]]
    ]
  ] = js.undefined
  var provideRenameEdits: js.UndefOr[
    js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* newName */ String, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.WorkspaceEdit]
    ]
  ] = js.undefined
  var provideSignatureHelp: js.UndefOr[
    js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ]
  ] = js.undefined
  var provideWorkspaceSymbols: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]]
    ]
  ] = js.undefined
  var resolveCodeLens: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typingsJapgolly.vscode.mod.CodeLens, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.CodeLens]
    ]
  ] = js.undefined
  var resolveCompletionItem: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typingsJapgolly.vscode.mod.CompletionItem, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.CompletionItem]
    ]
  ] = js.undefined
  var resolveDocumentLink: js.UndefOr[
    js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typingsJapgolly.vscode.mod.DocumentLink, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.DocumentLink]
    ]
  ] = js.undefined
  var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Unit]] = js.undefined
  var willSaveWaitUntil: js.UndefOr[
    NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typingsJapgolly.vscode.mod.TextEdit]]]
  ] = js.undefined
  var workspace: js.UndefOr[WorkspaceMiddleware] = js.undefined
}

object _Middleware {
  @scala.inline
  def apply(
    didChange: NextSignature[TextDocumentChangeEvent, Unit] = null,
    didClose: NextSignature[typingsJapgolly.vscode.mod.TextDocument, Unit] = null,
    didOpen: NextSignature[typingsJapgolly.vscode.mod.TextDocument, Unit] = null,
    didSave: NextSignature[typingsJapgolly.vscode.mod.TextDocument, Unit] = null,
    handleDiagnostics: js.ThisFunction3[
      /* this */ Unit, 
      /* uri */ Uri, 
      /* diagnostics */ js.Array[typingsJapgolly.vscode.mod.Diagnostic], 
      /* next */ HandleDiagnosticsSignature, 
      Unit
    ] = null,
    prepareRename: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ PrepareRenameSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.Range | AnonPlaceholder]
    ] = null,
    provideCodeActions: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* range */ typingsJapgolly.vscode.mod.Range, 
      /* context */ typingsJapgolly.vscode.mod.CodeActionContext, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeActionsSignature, 
      ProviderResult[
        js.Array[typingsJapgolly.vscode.mod.Command | typingsJapgolly.vscode.mod.CodeAction]
      ]
    ] = null,
    provideCodeLenses: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideCodeLensesSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.CodeLens]]
    ] = null,
    provideCompletionItem: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* context */ CompletionContext, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideCompletionItemsSignature, 
      ProviderResult[
        js.Array[typingsJapgolly.vscode.mod.CompletionItem] | typingsJapgolly.vscode.mod.CompletionList
      ]
    ] = null,
    provideDefinition: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDefinitionSignature, 
      ProviderResult[Definition | js.Array[DefinitionLink]]
    ] = null,
    provideDocumentFormattingEdits: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentFormattingEditsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
    ] = null,
    provideDocumentHighlights: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentHighlightsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.DocumentHighlight]]
    ] = null,
    provideDocumentLinks: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentLinksSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.DocumentLink]]
    ] = null,
    provideDocumentRangeFormattingEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* range */ typingsJapgolly.vscode.mod.Range, 
      /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentRangeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
    ] = null,
    provideDocumentSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideDocumentSymbolsSignature, 
      ProviderResult[
        js.Array[
          typingsJapgolly.vscode.mod.DocumentSymbol | typingsJapgolly.vscode.mod.SymbolInformation
        ]
      ]
    ] = null,
    provideHover: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideHoverSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.Hover]
    ] = null,
    provideOnTypeFormattingEdits: js.ThisFunction6[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* ch */ String, 
      /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideOnTypeFormattingEditsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
    ] = null,
    provideReferences: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* options */ AnonIncludeDeclaration, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideReferencesSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.Location]]
    ] = null,
    provideRenameEdits: js.ThisFunction5[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* newName */ String, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideRenameEditsSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.WorkspaceEdit]
    ] = null,
    provideSignatureHelp: js.ThisFunction4[
      /* this */ Unit, 
      /* document */ typingsJapgolly.vscode.mod.TextDocument, 
      /* position */ typingsJapgolly.vscode.mod.Position, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideSignatureHelpSignature, 
      ProviderResult[SignatureHelp]
    ] = null,
    provideWorkspaceSymbols: js.ThisFunction3[
      /* this */ Unit, 
      /* query */ String, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ProvideWorkspaceSymbolsSignature, 
      ProviderResult[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]]
    ] = null,
    resolveCodeLens: js.ThisFunction3[
      /* this */ Unit, 
      /* codeLens */ typingsJapgolly.vscode.mod.CodeLens, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ResolveCodeLensSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.CodeLens]
    ] = null,
    resolveCompletionItem: js.ThisFunction3[
      /* this */ Unit, 
      /* item */ typingsJapgolly.vscode.mod.CompletionItem, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ResolveCompletionItemSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.CompletionItem]
    ] = null,
    resolveDocumentLink: js.ThisFunction3[
      /* this */ Unit, 
      /* link */ typingsJapgolly.vscode.mod.DocumentLink, 
      /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
      /* next */ ResolveDocumentLinkSignature, 
      ProviderResult[typingsJapgolly.vscode.mod.DocumentLink]
    ] = null,
    willSave: NextSignature[TextDocumentWillSaveEvent, Unit] = null,
    willSaveWaitUntil: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[typingsJapgolly.vscode.mod.TextEdit]]] = null,
    workspace: WorkspaceMiddleware = null
  ): _Middleware = {
    val __obj = js.Dynamic.literal()
    if (didChange != null) __obj.updateDynamic("didChange")(didChange.asInstanceOf[js.Any])
    if (didClose != null) __obj.updateDynamic("didClose")(didClose.asInstanceOf[js.Any])
    if (didOpen != null) __obj.updateDynamic("didOpen")(didOpen.asInstanceOf[js.Any])
    if (didSave != null) __obj.updateDynamic("didSave")(didSave.asInstanceOf[js.Any])
    if (handleDiagnostics != null) __obj.updateDynamic("handleDiagnostics")(handleDiagnostics.asInstanceOf[js.Any])
    if (prepareRename != null) __obj.updateDynamic("prepareRename")(prepareRename.asInstanceOf[js.Any])
    if (provideCodeActions != null) __obj.updateDynamic("provideCodeActions")(provideCodeActions.asInstanceOf[js.Any])
    if (provideCodeLenses != null) __obj.updateDynamic("provideCodeLenses")(provideCodeLenses.asInstanceOf[js.Any])
    if (provideCompletionItem != null) __obj.updateDynamic("provideCompletionItem")(provideCompletionItem.asInstanceOf[js.Any])
    if (provideDefinition != null) __obj.updateDynamic("provideDefinition")(provideDefinition.asInstanceOf[js.Any])
    if (provideDocumentFormattingEdits != null) __obj.updateDynamic("provideDocumentFormattingEdits")(provideDocumentFormattingEdits.asInstanceOf[js.Any])
    if (provideDocumentHighlights != null) __obj.updateDynamic("provideDocumentHighlights")(provideDocumentHighlights.asInstanceOf[js.Any])
    if (provideDocumentLinks != null) __obj.updateDynamic("provideDocumentLinks")(provideDocumentLinks.asInstanceOf[js.Any])
    if (provideDocumentRangeFormattingEdits != null) __obj.updateDynamic("provideDocumentRangeFormattingEdits")(provideDocumentRangeFormattingEdits.asInstanceOf[js.Any])
    if (provideDocumentSymbols != null) __obj.updateDynamic("provideDocumentSymbols")(provideDocumentSymbols.asInstanceOf[js.Any])
    if (provideHover != null) __obj.updateDynamic("provideHover")(provideHover.asInstanceOf[js.Any])
    if (provideOnTypeFormattingEdits != null) __obj.updateDynamic("provideOnTypeFormattingEdits")(provideOnTypeFormattingEdits.asInstanceOf[js.Any])
    if (provideReferences != null) __obj.updateDynamic("provideReferences")(provideReferences.asInstanceOf[js.Any])
    if (provideRenameEdits != null) __obj.updateDynamic("provideRenameEdits")(provideRenameEdits.asInstanceOf[js.Any])
    if (provideSignatureHelp != null) __obj.updateDynamic("provideSignatureHelp")(provideSignatureHelp.asInstanceOf[js.Any])
    if (provideWorkspaceSymbols != null) __obj.updateDynamic("provideWorkspaceSymbols")(provideWorkspaceSymbols.asInstanceOf[js.Any])
    if (resolveCodeLens != null) __obj.updateDynamic("resolveCodeLens")(resolveCodeLens.asInstanceOf[js.Any])
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(resolveCompletionItem.asInstanceOf[js.Any])
    if (resolveDocumentLink != null) __obj.updateDynamic("resolveDocumentLink")(resolveDocumentLink.asInstanceOf[js.Any])
    if (willSave != null) __obj.updateDynamic("willSave")(willSave.asInstanceOf[js.Any])
    if (willSaveWaitUntil != null) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil.asInstanceOf[js.Any])
    if (workspace != null) __obj.updateDynamic("workspace")(workspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Middleware]
  }
}


package typingsJapgolly.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type DidChangeConfigurationSignature = js.Function1[/* sections */ js.UndefOr[js.Array[java.lang.String]], scala.Unit]
  type HandleDiagnosticsSignature = js.Function2[
    /* uri */ typingsJapgolly.vscode.mod.Uri, 
    /* diagnostics */ js.Array[typingsJapgolly.vscode.mod.Diagnostic], 
    scala.Unit
  ]
  type InitializationFailedHandler = js.Function1[
    /* error */ typingsJapgolly.vscodeLanguageserverProtocol.mod.ResponseError[typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeError] | js.Error | js.Any, 
    scala.Boolean
  ]
  type Middleware = typingsJapgolly.vscodeLanguageclient.clientMod._Middleware with typingsJapgolly.vscodeLanguageclient.typeDefinitionMod.TypeDefinitionMiddleware with typingsJapgolly.vscodeLanguageclient.implementationMod.ImplementationMiddleware with typingsJapgolly.vscodeLanguageclient.colorProviderMod.ColorProviderMiddleware with typingsJapgolly.vscodeLanguageclient.foldingRangeMod.FoldingRangeProviderMiddleware with typingsJapgolly.vscodeLanguageclient.declarationMod.DeclarationMiddleware
  type NextSignature[P, R] = js.ThisFunction2[/* this */ scala.Unit, /* data */ P, /* next */ js.Function1[/* data */ P, R], R]
  type PrepareRenameSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[
      typingsJapgolly.vscode.mod.Range | typingsJapgolly.vscodeLanguageclient.AnonPlaceholder
    ]
  ]
  type ProvideCodeActionsSignature = js.Function4[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* range */ typingsJapgolly.vscode.mod.Range, 
    /* context */ typingsJapgolly.vscode.mod.CodeActionContext, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[
      js.Array[typingsJapgolly.vscode.mod.Command | typingsJapgolly.vscode.mod.CodeAction]
    ]
  ]
  type ProvideCodeLensesSignature = js.Function2[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.CodeLens]]
  ]
  type ProvideCompletionItemsSignature = js.Function4[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* context */ typingsJapgolly.vscode.mod.CompletionContext, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[
      js.Array[typingsJapgolly.vscode.mod.CompletionItem] | typingsJapgolly.vscode.mod.CompletionList
    ]
  ]
  type ProvideDefinitionSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[
      typingsJapgolly.vscode.mod.Definition | js.Array[typingsJapgolly.vscode.mod.DefinitionLink]
    ]
  ]
  type ProvideDocumentFormattingEditsSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentHighlightsSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.DocumentHighlight]]
  ]
  type ProvideDocumentLinksSignature = js.Function2[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.DocumentLink]]
  ]
  type ProvideDocumentRangeFormattingEditsSignature = js.Function4[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* range */ typingsJapgolly.vscode.mod.Range, 
    /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
  ]
  type ProvideDocumentSymbolsSignature = js.Function2[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[
      js.Array[
        typingsJapgolly.vscode.mod.DocumentSymbol | typingsJapgolly.vscode.mod.SymbolInformation
      ]
    ]
  ]
  type ProvideHoverSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.Hover]
  ]
  type ProvideOnTypeFormattingEditsSignature = js.Function5[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* ch */ java.lang.String, 
    /* options */ typingsJapgolly.vscode.mod.FormattingOptions, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.TextEdit]]
  ]
  type ProvideReferencesSignature = js.Function4[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* options */ typingsJapgolly.vscodeLanguageclient.AnonIncludeDeclaration, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.Location]]
  ]
  type ProvideRenameEditsSignature = js.Function4[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* newName */ java.lang.String, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.WorkspaceEdit]
  ]
  type ProvideSignatureHelpSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.SignatureHelp]
  ]
  type ProvideWorkspaceSymbolsSignature = js.Function2[
    /* query */ java.lang.String, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.SymbolInformation]]
  ]
  type ResolveCodeLensSignature = js.Function2[
    /* codeLens */ typingsJapgolly.vscode.mod.CodeLens, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.CodeLens]
  ]
  type ResolveCompletionItemSignature = js.Function2[
    /* item */ typingsJapgolly.vscode.mod.CompletionItem, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.CompletionItem]
  ]
  type ResolveDocumentLinkSignature = js.Function2[
    /* link */ typingsJapgolly.vscode.mod.DocumentLink, 
    /* token */ typingsJapgolly.vscode.mod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.DocumentLink]
  ]
  type WorkspaceMiddleware = typingsJapgolly.vscodeLanguageclient.clientMod._WorkspaceMiddleware with typingsJapgolly.vscodeLanguageclient.configurationMod.ConfigurationWorkspaceMiddleware with typingsJapgolly.vscodeLanguageclient.workspaceFoldersMod.WorkspaceFolderWorkspaceMiddleware
}

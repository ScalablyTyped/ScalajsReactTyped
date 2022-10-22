package typingsJapgolly.vscodeLanguageclient.libCommonClientMod

import typingsJapgolly.vscodeLanguageclient.libCommonCallHierarchyMod.CallHierarchyMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonCodeActionMod.CodeActionMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonCodeLensMod.CodeLensMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonColorProviderMod.ColorProviderMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonCompletionMod.CompletionMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonDeclarationMod.DeclarationMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonDefinitionMod.DefinitionMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod.DiagnosticProviderMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonDocumentHighlightMod.DocumentHighlightMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonDocumentLinkMod.DocumentLinkMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonDocumentSymbolMod.DocumentSymbolMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonExecuteCommandMod.ExecuteCommandMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonFoldingRangeMod.FoldingRangeProviderMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonFormattingMod.FormattingMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonHoverMod.HoverMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonImplementationMod.ImplementationMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonInlayHintMod.InlayHintsMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonInlineValueMod.InlineValueMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonLinkedEditingRangeMod.LinkedEditingRangeMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonNotebookMod.NotebookDocumentMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonReferenceMod.ReferencesMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonRenameMod.RenameMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonSelectionRangeMod.SelectionRangeProviderMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonSemanticTokensMod.SemanticTokensMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonSignatureHelpMod.SignatureHelpMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.TextDocumentSynchronizationMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonTypeDefinitionMod.TypeDefinitionMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonTypeHierarchyMod.TypeHierarchyMiddleware
import typingsJapgolly.vscodeLanguageclient.libCommonWorkspaceSymbolMod.WorkspaceSymbolMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware
  extends StObject
     with _Middleware
     with TextDocumentSynchronizationMiddleware
     with CompletionMiddleware
     with HoverMiddleware
     with DefinitionMiddleware
     with SignatureHelpMiddleware
     with DocumentHighlightMiddleware
     with DocumentSymbolMiddleware
     with WorkspaceSymbolMiddleware
     with ReferencesMiddleware
     with TypeDefinitionMiddleware
     with ImplementationMiddleware
     with ColorProviderMiddleware
     with CodeActionMiddleware
     with CodeLensMiddleware
     with FormattingMiddleware
     with RenameMiddleware
     with DocumentLinkMiddleware
     with ExecuteCommandMiddleware
     with FoldingRangeProviderMiddleware
     with DeclarationMiddleware
     with SelectionRangeProviderMiddleware
     with CallHierarchyMiddleware
     with SemanticTokensMiddleware
     with LinkedEditingRangeMiddleware
     with TypeHierarchyMiddleware
     with InlineValueMiddleware
     with InlayHintsMiddleware
     with NotebookDocumentMiddleware
     with DiagnosticProviderMiddleware
object Middleware {
  
  inline def apply(): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Middleware]
  }
}

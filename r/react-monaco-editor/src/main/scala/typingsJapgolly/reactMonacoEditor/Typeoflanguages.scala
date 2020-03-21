package typingsJapgolly.reactMonacoEditor

import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.Thenable
import typingsJapgolly.monacoEditor.mod.languages.CodeActionProvider
import typingsJapgolly.monacoEditor.mod.languages.CodeLensProvider
import typingsJapgolly.monacoEditor.mod.languages.CompletionItemProvider
import typingsJapgolly.monacoEditor.mod.languages.DeclarationProvider
import typingsJapgolly.monacoEditor.mod.languages.DefinitionProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentColorProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentFormattingEditProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentRangeFormattingEditProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentSymbolProvider
import typingsJapgolly.monacoEditor.mod.languages.EncodedTokensProvider
import typingsJapgolly.monacoEditor.mod.languages.FoldingRangeProvider
import typingsJapgolly.monacoEditor.mod.languages.HoverProvider
import typingsJapgolly.monacoEditor.mod.languages.ILanguageExtensionPoint
import typingsJapgolly.monacoEditor.mod.languages.IMonarchLanguage
import typingsJapgolly.monacoEditor.mod.languages.ImplementationProvider
import typingsJapgolly.monacoEditor.mod.languages.LanguageConfiguration
import typingsJapgolly.monacoEditor.mod.languages.LinkProvider
import typingsJapgolly.monacoEditor.mod.languages.OnTypeFormattingEditProvider
import typingsJapgolly.monacoEditor.mod.languages.ReferenceProvider
import typingsJapgolly.monacoEditor.mod.languages.RenameProvider
import typingsJapgolly.monacoEditor.mod.languages.SelectionRangeProvider
import typingsJapgolly.monacoEditor.mod.languages.SignatureHelpProvider
import typingsJapgolly.monacoEditor.mod.languages.TokensProvider
import typingsJapgolly.monacoEditor.mod.languages.TypeDefinitionProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflanguages extends js.Object {
  var FoldingRangeKind: TypeofFoldingRangeKind = js.native
  val css: Typeofcss = js.native
  val html: Typeofhtml = js.native
  val json: Typeofjson = js.native
  val typescript: Typeoftypescript = js.native
  def getEncodedLanguageId(languageId: String): Double = js.native
  def getLanguages(): js.Array[ILanguageExtensionPoint] = js.native
  def onLanguage(languageId: String, callback: js.Function0[Unit]): IDisposable = js.native
  def register(language: ILanguageExtensionPoint): Unit = js.native
  def registerCodeActionProvider(languageId: String, provider: CodeActionProvider): IDisposable = js.native
  def registerCodeLensProvider(languageId: String, provider: CodeLensProvider): IDisposable = js.native
  def registerColorProvider(languageId: String, provider: DocumentColorProvider): IDisposable = js.native
  def registerCompletionItemProvider(languageId: String, provider: CompletionItemProvider): IDisposable = js.native
  def registerDeclarationProvider(languageId: String, provider: DeclarationProvider): IDisposable = js.native
  def registerDefinitionProvider(languageId: String, provider: DefinitionProvider): IDisposable = js.native
  def registerDocumentFormattingEditProvider(languageId: String, provider: DocumentFormattingEditProvider): IDisposable = js.native
  def registerDocumentHighlightProvider(languageId: String, provider: DocumentHighlightProvider): IDisposable = js.native
  def registerDocumentRangeFormattingEditProvider(languageId: String, provider: DocumentRangeFormattingEditProvider): IDisposable = js.native
  def registerDocumentSymbolProvider(languageId: String, provider: DocumentSymbolProvider): IDisposable = js.native
  def registerFoldingRangeProvider(languageId: String, provider: FoldingRangeProvider): IDisposable = js.native
  def registerHoverProvider(languageId: String, provider: HoverProvider): IDisposable = js.native
  def registerImplementationProvider(languageId: String, provider: ImplementationProvider): IDisposable = js.native
  def registerLinkProvider(languageId: String, provider: LinkProvider): IDisposable = js.native
  def registerOnTypeFormattingEditProvider(languageId: String, provider: OnTypeFormattingEditProvider): IDisposable = js.native
  def registerReferenceProvider(languageId: String, provider: ReferenceProvider): IDisposable = js.native
  def registerRenameProvider(languageId: String, provider: RenameProvider): IDisposable = js.native
  def registerSelectionRangeProvider(languageId: String, provider: SelectionRangeProvider): IDisposable = js.native
  def registerSignatureHelpProvider(languageId: String, provider: SignatureHelpProvider): IDisposable = js.native
  def registerTypeDefinitionProvider(languageId: String, provider: TypeDefinitionProvider): IDisposable = js.native
  def setLanguageConfiguration(languageId: String, configuration: LanguageConfiguration): IDisposable = js.native
  def setMonarchTokensProvider(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
  def setMonarchTokensProvider(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: EncodedTokensProvider): IDisposable = js.native
  def setTokensProvider(languageId: String, provider: TokensProvider): IDisposable = js.native
}


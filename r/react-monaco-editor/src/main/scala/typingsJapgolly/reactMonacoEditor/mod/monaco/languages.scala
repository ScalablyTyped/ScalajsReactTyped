package typingsJapgolly.reactMonacoEditor.mod.monaco

import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.Thenable
import typingsJapgolly.monacoEditor.mod.languages.CodeActionProvider
import typingsJapgolly.monacoEditor.mod.languages.CodeActionProviderMetadata
import typingsJapgolly.monacoEditor.mod.languages.CodeLensProvider
import typingsJapgolly.monacoEditor.mod.languages.CompletionItemProvider
import typingsJapgolly.monacoEditor.mod.languages.DeclarationProvider
import typingsJapgolly.monacoEditor.mod.languages.DefinitionProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentColorProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentFormattingEditProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentRangeFormattingEditProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentRangeSemanticTokensProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentSemanticTokensProvider
import typingsJapgolly.monacoEditor.mod.languages.DocumentSymbolProvider
import typingsJapgolly.monacoEditor.mod.languages.EncodedTokensProvider
import typingsJapgolly.monacoEditor.mod.languages.FoldingRangeProvider
import typingsJapgolly.monacoEditor.mod.languages.HoverProvider
import typingsJapgolly.monacoEditor.mod.languages.ILanguageExtensionPoint
import typingsJapgolly.monacoEditor.mod.languages.IMonarchLanguage
import typingsJapgolly.monacoEditor.mod.languages.ImplementationProvider
import typingsJapgolly.monacoEditor.mod.languages.InlayHintsProvider
import typingsJapgolly.monacoEditor.mod.languages.InlineCompletion
import typingsJapgolly.monacoEditor.mod.languages.InlineCompletions
import typingsJapgolly.monacoEditor.mod.languages.InlineCompletionsProvider
import typingsJapgolly.monacoEditor.mod.languages.LanguageConfiguration
import typingsJapgolly.monacoEditor.mod.languages.LanguageSelector
import typingsJapgolly.monacoEditor.mod.languages.LinkProvider
import typingsJapgolly.monacoEditor.mod.languages.LinkedEditingRangeProvider
import typingsJapgolly.monacoEditor.mod.languages.OnTypeFormattingEditProvider
import typingsJapgolly.monacoEditor.mod.languages.ReferenceProvider
import typingsJapgolly.monacoEditor.mod.languages.RenameProvider
import typingsJapgolly.monacoEditor.mod.languages.SelectionRangeProvider
import typingsJapgolly.monacoEditor.mod.languages.SignatureHelpProvider
import typingsJapgolly.monacoEditor.mod.languages.TokensProvider
import typingsJapgolly.monacoEditor.mod.languages.TokensProviderFactory
import typingsJapgolly.monacoEditor.mod.languages.TypeDefinitionProvider
import typingsJapgolly.monacoEditor.mod.languages.css.LanguageServiceDefaults
import typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceRegistration
import typingsJapgolly.monacoEditor.mod.languages.html.ModeConfiguration
import typingsJapgolly.monacoEditor.mod.languages.html.Options
import typingsJapgolly.monacoEditor.mod.languages.typescript.TypeScriptWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languages {
  
  @JSImport("react-monaco-editor", "monaco.languages")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-monaco-editor", "monaco.languages.CodeActionTriggerType")
  @js.native
  object CodeActionTriggerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.CodeActionTriggerType & Double] = js.native
    
    /* 2 */ val Auto: typingsJapgolly.monacoEditor.mod.languages.CodeActionTriggerType.Auto & Double = js.native
    
    /* 1 */ val Invoke: typingsJapgolly.monacoEditor.mod.languages.CodeActionTriggerType.Invoke & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.CompletionItemInsertTextRule")
  @js.native
  object CompletionItemInsertTextRule extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.CompletionItemInsertTextRule & Double] = js.native
    
    /* 4 */ val InsertAsSnippet: typingsJapgolly.monacoEditor.mod.languages.CompletionItemInsertTextRule.InsertAsSnippet & Double = js.native
    
    /* 1 */ val KeepWhitespace: typingsJapgolly.monacoEditor.mod.languages.CompletionItemInsertTextRule.KeepWhitespace & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.CompletionItemKind")
  @js.native
  object CompletionItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind & Double] = js.native
    
    /* 5 */ val Class: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Class & Double = js.native
    
    /* 19 */ val Color: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Color & Double = js.native
    
    /* 14 */ val Constant: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Constant & Double = js.native
    
    /* 2 */ val Constructor: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Constructor & Double = js.native
    
    /* 22 */ val Customcolor: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Customcolor & Double = js.native
    
    /* 15 */ val Enum: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Enum & Double = js.native
    
    /* 16 */ val EnumMember: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.EnumMember & Double = js.native
    
    /* 10 */ val Event: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Event & Double = js.native
    
    /* 3 */ val Field: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Field & Double = js.native
    
    /* 20 */ val File: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.File & Double = js.native
    
    /* 23 */ val Folder: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Folder & Double = js.native
    
    /* 1 */ val Function: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Function & Double = js.native
    
    /* 7 */ val Interface: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Interface & Double = js.native
    
    /* 26 */ val Issue: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Issue & Double = js.native
    
    /* 17 */ val Keyword: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Keyword & Double = js.native
    
    /* 0 */ val Method: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Method & Double = js.native
    
    /* 8 */ val Module: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Module & Double = js.native
    
    /* 11 */ val Operator: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Operator & Double = js.native
    
    /* 9 */ val Property: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Property & Double = js.native
    
    /* 21 */ val Reference: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Reference & Double = js.native
    
    /* 27 */ val Snippet: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Snippet & Double = js.native
    
    /* 6 */ val Struct: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Struct & Double = js.native
    
    /* 18 */ val Text: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Text & Double = js.native
    
    /* 24 */ val TypeParameter: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.TypeParameter & Double = js.native
    
    /* 12 */ val Unit: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Unit & Double = js.native
    
    /* 25 */ val User: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.User & Double = js.native
    
    /* 13 */ val Value: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Value & Double = js.native
    
    /* 4 */ val Variable: typingsJapgolly.monacoEditor.mod.languages.CompletionItemKind.Variable & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.CompletionItemTag")
  @js.native
  object CompletionItemTag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.CompletionItemTag & Double] = js.native
    
    /* 1 */ val Deprecated: typingsJapgolly.monacoEditor.mod.languages.CompletionItemTag.Deprecated & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.CompletionTriggerKind")
  @js.native
  object CompletionTriggerKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.CompletionTriggerKind & Double] = js.native
    
    /* 0 */ val Invoke: typingsJapgolly.monacoEditor.mod.languages.CompletionTriggerKind.Invoke & Double = js.native
    
    /* 1 */ val TriggerCharacter: typingsJapgolly.monacoEditor.mod.languages.CompletionTriggerKind.TriggerCharacter & Double = js.native
    
    /* 2 */ val TriggerForIncompleteCompletions: typingsJapgolly.monacoEditor.mod.languages.CompletionTriggerKind.TriggerForIncompleteCompletions & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.DocumentHighlightKind")
  @js.native
  object DocumentHighlightKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind & Double] = js.native
    
    /* 1 */ val Read: typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind.Read & Double = js.native
    
    /* 0 */ val Text: typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind.Text & Double = js.native
    
    /* 2 */ val Write: typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind.Write & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.FoldingRangeKind")
  @js.native
  open class FoldingRangeKind protected ()
    extends typingsJapgolly.monacoEditor.mod.languages.FoldingRangeKind {
    /**
      * Creates a new {@link FoldingRangeKind}.
      *
      * @param value of the kind.
      */
    def this(value: String) = this()
  }
  /* static members */
  object FoldingRangeKind {
    
    /**
      * Kind for folding range representing a comment. The value of the kind is 'comment'.
      */
    @JSImport("react-monaco-editor", "monaco.languages.FoldingRangeKind.Comment")
    @js.native
    val Comment: typingsJapgolly.monacoEditor.mod.languages.FoldingRangeKind = js.native
    
    /**
      * Kind for folding range representing a import. The value of the kind is 'imports'.
      */
    @JSImport("react-monaco-editor", "monaco.languages.FoldingRangeKind.Imports")
    @js.native
    val Imports: typingsJapgolly.monacoEditor.mod.languages.FoldingRangeKind = js.native
    
    /**
      * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
      * The value of the kind is 'region'.
      */
    @JSImport("react-monaco-editor", "monaco.languages.FoldingRangeKind.Region")
    @js.native
    val Region: typingsJapgolly.monacoEditor.mod.languages.FoldingRangeKind = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.IndentAction")
  @js.native
  object IndentAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.IndentAction & Double] = js.native
    
    /* 1 */ val Indent: typingsJapgolly.monacoEditor.mod.languages.IndentAction.Indent & Double = js.native
    
    /* 2 */ val IndentOutdent: typingsJapgolly.monacoEditor.mod.languages.IndentAction.IndentOutdent & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.monacoEditor.mod.languages.IndentAction.None & Double = js.native
    
    /* 3 */ val Outdent: typingsJapgolly.monacoEditor.mod.languages.IndentAction.Outdent & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.InlayHintKind")
  @js.native
  object InlayHintKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.InlayHintKind & Double] = js.native
    
    /* 2 */ val Parameter: typingsJapgolly.monacoEditor.mod.languages.InlayHintKind.Parameter & Double = js.native
    
    /* 1 */ val Type: typingsJapgolly.monacoEditor.mod.languages.InlayHintKind.Type & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.InlineCompletionTriggerKind")
  @js.native
  object InlineCompletionTriggerKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.InlineCompletionTriggerKind & Double] = js.native
    
    /* 0 */ val Automatic: typingsJapgolly.monacoEditor.mod.languages.InlineCompletionTriggerKind.Automatic & Double = js.native
    
    /* 1 */ val Explicit: typingsJapgolly.monacoEditor.mod.languages.InlineCompletionTriggerKind.Explicit & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.SignatureHelpTriggerKind")
  @js.native
  object SignatureHelpTriggerKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.SignatureHelpTriggerKind & Double] = js.native
    
    /* 3 */ val ContentChange: typingsJapgolly.monacoEditor.mod.languages.SignatureHelpTriggerKind.ContentChange & Double = js.native
    
    /* 1 */ val Invoke: typingsJapgolly.monacoEditor.mod.languages.SignatureHelpTriggerKind.Invoke & Double = js.native
    
    /* 2 */ val TriggerCharacter: typingsJapgolly.monacoEditor.mod.languages.SignatureHelpTriggerKind.TriggerCharacter & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.SymbolKind")
  @js.native
  object SymbolKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.SymbolKind & Double] = js.native
    
    /* 17 */ val Array: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Array & Double = js.native
    
    /* 16 */ val Boolean: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Boolean & Double = js.native
    
    /* 4 */ val Class: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Class & Double = js.native
    
    /* 13 */ val Constant: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Constant & Double = js.native
    
    /* 8 */ val Constructor: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Constructor & Double = js.native
    
    /* 9 */ val Enum: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Enum & Double = js.native
    
    /* 21 */ val EnumMember: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.EnumMember & Double = js.native
    
    /* 23 */ val Event: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Event & Double = js.native
    
    /* 7 */ val Field: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Field & Double = js.native
    
    /* 0 */ val File: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.File & Double = js.native
    
    /* 11 */ val Function: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Function & Double = js.native
    
    /* 10 */ val Interface: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Interface & Double = js.native
    
    /* 19 */ val Key: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Key & Double = js.native
    
    /* 5 */ val Method: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Method & Double = js.native
    
    /* 1 */ val Module: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Module & Double = js.native
    
    /* 2 */ val Namespace: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Namespace & Double = js.native
    
    /* 20 */ val Null: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Null & Double = js.native
    
    /* 15 */ val Number: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Number & Double = js.native
    
    /* 18 */ val Object: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Object & Double = js.native
    
    /* 24 */ val Operator: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Operator & Double = js.native
    
    /* 3 */ val Package: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Package & Double = js.native
    
    /* 6 */ val Property: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Property & Double = js.native
    
    /* 14 */ val String: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.String & Double = js.native
    
    /* 22 */ val Struct: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Struct & Double = js.native
    
    /* 25 */ val TypeParameter: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.TypeParameter & Double = js.native
    
    /* 12 */ val Variable: typingsJapgolly.monacoEditor.mod.languages.SymbolKind.Variable & Double = js.native
  }
  
  @JSImport("react-monaco-editor", "monaco.languages.SymbolTag")
  @js.native
  object SymbolTag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.SymbolTag & Double] = js.native
    
    /* 1 */ val Deprecated: typingsJapgolly.monacoEditor.mod.languages.SymbolTag.Deprecated & Double = js.native
  }
  
  object css {
    
    @JSImport("react-monaco-editor", "monaco.languages.css.cssDefaults")
    @js.native
    val cssDefaults: LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.css.lessDefaults")
    @js.native
    val lessDefaults: LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.css.scssDefaults")
    @js.native
    val scssDefaults: LanguageServiceDefaults = js.native
  }
  
  inline def getEncodedLanguageId(languageId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodedLanguageId")(languageId.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getLanguages(): js.Array[ILanguageExtensionPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Array[ILanguageExtensionPoint]]
  
  object html {
    
    @JSImport("react-monaco-editor", "monaco.languages.html")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.html.handlebarDefaults")
    @js.native
    val handlebarDefaults: typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.html.handlebarLanguageService")
    @js.native
    val handlebarLanguageService: LanguageServiceRegistration = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.html.htmlDefaults")
    @js.native
    val htmlDefaults: typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.html.htmlLanguageService")
    @js.native
    val htmlLanguageService: LanguageServiceRegistration = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.html.razorDefaults")
    @js.native
    val razorDefaults: typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.html.razorLanguageService")
    @js.native
    val razorLanguageService: LanguageServiceRegistration = js.native
    
    inline def registerHTMLLanguageService(languageId: String): LanguageServiceRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any]).asInstanceOf[LanguageServiceRegistration]
    inline def registerHTMLLanguageService(languageId: String, options: Unit, modeConfiguration: ModeConfiguration): LanguageServiceRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], modeConfiguration.asInstanceOf[js.Any])).asInstanceOf[LanguageServiceRegistration]
    inline def registerHTMLLanguageService(languageId: String, options: Options): LanguageServiceRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LanguageServiceRegistration]
    inline def registerHTMLLanguageService(languageId: String, options: Options, modeConfiguration: ModeConfiguration): LanguageServiceRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], modeConfiguration.asInstanceOf[js.Any])).asInstanceOf[LanguageServiceRegistration]
  }
  
  object json {
    
    @JSImport("react-monaco-editor", "monaco.languages.json.jsonDefaults")
    @js.native
    val jsonDefaults: typingsJapgolly.monacoEditor.mod.languages.json.LanguageServiceDefaults = js.native
  }
  
  inline def onLanguage(languageId: String, callback: js.Function0[Unit]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("onLanguage")(languageId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def register(language: ILanguageExtensionPoint): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerCodeActionProvider(languageSelector: LanguageSelector, provider: CodeActionProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  inline def registerCodeActionProvider(
    languageSelector: LanguageSelector,
    provider: CodeActionProvider,
    metadata: CodeActionProviderMetadata
  ): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerCodeLensProvider(languageSelector: LanguageSelector, provider: CodeLensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerColorProvider(languageSelector: LanguageSelector, provider: DocumentColorProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerCompletionItemProvider(languageSelector: LanguageSelector, provider: CompletionItemProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDeclarationProvider(languageSelector: LanguageSelector, provider: DeclarationProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDefinitionProvider(languageSelector: LanguageSelector, provider: DefinitionProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDocumentFormattingEditProvider(languageSelector: LanguageSelector, provider: DocumentFormattingEditProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDocumentHighlightProvider(languageSelector: LanguageSelector, provider: DocumentHighlightProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDocumentRangeFormattingEditProvider(languageSelector: LanguageSelector, provider: DocumentRangeFormattingEditProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDocumentRangeSemanticTokensProvider(languageSelector: LanguageSelector, provider: DocumentRangeSemanticTokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDocumentSemanticTokensProvider(languageSelector: LanguageSelector, provider: DocumentSemanticTokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerDocumentSymbolProvider(languageSelector: LanguageSelector, provider: DocumentSymbolProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerFoldingRangeProvider(languageSelector: LanguageSelector, provider: FoldingRangeProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerHoverProvider(languageSelector: LanguageSelector, provider: HoverProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerImplementationProvider(languageSelector: LanguageSelector, provider: ImplementationProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerInlayHintsProvider(languageSelector: LanguageSelector, provider: InlayHintsProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlayHintsProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerInlineCompletionsProvider(
    languageSelector: LanguageSelector,
    provider: InlineCompletionsProvider[InlineCompletions[InlineCompletion]]
  ): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInlineCompletionsProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerLinkProvider(languageSelector: LanguageSelector, provider: LinkProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerLinkedEditingRangeProvider(languageSelector: LanguageSelector, provider: LinkedEditingRangeProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkedEditingRangeProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerOnTypeFormattingEditProvider(languageSelector: LanguageSelector, provider: OnTypeFormattingEditProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerReferenceProvider(languageSelector: LanguageSelector, provider: ReferenceProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerRenameProvider(languageSelector: LanguageSelector, provider: RenameProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerSelectionRangeProvider(languageSelector: LanguageSelector, provider: SelectionRangeProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerSignatureHelpProvider(languageSelector: LanguageSelector, provider: SignatureHelpProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerTokensProviderFactory(languageId: String, factory: TokensProviderFactory): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTokensProviderFactory")(languageId.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def registerTypeDefinitionProvider(languageSelector: LanguageSelector, provider: TypeDefinitionProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(languageSelector.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def setColorMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setColorMap")().asInstanceOf[Unit]
  inline def setColorMap(colorMap: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setColorMap")(colorMap.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLanguageConfiguration(languageId: String, configuration: LanguageConfiguration): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(languageId.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def setMonarchTokensProvider(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  inline def setMonarchTokensProvider(languageId: String, languageDef: IMonarchLanguage): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  inline def setTokensProvider(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  inline def setTokensProvider(languageId: String, provider: EncodedTokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  inline def setTokensProvider(languageId: String, provider: TokensProvider): IDisposable = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[IDisposable]
  
  object typescript {
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.JsxEmit")
    @js.native
    object JsxEmit extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit & Double] = js.native
      
      /* 0 */ val None: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.None & Double = js.native
      
      /* 1 */ val Preserve: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.Preserve & Double = js.native
      
      /* 2 */ val React: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.React & Double = js.native
      
      /* 4 */ val ReactJSX: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.ReactJSX & Double = js.native
      
      /* 5 */ val ReactJSXDev: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.ReactJSXDev & Double = js.native
      
      /* 3 */ val ReactNative: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.ReactNative & Double = js.native
    }
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.ModuleKind")
    @js.native
    object ModuleKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind & Double] = js.native
      
      /* 2 */ val AMD: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.AMD & Double = js.native
      
      /* 1 */ val CommonJS: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.CommonJS & Double = js.native
      
      /* 5 */ val ES2015: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.ES2015 & Double = js.native
      
      /* 99 */ val ESNext: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.ESNext & Double = js.native
      
      /* 0 */ val None: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.None & Double = js.native
      
      /* 4 */ val System: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.System & Double = js.native
      
      /* 3 */ val UMD: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleKind.UMD & Double = js.native
    }
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.ModuleResolutionKind")
    @js.native
    object ModuleResolutionKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleResolutionKind & Double
          ] = js.native
      
      /* 1 */ val Classic: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleResolutionKind.Classic & Double = js.native
      
      /* 2 */ val NodeJs: typingsJapgolly.monacoEditor.mod.languages.typescript.ModuleResolutionKind.NodeJs & Double = js.native
    }
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.NewLineKind")
    @js.native
    object NewLineKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.typescript.NewLineKind & Double] = js.native
      
      /* 0 */ val CarriageReturnLineFeed: typingsJapgolly.monacoEditor.mod.languages.typescript.NewLineKind.CarriageReturnLineFeed & Double = js.native
      
      /* 1 */ val LineFeed: typingsJapgolly.monacoEditor.mod.languages.typescript.NewLineKind.LineFeed & Double = js.native
    }
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.ScriptTarget")
    @js.native
    object ScriptTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget & Double] = js.native
      
      /* 2 */ val ES2015: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES2015 & Double = js.native
      
      /* 3 */ val ES2016: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES2016 & Double = js.native
      
      /* 4 */ val ES2017: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES2017 & Double = js.native
      
      /* 5 */ val ES2018: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES2018 & Double = js.native
      
      /* 6 */ val ES2019: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES2019 & Double = js.native
      
      /* 7 */ val ES2020: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES2020 & Double = js.native
      
      /* 0 */ val ES3: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES3 & Double = js.native
      
      /* 1 */ val ES5: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ES5 & Double = js.native
      
      /* 99 */ val ESNext: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.ESNext & Double = js.native
      
      /* 100 */ val JSON: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.JSON & Double = js.native
      
      /* 99 */ val Latest: typingsJapgolly.monacoEditor.mod.languages.typescript.ScriptTarget.Latest & Double = js.native
    }
    
    inline def getJavaScriptWorker(): js.Promise[
        js.Function1[/* repeated */ typingsJapgolly.monacoEditor.mod.Uri, js.Promise[TypeScriptWorker]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJavaScriptWorker")().asInstanceOf[js.Promise[
        js.Function1[/* repeated */ typingsJapgolly.monacoEditor.mod.Uri, js.Promise[TypeScriptWorker]]
      ]]
    
    inline def getTypeScriptWorker(): js.Promise[
        js.Function1[/* repeated */ typingsJapgolly.monacoEditor.mod.Uri, js.Promise[TypeScriptWorker]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptWorker")().asInstanceOf[js.Promise[
        js.Function1[/* repeated */ typingsJapgolly.monacoEditor.mod.Uri, js.Promise[TypeScriptWorker]]
      ]]
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.javascriptDefaults")
    @js.native
    val javascriptDefaults: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.typescriptDefaults")
    @js.native
    val typescriptDefaults: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = js.native
    
    @JSImport("react-monaco-editor", "monaco.languages.typescript.typescriptVersion")
    @js.native
    val typescriptVersion: String = js.native
  }
}

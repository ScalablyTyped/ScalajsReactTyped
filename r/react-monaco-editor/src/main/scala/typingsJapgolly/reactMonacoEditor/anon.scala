package typingsJapgolly.reactMonacoEditor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.HTMLElement
import typingsJapgolly.monacoEditor.anon.Fragment
import typingsJapgolly.monacoEditor.anon.Model
import typingsJapgolly.monacoEditor.anon.Owner
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIBracketP
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIDropInto
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorCo
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorFi
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorHo
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorIn
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorLi
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorMi
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorPa
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIEditorPaCycle
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIGotoLoca
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIGuidesOp
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredIInlineSu
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredISmartSel
import typingsJapgolly.monacoEditor.anon.ReadonlyRequiredISuggestO
import typingsJapgolly.monacoEditor.mod.CancellationTokenSource
import typingsJapgolly.monacoEditor.mod.Emitter
import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.IPosition
import typingsJapgolly.monacoEditor.mod.IRange
import typingsJapgolly.monacoEditor.mod.ISelection
import typingsJapgolly.monacoEditor.mod.KeyMod
import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.Selection
import typingsJapgolly.monacoEditor.mod.SelectionDirection
import typingsJapgolly.monacoEditor.mod.Thenable
import typingsJapgolly.monacoEditor.mod.Token
import typingsJapgolly.monacoEditor.mod.Uri
import typingsJapgolly.monacoEditor.mod.UriComponents
import typingsJapgolly.monacoEditor.mod.editor.AccessibilitySupport
import typingsJapgolly.monacoEditor.mod.editor.EditorAutoIndentStrategy
import typingsJapgolly.monacoEditor.mod.editor.EditorExperimentalOptions
import typingsJapgolly.monacoEditor.mod.editor.EditorLayoutInfo
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.ariaLabel
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingDelete
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoIndent
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoSurround
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.automaticLayout
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.bracketPairColorization
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.codeLens
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.codeLensFontFamily
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.codeLensFontSize
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.colorDecorators
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.columnSelection
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.comments
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.contextmenu
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorBlinking
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorStyle
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorWidth
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.domReadOnly
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.dragAndDrop
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.dropIntoEditor
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.editorClassName
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.experimental
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.find
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.folding
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingHighlight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingStrategy
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontFamily
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontInfo
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontLigatures
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontSize
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontWeight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.formatOnPaste
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.formatOnType
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.glyphMargin
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.gotoLocation
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.guides
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.hover
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.inDiffEditor
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.inlayHints
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.inlineSuggest
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.layoutInfo
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.letterSpacing
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.lightbulb
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineHeight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineNumbers
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.linkedEditing
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.links
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.matchBrackets
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.minimap
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.mouseStyle
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.multiCursorModifier
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.multiCursorPaste
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.occurrencesHighlight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.overviewRulerBorder
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.overviewRulerLanes
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.padding
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.parameterHints
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.pixelRatio
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.quickSuggestions
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.readOnly
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renameOnType
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderControlCharacters
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderFinalNewline
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderWhitespace
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.roundedSelection
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.rulers
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollbar
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.selectionClipboard
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.selectionHighlight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.showDeprecated
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.showFoldingControls
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.showUnused
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.smartSelect
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.smoothScrolling
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.stickyTabStops
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggest
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestFontSize
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestLineHeight
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestSelection
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.tabCompletion
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.tabFocusMode
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.tabIndex
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.unicodeHighlighting
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.unusualLineTerminators
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.useShadowDOM
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.useTabStops
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordSeparators
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrap
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapOverride1
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapOverride2
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wrappingIndent
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wrappingInfo
import typingsJapgolly.monacoEditor.mod.editor.EditorOption.wrappingStrategy
import typingsJapgolly.monacoEditor.mod.editor.EditorWrappingInfo
import typingsJapgolly.monacoEditor.mod.editor.FontInfo
import typingsJapgolly.monacoEditor.mod.editor.ICodeEditor
import typingsJapgolly.monacoEditor.mod.editor.IColorizerElementOptions
import typingsJapgolly.monacoEditor.mod.editor.IColorizerOptions
import typingsJapgolly.monacoEditor.mod.editor.IDiffEditor
import typingsJapgolly.monacoEditor.mod.editor.IDiffNavigator
import typingsJapgolly.monacoEditor.mod.editor.IDiffNavigatorOptions
import typingsJapgolly.monacoEditor.mod.editor.IEditorOption
import typingsJapgolly.monacoEditor.mod.editor.IEditorOverrideServices
import typingsJapgolly.monacoEditor.mod.editor.IMarker
import typingsJapgolly.monacoEditor.mod.editor.IMarkerData
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneThemeData
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import typingsJapgolly.monacoEditor.mod.editor.IWebWorkerOptions
import typingsJapgolly.monacoEditor.mod.editor.InternalEditorRenderLineNumbersOptions
import typingsJapgolly.monacoEditor.mod.editor.InternalEditorScrollbarOptions
import typingsJapgolly.monacoEditor.mod.editor.InternalQuickSuggestionsOptions
import typingsJapgolly.monacoEditor.mod.editor.MonacoWebWorker
import typingsJapgolly.monacoEditor.mod.editor.TextEditorCursorBlinkingStyle
import typingsJapgolly.monacoEditor.mod.editor.TextEditorCursorStyle
import typingsJapgolly.monacoEditor.mod.editor.WrappingIndent
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
import typingsJapgolly.monacoEditor.mod.languages.FoldingRangeKind
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
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.`inline`
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.advanced
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.all
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.altKey
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.always
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.auto
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.beforeWhitespace
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.bottom
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.boundary
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.bounded
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.brackets
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.copy
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.ctrlKey
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.default
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.editable
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.editor
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.first
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.full
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.gutter
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.indentation
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.inherit
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.languageDefined
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.line
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.metaKey
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.mouseover
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.near
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.never
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.none
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.off
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.on
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.onlySnippets
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.prompt
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.quotes
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsed
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.recentlyUsedByPrefix
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.selection
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.simple
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.smart
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.spread
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.text
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.top
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.trailing
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.tree
import typingsJapgolly.reactMonacoEditor.reactMonacoEditorStrings.wordWrapColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(domElement: HTMLElement): IStandaloneCodeEditor = js.native
    def apply(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
    def apply(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
    def apply(
      domElement: HTMLElement,
      options: IStandaloneEditorConstructionOptions,
      `override`: IEditorOverrideServices
    ): IStandaloneCodeEditor = js.native
  }
  
  trait TypeofEditorOptions extends StObject {
    
    var acceptSuggestionOnCommitCharacter: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
        Boolean
      ]
    
    var acceptSuggestionOnEnter: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
        on | off | smart
      ]
    
    var accessibilityPageSize: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double]
    
    var accessibilitySupport: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
        AccessibilitySupport
      ]
    
    var ariaLabel: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.ariaLabel, String]
    
    var autoClosingBrackets: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
        always | languageDefined | beforeWhitespace | never
      ]
    
    var autoClosingDelete: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingDelete, 
        always | never | auto
      ]
    
    var autoClosingOvertype: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
        always | never | auto
      ]
    
    var autoClosingQuotes: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
        always | languageDefined | beforeWhitespace | never
      ]
    
    var autoIndent: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoIndent, 
        EditorAutoIndentStrategy
      ]
    
    var autoSurround: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.autoSurround, 
        languageDefined | never | quotes | brackets
      ]
    
    var automaticLayout: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean]
    
    var bracketPairColorization: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.bracketPairColorization, 
        ReadonlyRequiredIBracketP
      ]
    
    var bracketPairGuides: IEditorOption[guides, ReadonlyRequiredIGuidesOp]
    
    var codeLens: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.codeLens, Boolean]
    
    var codeLensFontFamily: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.codeLensFontFamily, String]
    
    var codeLensFontSize: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.codeLensFontSize, Double]
    
    var colorDecorators: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean]
    
    var columnSelection: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean]
    
    var comments: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.comments, 
        ReadonlyRequiredIEditorCo
      ]
    
    var contextmenu: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean]
    
    var copyWithSyntaxHighlighting: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, 
        Boolean
      ]
    
    var cursorBlinking: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
        TextEditorCursorBlinkingStyle
      ]
    
    var cursorSmoothCaretAnimation: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, 
        Boolean
      ]
    
    var cursorStyle: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorStyle, 
        TextEditorCursorStyle
      ]
    
    var cursorSurroundingLines: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, 
        Double
      ]
    
    var cursorSurroundingLinesStyle: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
        default | all
      ]
    
    var cursorWidth: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.cursorWidth, Double]
    
    var definitionLinkOpensInPeek: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, 
        Boolean
      ]
    
    var disableLayerHinting: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean]
    
    var disableMonospaceOptimizations: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
        Boolean
      ]
    
    var domReadOnly: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.domReadOnly, Boolean]
    
    var dragAndDrop: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean]
    
    var dropIntoEditor: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.dropIntoEditor, 
        ReadonlyRequiredIDropInto
      ]
    
    var editorClassName: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.editorClassName, String]
    
    var emptySelectionClipboard: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, 
        Boolean
      ]
    
    var experimental: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.experimental, 
        EditorExperimentalOptions
      ]
    
    var extraEditorClassName: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String]
    
    var fastScrollSensitivity: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double]
    
    var find: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.find, 
        ReadonlyRequiredIEditorFi
      ]
    
    var fixedOverflowWidgets: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean]
    
    var folding: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.folding, Boolean]
    
    var foldingHighlight: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean]
    
    var foldingImportsByDefault: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingImportsByDefault, 
        Boolean
      ]
    
    var foldingMaximumRegions: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingMaximumRegions, Double]
    
    var foldingStrategy: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.foldingStrategy, 
        auto | indentation
      ]
    
    var fontFamily: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontFamily, String]
    
    var fontInfo: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo]
    
    var fontLigatures2: IEditorOption[fontLigatures, String]
    
    var fontSize: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontSize, Double]
    
    var fontWeight: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.fontWeight, String]
    
    var formatOnPaste: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean]
    
    var formatOnType: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean]
    
    var glyphMargin: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean]
    
    var gotoLocation: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.gotoLocation, 
        ReadonlyRequiredIGotoLoca
      ]
    
    var hideCursorInOverviewRuler: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, 
        Boolean
      ]
    
    var hover: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.hover, 
        ReadonlyRequiredIEditorHo
      ]
    
    var inDiffEditor: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean]
    
    var inlayHints: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.inlayHints, 
        ReadonlyRequiredIEditorIn
      ]
    
    var inlineSuggest: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.inlineSuggest, 
        ReadonlyRequiredIInlineSu
      ]
    
    var layoutInfo: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo]
    
    var letterSpacing: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.letterSpacing, Double]
    
    var lightbulb: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.lightbulb, 
        ReadonlyRequiredIEditorLi
      ]
    
    var lineDecorationsWidth: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, 
        String | Double
      ]
    
    var lineHeight: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineHeight, Double]
    
    var lineNumbers: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineNumbers, 
        InternalEditorRenderLineNumbersOptions
      ]
    
    var lineNumbersMinChars: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double]
    
    var linkedEditing: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.linkedEditing, Boolean]
    
    var links: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.links, Boolean]
    
    var matchBrackets: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.matchBrackets, 
        always | never | near
      ]
    
    var minimap: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.minimap, 
        ReadonlyRequiredIEditorMi
      ]
    
    var mouseStyle: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.mouseStyle, 
        default | text | copy
      ]
    
    var mouseWheelScrollSensitivity: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, 
        Double
      ]
    
    var mouseWheelZoom: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean]
    
    var multiCursorMergeOverlapping: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, 
        Boolean
      ]
    
    var multiCursorModifier: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
        altKey | metaKey | ctrlKey
      ]
    
    var multiCursorPaste: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.multiCursorPaste, 
        spread | full
      ]
    
    var occurrencesHighlight: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean]
    
    var overviewRulerBorder: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean]
    
    var overviewRulerLanes: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double]
    
    var padding: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.padding, 
        ReadonlyRequiredIEditorPa
      ]
    
    var parameterHints: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.parameterHints, 
        ReadonlyRequiredIEditorPaCycle
      ]
    
    var peekWidgetDefaultFocus: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
        tree | editor
      ]
    
    var pixelRatio: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.pixelRatio, Double]
    
    var quickSuggestions: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
        InternalQuickSuggestionsOptions
      ]
    
    var quickSuggestionsDelay: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double]
    
    var readOnly: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.readOnly, Boolean]
    
    var renameOnType: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean]
    
    var renderControlCharacters: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderControlCharacters, 
        Boolean
      ]
    
    var renderFinalNewline: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean]
    
    var renderLineHighlight: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
        all | line | none | gutter
      ]
    
    var renderLineHighlightOnlyWhenFocus: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
        Boolean
      ]
    
    var renderValidationDecorations: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
        on | off | editable
      ]
    
    var renderWhitespace: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
        all | none | boundary | selection | trailing
      ]
    
    var revealHorizontalRightPadding: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, 
        Double
      ]
    
    var roundedSelection: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean]
    
    var rulers: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.rulers, js.Object]
    
    var scrollBeyondLastColumn: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, 
        Double
      ]
    
    var scrollBeyondLastLine: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean]
    
    var scrollPredominantAxis: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, 
        Boolean
      ]
    
    var scrollbar: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.scrollbar, 
        InternalEditorScrollbarOptions
      ]
    
    var selectOnLineNumbers: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean]
    
    var selectionClipboard: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean]
    
    var selectionHighlight: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean]
    
    var showDeprecated: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean]
    
    var showFoldingControls: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
        always | never | mouseover
      ]
    
    var showUnused: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.showUnused, Boolean]
    
    var smartSelect: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.smartSelect, 
        ReadonlyRequiredISmartSel
      ]
    
    var smoothScrolling: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean]
    
    var snippetSuggestions: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
        none | top | bottom | `inline`
      ]
    
    var stickyTabStops: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.stickyTabStops, Boolean]
    
    var stopRenderingLineAfter: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, 
        Double
      ]
    
    var suggest: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggest, 
        ReadonlyRequiredISuggestO
      ]
    
    var suggestFontSize: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double]
    
    var suggestLineHeight: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double]
    
    var suggestOnTriggerCharacters: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, 
        Boolean
      ]
    
    var suggestSelection: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.suggestSelection, 
        first | recentlyUsed | recentlyUsedByPrefix
      ]
    
    var tabCompletion: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.tabCompletion, 
        on | off | onlySnippets
      ]
    
    var tabFocusMode: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean]
    
    var tabIndex: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.tabIndex, Double]
    
    var unfoldOnClickAfterEndOfLine: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, 
        Boolean
      ]
    
    var unicodeHighlight: IEditorOption[unicodeHighlighting, Any]
    
    var unusualLineTerminators: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
        auto | off | prompt
      ]
    
    var useShadowDOM: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.useShadowDOM, Boolean]
    
    var useTabStops: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean]
    
    var wordSeparators: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordSeparators, String]
    
    var wordWrap: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrap, 
        on | off | wordWrapColumn | bounded
      ]
    
    var wordWrapBreakAfterCharacters: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, 
        String
      ]
    
    var wordWrapBreakBeforeCharacters: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, 
        String
      ]
    
    var wordWrapColumn: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]
    
    var wordWrapOverride1: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapOverride1, 
        on | off | inherit
      ]
    
    var wordWrapOverride2: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapOverride2, 
        on | off | inherit
      ]
    
    var wrappingIndent: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wrappingIndent, 
        WrappingIndent
      ]
    
    var wrappingInfo: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wrappingInfo, 
        EditorWrappingInfo
      ]
    
    var wrappingStrategy: IEditorOption[
        typingsJapgolly.monacoEditor.mod.editor.EditorOption.wrappingStrategy, 
        simple | advanced
      ]
  }
  object TypeofEditorOptions {
    
    inline def apply(
      acceptSuggestionOnCommitCharacter: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean],
      acceptSuggestionOnEnter: IEditorOption[acceptSuggestionOnEnter, on | off | smart],
      accessibilityPageSize: IEditorOption[accessibilityPageSize, Double],
      accessibilitySupport: IEditorOption[accessibilitySupport, AccessibilitySupport],
      ariaLabel: IEditorOption[ariaLabel, String],
      autoClosingBrackets: IEditorOption[autoClosingBrackets, always | languageDefined | beforeWhitespace | never],
      autoClosingDelete: IEditorOption[autoClosingDelete, always | never | auto],
      autoClosingOvertype: IEditorOption[autoClosingOvertype, always | never | auto],
      autoClosingQuotes: IEditorOption[autoClosingQuotes, always | languageDefined | beforeWhitespace | never],
      autoIndent: IEditorOption[autoIndent, EditorAutoIndentStrategy],
      autoSurround: IEditorOption[autoSurround, languageDefined | never | quotes | brackets],
      automaticLayout: IEditorOption[automaticLayout, Boolean],
      bracketPairColorization: IEditorOption[bracketPairColorization, ReadonlyRequiredIBracketP],
      bracketPairGuides: IEditorOption[guides, ReadonlyRequiredIGuidesOp],
      codeLens: IEditorOption[codeLens, Boolean],
      codeLensFontFamily: IEditorOption[codeLensFontFamily, String],
      codeLensFontSize: IEditorOption[codeLensFontSize, Double],
      colorDecorators: IEditorOption[colorDecorators, Boolean],
      columnSelection: IEditorOption[columnSelection, Boolean],
      comments: IEditorOption[comments, ReadonlyRequiredIEditorCo],
      contextmenu: IEditorOption[contextmenu, Boolean],
      copyWithSyntaxHighlighting: IEditorOption[copyWithSyntaxHighlighting, Boolean],
      cursorBlinking: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle],
      cursorSmoothCaretAnimation: IEditorOption[cursorSmoothCaretAnimation, Boolean],
      cursorStyle: IEditorOption[cursorStyle, TextEditorCursorStyle],
      cursorSurroundingLines: IEditorOption[cursorSurroundingLines, Double],
      cursorSurroundingLinesStyle: IEditorOption[cursorSurroundingLinesStyle, default | all],
      cursorWidth: IEditorOption[cursorWidth, Double],
      definitionLinkOpensInPeek: IEditorOption[definitionLinkOpensInPeek, Boolean],
      disableLayerHinting: IEditorOption[disableLayerHinting, Boolean],
      disableMonospaceOptimizations: IEditorOption[disableMonospaceOptimizations, Boolean],
      domReadOnly: IEditorOption[domReadOnly, Boolean],
      dragAndDrop: IEditorOption[dragAndDrop, Boolean],
      dropIntoEditor: IEditorOption[dropIntoEditor, ReadonlyRequiredIDropInto],
      editorClassName: IEditorOption[editorClassName, String],
      emptySelectionClipboard: IEditorOption[emptySelectionClipboard, Boolean],
      experimental: IEditorOption[experimental, EditorExperimentalOptions],
      extraEditorClassName: IEditorOption[extraEditorClassName, String],
      fastScrollSensitivity: IEditorOption[fastScrollSensitivity, Double],
      find: IEditorOption[find, ReadonlyRequiredIEditorFi],
      fixedOverflowWidgets: IEditorOption[fixedOverflowWidgets, Boolean],
      folding: IEditorOption[folding, Boolean],
      foldingHighlight: IEditorOption[foldingHighlight, Boolean],
      foldingImportsByDefault: IEditorOption[foldingImportsByDefault, Boolean],
      foldingMaximumRegions: IEditorOption[foldingMaximumRegions, Double],
      foldingStrategy: IEditorOption[foldingStrategy, auto | indentation],
      fontFamily: IEditorOption[fontFamily, String],
      fontInfo: IEditorOption[fontInfo, FontInfo],
      fontLigatures2: IEditorOption[fontLigatures, String],
      fontSize: IEditorOption[fontSize, Double],
      fontWeight: IEditorOption[fontWeight, String],
      formatOnPaste: IEditorOption[formatOnPaste, Boolean],
      formatOnType: IEditorOption[formatOnType, Boolean],
      glyphMargin: IEditorOption[glyphMargin, Boolean],
      gotoLocation: IEditorOption[gotoLocation, ReadonlyRequiredIGotoLoca],
      hideCursorInOverviewRuler: IEditorOption[hideCursorInOverviewRuler, Boolean],
      hover: IEditorOption[hover, ReadonlyRequiredIEditorHo],
      inDiffEditor: IEditorOption[inDiffEditor, Boolean],
      inlayHints: IEditorOption[inlayHints, ReadonlyRequiredIEditorIn],
      inlineSuggest: IEditorOption[inlineSuggest, ReadonlyRequiredIInlineSu],
      layoutInfo: IEditorOption[layoutInfo, EditorLayoutInfo],
      letterSpacing: IEditorOption[letterSpacing, Double],
      lightbulb: IEditorOption[lightbulb, ReadonlyRequiredIEditorLi],
      lineDecorationsWidth: IEditorOption[lineDecorationsWidth, String | Double],
      lineHeight: IEditorOption[lineHeight, Double],
      lineNumbers: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions],
      lineNumbersMinChars: IEditorOption[lineNumbersMinChars, Double],
      linkedEditing: IEditorOption[linkedEditing, Boolean],
      links: IEditorOption[links, Boolean],
      matchBrackets: IEditorOption[matchBrackets, always | never | near],
      minimap: IEditorOption[minimap, ReadonlyRequiredIEditorMi],
      mouseStyle: IEditorOption[mouseStyle, default | text | copy],
      mouseWheelScrollSensitivity: IEditorOption[mouseWheelScrollSensitivity, Double],
      mouseWheelZoom: IEditorOption[mouseWheelZoom, Boolean],
      multiCursorMergeOverlapping: IEditorOption[multiCursorMergeOverlapping, Boolean],
      multiCursorModifier: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey],
      multiCursorPaste: IEditorOption[multiCursorPaste, spread | full],
      occurrencesHighlight: IEditorOption[occurrencesHighlight, Boolean],
      overviewRulerBorder: IEditorOption[overviewRulerBorder, Boolean],
      overviewRulerLanes: IEditorOption[overviewRulerLanes, Double],
      padding: IEditorOption[padding, ReadonlyRequiredIEditorPa],
      parameterHints: IEditorOption[parameterHints, ReadonlyRequiredIEditorPaCycle],
      peekWidgetDefaultFocus: IEditorOption[peekWidgetDefaultFocus, tree | editor],
      pixelRatio: IEditorOption[pixelRatio, Double],
      quickSuggestions: IEditorOption[quickSuggestions, InternalQuickSuggestionsOptions],
      quickSuggestionsDelay: IEditorOption[quickSuggestionsDelay, Double],
      readOnly: IEditorOption[readOnly, Boolean],
      renameOnType: IEditorOption[renameOnType, Boolean],
      renderControlCharacters: IEditorOption[renderControlCharacters, Boolean],
      renderFinalNewline: IEditorOption[renderFinalNewline, Boolean],
      renderLineHighlight: IEditorOption[renderLineHighlight, all | line | none | gutter],
      renderLineHighlightOnlyWhenFocus: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean],
      renderValidationDecorations: IEditorOption[renderValidationDecorations, on | off | editable],
      renderWhitespace: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing],
      revealHorizontalRightPadding: IEditorOption[revealHorizontalRightPadding, Double],
      roundedSelection: IEditorOption[roundedSelection, Boolean],
      rulers: IEditorOption[rulers, js.Object],
      scrollBeyondLastColumn: IEditorOption[scrollBeyondLastColumn, Double],
      scrollBeyondLastLine: IEditorOption[scrollBeyondLastLine, Boolean],
      scrollPredominantAxis: IEditorOption[scrollPredominantAxis, Boolean],
      scrollbar: IEditorOption[scrollbar, InternalEditorScrollbarOptions],
      selectOnLineNumbers: IEditorOption[selectOnLineNumbers, Boolean],
      selectionClipboard: IEditorOption[selectionClipboard, Boolean],
      selectionHighlight: IEditorOption[selectionHighlight, Boolean],
      showDeprecated: IEditorOption[showDeprecated, Boolean],
      showFoldingControls: IEditorOption[showFoldingControls, always | never | mouseover],
      showUnused: IEditorOption[showUnused, Boolean],
      smartSelect: IEditorOption[smartSelect, ReadonlyRequiredISmartSel],
      smoothScrolling: IEditorOption[smoothScrolling, Boolean],
      snippetSuggestions: IEditorOption[snippetSuggestions, none | top | bottom | `inline`],
      stickyTabStops: IEditorOption[stickyTabStops, Boolean],
      stopRenderingLineAfter: IEditorOption[stopRenderingLineAfter, Double],
      suggest: IEditorOption[suggest, ReadonlyRequiredISuggestO],
      suggestFontSize: IEditorOption[suggestFontSize, Double],
      suggestLineHeight: IEditorOption[suggestLineHeight, Double],
      suggestOnTriggerCharacters: IEditorOption[suggestOnTriggerCharacters, Boolean],
      suggestSelection: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix],
      tabCompletion: IEditorOption[tabCompletion, on | off | onlySnippets],
      tabFocusMode: IEditorOption[tabFocusMode, Boolean],
      tabIndex: IEditorOption[tabIndex, Double],
      unfoldOnClickAfterEndOfLine: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean],
      unicodeHighlight: IEditorOption[unicodeHighlighting, Any],
      unusualLineTerminators: IEditorOption[unusualLineTerminators, auto | off | prompt],
      useShadowDOM: IEditorOption[useShadowDOM, Boolean],
      useTabStops: IEditorOption[useTabStops, Boolean],
      wordSeparators: IEditorOption[wordSeparators, String],
      wordWrap: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded],
      wordWrapBreakAfterCharacters: IEditorOption[wordWrapBreakAfterCharacters, String],
      wordWrapBreakBeforeCharacters: IEditorOption[wordWrapBreakBeforeCharacters, String],
      wordWrapColumn: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double],
      wordWrapOverride1: IEditorOption[wordWrapOverride1, on | off | inherit],
      wordWrapOverride2: IEditorOption[wordWrapOverride2, on | off | inherit],
      wrappingIndent: IEditorOption[wrappingIndent, WrappingIndent],
      wrappingInfo: IEditorOption[wrappingInfo, EditorWrappingInfo],
      wrappingStrategy: IEditorOption[wrappingStrategy, simple | advanced]
    ): TypeofEditorOptions = {
      val __obj = js.Dynamic.literal(acceptSuggestionOnCommitCharacter = acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any], acceptSuggestionOnEnter = acceptSuggestionOnEnter.asInstanceOf[js.Any], accessibilityPageSize = accessibilityPageSize.asInstanceOf[js.Any], accessibilitySupport = accessibilitySupport.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any], autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], autoClosingDelete = autoClosingDelete.asInstanceOf[js.Any], autoClosingOvertype = autoClosingOvertype.asInstanceOf[js.Any], autoClosingQuotes = autoClosingQuotes.asInstanceOf[js.Any], autoIndent = autoIndent.asInstanceOf[js.Any], autoSurround = autoSurround.asInstanceOf[js.Any], automaticLayout = automaticLayout.asInstanceOf[js.Any], bracketPairColorization = bracketPairColorization.asInstanceOf[js.Any], bracketPairGuides = bracketPairGuides.asInstanceOf[js.Any], codeLens = codeLens.asInstanceOf[js.Any], codeLensFontFamily = codeLensFontFamily.asInstanceOf[js.Any], codeLensFontSize = codeLensFontSize.asInstanceOf[js.Any], colorDecorators = colorDecorators.asInstanceOf[js.Any], columnSelection = columnSelection.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copyWithSyntaxHighlighting = copyWithSyntaxHighlighting.asInstanceOf[js.Any], cursorBlinking = cursorBlinking.asInstanceOf[js.Any], cursorSmoothCaretAnimation = cursorSmoothCaretAnimation.asInstanceOf[js.Any], cursorStyle = cursorStyle.asInstanceOf[js.Any], cursorSurroundingLines = cursorSurroundingLines.asInstanceOf[js.Any], cursorSurroundingLinesStyle = cursorSurroundingLinesStyle.asInstanceOf[js.Any], cursorWidth = cursorWidth.asInstanceOf[js.Any], definitionLinkOpensInPeek = definitionLinkOpensInPeek.asInstanceOf[js.Any], disableLayerHinting = disableLayerHinting.asInstanceOf[js.Any], disableMonospaceOptimizations = disableMonospaceOptimizations.asInstanceOf[js.Any], domReadOnly = domReadOnly.asInstanceOf[js.Any], dragAndDrop = dragAndDrop.asInstanceOf[js.Any], dropIntoEditor = dropIntoEditor.asInstanceOf[js.Any], editorClassName = editorClassName.asInstanceOf[js.Any], emptySelectionClipboard = emptySelectionClipboard.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], extraEditorClassName = extraEditorClassName.asInstanceOf[js.Any], fastScrollSensitivity = fastScrollSensitivity.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], fixedOverflowWidgets = fixedOverflowWidgets.asInstanceOf[js.Any], folding = folding.asInstanceOf[js.Any], foldingHighlight = foldingHighlight.asInstanceOf[js.Any], foldingImportsByDefault = foldingImportsByDefault.asInstanceOf[js.Any], foldingMaximumRegions = foldingMaximumRegions.asInstanceOf[js.Any], foldingStrategy = foldingStrategy.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontInfo = fontInfo.asInstanceOf[js.Any], fontLigatures2 = fontLigatures2.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], formatOnPaste = formatOnPaste.asInstanceOf[js.Any], formatOnType = formatOnType.asInstanceOf[js.Any], glyphMargin = glyphMargin.asInstanceOf[js.Any], gotoLocation = gotoLocation.asInstanceOf[js.Any], hideCursorInOverviewRuler = hideCursorInOverviewRuler.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDiffEditor = inDiffEditor.asInstanceOf[js.Any], inlayHints = inlayHints.asInstanceOf[js.Any], inlineSuggest = inlineSuggest.asInstanceOf[js.Any], layoutInfo = layoutInfo.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lightbulb = lightbulb.asInstanceOf[js.Any], lineDecorationsWidth = lineDecorationsWidth.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineNumbersMinChars = lineNumbersMinChars.asInstanceOf[js.Any], linkedEditing = linkedEditing.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], minimap = minimap.asInstanceOf[js.Any], mouseStyle = mouseStyle.asInstanceOf[js.Any], mouseWheelScrollSensitivity = mouseWheelScrollSensitivity.asInstanceOf[js.Any], mouseWheelZoom = mouseWheelZoom.asInstanceOf[js.Any], multiCursorMergeOverlapping = multiCursorMergeOverlapping.asInstanceOf[js.Any], multiCursorModifier = multiCursorModifier.asInstanceOf[js.Any], multiCursorPaste = multiCursorPaste.asInstanceOf[js.Any], occurrencesHighlight = occurrencesHighlight.asInstanceOf[js.Any], overviewRulerBorder = overviewRulerBorder.asInstanceOf[js.Any], overviewRulerLanes = overviewRulerLanes.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], parameterHints = parameterHints.asInstanceOf[js.Any], peekWidgetDefaultFocus = peekWidgetDefaultFocus.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], quickSuggestions = quickSuggestions.asInstanceOf[js.Any], quickSuggestionsDelay = quickSuggestionsDelay.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], renameOnType = renameOnType.asInstanceOf[js.Any], renderControlCharacters = renderControlCharacters.asInstanceOf[js.Any], renderFinalNewline = renderFinalNewline.asInstanceOf[js.Any], renderLineHighlight = renderLineHighlight.asInstanceOf[js.Any], renderLineHighlightOnlyWhenFocus = renderLineHighlightOnlyWhenFocus.asInstanceOf[js.Any], renderValidationDecorations = renderValidationDecorations.asInstanceOf[js.Any], renderWhitespace = renderWhitespace.asInstanceOf[js.Any], revealHorizontalRightPadding = revealHorizontalRightPadding.asInstanceOf[js.Any], roundedSelection = roundedSelection.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], scrollBeyondLastColumn = scrollBeyondLastColumn.asInstanceOf[js.Any], scrollBeyondLastLine = scrollBeyondLastLine.asInstanceOf[js.Any], scrollPredominantAxis = scrollPredominantAxis.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], selectOnLineNumbers = selectOnLineNumbers.asInstanceOf[js.Any], selectionClipboard = selectionClipboard.asInstanceOf[js.Any], selectionHighlight = selectionHighlight.asInstanceOf[js.Any], showDeprecated = showDeprecated.asInstanceOf[js.Any], showFoldingControls = showFoldingControls.asInstanceOf[js.Any], showUnused = showUnused.asInstanceOf[js.Any], smartSelect = smartSelect.asInstanceOf[js.Any], smoothScrolling = smoothScrolling.asInstanceOf[js.Any], snippetSuggestions = snippetSuggestions.asInstanceOf[js.Any], stickyTabStops = stickyTabStops.asInstanceOf[js.Any], stopRenderingLineAfter = stopRenderingLineAfter.asInstanceOf[js.Any], suggest = suggest.asInstanceOf[js.Any], suggestFontSize = suggestFontSize.asInstanceOf[js.Any], suggestLineHeight = suggestLineHeight.asInstanceOf[js.Any], suggestOnTriggerCharacters = suggestOnTriggerCharacters.asInstanceOf[js.Any], suggestSelection = suggestSelection.asInstanceOf[js.Any], tabCompletion = tabCompletion.asInstanceOf[js.Any], tabFocusMode = tabFocusMode.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], unfoldOnClickAfterEndOfLine = unfoldOnClickAfterEndOfLine.asInstanceOf[js.Any], unicodeHighlight = unicodeHighlight.asInstanceOf[js.Any], unusualLineTerminators = unusualLineTerminators.asInstanceOf[js.Any], useShadowDOM = useShadowDOM.asInstanceOf[js.Any], useTabStops = useTabStops.asInstanceOf[js.Any], wordSeparators = wordSeparators.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any], wordWrapOverride1 = wordWrapOverride1.asInstanceOf[js.Any], wordWrapOverride2 = wordWrapOverride2.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any], wrappingInfo = wrappingInfo.asInstanceOf[js.Any], wrappingStrategy = wrappingStrategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofEditorOptions]
    }
    
    extension [Self <: TypeofEditorOptions](x: Self) {
      
      inline def setAcceptSuggestionOnCommitCharacter(value: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Self = StObject.set(x, "acceptSuggestionOnCommitCharacter", value.asInstanceOf[js.Any])
      
      inline def setAcceptSuggestionOnEnter(value: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Self = StObject.set(x, "acceptSuggestionOnEnter", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityPageSize(value: IEditorOption[accessibilityPageSize, Double]): Self = StObject.set(x, "accessibilityPageSize", value.asInstanceOf[js.Any])
      
      inline def setAccessibilitySupport(value: IEditorOption[accessibilitySupport, AccessibilitySupport]): Self = StObject.set(x, "accessibilitySupport", value.asInstanceOf[js.Any])
      
      inline def setAriaLabel(value: IEditorOption[ariaLabel, String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingBrackets(value: IEditorOption[autoClosingBrackets, always | languageDefined | beforeWhitespace | never]): Self = StObject.set(x, "autoClosingBrackets", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingDelete(value: IEditorOption[autoClosingDelete, always | never | auto]): Self = StObject.set(x, "autoClosingDelete", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingOvertype(value: IEditorOption[autoClosingOvertype, always | never | auto]): Self = StObject.set(x, "autoClosingOvertype", value.asInstanceOf[js.Any])
      
      inline def setAutoClosingQuotes(value: IEditorOption[autoClosingQuotes, always | languageDefined | beforeWhitespace | never]): Self = StObject.set(x, "autoClosingQuotes", value.asInstanceOf[js.Any])
      
      inline def setAutoIndent(value: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
      
      inline def setAutoSurround(value: IEditorOption[autoSurround, languageDefined | never | quotes | brackets]): Self = StObject.set(x, "autoSurround", value.asInstanceOf[js.Any])
      
      inline def setAutomaticLayout(value: IEditorOption[automaticLayout, Boolean]): Self = StObject.set(x, "automaticLayout", value.asInstanceOf[js.Any])
      
      inline def setBracketPairColorization(value: IEditorOption[bracketPairColorization, ReadonlyRequiredIBracketP]): Self = StObject.set(x, "bracketPairColorization", value.asInstanceOf[js.Any])
      
      inline def setBracketPairGuides(value: IEditorOption[guides, ReadonlyRequiredIGuidesOp]): Self = StObject.set(x, "bracketPairGuides", value.asInstanceOf[js.Any])
      
      inline def setCodeLens(value: IEditorOption[codeLens, Boolean]): Self = StObject.set(x, "codeLens", value.asInstanceOf[js.Any])
      
      inline def setCodeLensFontFamily(value: IEditorOption[codeLensFontFamily, String]): Self = StObject.set(x, "codeLensFontFamily", value.asInstanceOf[js.Any])
      
      inline def setCodeLensFontSize(value: IEditorOption[codeLensFontSize, Double]): Self = StObject.set(x, "codeLensFontSize", value.asInstanceOf[js.Any])
      
      inline def setColorDecorators(value: IEditorOption[colorDecorators, Boolean]): Self = StObject.set(x, "colorDecorators", value.asInstanceOf[js.Any])
      
      inline def setColumnSelection(value: IEditorOption[columnSelection, Boolean]): Self = StObject.set(x, "columnSelection", value.asInstanceOf[js.Any])
      
      inline def setComments(value: IEditorOption[comments, ReadonlyRequiredIEditorCo]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setContextmenu(value: IEditorOption[contextmenu, Boolean]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setCopyWithSyntaxHighlighting(value: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Self = StObject.set(x, "copyWithSyntaxHighlighting", value.asInstanceOf[js.Any])
      
      inline def setCursorBlinking(value: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Self = StObject.set(x, "cursorBlinking", value.asInstanceOf[js.Any])
      
      inline def setCursorSmoothCaretAnimation(value: IEditorOption[cursorSmoothCaretAnimation, Boolean]): Self = StObject.set(x, "cursorSmoothCaretAnimation", value.asInstanceOf[js.Any])
      
      inline def setCursorStyle(value: IEditorOption[cursorStyle, TextEditorCursorStyle]): Self = StObject.set(x, "cursorStyle", value.asInstanceOf[js.Any])
      
      inline def setCursorSurroundingLines(value: IEditorOption[cursorSurroundingLines, Double]): Self = StObject.set(x, "cursorSurroundingLines", value.asInstanceOf[js.Any])
      
      inline def setCursorSurroundingLinesStyle(value: IEditorOption[cursorSurroundingLinesStyle, default | all]): Self = StObject.set(x, "cursorSurroundingLinesStyle", value.asInstanceOf[js.Any])
      
      inline def setCursorWidth(value: IEditorOption[cursorWidth, Double]): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
      
      inline def setDefinitionLinkOpensInPeek(value: IEditorOption[definitionLinkOpensInPeek, Boolean]): Self = StObject.set(x, "definitionLinkOpensInPeek", value.asInstanceOf[js.Any])
      
      inline def setDisableLayerHinting(value: IEditorOption[disableLayerHinting, Boolean]): Self = StObject.set(x, "disableLayerHinting", value.asInstanceOf[js.Any])
      
      inline def setDisableMonospaceOptimizations(value: IEditorOption[disableMonospaceOptimizations, Boolean]): Self = StObject.set(x, "disableMonospaceOptimizations", value.asInstanceOf[js.Any])
      
      inline def setDomReadOnly(value: IEditorOption[domReadOnly, Boolean]): Self = StObject.set(x, "domReadOnly", value.asInstanceOf[js.Any])
      
      inline def setDragAndDrop(value: IEditorOption[dragAndDrop, Boolean]): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setDropIntoEditor(value: IEditorOption[dropIntoEditor, ReadonlyRequiredIDropInto]): Self = StObject.set(x, "dropIntoEditor", value.asInstanceOf[js.Any])
      
      inline def setEditorClassName(value: IEditorOption[editorClassName, String]): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
      
      inline def setEmptySelectionClipboard(value: IEditorOption[emptySelectionClipboard, Boolean]): Self = StObject.set(x, "emptySelectionClipboard", value.asInstanceOf[js.Any])
      
      inline def setExperimental(value: IEditorOption[experimental, EditorExperimentalOptions]): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExtraEditorClassName(value: IEditorOption[extraEditorClassName, String]): Self = StObject.set(x, "extraEditorClassName", value.asInstanceOf[js.Any])
      
      inline def setFastScrollSensitivity(value: IEditorOption[fastScrollSensitivity, Double]): Self = StObject.set(x, "fastScrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setFind(value: IEditorOption[find, ReadonlyRequiredIEditorFi]): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFixedOverflowWidgets(value: IEditorOption[fixedOverflowWidgets, Boolean]): Self = StObject.set(x, "fixedOverflowWidgets", value.asInstanceOf[js.Any])
      
      inline def setFolding(value: IEditorOption[folding, Boolean]): Self = StObject.set(x, "folding", value.asInstanceOf[js.Any])
      
      inline def setFoldingHighlight(value: IEditorOption[foldingHighlight, Boolean]): Self = StObject.set(x, "foldingHighlight", value.asInstanceOf[js.Any])
      
      inline def setFoldingImportsByDefault(value: IEditorOption[foldingImportsByDefault, Boolean]): Self = StObject.set(x, "foldingImportsByDefault", value.asInstanceOf[js.Any])
      
      inline def setFoldingMaximumRegions(value: IEditorOption[foldingMaximumRegions, Double]): Self = StObject.set(x, "foldingMaximumRegions", value.asInstanceOf[js.Any])
      
      inline def setFoldingStrategy(value: IEditorOption[foldingStrategy, auto | indentation]): Self = StObject.set(x, "foldingStrategy", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: IEditorOption[fontFamily, String]): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontInfo(value: IEditorOption[fontInfo, FontInfo]): Self = StObject.set(x, "fontInfo", value.asInstanceOf[js.Any])
      
      inline def setFontLigatures2(value: IEditorOption[fontLigatures, String]): Self = StObject.set(x, "fontLigatures2", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: IEditorOption[fontSize, Double]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: IEditorOption[fontWeight, String]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFormatOnPaste(value: IEditorOption[formatOnPaste, Boolean]): Self = StObject.set(x, "formatOnPaste", value.asInstanceOf[js.Any])
      
      inline def setFormatOnType(value: IEditorOption[formatOnType, Boolean]): Self = StObject.set(x, "formatOnType", value.asInstanceOf[js.Any])
      
      inline def setGlyphMargin(value: IEditorOption[glyphMargin, Boolean]): Self = StObject.set(x, "glyphMargin", value.asInstanceOf[js.Any])
      
      inline def setGotoLocation(value: IEditorOption[gotoLocation, ReadonlyRequiredIGotoLoca]): Self = StObject.set(x, "gotoLocation", value.asInstanceOf[js.Any])
      
      inline def setHideCursorInOverviewRuler(value: IEditorOption[hideCursorInOverviewRuler, Boolean]): Self = StObject.set(x, "hideCursorInOverviewRuler", value.asInstanceOf[js.Any])
      
      inline def setHover(value: IEditorOption[hover, ReadonlyRequiredIEditorHo]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setInDiffEditor(value: IEditorOption[inDiffEditor, Boolean]): Self = StObject.set(x, "inDiffEditor", value.asInstanceOf[js.Any])
      
      inline def setInlayHints(value: IEditorOption[inlayHints, ReadonlyRequiredIEditorIn]): Self = StObject.set(x, "inlayHints", value.asInstanceOf[js.Any])
      
      inline def setInlineSuggest(value: IEditorOption[inlineSuggest, ReadonlyRequiredIInlineSu]): Self = StObject.set(x, "inlineSuggest", value.asInstanceOf[js.Any])
      
      inline def setLayoutInfo(value: IEditorOption[layoutInfo, EditorLayoutInfo]): Self = StObject.set(x, "layoutInfo", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: IEditorOption[letterSpacing, Double]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLightbulb(value: IEditorOption[lightbulb, ReadonlyRequiredIEditorLi]): Self = StObject.set(x, "lightbulb", value.asInstanceOf[js.Any])
      
      inline def setLineDecorationsWidth(value: IEditorOption[lineDecorationsWidth, String | Double]): Self = StObject.set(x, "lineDecorationsWidth", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: IEditorOption[lineHeight, Double]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineNumbers(value: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
      
      inline def setLineNumbersMinChars(value: IEditorOption[lineNumbersMinChars, Double]): Self = StObject.set(x, "lineNumbersMinChars", value.asInstanceOf[js.Any])
      
      inline def setLinkedEditing(value: IEditorOption[linkedEditing, Boolean]): Self = StObject.set(x, "linkedEditing", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: IEditorOption[links, Boolean]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMatchBrackets(value: IEditorOption[matchBrackets, always | never | near]): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
      
      inline def setMinimap(value: IEditorOption[minimap, ReadonlyRequiredIEditorMi]): Self = StObject.set(x, "minimap", value.asInstanceOf[js.Any])
      
      inline def setMouseStyle(value: IEditorOption[mouseStyle, default | text | copy]): Self = StObject.set(x, "mouseStyle", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelScrollSensitivity(value: IEditorOption[mouseWheelScrollSensitivity, Double]): Self = StObject.set(x, "mouseWheelScrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelZoom(value: IEditorOption[mouseWheelZoom, Boolean]): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      inline def setMultiCursorMergeOverlapping(value: IEditorOption[multiCursorMergeOverlapping, Boolean]): Self = StObject.set(x, "multiCursorMergeOverlapping", value.asInstanceOf[js.Any])
      
      inline def setMultiCursorModifier(value: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Self = StObject.set(x, "multiCursorModifier", value.asInstanceOf[js.Any])
      
      inline def setMultiCursorPaste(value: IEditorOption[multiCursorPaste, spread | full]): Self = StObject.set(x, "multiCursorPaste", value.asInstanceOf[js.Any])
      
      inline def setOccurrencesHighlight(value: IEditorOption[occurrencesHighlight, Boolean]): Self = StObject.set(x, "occurrencesHighlight", value.asInstanceOf[js.Any])
      
      inline def setOverviewRulerBorder(value: IEditorOption[overviewRulerBorder, Boolean]): Self = StObject.set(x, "overviewRulerBorder", value.asInstanceOf[js.Any])
      
      inline def setOverviewRulerLanes(value: IEditorOption[overviewRulerLanes, Double]): Self = StObject.set(x, "overviewRulerLanes", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: IEditorOption[padding, ReadonlyRequiredIEditorPa]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setParameterHints(value: IEditorOption[parameterHints, ReadonlyRequiredIEditorPaCycle]): Self = StObject.set(x, "parameterHints", value.asInstanceOf[js.Any])
      
      inline def setPeekWidgetDefaultFocus(value: IEditorOption[peekWidgetDefaultFocus, tree | editor]): Self = StObject.set(x, "peekWidgetDefaultFocus", value.asInstanceOf[js.Any])
      
      inline def setPixelRatio(value: IEditorOption[pixelRatio, Double]): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setQuickSuggestions(value: IEditorOption[quickSuggestions, InternalQuickSuggestionsOptions]): Self = StObject.set(x, "quickSuggestions", value.asInstanceOf[js.Any])
      
      inline def setQuickSuggestionsDelay(value: IEditorOption[quickSuggestionsDelay, Double]): Self = StObject.set(x, "quickSuggestionsDelay", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: IEditorOption[readOnly, Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRenameOnType(value: IEditorOption[renameOnType, Boolean]): Self = StObject.set(x, "renameOnType", value.asInstanceOf[js.Any])
      
      inline def setRenderControlCharacters(value: IEditorOption[renderControlCharacters, Boolean]): Self = StObject.set(x, "renderControlCharacters", value.asInstanceOf[js.Any])
      
      inline def setRenderFinalNewline(value: IEditorOption[renderFinalNewline, Boolean]): Self = StObject.set(x, "renderFinalNewline", value.asInstanceOf[js.Any])
      
      inline def setRenderLineHighlight(value: IEditorOption[renderLineHighlight, all | line | none | gutter]): Self = StObject.set(x, "renderLineHighlight", value.asInstanceOf[js.Any])
      
      inline def setRenderLineHighlightOnlyWhenFocus(value: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean]): Self = StObject.set(x, "renderLineHighlightOnlyWhenFocus", value.asInstanceOf[js.Any])
      
      inline def setRenderValidationDecorations(value: IEditorOption[renderValidationDecorations, on | off | editable]): Self = StObject.set(x, "renderValidationDecorations", value.asInstanceOf[js.Any])
      
      inline def setRenderWhitespace(value: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing]): Self = StObject.set(x, "renderWhitespace", value.asInstanceOf[js.Any])
      
      inline def setRevealHorizontalRightPadding(value: IEditorOption[revealHorizontalRightPadding, Double]): Self = StObject.set(x, "revealHorizontalRightPadding", value.asInstanceOf[js.Any])
      
      inline def setRoundedSelection(value: IEditorOption[roundedSelection, Boolean]): Self = StObject.set(x, "roundedSelection", value.asInstanceOf[js.Any])
      
      inline def setRulers(value: IEditorOption[rulers, js.Object]): Self = StObject.set(x, "rulers", value.asInstanceOf[js.Any])
      
      inline def setScrollBeyondLastColumn(value: IEditorOption[scrollBeyondLastColumn, Double]): Self = StObject.set(x, "scrollBeyondLastColumn", value.asInstanceOf[js.Any])
      
      inline def setScrollBeyondLastLine(value: IEditorOption[scrollBeyondLastLine, Boolean]): Self = StObject.set(x, "scrollBeyondLastLine", value.asInstanceOf[js.Any])
      
      inline def setScrollPredominantAxis(value: IEditorOption[scrollPredominantAxis, Boolean]): Self = StObject.set(x, "scrollPredominantAxis", value.asInstanceOf[js.Any])
      
      inline def setScrollbar(value: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setSelectOnLineNumbers(value: IEditorOption[selectOnLineNumbers, Boolean]): Self = StObject.set(x, "selectOnLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setSelectionClipboard(value: IEditorOption[selectionClipboard, Boolean]): Self = StObject.set(x, "selectionClipboard", value.asInstanceOf[js.Any])
      
      inline def setSelectionHighlight(value: IEditorOption[selectionHighlight, Boolean]): Self = StObject.set(x, "selectionHighlight", value.asInstanceOf[js.Any])
      
      inline def setShowDeprecated(value: IEditorOption[showDeprecated, Boolean]): Self = StObject.set(x, "showDeprecated", value.asInstanceOf[js.Any])
      
      inline def setShowFoldingControls(value: IEditorOption[showFoldingControls, always | never | mouseover]): Self = StObject.set(x, "showFoldingControls", value.asInstanceOf[js.Any])
      
      inline def setShowUnused(value: IEditorOption[showUnused, Boolean]): Self = StObject.set(x, "showUnused", value.asInstanceOf[js.Any])
      
      inline def setSmartSelect(value: IEditorOption[smartSelect, ReadonlyRequiredISmartSel]): Self = StObject.set(x, "smartSelect", value.asInstanceOf[js.Any])
      
      inline def setSmoothScrolling(value: IEditorOption[smoothScrolling, Boolean]): Self = StObject.set(x, "smoothScrolling", value.asInstanceOf[js.Any])
      
      inline def setSnippetSuggestions(value: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Self = StObject.set(x, "snippetSuggestions", value.asInstanceOf[js.Any])
      
      inline def setStickyTabStops(value: IEditorOption[stickyTabStops, Boolean]): Self = StObject.set(x, "stickyTabStops", value.asInstanceOf[js.Any])
      
      inline def setStopRenderingLineAfter(value: IEditorOption[stopRenderingLineAfter, Double]): Self = StObject.set(x, "stopRenderingLineAfter", value.asInstanceOf[js.Any])
      
      inline def setSuggest(value: IEditorOption[suggest, ReadonlyRequiredISuggestO]): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      inline def setSuggestFontSize(value: IEditorOption[suggestFontSize, Double]): Self = StObject.set(x, "suggestFontSize", value.asInstanceOf[js.Any])
      
      inline def setSuggestLineHeight(value: IEditorOption[suggestLineHeight, Double]): Self = StObject.set(x, "suggestLineHeight", value.asInstanceOf[js.Any])
      
      inline def setSuggestOnTriggerCharacters(value: IEditorOption[suggestOnTriggerCharacters, Boolean]): Self = StObject.set(x, "suggestOnTriggerCharacters", value.asInstanceOf[js.Any])
      
      inline def setSuggestSelection(value: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Self = StObject.set(x, "suggestSelection", value.asInstanceOf[js.Any])
      
      inline def setTabCompletion(value: IEditorOption[tabCompletion, on | off | onlySnippets]): Self = StObject.set(x, "tabCompletion", value.asInstanceOf[js.Any])
      
      inline def setTabFocusMode(value: IEditorOption[tabFocusMode, Boolean]): Self = StObject.set(x, "tabFocusMode", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: IEditorOption[tabIndex, Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setUnfoldOnClickAfterEndOfLine(value: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean]): Self = StObject.set(x, "unfoldOnClickAfterEndOfLine", value.asInstanceOf[js.Any])
      
      inline def setUnicodeHighlight(value: IEditorOption[unicodeHighlighting, Any]): Self = StObject.set(x, "unicodeHighlight", value.asInstanceOf[js.Any])
      
      inline def setUnusualLineTerminators(value: IEditorOption[unusualLineTerminators, auto | off | prompt]): Self = StObject.set(x, "unusualLineTerminators", value.asInstanceOf[js.Any])
      
      inline def setUseShadowDOM(value: IEditorOption[useShadowDOM, Boolean]): Self = StObject.set(x, "useShadowDOM", value.asInstanceOf[js.Any])
      
      inline def setUseTabStops(value: IEditorOption[useTabStops, Boolean]): Self = StObject.set(x, "useTabStops", value.asInstanceOf[js.Any])
      
      inline def setWordSeparators(value: IEditorOption[wordSeparators, String]): Self = StObject.set(x, "wordSeparators", value.asInstanceOf[js.Any])
      
      inline def setWordWrap(value: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapBreakAfterCharacters(value: IEditorOption[wordWrapBreakAfterCharacters, String]): Self = StObject.set(x, "wordWrapBreakAfterCharacters", value.asInstanceOf[js.Any])
      
      inline def setWordWrapBreakBeforeCharacters(value: IEditorOption[wordWrapBreakBeforeCharacters, String]): Self = StObject.set(x, "wordWrapBreakBeforeCharacters", value.asInstanceOf[js.Any])
      
      inline def setWordWrapColumn(value: IEditorOption[typingsJapgolly.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Self = StObject.set(x, "wordWrapColumn", value.asInstanceOf[js.Any])
      
      inline def setWordWrapOverride1(value: IEditorOption[wordWrapOverride1, on | off | inherit]): Self = StObject.set(x, "wordWrapOverride1", value.asInstanceOf[js.Any])
      
      inline def setWordWrapOverride2(value: IEditorOption[wordWrapOverride2, on | off | inherit]): Self = StObject.set(x, "wordWrapOverride2", value.asInstanceOf[js.Any])
      
      inline def setWrappingIndent(value: IEditorOption[wrappingIndent, WrappingIndent]): Self = StObject.set(x, "wrappingIndent", value.asInstanceOf[js.Any])
      
      inline def setWrappingInfo(value: IEditorOption[wrappingInfo, EditorWrappingInfo]): Self = StObject.set(x, "wrappingInfo", value.asInstanceOf[js.Any])
      
      inline def setWrappingStrategy(value: IEditorOption[wrappingStrategy, simple | advanced]): Self = StObject.set(x, "wrappingStrategy", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofEditorType extends StObject {
    
    var ICodeEditor: String
    
    var IDiffEditor: String
  }
  object TypeofEditorType {
    
    inline def apply(ICodeEditor: String, IDiffEditor: String): TypeofEditorType = {
      val __obj = js.Dynamic.literal(ICodeEditor = ICodeEditor.asInstanceOf[js.Any], IDiffEditor = IDiffEditor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofEditorType]
    }
    
    extension [Self <: TypeofEditorType](x: Self) {
      
      inline def setICodeEditor(value: String): Self = StObject.set(x, "ICodeEditor", value.asInstanceOf[js.Any])
      
      inline def setIDiffEditor(value: String): Self = StObject.set(x, "IDiffEditor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofFoldingRangeKind
    extends StObject
       with Instantiable1[/* value */ String, FoldingRangeKind] {
    
    /**
      * Kind for folding range representing a comment. The value of the kind is 'comment'.
      */
    val Comment: FoldingRangeKind = js.native
    
    /**
      * Kind for folding range representing a import. The value of the kind is 'imports'.
      */
    val Imports: FoldingRangeKind = js.native
    
    /**
      * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
      * The value of the kind is 'region'.
      */
    val Region: FoldingRangeKind = js.native
  }
  
  @js.native
  trait TypeofKeyMod
    extends StObject
       with Instantiable0[KeyMod] {
    
    val Alt: Double = js.native
    
    val CtrlCmd: Double = js.native
    
    val Shift: Double = js.native
    
    val WinCtrl: Double = js.native
    
    def chord(firstPart: Double, secondPart: Double): Double = js.native
  }
  
  @js.native
  trait TypeofPosition
    extends StObject
       with Instantiable2[/* lineNumber */ Double, /* column */ Double, Position] {
    
    /**
      * A function that compares positions, useful for sorting
      */
    def compare(a: IPosition, b: IPosition): Double = js.native
    
    /**
      * Test if position `a` equals position `b`
      */
    def equals(): Boolean = js.native
    def equals(a: Null, b: IPosition): Boolean = js.native
    def equals(a: IPosition): Boolean = js.native
    def equals(a: IPosition, b: IPosition): Boolean = js.native
    
    /**
      * Test if position `a` is before position `b`.
      * If the two positions are equal, the result will be false.
      */
    def isBefore(a: IPosition, b: IPosition): Boolean = js.native
    
    /**
      * Test if position `a` is before position `b`.
      * If the two positions are equal, the result will be true.
      */
    def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = js.native
    
    /**
      * Test if `obj` is an `IPosition`.
      */
    def isIPosition(obj: Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = js.native
    
    /**
      * Create a `Position` from an `IPosition`.
      */
    def lift(pos: IPosition): Position = js.native
  }
  
  @js.native
  trait TypeofRange
    extends StObject
       with Instantiable4[
          /* startLineNumber */ Double, 
          /* startColumn */ Double, 
          /* endLineNumber */ Double, 
          /* endColumn */ Double, 
          Range
        ] {
    
    /**
      * Test if the two ranges are intersecting. If the ranges are touching it returns true.
      */
    def areIntersecting(a: IRange, b: IRange): Boolean = js.native
    
    /**
      * Test if the two ranges are touching in any way.
      */
    def areIntersectingOrTouching(a: IRange, b: IRange): Boolean = js.native
    
    /**
      * Create a new empty range using this range's start position.
      */
    def collapseToStart(range: IRange): Range = js.native
    
    /**
      * A function that compares ranges, useful for sorting ranges
      * It will first compare ranges on the endPosition and then on the startPosition
      */
    def compareRangesUsingEnds(a: IRange, b: IRange): Double = js.native
    
    /**
      * A function that compares ranges, useful for sorting ranges
      * It will first compare ranges on the startPosition and then on the endPosition
      */
    def compareRangesUsingStarts(): Double = js.native
    def compareRangesUsingStarts(a: Null, b: IRange): Double = js.native
    def compareRangesUsingStarts(a: Unit, b: IRange): Double = js.native
    def compareRangesUsingStarts(a: IRange): Double = js.native
    def compareRangesUsingStarts(a: IRange, b: IRange): Double = js.native
    
    /**
      * Test if `position` is in `range`. If the position is at the edges, will return true.
      */
    def containsPosition(range: IRange, position: IPosition): Boolean = js.native
    
    /**
      * Test if `otherRange` is in `range`. If the ranges are equal, will return true.
      */
    def containsRange(range: IRange, otherRange: IRange): Boolean = js.native
    
    /**
      * Test if range `a` equals `b`.
      */
    def equalsRange(): Boolean = js.native
    def equalsRange(a: Null, b: IRange): Boolean = js.native
    def equalsRange(a: IRange): Boolean = js.native
    def equalsRange(a: IRange, b: IRange): Boolean = js.native
    
    def fromPositions(start: IPosition): Range = js.native
    def fromPositions(start: IPosition, end: IPosition): Range = js.native
    
    /**
      * Return the end position (which will be after or equal to the start position)
      */
    def getEndPosition(range: IRange): Position = js.native
    
    /**
      * Return the start position (which will be before or equal to the end position)
      */
    def getStartPosition(range: IRange): Position = js.native
    
    /**
      * A intersection of the two ranges.
      */
    def intersectRanges(a: IRange, b: IRange): Range | Null = js.native
    
    /**
      * Test if `range` is empty.
      */
    def isEmpty(range: IRange): Boolean = js.native
    
    /**
      * Test if `obj` is an `IRange`.
      */
    def isIRange(obj: Any): /* is monaco-editor.monaco-editor.IRange */ Boolean = js.native
    
    /**
      * Create a `Range` from an `IRange`.
      */
    def lift(): Null = js.native
    def lift(range: IRange): Range | Null = js.native
    @JSName("lift")
    def lift_Range(range: IRange): Range = js.native
    @JSName("lift")
    def lift_Union(): Range | Null = js.native
    
    /**
      * A reunion of the two ranges.
      * The smallest position will be used as the start point, and the largest one as the end point.
      */
    def plusRange(a: IRange, b: IRange): Range = js.native
    
    /**
      * Test if the range spans multiple lines.
      */
    def spansMultipleLines(range: IRange): Boolean = js.native
    
    /**
      * Test if `otherRange` is strictly in `range` (must start after, and end before). If the ranges are equal, will return false.
      */
    def strictContainsRange(range: IRange, otherRange: IRange): Boolean = js.native
  }
  
  @js.native
  trait TypeofSelection
    extends StObject
       with Instantiable4[
          /* selectionStartLineNumber */ Double, 
          /* selectionStartColumn */ Double, 
          /* positionLineNumber */ Double, 
          /* positionColumn */ Double, 
          Selection
        ] {
    
    /**
      * Create with a direction.
      */
    def createWithDirection(
      startLineNumber: Double,
      startColumn: Double,
      endLineNumber: Double,
      endColumn: Double,
      direction: SelectionDirection
    ): Selection = js.native
    
    /**
      * Create a `Selection` from one or two positions
      */
    def fromPositions(start: IPosition): Selection = js.native
    def fromPositions(start: IPosition, end: IPosition): Selection = js.native
    
    /**
      * Creates a `Selection` from a range, given a direction.
      */
    def fromRange(range: Range, direction: SelectionDirection): Selection = js.native
    
    /**
      * Test if `obj` is an `ISelection`.
      */
    def isISelection(obj: Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = js.native
    
    /**
      * Create a `Selection` from an `ISelection`.
      */
    def liftSelection(sel: ISelection): Selection = js.native
    
    /**
      * `a` equals `b`.
      */
    def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = js.native
    
    /**
      * Test if the two selections are equal.
      */
    def selectionsEqual(a: ISelection, b: ISelection): Boolean = js.native
  }
  
  @js.native
  trait TypeofUri
    extends StObject
       with Instantiable0[Uri] {
    
    /**
      * Creates a new Uri from a file system path, e.g. `c:\my\files`,
      * `/usr/home`, or `\\server\share\some\path`.
      *
      * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
      * as path, not as stringified-uri. E.g. `Uri.file(path)` is **not the same as**
      * `Uri.parse('file://' + path)` because the path might contain characters that are
      * interpreted (# and ?). See the following sample:
      * ```ts
      const good = Uri.file('/coding/c#/project1');
      good.scheme === 'file';
      good.path === '/coding/c#/project1';
      good.fragment === '';
      const bad = Uri.parse('file://' + '/coding/c#/project1');
      bad.scheme === 'file';
      bad.path === '/coding/c'; // path is now broken
      bad.fragment === '/project1';
      ```
      *
      * @param path A file system path (see `Uri#fsPath`)
      */
    def file(path: String): Uri = js.native
    
    def from(components: Fragment): Uri = js.native
    
    def isUri(thing: Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = js.native
    
    /**
      * Join a Uri path with path fragments and normalizes the resulting path.
      *
      * @param uri The input Uri.
      * @param pathFragment The path fragment to add to the Uri path.
      * @returns The resulting Uri.
      */
    def joinPath(uri: Uri, pathFragment: String*): Uri = js.native
    
    /**
      * Creates a new Uri from a string, e.g. `http://www.example.com/some/path`,
      * `file:///usr/home`, or `scheme:with/path`.
      *
      * @param value A string which represents an Uri (see `Uri#toString`).
      */
    def parse(value: String): Uri = js.native
    def parse(value: String, _strict: Boolean): Uri = js.native
    
    def revive(): js.UndefOr[Uri] = js.native
    def revive(data: Uri): js.UndefOr[Uri] = js.native
    def revive(data: UriComponents): js.UndefOr[Uri] = js.native
    @JSName("revive")
    def revive_Uri(data: Uri): Uri = js.native
    @JSName("revive")
    def revive_Uri(data: UriComponents): Uri = js.native
  }
  
  trait Typeofcss extends StObject {
    
    val cssDefaults: LanguageServiceDefaults
    
    val lessDefaults: LanguageServiceDefaults
    
    val scssDefaults: LanguageServiceDefaults
  }
  object Typeofcss {
    
    inline def apply(
      cssDefaults: LanguageServiceDefaults,
      lessDefaults: LanguageServiceDefaults,
      scssDefaults: LanguageServiceDefaults
    ): Typeofcss = {
      val __obj = js.Dynamic.literal(cssDefaults = cssDefaults.asInstanceOf[js.Any], lessDefaults = lessDefaults.asInstanceOf[js.Any], scssDefaults = scssDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcss]
    }
    
    extension [Self <: Typeofcss](x: Self) {
      
      inline def setCssDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "cssDefaults", value.asInstanceOf[js.Any])
      
      inline def setLessDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "lessDefaults", value.asInstanceOf[js.Any])
      
      inline def setScssDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "scssDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofeditor extends StObject {
    
    var ApplyUpdateResult: Instantiable2[
        /* import warning: RewrittenClass.unapply cls was tparam T */ /* newValue */ Any, 
        /* didChange */ Boolean, 
        typingsJapgolly.monacoEditor.mod.editor.ApplyUpdateResult[js.Object]
      ] = js.native
    
    var BareFontInfo: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.BareFontInfo] = js.native
    
    var ConfigurationChangedEvent: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.ConfigurationChangedEvent] = js.native
    
    val EditorOptions: TypeofEditorOptions = js.native
    
    val EditorType: TypeofEditorType = js.native
    
    var FindMatch: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.FindMatch] = js.native
    
    var FontInfo: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.FontInfo] = js.native
    
    var TextModelResolvedOptions: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.TextModelResolvedOptions] = js.native
    
    def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
    
    def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
    
    def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
    def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
    
    def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
    def create(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
    def create(domElement: HTMLElement, options: IStandaloneEditorConstructionOptions): IStandaloneCodeEditor = js.native
    def create(
      domElement: HTMLElement,
      options: IStandaloneEditorConstructionOptions,
      `override`: IEditorOverrideServices
    ): IStandaloneCodeEditor = js.native
    
    def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
    def createDiffEditor(domElement: HTMLElement, options: Unit, `override`: IEditorOverrideServices): IStandaloneDiffEditor = js.native
    def createDiffEditor(domElement: HTMLElement, options: IStandaloneDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
    def createDiffEditor(
      domElement: HTMLElement,
      options: IStandaloneDiffEditorConstructionOptions,
      `override`: IEditorOverrideServices
    ): IStandaloneDiffEditor = js.native
    
    def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
    def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
    
    def createModel(value: String): ITextModel = js.native
    def createModel(value: String, language: String): ITextModel = js.native
    def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
    def createModel(value: String, language: Unit, uri: Uri): ITextModel = js.native
    
    def createWebWorker[T /* <: js.Object */](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
    
    def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
    
    def getDiffEditors(): js.Array[IDiffEditor] = js.native
    
    def getEditors(): js.Array[ICodeEditor] = js.native
    
    def getModel(uri: Uri): ITextModel | Null = js.native
    
    def getModelMarkers(filter: Owner): js.Array[IMarker] = js.native
    
    def getModels(): js.Array[ITextModel] = js.native
    
    def onDidChangeMarkers(listener: js.Function1[/* e */ js.Array[Uri], Unit]): IDisposable = js.native
    
    def onDidChangeModelLanguage(listener: js.Function1[/* e */ Model, Unit]): IDisposable = js.native
    
    def onDidCreateDiffEditor(listener: js.Function1[/* diffEditor */ IDiffEditor, Unit]): IDisposable = js.native
    
    def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
    
    def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
    
    def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
    
    def registerCommand(id: String, handler: js.Function2[/* accessor */ Any, /* repeated */ Any, Unit]): IDisposable = js.native
    
    def remeasureFonts(): Unit = js.native
    
    def removeAllMarkers(owner: String): Unit = js.native
    
    def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
    
    def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
    
    def setTheme(themeName: String): Unit = js.native
    
    def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
  }
  
  @js.native
  trait Typeofhtml extends StObject {
    
    val handlebarDefaults: typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    val handlebarLanguageService: LanguageServiceRegistration = js.native
    
    val htmlDefaults: typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    val htmlLanguageService: LanguageServiceRegistration = js.native
    
    val razorDefaults: typingsJapgolly.monacoEditor.mod.languages.html.LanguageServiceDefaults = js.native
    
    val razorLanguageService: LanguageServiceRegistration = js.native
    
    def registerHTMLLanguageService(languageId: String): LanguageServiceRegistration = js.native
    def registerHTMLLanguageService(languageId: String, options: Unit, modeConfiguration: ModeConfiguration): LanguageServiceRegistration = js.native
    def registerHTMLLanguageService(languageId: String, options: Options): LanguageServiceRegistration = js.native
    def registerHTMLLanguageService(languageId: String, options: Options, modeConfiguration: ModeConfiguration): LanguageServiceRegistration = js.native
  }
  
  trait Typeofjson extends StObject {
    
    val jsonDefaults: typingsJapgolly.monacoEditor.mod.languages.json.LanguageServiceDefaults
  }
  object Typeofjson {
    
    inline def apply(jsonDefaults: typingsJapgolly.monacoEditor.mod.languages.json.LanguageServiceDefaults): Typeofjson = {
      val __obj = js.Dynamic.literal(jsonDefaults = jsonDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofjson]
    }
    
    extension [Self <: Typeofjson](x: Self) {
      
      inline def setJsonDefaults(value: typingsJapgolly.monacoEditor.mod.languages.json.LanguageServiceDefaults): Self = StObject.set(x, "jsonDefaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflanguages extends StObject {
    
    var FoldingRangeKind: TypeofFoldingRangeKind = js.native
    
    val css: Typeofcss = js.native
    
    def getEncodedLanguageId(languageId: String): Double = js.native
    
    def getLanguages(): js.Array[ILanguageExtensionPoint] = js.native
    
    val html: Typeofhtml = js.native
    
    val json: Typeofjson = js.native
    
    def onLanguage(languageId: String, callback: js.Function0[Unit]): IDisposable = js.native
    
    def register(language: ILanguageExtensionPoint): Unit = js.native
    
    def registerCodeActionProvider(languageSelector: LanguageSelector, provider: CodeActionProvider): IDisposable = js.native
    def registerCodeActionProvider(
      languageSelector: LanguageSelector,
      provider: CodeActionProvider,
      metadata: CodeActionProviderMetadata
    ): IDisposable = js.native
    
    def registerCodeLensProvider(languageSelector: LanguageSelector, provider: CodeLensProvider): IDisposable = js.native
    
    def registerColorProvider(languageSelector: LanguageSelector, provider: DocumentColorProvider): IDisposable = js.native
    
    def registerCompletionItemProvider(languageSelector: LanguageSelector, provider: CompletionItemProvider): IDisposable = js.native
    
    def registerDeclarationProvider(languageSelector: LanguageSelector, provider: DeclarationProvider): IDisposable = js.native
    
    def registerDefinitionProvider(languageSelector: LanguageSelector, provider: DefinitionProvider): IDisposable = js.native
    
    def registerDocumentFormattingEditProvider(languageSelector: LanguageSelector, provider: DocumentFormattingEditProvider): IDisposable = js.native
    
    def registerDocumentHighlightProvider(languageSelector: LanguageSelector, provider: DocumentHighlightProvider): IDisposable = js.native
    
    def registerDocumentRangeFormattingEditProvider(languageSelector: LanguageSelector, provider: DocumentRangeFormattingEditProvider): IDisposable = js.native
    
    def registerDocumentRangeSemanticTokensProvider(languageSelector: LanguageSelector, provider: DocumentRangeSemanticTokensProvider): IDisposable = js.native
    
    def registerDocumentSemanticTokensProvider(languageSelector: LanguageSelector, provider: DocumentSemanticTokensProvider): IDisposable = js.native
    
    def registerDocumentSymbolProvider(languageSelector: LanguageSelector, provider: DocumentSymbolProvider): IDisposable = js.native
    
    def registerFoldingRangeProvider(languageSelector: LanguageSelector, provider: FoldingRangeProvider): IDisposable = js.native
    
    def registerHoverProvider(languageSelector: LanguageSelector, provider: HoverProvider): IDisposable = js.native
    
    def registerImplementationProvider(languageSelector: LanguageSelector, provider: ImplementationProvider): IDisposable = js.native
    
    def registerInlayHintsProvider(languageSelector: LanguageSelector, provider: InlayHintsProvider): IDisposable = js.native
    
    def registerInlineCompletionsProvider(
      languageSelector: LanguageSelector,
      provider: InlineCompletionsProvider[InlineCompletions[InlineCompletion]]
    ): IDisposable = js.native
    
    def registerLinkProvider(languageSelector: LanguageSelector, provider: LinkProvider): IDisposable = js.native
    
    def registerLinkedEditingRangeProvider(languageSelector: LanguageSelector, provider: LinkedEditingRangeProvider): IDisposable = js.native
    
    def registerOnTypeFormattingEditProvider(languageSelector: LanguageSelector, provider: OnTypeFormattingEditProvider): IDisposable = js.native
    
    def registerReferenceProvider(languageSelector: LanguageSelector, provider: ReferenceProvider): IDisposable = js.native
    
    def registerRenameProvider(languageSelector: LanguageSelector, provider: RenameProvider): IDisposable = js.native
    
    def registerSelectionRangeProvider(languageSelector: LanguageSelector, provider: SelectionRangeProvider): IDisposable = js.native
    
    def registerSignatureHelpProvider(languageSelector: LanguageSelector, provider: SignatureHelpProvider): IDisposable = js.native
    
    def registerTokensProviderFactory(languageId: String, factory: TokensProviderFactory): IDisposable = js.native
    
    def registerTypeDefinitionProvider(languageSelector: LanguageSelector, provider: TypeDefinitionProvider): IDisposable = js.native
    
    def setColorMap(): Unit = js.native
    def setColorMap(colorMap: js.Array[String]): Unit = js.native
    
    def setLanguageConfiguration(languageId: String, configuration: LanguageConfiguration): IDisposable = js.native
    
    def setMonarchTokensProvider(languageId: String, languageDef: Thenable[IMonarchLanguage]): IDisposable = js.native
    def setMonarchTokensProvider(languageId: String, languageDef: IMonarchLanguage): IDisposable = js.native
    
    def setTokensProvider(languageId: String, provider: Thenable[TokensProvider | EncodedTokensProvider]): IDisposable = js.native
    def setTokensProvider(languageId: String, provider: EncodedTokensProvider): IDisposable = js.native
    def setTokensProvider(languageId: String, provider: TokensProvider): IDisposable = js.native
    
    val typescript: Typeoftypescript = js.native
  }
  
  trait TypeofmonacoEditor extends StObject {
    
    var CancellationTokenSource: Instantiable0[typingsJapgolly.monacoEditor.mod.CancellationTokenSource]
    
    var Emitter: Instantiable0[typingsJapgolly.monacoEditor.mod.Emitter[js.Object]]
    
    var KeyMod: TypeofKeyMod
    
    var Position: TypeofPosition
    
    var Range: TypeofRange
    
    var Selection: TypeofSelection
    
    var Token: Instantiable3[
        /* offset */ Double, 
        /* type */ String, 
        /* language */ String, 
        typingsJapgolly.monacoEditor.mod.Token
      ]
    
    var Uri: TypeofUri
    
    val editor: Typeofeditor
    
    val languages: Typeoflanguages
    
    val worker: Any
  }
  object TypeofmonacoEditor {
    
    inline def apply(
      CancellationTokenSource: Instantiable0[CancellationTokenSource],
      Emitter: Instantiable0[Emitter[js.Object]],
      KeyMod: TypeofKeyMod,
      Position: TypeofPosition,
      Range: TypeofRange,
      Selection: TypeofSelection,
      Token: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token],
      Uri: TypeofUri,
      editor: Typeofeditor,
      languages: Typeoflanguages,
      worker: Any
    ): TypeofmonacoEditor = {
      val __obj = js.Dynamic.literal(CancellationTokenSource = CancellationTokenSource.asInstanceOf[js.Any], Emitter = Emitter.asInstanceOf[js.Any], KeyMod = KeyMod.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofmonacoEditor]
    }
    
    extension [Self <: TypeofmonacoEditor](x: Self) {
      
      inline def setCancellationTokenSource(value: Instantiable0[CancellationTokenSource]): Self = StObject.set(x, "CancellationTokenSource", value.asInstanceOf[js.Any])
      
      inline def setEditor(value: Typeofeditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEmitter(value: Instantiable0[Emitter[js.Object]]): Self = StObject.set(x, "Emitter", value.asInstanceOf[js.Any])
      
      inline def setKeyMod(value: TypeofKeyMod): Self = StObject.set(x, "KeyMod", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: Typeoflanguages): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: TypeofPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      inline def setRange(value: TypeofRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: TypeofSelection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Instantiable3[/* offset */ Double, /* type */ String, /* language */ String, Token]): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      inline def setUri(value: TypeofUri): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: Any): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeoftypescript extends StObject {
    
    def getJavaScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]
    
    def getTypeScriptWorker(): js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]
    
    val javascriptDefaults: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults
    
    val typescriptDefaults: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults
    
    val typescriptVersion: String
  }
  object Typeoftypescript {
    
    inline def apply(
      getJavaScriptWorker: CallbackTo[js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]],
      getTypeScriptWorker: CallbackTo[js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]],
      javascriptDefaults: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults,
      typescriptDefaults: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults,
      typescriptVersion: String
    ): Typeoftypescript = {
      val __obj = js.Dynamic.literal(getJavaScriptWorker = getJavaScriptWorker.toJsFn, getTypeScriptWorker = getTypeScriptWorker.toJsFn, javascriptDefaults = javascriptDefaults.asInstanceOf[js.Any], typescriptDefaults = typescriptDefaults.asInstanceOf[js.Any], typescriptVersion = typescriptVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeoftypescript]
    }
    
    extension [Self <: Typeoftypescript](x: Self) {
      
      inline def setGetJavaScriptWorker(value: CallbackTo[js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]]): Self = StObject.set(x, "getJavaScriptWorker", value.toJsFn)
      
      inline def setGetTypeScriptWorker(value: CallbackTo[js.Promise[js.Function1[/* repeated */ Uri, js.Promise[TypeScriptWorker]]]]): Self = StObject.set(x, "getTypeScriptWorker", value.toJsFn)
      
      inline def setJavascriptDefaults(value: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults): Self = StObject.set(x, "javascriptDefaults", value.asInstanceOf[js.Any])
      
      inline def setTypescriptDefaults(value: typingsJapgolly.monacoEditor.mod.languages.typescript.LanguageServiceDefaults): Self = StObject.set(x, "typescriptDefaults", value.asInstanceOf[js.Any])
      
      inline def setTypescriptVersion(value: String): Self = StObject.set(x, "typescriptVersion", value.asInstanceOf[js.Any])
    }
  }
}

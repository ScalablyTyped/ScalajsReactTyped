package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.AnonComments
import typingsJapgolly.monacoEditor.monacoEditorStrings.`100`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`200`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`300`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`400`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`500`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`600`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`700`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`800`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`900`
import typingsJapgolly.monacoEditor.monacoEditorStrings.`inline`
import typingsJapgolly.monacoEditor.monacoEditorStrings.all
import typingsJapgolly.monacoEditor.monacoEditorStrings.alt
import typingsJapgolly.monacoEditor.monacoEditorStrings.always
import typingsJapgolly.monacoEditor.monacoEditorStrings.auto
import typingsJapgolly.monacoEditor.monacoEditorStrings.bold
import typingsJapgolly.monacoEditor.monacoEditorStrings.bolder
import typingsJapgolly.monacoEditor.monacoEditorStrings.bottom
import typingsJapgolly.monacoEditor.monacoEditorStrings.boundary
import typingsJapgolly.monacoEditor.monacoEditorStrings.bounded
import typingsJapgolly.monacoEditor.monacoEditorStrings.ctrlCmd
import typingsJapgolly.monacoEditor.monacoEditorStrings.first
import typingsJapgolly.monacoEditor.monacoEditorStrings.gutter
import typingsJapgolly.monacoEditor.monacoEditorStrings.indentation
import typingsJapgolly.monacoEditor.monacoEditorStrings.inherit
import typingsJapgolly.monacoEditor.monacoEditorStrings.initial
import typingsJapgolly.monacoEditor.monacoEditorStrings.interval
import typingsJapgolly.monacoEditor.monacoEditorStrings.lighter
import typingsJapgolly.monacoEditor.monacoEditorStrings.line
import typingsJapgolly.monacoEditor.monacoEditorStrings.mouseover
import typingsJapgolly.monacoEditor.monacoEditorStrings.none
import typingsJapgolly.monacoEditor.monacoEditorStrings.normal
import typingsJapgolly.monacoEditor.monacoEditorStrings.off
import typingsJapgolly.monacoEditor.monacoEditorStrings.on
import typingsJapgolly.monacoEditor.monacoEditorStrings.onlySnippets
import typingsJapgolly.monacoEditor.monacoEditorStrings.recentlyUsed
import typingsJapgolly.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import typingsJapgolly.monacoEditor.monacoEditorStrings.relative
import typingsJapgolly.monacoEditor.monacoEditorStrings.selection
import typingsJapgolly.monacoEditor.monacoEditorStrings.smart
import typingsJapgolly.monacoEditor.monacoEditorStrings.top
import typingsJapgolly.monacoEditor.monacoEditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorConstructionOptions extends IEditorOptions {
  /**
    * An URL to open when Ctrl+H (Windows and Linux) or Cmd+H (OSX) is pressed in
    * the accessibility help dialog in the editor.
    *
    * Defaults to "https://go.microsoft.com/fwlink/?linkid=852450"
    */
  var accessibilityHelpUrl: js.UndefOr[String] = js.undefined
  /**
    * The initial language of the auto created model in the editor.
    * To not create automatically a model, use `model: null`.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * The initial model associated with this code editor.
    */
  var model: js.UndefOr[ITextModel | Null] = js.undefined
  /**
    * Initial theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`
    */
  var theme: js.UndefOr[String] = js.undefined
  /**
    * The initial value of the auto created model in the editor.
    * To not create automatically a model, use `model: null`.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IEditorConstructionOptions {
  @scala.inline
  def apply(
    acceptSuggestionOnCommitCharacter: js.UndefOr[Boolean] = js.undefined,
    acceptSuggestionOnEnter: Boolean | on | smart | off = null,
    accessibilityHelpUrl: String = null,
    accessibilitySupport: auto | off | on = null,
    ariaLabel: String = null,
    autoClosingBrackets: EditorAutoClosingStrategy = null,
    autoClosingOvertype: EditorAutoClosingOvertypeStrategy = null,
    autoClosingQuotes: EditorAutoClosingStrategy = null,
    autoIndent: js.UndefOr[Boolean] = js.undefined,
    autoSurround: EditorAutoSurroundStrategy = null,
    automaticLayout: js.UndefOr[Boolean] = js.undefined,
    codeActionsOnSave: ICodeActionsOnSaveOptions = null,
    codeActionsOnSaveTimeout: Int | Double = null,
    codeLens: js.UndefOr[Boolean] = js.undefined,
    colorDecorators: js.UndefOr[Boolean] = js.undefined,
    contextmenu: js.UndefOr[Boolean] = js.undefined,
    copyWithSyntaxHighlighting: js.UndefOr[Boolean] = js.undefined,
    cursorBlinking: String = null,
    cursorSmoothCaretAnimation: js.UndefOr[Boolean] = js.undefined,
    cursorStyle: String = null,
    cursorSurroundingLines: Int | Double = null,
    cursorWidth: Int | Double = null,
    disableLayerHinting: js.UndefOr[Boolean] = js.undefined,
    disableMonospaceOptimizations: js.UndefOr[Boolean] = js.undefined,
    dragAndDrop: js.UndefOr[Boolean] = js.undefined,
    emptySelectionClipboard: js.UndefOr[Boolean] = js.undefined,
    extraEditorClassName: String = null,
    fastScrollSensitivity: Int | Double = null,
    find: IEditorFindOptions = null,
    fixedOverflowWidgets: js.UndefOr[Boolean] = js.undefined,
    folding: js.UndefOr[Boolean] = js.undefined,
    foldingStrategy: auto | indentation = null,
    fontFamily: String = null,
    fontLigatures: js.UndefOr[Boolean] = js.undefined,
    fontSize: Int | Double = null,
    fontWeight: normal | bold | bolder | lighter | initial | inherit | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null,
    formatOnPaste: js.UndefOr[Boolean] = js.undefined,
    formatOnType: js.UndefOr[Boolean] = js.undefined,
    glyphMargin: js.UndefOr[Boolean] = js.undefined,
    gotoLocation: IGotoLocationOptions = null,
    hideCursorInOverviewRuler: js.UndefOr[Boolean] = js.undefined,
    highlightActiveIndentGuide: js.UndefOr[Boolean] = js.undefined,
    hover: IEditorHoverOptions = null,
    language: String = null,
    letterSpacing: Int | Double = null,
    lightbulb: IEditorLightbulbOptions = null,
    lineDecorationsWidth: Double | String = null,
    lineHeight: Int | Double = null,
    lineNumbers: on | off | relative | interval | (js.Function1[/* lineNumber */ Double, String]) = null,
    lineNumbersMinChars: Int | Double = null,
    links: js.UndefOr[Boolean] = js.undefined,
    matchBrackets: js.UndefOr[Boolean] = js.undefined,
    minimap: IEditorMinimapOptions = null,
    model: ITextModel = null,
    mouseWheelScrollSensitivity: Int | Double = null,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    multiCursorMergeOverlapping: js.UndefOr[Boolean] = js.undefined,
    multiCursorModifier: ctrlCmd | alt = null,
    occurrencesHighlight: js.UndefOr[Boolean] = js.undefined,
    overviewRulerBorder: js.UndefOr[Boolean] = js.undefined,
    overviewRulerLanes: Int | Double = null,
    parameterHints: IEditorParameterHintOptions = null,
    quickSuggestions: Boolean | AnonComments = null,
    quickSuggestionsDelay: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderControlCharacters: js.UndefOr[Boolean] = js.undefined,
    renderFinalNewline: js.UndefOr[Boolean] = js.undefined,
    renderIndentGuides: js.UndefOr[Boolean] = js.undefined,
    renderLineHighlight: none | gutter | line | all = null,
    renderWhitespace: none | boundary | selection | all = null,
    revealHorizontalRightPadding: Int | Double = null,
    roundedSelection: js.UndefOr[Boolean] = js.undefined,
    rulers: js.Array[Double] = null,
    scrollBeyondLastColumn: Int | Double = null,
    scrollBeyondLastLine: js.UndefOr[Boolean] = js.undefined,
    scrollbar: IEditorScrollbarOptions = null,
    selectOnLineNumbers: js.UndefOr[Boolean] = js.undefined,
    selectionClipboard: js.UndefOr[Boolean] = js.undefined,
    selectionHighlight: js.UndefOr[Boolean] = js.undefined,
    showFoldingControls: always | mouseover = null,
    showUnused: js.UndefOr[Boolean] = js.undefined,
    smoothScrolling: js.UndefOr[Boolean] = js.undefined,
    snippetSuggestions: top | bottom | `inline` | none = null,
    stopRenderingLineAfter: Int | Double = null,
    suggest: ISuggestOptions = null,
    suggestFontSize: Int | Double = null,
    suggestLineHeight: Int | Double = null,
    suggestOnTriggerCharacters: js.UndefOr[Boolean] = js.undefined,
    suggestSelection: first | recentlyUsed | recentlyUsedByPrefix = null,
    tabCompletion: Boolean | on | off | onlySnippets = null,
    theme: String = null,
    useTabStops: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    wordBasedSuggestions: js.UndefOr[Boolean] = js.undefined,
    wordSeparators: String = null,
    wordWrap: off | on | wordWrapColumn | bounded = null,
    wordWrapBreakAfterCharacters: String = null,
    wordWrapBreakBeforeCharacters: String = null,
    wordWrapBreakObtrusiveCharacters: String = null,
    wordWrapColumn: Int | Double = null,
    wordWrapMinified: js.UndefOr[Boolean] = js.undefined,
    wrappingIndent: String = null
  ): IEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptSuggestionOnCommitCharacter)) __obj.updateDynamic("acceptSuggestionOnCommitCharacter")(acceptSuggestionOnCommitCharacter.asInstanceOf[js.Any])
    if (acceptSuggestionOnEnter != null) __obj.updateDynamic("acceptSuggestionOnEnter")(acceptSuggestionOnEnter.asInstanceOf[js.Any])
    if (accessibilityHelpUrl != null) __obj.updateDynamic("accessibilityHelpUrl")(accessibilityHelpUrl.asInstanceOf[js.Any])
    if (accessibilitySupport != null) __obj.updateDynamic("accessibilitySupport")(accessibilitySupport.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (autoClosingBrackets != null) __obj.updateDynamic("autoClosingBrackets")(autoClosingBrackets.asInstanceOf[js.Any])
    if (autoClosingOvertype != null) __obj.updateDynamic("autoClosingOvertype")(autoClosingOvertype.asInstanceOf[js.Any])
    if (autoClosingQuotes != null) __obj.updateDynamic("autoClosingQuotes")(autoClosingQuotes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoIndent)) __obj.updateDynamic("autoIndent")(autoIndent.asInstanceOf[js.Any])
    if (autoSurround != null) __obj.updateDynamic("autoSurround")(autoSurround.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticLayout)) __obj.updateDynamic("automaticLayout")(automaticLayout.asInstanceOf[js.Any])
    if (codeActionsOnSave != null) __obj.updateDynamic("codeActionsOnSave")(codeActionsOnSave.asInstanceOf[js.Any])
    if (codeActionsOnSaveTimeout != null) __obj.updateDynamic("codeActionsOnSaveTimeout")(codeActionsOnSaveTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(codeLens)) __obj.updateDynamic("codeLens")(codeLens.asInstanceOf[js.Any])
    if (!js.isUndefined(colorDecorators)) __obj.updateDynamic("colorDecorators")(colorDecorators.asInstanceOf[js.Any])
    if (!js.isUndefined(contextmenu)) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (!js.isUndefined(copyWithSyntaxHighlighting)) __obj.updateDynamic("copyWithSyntaxHighlighting")(copyWithSyntaxHighlighting.asInstanceOf[js.Any])
    if (cursorBlinking != null) __obj.updateDynamic("cursorBlinking")(cursorBlinking.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorSmoothCaretAnimation)) __obj.updateDynamic("cursorSmoothCaretAnimation")(cursorSmoothCaretAnimation.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (cursorSurroundingLines != null) __obj.updateDynamic("cursorSurroundingLines")(cursorSurroundingLines.asInstanceOf[js.Any])
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLayerHinting)) __obj.updateDynamic("disableLayerHinting")(disableLayerHinting.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMonospaceOptimizations)) __obj.updateDynamic("disableMonospaceOptimizations")(disableMonospaceOptimizations.asInstanceOf[js.Any])
    if (!js.isUndefined(dragAndDrop)) __obj.updateDynamic("dragAndDrop")(dragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(emptySelectionClipboard)) __obj.updateDynamic("emptySelectionClipboard")(emptySelectionClipboard.asInstanceOf[js.Any])
    if (extraEditorClassName != null) __obj.updateDynamic("extraEditorClassName")(extraEditorClassName.asInstanceOf[js.Any])
    if (fastScrollSensitivity != null) __obj.updateDynamic("fastScrollSensitivity")(fastScrollSensitivity.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedOverflowWidgets)) __obj.updateDynamic("fixedOverflowWidgets")(fixedOverflowWidgets.asInstanceOf[js.Any])
    if (!js.isUndefined(folding)) __obj.updateDynamic("folding")(folding.asInstanceOf[js.Any])
    if (foldingStrategy != null) __obj.updateDynamic("foldingStrategy")(foldingStrategy.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontLigatures)) __obj.updateDynamic("fontLigatures")(fontLigatures.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnPaste)) __obj.updateDynamic("formatOnPaste")(formatOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(formatOnType)) __obj.updateDynamic("formatOnType")(formatOnType.asInstanceOf[js.Any])
    if (!js.isUndefined(glyphMargin)) __obj.updateDynamic("glyphMargin")(glyphMargin.asInstanceOf[js.Any])
    if (gotoLocation != null) __obj.updateDynamic("gotoLocation")(gotoLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursorInOverviewRuler)) __obj.updateDynamic("hideCursorInOverviewRuler")(hideCursorInOverviewRuler.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveIndentGuide)) __obj.updateDynamic("highlightActiveIndentGuide")(highlightActiveIndentGuide.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lightbulb != null) __obj.updateDynamic("lightbulb")(lightbulb.asInstanceOf[js.Any])
    if (lineDecorationsWidth != null) __obj.updateDynamic("lineDecorationsWidth")(lineDecorationsWidth.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineNumbers != null) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (lineNumbersMinChars != null) __obj.updateDynamic("lineNumbersMinChars")(lineNumbersMinChars.asInstanceOf[js.Any])
    if (!js.isUndefined(links)) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (minimap != null) __obj.updateDynamic("minimap")(minimap.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mouseWheelScrollSensitivity != null) __obj.updateDynamic("mouseWheelScrollSensitivity")(mouseWheelScrollSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(multiCursorMergeOverlapping)) __obj.updateDynamic("multiCursorMergeOverlapping")(multiCursorMergeOverlapping.asInstanceOf[js.Any])
    if (multiCursorModifier != null) __obj.updateDynamic("multiCursorModifier")(multiCursorModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(occurrencesHighlight)) __obj.updateDynamic("occurrencesHighlight")(occurrencesHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(overviewRulerBorder)) __obj.updateDynamic("overviewRulerBorder")(overviewRulerBorder.asInstanceOf[js.Any])
    if (overviewRulerLanes != null) __obj.updateDynamic("overviewRulerLanes")(overviewRulerLanes.asInstanceOf[js.Any])
    if (parameterHints != null) __obj.updateDynamic("parameterHints")(parameterHints.asInstanceOf[js.Any])
    if (quickSuggestions != null) __obj.updateDynamic("quickSuggestions")(quickSuggestions.asInstanceOf[js.Any])
    if (quickSuggestionsDelay != null) __obj.updateDynamic("quickSuggestionsDelay")(quickSuggestionsDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(renderControlCharacters)) __obj.updateDynamic("renderControlCharacters")(renderControlCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFinalNewline)) __obj.updateDynamic("renderFinalNewline")(renderFinalNewline.asInstanceOf[js.Any])
    if (!js.isUndefined(renderIndentGuides)) __obj.updateDynamic("renderIndentGuides")(renderIndentGuides.asInstanceOf[js.Any])
    if (renderLineHighlight != null) __obj.updateDynamic("renderLineHighlight")(renderLineHighlight.asInstanceOf[js.Any])
    if (renderWhitespace != null) __obj.updateDynamic("renderWhitespace")(renderWhitespace.asInstanceOf[js.Any])
    if (revealHorizontalRightPadding != null) __obj.updateDynamic("revealHorizontalRightPadding")(revealHorizontalRightPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedSelection)) __obj.updateDynamic("roundedSelection")(roundedSelection.asInstanceOf[js.Any])
    if (rulers != null) __obj.updateDynamic("rulers")(rulers.asInstanceOf[js.Any])
    if (scrollBeyondLastColumn != null) __obj.updateDynamic("scrollBeyondLastColumn")(scrollBeyondLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollBeyondLastLine)) __obj.updateDynamic("scrollBeyondLastLine")(scrollBeyondLastLine.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnLineNumbers)) __obj.updateDynamic("selectOnLineNumbers")(selectOnLineNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionClipboard)) __obj.updateDynamic("selectionClipboard")(selectionClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionHighlight)) __obj.updateDynamic("selectionHighlight")(selectionHighlight.asInstanceOf[js.Any])
    if (showFoldingControls != null) __obj.updateDynamic("showFoldingControls")(showFoldingControls.asInstanceOf[js.Any])
    if (!js.isUndefined(showUnused)) __obj.updateDynamic("showUnused")(showUnused.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling.asInstanceOf[js.Any])
    if (snippetSuggestions != null) __obj.updateDynamic("snippetSuggestions")(snippetSuggestions.asInstanceOf[js.Any])
    if (stopRenderingLineAfter != null) __obj.updateDynamic("stopRenderingLineAfter")(stopRenderingLineAfter.asInstanceOf[js.Any])
    if (suggest != null) __obj.updateDynamic("suggest")(suggest.asInstanceOf[js.Any])
    if (suggestFontSize != null) __obj.updateDynamic("suggestFontSize")(suggestFontSize.asInstanceOf[js.Any])
    if (suggestLineHeight != null) __obj.updateDynamic("suggestLineHeight")(suggestLineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestOnTriggerCharacters)) __obj.updateDynamic("suggestOnTriggerCharacters")(suggestOnTriggerCharacters.asInstanceOf[js.Any])
    if (suggestSelection != null) __obj.updateDynamic("suggestSelection")(suggestSelection.asInstanceOf[js.Any])
    if (tabCompletion != null) __obj.updateDynamic("tabCompletion")(tabCompletion.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabStops)) __obj.updateDynamic("useTabStops")(useTabStops.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(wordBasedSuggestions)) __obj.updateDynamic("wordBasedSuggestions")(wordBasedSuggestions.asInstanceOf[js.Any])
    if (wordSeparators != null) __obj.updateDynamic("wordSeparators")(wordSeparators.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    if (wordWrapBreakAfterCharacters != null) __obj.updateDynamic("wordWrapBreakAfterCharacters")(wordWrapBreakAfterCharacters.asInstanceOf[js.Any])
    if (wordWrapBreakBeforeCharacters != null) __obj.updateDynamic("wordWrapBreakBeforeCharacters")(wordWrapBreakBeforeCharacters.asInstanceOf[js.Any])
    if (wordWrapBreakObtrusiveCharacters != null) __obj.updateDynamic("wordWrapBreakObtrusiveCharacters")(wordWrapBreakObtrusiveCharacters.asInstanceOf[js.Any])
    if (wordWrapColumn != null) __obj.updateDynamic("wordWrapColumn")(wordWrapColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapMinified)) __obj.updateDynamic("wordWrapMinified")(wordWrapMinified.asInstanceOf[js.Any])
    if (wrappingIndent != null) __obj.updateDynamic("wrappingIndent")(wrappingIndent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorConstructionOptions]
  }
}


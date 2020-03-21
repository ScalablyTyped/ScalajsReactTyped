package typingsJapgolly.jupyterlabCodemirror.editorMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.codemirror.mod.Doc
import typingsJapgolly.codemirror.mod.Editor
import typingsJapgolly.codemirror.mod.Position
import typingsJapgolly.codemirror.mod.SearchCursor
import typingsJapgolly.codemirror.mod.StyleActiveLine
import typingsJapgolly.codemirror.mod.TextMarker
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.EdgeLocation
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IPosition
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IRange
import typingsJapgolly.jupyterlabCodemirror.AnonBias
import typingsJapgolly.jupyterlabCodemirror.AnonBottom
import typingsJapgolly.jupyterlabCodemirror.AnonFrom
import typingsJapgolly.jupyterlabCodemirror.editorMod.CodeMirrorEditor.IOptions
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.autoClosingBrackets
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.bounded
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.codeFolding
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.coverGutterNextToScrollbar
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.dragDrop
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.electricChars
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.extraKeys
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.fixedGutter
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.foldGutter
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.fontFamily
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.fontSize
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.gutters
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.insertSpaces
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.keyMap
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineNumbers
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineSeparator
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineWiseCopyCut
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineWrap
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.local
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.matchBrackets
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.mode
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.off
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.on
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.page
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.readOnly
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.rulers
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.scrollPastEnd
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.scrollbarStyle
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.selectionPointer
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.showCursorWhenSelecting
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.smartIndent
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.styleActiveLine
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.styleSelectedText
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.tabSize
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.theme
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.window
import typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.wordWrapColumn
import typingsJapgolly.jupyterlabCodemirror.modeMod.Mode.IMode
import typingsJapgolly.phosphorSignaling.mod.Signal
import typingsJapgolly.std.Event_
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/editor", "CodeMirrorEditor")
@js.native
class CodeMirrorEditor_ protected () extends IEditor {
  /**
    * Construct a CodeMirror editor.
    */
  def this(options: IOptions) = this()
  /**
    * Handles document changes.
    */
  var _beforeDocChanged: js.Any = js.native
  var _caretHover: js.Any = js.native
  var _changeGuard: js.Any = js.native
  /**
    * Check for an out of sync editor.
    */
  var _checkSync: js.Any = js.native
  /**
    * Clean selections for the given uuid.
    */
  var _cleanSelections: js.Any = js.native
  /**
    * Clear the hover for a caret, due to things like
    * scrolling, resizing, deactivation, etc, where
    * the position is no longer valid.
    */
  var _clearHover: js.Any = js.native
  val _config: js.Any = js.native
  var _editor: js.Any = js.native
  /**
    * Handle `blur` events for the editor.
    */
  var _evtBlur: js.Any = js.native
  /**
    * Handle `focus` events for the editor.
    */
  var _evtFocus: js.Any = js.native
  /**
    * Handle `scroll` events for the editor.
    */
  var _evtScroll: js.Any = js.native
  /**
    * Construct a caret element representing the position
    * of a collaborator's cursor.
    */
  var _getCaret: js.Any = js.native
  var _hoverId: js.Any = js.native
  var _hoverTimeout: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _keydownHandlers: js.Any = js.native
  var _lastChange: js.Any = js.native
  /**
    * Marks selections.
    */
  var _markSelections: js.Any = js.native
  var _model: js.Any = js.native
  var _needsRefresh: js.Any = js.native
  /**
    * Handles a cursor activity event.
    */
  var _onCursorActivity: js.Any = js.native
  /**
    * Handles a mime type change.
    */
  var _onMimeTypeChanged: js.Any = js.native
  /**
    * Handles a selections change.
    */
  var _onSelectionsChanged: js.Any = js.native
  /**
    * Handle model value changes.
    */
  var _onValueChanged: js.Any = js.native
  var _poll: js.Any = js.native
  var _selectionStyle: js.Any = js.native
  /**
    * Convert an editor position to a code mirror position.
    */
  var _toCodeMirrorPosition: js.Any = js.native
  /**
    * Converts an editor selection to a code mirror selection.
    */
  var _toCodeMirrorSelection: js.Any = js.native
  /**
    * Converts selections to code mirror selections.
    */
  var _toCodeMirrorSelections: js.Any = js.native
  /**
    * Convert a code mirror position to an editor position.
    */
  var _toPosition: js.Any = js.native
  /**
    * Converts a code mirror selection to an editor selection.
    */
  var _toSelection: js.Any = js.native
  /**
    * Converts the selection style to a text marker options.
    */
  var _toTextMarkerOptions: js.Any = js.native
  var _uuid: js.Any = js.native
  /**
    * Get the codemirror doc wrapped by the widget.
    */
  val doc: Doc = js.native
  /**
    * A signal emitted when either the top or bottom edge is requested.
    */
  @JSName("edgeRequested")
  val edgeRequested_CodeMirrorEditor_ : Signal[this.type, EdgeLocation] = js.native
  /**
    * Get the codemirror editor wrapped by the editor.
    */
  val editor: Editor = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  var selectionMarkers: StringDictionary[js.UndefOr[js.Array[TextMarker]]] = js.native
  val state: js.Any = js.native
  /**
    * The uuid of this selection owner.
    */
  /* CompleteClass */
  override var uuid: String = js.native
  def addOverlay(mode: String): Unit = js.native
  def addOverlay(mode: String, options: js.Object): Unit = js.native
  def addOverlay(mode: js.Object): Unit = js.native
  def addOverlay(mode: js.Object, options: js.Object): Unit = js.native
  def cursorCoords(where: Boolean): AnonBottom = js.native
  @JSName("cursorCoords")
  def cursorCoords_local(where: Boolean, mode: local): AnonBottom = js.native
  @JSName("cursorCoords")
  def cursorCoords_page(where: Boolean, mode: page): AnonBottom = js.native
  @JSName("cursorCoords")
  def cursorCoords_window(where: Boolean, mode: window): AnonBottom = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Execute a codemirror command on the editor.
    *
    * @param command - The name of the command to execute.
    */
  def execCommand(command: String): Unit = js.native
  def firstLine(): Double = js.native
  def getCursor(): Position = js.native
  def getCursor(start: String): Position = js.native
  /**
    * Returns the primary position of the cursor, never `null`.
    */
  /* CompleteClass */
  override def getCursorPosition(): IPosition = js.native
  @JSName("getOption")
  def getOption_autoClosingBrackets(option: autoClosingBrackets): Boolean = js.native
  @JSName("getOption")
  def getOption_codeFolding(option: codeFolding): Boolean = js.native
  @JSName("getOption")
  def getOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar): Boolean = js.native
  @JSName("getOption")
  def getOption_dragDrop(option: dragDrop): Boolean = js.native
  @JSName("getOption")
  def getOption_electricChars(option: electricChars): Boolean = js.native
  @JSName("getOption")
  def getOption_extraKeys(option: extraKeys): js.Any = js.native
  @JSName("getOption")
  def getOption_fixedGutter(option: fixedGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_foldGutter(option: foldGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_fontFamily(option: fontFamily): String | Null = js.native
  @JSName("getOption")
  def getOption_fontSize(option: fontSize): Double | Null = js.native
  @JSName("getOption")
  def getOption_gutters(option: gutters): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_insertSpaces(option: insertSpaces): Boolean = js.native
  @JSName("getOption")
  def getOption_keyMap(option: keyMap): String = js.native
  @JSName("getOption")
  def getOption_lineHeight(option: typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineHeight): Double | Null = js.native
  @JSName("getOption")
  def getOption_lineNumbers(option: lineNumbers): Boolean = js.native
  @JSName("getOption")
  def getOption_lineSeparator(option: lineSeparator): String | Null = js.native
  @JSName("getOption")
  def getOption_lineWiseCopyCut(option: lineWiseCopyCut): Boolean = js.native
  @JSName("getOption")
  def getOption_lineWrap(option: lineWrap): off | on | wordWrapColumn | bounded = js.native
  @JSName("getOption")
  def getOption_matchBrackets(option: matchBrackets): Boolean = js.native
  /**
    * Get a config option for the editor.
    */
  @JSName("getOption")
  def getOption_mode(option: mode): String | IMode = js.native
  @JSName("getOption")
  def getOption_readOnly(option: readOnly): Boolean = js.native
  @JSName("getOption")
  def getOption_rulers(option: rulers): js.Array[Double] = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(option: scrollPastEnd): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollbarStyle(option: scrollbarStyle): String = js.native
  @JSName("getOption")
  def getOption_selectionPointer(option: selectionPointer): Boolean | String = js.native
  @JSName("getOption")
  def getOption_showCursorWhenSelecting(option: showCursorWhenSelecting): Boolean = js.native
  @JSName("getOption")
  def getOption_smartIndent(option: smartIndent): Boolean = js.native
  @JSName("getOption")
  def getOption_styleActiveLine(option: styleActiveLine): Boolean | StyleActiveLine = js.native
  @JSName("getOption")
  def getOption_styleSelectedText(option: styleSelectedText): Boolean = js.native
  @JSName("getOption")
  def getOption_tabSize(option: tabSize): Double = js.native
  @JSName("getOption")
  def getOption_theme(option: theme): String = js.native
  @JSName("getOption")
  def getOption_wordWrapColumn(option: wordWrapColumn): Double = js.native
  def getRange(from: Position, to: Position): String = js.native
  def getRange(from: Position, to: Position, seperator: String): String = js.native
  def getSearchCursor(query: String): SearchCursor = js.native
  def getSearchCursor(query: String, start: Position): SearchCursor = js.native
  def getSearchCursor(query: String, start: Position, caseFold: Boolean): SearchCursor = js.native
  def getSearchCursor(query: RegExp): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: Position): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: Position, caseFold: Boolean): SearchCursor = js.native
  /**
    * Returns the primary selection, never `null`.
    */
  /* CompleteClass */
  override def getSelection(): IRange = js.native
  /**
    * Gets the selections for all the cursors, never `null` or empty.
    */
  /* CompleteClass */
  override def getSelections(): js.Array[IRange] = js.native
  /**
    * Handle the DOM events for the editor.
    *
    * @param event - The DOM event sent to the editor.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the editor's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
  def lastLine(): Double = js.native
  /**
    * Handle keydown events from the editor.
    */
  /* protected */ def onKeydown(event: KeyboardEvent): Boolean = js.native
  def operation[T](fn: js.Function0[T]): T = js.native
  def removeOverlay(mode: String): Unit = js.native
  def removeOverlay(mode: js.Object): Unit = js.native
  def scrollIntoView(pos: AnonFrom, margin: Double): Unit = js.native
  /**
    * Set the primary position of the cursor.
    *
    * @param position - The new primary position.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  /* CompleteClass */
  override def setCursorPosition(position: IPosition): Unit = js.native
  def setCursorPosition(position: IPosition, options: AnonBias): Unit = js.native
  def setOption(option: lineWrap, value: bounded): Unit = js.native
  def setOption(option: lineWrap, value: off): Unit = js.native
  def setOption(option: lineWrap, value: on): Unit = js.native
  def setOption(option: lineWrap, value: wordWrapColumn): Unit = js.native
  @JSName("setOption")
  def setOption_autoClosingBrackets(option: autoClosingBrackets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_codeFolding(option: codeFolding, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_dragDrop(option: dragDrop, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_electricChars(option: electricChars, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_extraKeys(option: extraKeys, value: js.Any): Unit = js.native
  @JSName("setOption")
  def setOption_fixedGutter(option: fixedGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_foldGutter(option: foldGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(option: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(option: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_gutters(option: gutters, value: js.Array[String]): Unit = js.native
  @JSName("setOption")
  def setOption_insertSpaces(option: insertSpaces, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_keyMap(option: keyMap, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineHeight): Unit = js.native
  @JSName("setOption")
  def setOption_lineHeight(option: typingsJapgolly.jupyterlabCodemirror.jupyterlabCodemirrorStrings.lineHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_lineNumbers(option: lineNumbers, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lineSeparator(option: lineSeparator): Unit = js.native
  @JSName("setOption")
  def setOption_lineSeparator(option: lineSeparator, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineWiseCopyCut(option: lineWiseCopyCut, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_matchBrackets(option: matchBrackets, value: Boolean): Unit = js.native
  /**
    * Set a config option for the editor.
    */
  @JSName("setOption")
  def setOption_mode(option: mode, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_mode(option: mode, value: IMode): Unit = js.native
  @JSName("setOption")
  def setOption_readOnly(option: readOnly, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_rulers(option: rulers, value: js.Array[Double]): Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(option: scrollPastEnd, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollbarStyle(option: scrollbarStyle, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_selectionPointer(option: selectionPointer, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_selectionPointer(option: selectionPointer, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showCursorWhenSelecting(option: showCursorWhenSelecting, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_smartIndent(option: smartIndent, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_styleActiveLine(option: styleActiveLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_styleActiveLine(option: styleActiveLine, value: StyleActiveLine): Unit = js.native
  @JSName("setOption")
  def setOption_styleSelectedText(option: styleSelectedText, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_tabSize(option: tabSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_theme(option: theme, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_wordWrapColumn(option: wordWrapColumn, value: Double): Unit = js.native
  /**
    * Set the primary selection.
    *
    * @param selection - The desired selection range.
    *
    * #### Notes
    * This will remove any secondary cursors.
    */
  /* CompleteClass */
  override def setSelection(selection: IRange): Unit = js.native
  /**
    * Sets the selections for all the cursors.
    *
    * @param selections - The new selections.
    *
    * #### Notes
    * Cursors will be removed or added, as necessary.
    * Passing an empty array resets a cursor position to the start of a
    * document.
    */
  /* CompleteClass */
  override def setSelections(selections: js.Array[IRange]): Unit = js.native
}


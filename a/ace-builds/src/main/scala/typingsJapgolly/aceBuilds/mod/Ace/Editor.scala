package typingsJapgolly.aceBuilds.mod.Ace

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.aceBuilds.aceBuildsBooleans.`false`
import typingsJapgolly.aceBuilds.aceBuildsBooleans.`true`
import typingsJapgolly.aceBuilds.aceBuildsStrings.ace
import typingsJapgolly.aceBuilds.aceBuildsStrings.always
import typingsJapgolly.aceBuilds.aceBuildsStrings.animatedScroll
import typingsJapgolly.aceBuilds.aceBuildsStrings.auto
import typingsJapgolly.aceBuilds.aceBuildsStrings.autoScrollEditorIntoView
import typingsJapgolly.aceBuilds.aceBuildsStrings.behavioursEnabled
import typingsJapgolly.aceBuilds.aceBuildsStrings.blur
import typingsJapgolly.aceBuilds.aceBuildsStrings.change
import typingsJapgolly.aceBuilds.aceBuildsStrings.changeSelectionStyle
import typingsJapgolly.aceBuilds.aceBuildsStrings.changeSession
import typingsJapgolly.aceBuilds.aceBuildsStrings.click
import typingsJapgolly.aceBuilds.aceBuildsStrings.code
import typingsJapgolly.aceBuilds.aceBuildsStrings.copy
import typingsJapgolly.aceBuilds.aceBuildsStrings.copyWithEmptySelection
import typingsJapgolly.aceBuilds.aceBuildsStrings.cursorStyle
import typingsJapgolly.aceBuilds.aceBuildsStrings.displayIndentGuides
import typingsJapgolly.aceBuilds.aceBuildsStrings.dragDelay
import typingsJapgolly.aceBuilds.aceBuildsStrings.dragEnabled
import typingsJapgolly.aceBuilds.aceBuildsStrings.enableAutoIndent
import typingsJapgolly.aceBuilds.aceBuildsStrings.fadeFoldWidgets
import typingsJapgolly.aceBuilds.aceBuildsStrings.firstLineNumber
import typingsJapgolly.aceBuilds.aceBuildsStrings.fixedWidthGutter
import typingsJapgolly.aceBuilds.aceBuildsStrings.focus
import typingsJapgolly.aceBuilds.aceBuildsStrings.focusTimeout
import typingsJapgolly.aceBuilds.aceBuildsStrings.foldStyle
import typingsJapgolly.aceBuilds.aceBuildsStrings.fontFamily
import typingsJapgolly.aceBuilds.aceBuildsStrings.fontSize
import typingsJapgolly.aceBuilds.aceBuildsStrings.free
import typingsJapgolly.aceBuilds.aceBuildsStrings.hScrollBarAlwaysVisible
import typingsJapgolly.aceBuilds.aceBuildsStrings.hasCssTransforms
import typingsJapgolly.aceBuilds.aceBuildsStrings.highlightActiveLine
import typingsJapgolly.aceBuilds.aceBuildsStrings.highlightGutterLine
import typingsJapgolly.aceBuilds.aceBuildsStrings.highlightSelectedWord
import typingsJapgolly.aceBuilds.aceBuildsStrings.indentedSoftWrap
import typingsJapgolly.aceBuilds.aceBuildsStrings.input
import typingsJapgolly.aceBuilds.aceBuildsStrings.keyboardHandler
import typingsJapgolly.aceBuilds.aceBuildsStrings.left
import typingsJapgolly.aceBuilds.aceBuildsStrings.manual
import typingsJapgolly.aceBuilds.aceBuildsStrings.markbegin
import typingsJapgolly.aceBuilds.aceBuildsStrings.markbeginend
import typingsJapgolly.aceBuilds.aceBuildsStrings.maxLines
import typingsJapgolly.aceBuilds.aceBuildsStrings.maxPixelHeight
import typingsJapgolly.aceBuilds.aceBuildsStrings.mergeUndoDeltas
import typingsJapgolly.aceBuilds.aceBuildsStrings.minLines
import typingsJapgolly.aceBuilds.aceBuildsStrings.mode
import typingsJapgolly.aceBuilds.aceBuildsStrings.mousemove
import typingsJapgolly.aceBuilds.aceBuildsStrings.mouseup
import typingsJapgolly.aceBuilds.aceBuildsStrings.mousewheel
import typingsJapgolly.aceBuilds.aceBuildsStrings.navigateWithinSoftTabs
import typingsJapgolly.aceBuilds.aceBuildsStrings.newLineMode
import typingsJapgolly.aceBuilds.aceBuildsStrings.off
import typingsJapgolly.aceBuilds.aceBuildsStrings.overwrite
import typingsJapgolly.aceBuilds.aceBuildsStrings.paste
import typingsJapgolly.aceBuilds.aceBuildsStrings.placeholder
import typingsJapgolly.aceBuilds.aceBuildsStrings.printMargin
import typingsJapgolly.aceBuilds.aceBuildsStrings.printMarginColumn
import typingsJapgolly.aceBuilds.aceBuildsStrings.printmargin_
import typingsJapgolly.aceBuilds.aceBuildsStrings.readOnly
import typingsJapgolly.aceBuilds.aceBuildsStrings.right
import typingsJapgolly.aceBuilds.aceBuildsStrings.scrollPastEnd
import typingsJapgolly.aceBuilds.aceBuildsStrings.scrollSpeed
import typingsJapgolly.aceBuilds.aceBuildsStrings.selectionStyle
import typingsJapgolly.aceBuilds.aceBuildsStrings.session
import typingsJapgolly.aceBuilds.aceBuildsStrings.showFoldWidgets
import typingsJapgolly.aceBuilds.aceBuildsStrings.showGutter
import typingsJapgolly.aceBuilds.aceBuildsStrings.showInvisibles
import typingsJapgolly.aceBuilds.aceBuildsStrings.showLineNumbers
import typingsJapgolly.aceBuilds.aceBuildsStrings.showPrintMargin
import typingsJapgolly.aceBuilds.aceBuildsStrings.slim
import typingsJapgolly.aceBuilds.aceBuildsStrings.smooth
import typingsJapgolly.aceBuilds.aceBuildsStrings.tabSize
import typingsJapgolly.aceBuilds.aceBuildsStrings.text
import typingsJapgolly.aceBuilds.aceBuildsStrings.theme
import typingsJapgolly.aceBuilds.aceBuildsStrings.tooltipFollowsMouse
import typingsJapgolly.aceBuilds.aceBuildsStrings.useSoftTabs
import typingsJapgolly.aceBuilds.aceBuildsStrings.useWorker
import typingsJapgolly.aceBuilds.aceBuildsStrings.vScrollBarAlwaysVisible
import typingsJapgolly.aceBuilds.aceBuildsStrings.value
import typingsJapgolly.aceBuilds.aceBuildsStrings.wide
import typingsJapgolly.aceBuilds.aceBuildsStrings.wrap
import typingsJapgolly.aceBuilds.aceBuildsStrings.wrapBehavioursEnabled
import typingsJapgolly.aceBuilds.aceBuildsStrings.wrapMethod
import typingsJapgolly.aceBuilds.anon.DataString
import typingsJapgolly.aceBuilds.anon.OldSession
import typingsJapgolly.aceBuilds.anon.PartialSearchOptions
import typingsJapgolly.aceBuilds.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor
  extends StObject
     with OptionsProvider
     with EventEmitter {
  
  def blockIndent(): Unit = js.native
  
  def blockOutdent(): Unit = js.native
  
  def blur(): Unit = js.native
  
  def centerSelection(): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  var commands: CommandManager = js.native
  
  var completers: js.Array[Completer] = js.native
  
  var container: HTMLElement = js.native
  
  def copyLinesDown(): Unit = js.native
  
  def copyLinesUp(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def duplicateSelection(): Unit = js.native
  
  def execCommand(command: String): Boolean = js.native
  def execCommand(command: String, args: Any): Boolean = js.native
  def execCommand(command: js.Array[String]): Boolean = js.native
  def execCommand(command: js.Array[String], args: Any): Boolean = js.native
  
  def find(needle: String): js.UndefOr[Range] = js.native
  def find(needle: String, options: Unit, animate: Boolean): js.UndefOr[Range] = js.native
  def find(needle: String, options: PartialSearchOptions): js.UndefOr[Range] = js.native
  def find(needle: String, options: PartialSearchOptions, animate: Boolean): js.UndefOr[Range] = js.native
  def find(needle: js.RegExp): js.UndefOr[Range] = js.native
  def find(needle: js.RegExp, options: Unit, animate: Boolean): js.UndefOr[Range] = js.native
  def find(needle: js.RegExp, options: PartialSearchOptions): js.UndefOr[Range] = js.native
  def find(needle: js.RegExp, options: PartialSearchOptions, animate: Boolean): js.UndefOr[Range] = js.native
  
  def findAll(needle: String): Double = js.native
  def findAll(needle: String, options: Unit, additive: Boolean): Double = js.native
  def findAll(needle: String, options: PartialSearchOptions): Double = js.native
  def findAll(needle: String, options: PartialSearchOptions, additive: Boolean): Double = js.native
  def findAll(needle: js.RegExp): Double = js.native
  def findAll(needle: js.RegExp, options: Unit, additive: Boolean): Double = js.native
  def findAll(needle: js.RegExp, options: PartialSearchOptions): Double = js.native
  def findAll(needle: js.RegExp, options: PartialSearchOptions, additive: Boolean): Double = js.native
  
  def findNext(): Unit = js.native
  def findNext(options: Unit, animate: Boolean): Unit = js.native
  def findNext(options: PartialSearchOptions): Unit = js.native
  def findNext(options: PartialSearchOptions, animate: Boolean): Unit = js.native
  
  def findPrevious(): Unit = js.native
  def findPrevious(options: Unit, animate: Boolean): Unit = js.native
  def findPrevious(options: PartialSearchOptions): Unit = js.native
  def findPrevious(options: PartialSearchOptions, animate: Boolean): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getAnimatedScroll(): Boolean = js.native
  
  def getBehavioursEnabled(): Boolean = js.native
  
  def getCopyText(): String = js.native
  
  def getCursorPosition(): Point = js.native
  
  def getCursorPositionScreen(): Point = js.native
  
  def getDisplayIndentGuides(): Boolean = js.native
  
  def getDragDelay(): Double = js.native
  
  def getFadeFoldWidgets(): Boolean = js.native
  
  def getFirstVisibleRow(): Double = js.native
  
  def getFontSize(): String = js.native
  
  def getHighlightActiveLine(): Boolean = js.native
  
  def getHighlightGutterLine(): Boolean = js.native
  
  def getHighlightSelectedWord(): Boolean = js.native
  
  def getKeyboardHandler(): String = js.native
  
  def getLastSearchOptions(): PartialSearchOptions = js.native
  
  def getLastVisibleRow(): Double = js.native
  
  @JSName("getOption")
  def getOption_animatedScroll(name: animatedScroll): Boolean = js.native
  @JSName("getOption")
  def getOption_autoScrollEditorIntoView(name: autoScrollEditorIntoView): Boolean = js.native
  @JSName("getOption")
  def getOption_behavioursEnabled(name: behavioursEnabled): Boolean = js.native
  @JSName("getOption")
  def getOption_copyWithEmptySelection(name: copyWithEmptySelection): Boolean = js.native
  @JSName("getOption")
  def getOption_cursorStyle(name: cursorStyle): ace | slim | smooth | wide = js.native
  @JSName("getOption")
  def getOption_displayIndentGuides(name: displayIndentGuides): Boolean = js.native
  @JSName("getOption")
  def getOption_dragDelay(name: dragDelay): Double = js.native
  @JSName("getOption")
  def getOption_dragEnabled(name: dragEnabled): Boolean = js.native
  @JSName("getOption")
  def getOption_enableAutoIndent(name: enableAutoIndent): Boolean = js.native
  @JSName("getOption")
  def getOption_fadeFoldWidgets(name: fadeFoldWidgets): Boolean = js.native
  @JSName("getOption")
  def getOption_firstLineNumber(name: firstLineNumber): Double = js.native
  @JSName("getOption")
  def getOption_fixedWidthGutter(name: fixedWidthGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_focusTimeout(name: focusTimeout): Double = js.native
  @JSName("getOption")
  def getOption_foldStyle(name: foldStyle): markbegin | markbeginend | manual = js.native
  @JSName("getOption")
  def getOption_fontFamily(name: fontFamily): String = js.native
  @JSName("getOption")
  def getOption_fontSize(name: fontSize): Double = js.native
  @JSName("getOption")
  def getOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible): Boolean = js.native
  @JSName("getOption")
  def getOption_hasCssTransforms(name: hasCssTransforms): Boolean = js.native
  @JSName("getOption")
  def getOption_highlightActiveLine(name: highlightActiveLine): Boolean = js.native
  @JSName("getOption")
  def getOption_highlightGutterLine(name: highlightGutterLine): Boolean = js.native
  @JSName("getOption")
  def getOption_highlightSelectedWord(name: highlightSelectedWord): Boolean = js.native
  @JSName("getOption")
  def getOption_indentedSoftWrap(name: indentedSoftWrap): Boolean = js.native
  @JSName("getOption")
  def getOption_keyboardHandler(name: keyboardHandler): String | Null = js.native
  @JSName("getOption")
  def getOption_maxLines(name: maxLines): Double = js.native
  @JSName("getOption")
  def getOption_maxPixelHeight(name: maxPixelHeight): Double = js.native
  @JSName("getOption")
  def getOption_mergeUndoDeltas(name: mergeUndoDeltas): `true` | `false` | always = js.native
  @JSName("getOption")
  def getOption_minLines(name: minLines): Double = js.native
  @JSName("getOption")
  def getOption_mode(name: mode): String = js.native
  @JSName("getOption")
  def getOption_navigateWithinSoftTabs(name: navigateWithinSoftTabs): Boolean = js.native
  @JSName("getOption")
  def getOption_newLineMode(name: newLineMode): NewLineMode = js.native
  @JSName("getOption")
  def getOption_overwrite(name: overwrite): Boolean = js.native
  @JSName("getOption")
  def getOption_placeholder(name: placeholder): String = js.native
  @JSName("getOption")
  def getOption_printMargin(name: printMargin): Boolean | Double = js.native
  @JSName("getOption")
  def getOption_printMarginColumn(name: printMarginColumn): Double = js.native
  @JSName("getOption")
  def getOption_readOnly(name: readOnly): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(name: scrollPastEnd): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollSpeed(name: scrollSpeed): Double = js.native
  @JSName("getOption")
  def getOption_selectionStyle(name: selectionStyle): String = js.native
  @JSName("getOption")
  def getOption_session(name: session): EditSession = js.native
  @JSName("getOption")
  def getOption_showFoldWidgets(name: showFoldWidgets): Boolean = js.native
  @JSName("getOption")
  def getOption_showGutter(name: showGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_showInvisibles(name: showInvisibles): Boolean = js.native
  @JSName("getOption")
  def getOption_showLineNumbers(name: showLineNumbers): Boolean = js.native
  @JSName("getOption")
  def getOption_showPrintMargin(name: showPrintMargin): Boolean = js.native
  @JSName("getOption")
  def getOption_tabSize(name: tabSize): Double = js.native
  @JSName("getOption")
  def getOption_theme(name: theme): String = js.native
  @JSName("getOption")
  def getOption_tooltipFollowsMouse(name: tooltipFollowsMouse): Boolean = js.native
  @JSName("getOption")
  def getOption_useSoftTabs(name: useSoftTabs): Boolean = js.native
  @JSName("getOption")
  def getOption_useWorker(name: useWorker): Boolean = js.native
  @JSName("getOption")
  def getOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible): Boolean = js.native
  @JSName("getOption")
  def getOption_value(name: value): String = js.native
  @JSName("getOption")
  def getOption_wrap(name: wrap): off | free | printmargin_ | Boolean | Double = js.native
  @JSName("getOption")
  def getOption_wrapBehavioursEnabled(name: wrapBehavioursEnabled): Boolean = js.native
  @JSName("getOption")
  def getOption_wrapMethod(name: wrapMethod): code | text | auto = js.native
  
  def getOverwrite(): Boolean = js.native
  
  def getPrintMarginColumn(): Double = js.native
  
  def getReadOnly(): Boolean = js.native
  
  def getScrollSpeed(): Double = js.native
  
  def getSelectedText(): String = js.native
  
  def getSelection(): Selection = js.native
  
  def getSelectionRange(): Range = js.native
  
  def getSelectionStyle(): String = js.native
  
  def getSession(): EditSession = js.native
  
  def getShowFoldWidgets(): Boolean = js.native
  
  def getShowInvisibles(): Boolean = js.native
  
  def getShowPrintMargin(): Boolean = js.native
  
  def getTheme(): String = js.native
  
  def getValue(): String = js.native
  
  def getWrapBehavioursEnabled(): Boolean = js.native
  
  def gotoLine(lineNumber: Double, column: Double, animate: Boolean): Unit = js.native
  
  def gotoPageDown(): Unit = js.native
  
  def gotoPageUp(): Unit = js.native
  
  var id: String = js.native
  
  def indent(): Unit = js.native
  
  def insert(text: String): Unit = js.native
  def insert(text: String, pasted: Boolean): Unit = js.native
  
  def isFocused(): Boolean = js.native
  
  def isRowFullyVisible(row: Double): Boolean = js.native
  
  def isRowVisible(row: Double): Boolean = js.native
  
  def jumpToMatching(select: Boolean, expand: Boolean): Unit = js.native
  
  var keyBinding: KeyBinding = js.native
  
  def modifyNumber(amount: Double): Unit = js.native
  
  def moveCursorTo(row: Double, column: Double): Unit = js.native
  
  def moveCursorToPosition(pos: Point): Unit = js.native
  
  def moveLinesDown(): Unit = js.native
  
  def moveLinesUp(): Unit = js.native
  
  def moveText(range: Range, toPosition: Point): Range = js.native
  def moveText(range: Range, toPosition: Point, copy: Boolean): Range = js.native
  
  def navigateDown(): Unit = js.native
  
  def navigateFileEnd(): Unit = js.native
  
  def navigateFileStart(): Unit = js.native
  
  def navigateLeft(): Unit = js.native
  
  def navigateLineEnd(): Unit = js.native
  
  def navigateLineStart(): Unit = js.native
  
  def navigateRight(): Unit = js.native
  
  def navigateTo(row: Double, column: Double): Unit = js.native
  
  def navigateUp(): Unit = js.native
  
  def navigateWordLeft(): Unit = js.native
  
  def navigateWordRight(): Unit = js.native
  
  def onPaste(text: String, event: Any): Unit = js.native
  
  @JSName("on")
  def on_blur(name: blur, callback: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSName("on")
  def on_change(name: change, callback: js.Function1[/* delta */ Delta, Unit]): Unit = js.native
  @JSName("on")
  def on_changeSelectionStyle(name: changeSelectionStyle, callback: js.Function1[/* obj */ DataString, Unit]): Unit = js.native
  @JSName("on")
  def on_changeSession(name: changeSession, callback: js.Function1[/* obj */ OldSession, Unit]): Unit = js.native
  @JSName("on")
  def on_click(name: click, callback: js.Function1[/* e */ Any, Unit]): Unit = js.native
  @JSName("on")
  def on_copy(name: copy, callback: js.Function1[/* obj */ Text, Unit]): Unit = js.native
  @JSName("on")
  def on_focus(name: focus, callback: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSName("on")
  def on_input(name: input, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_mousemove(name: mousemove, callback: js.Function1[/* e */ Any, Unit]): Unit = js.native
  @JSName("on")
  def on_mouseup(name: mouseup, callback: js.Function1[/* e */ Any, Unit]): Unit = js.native
  @JSName("on")
  def on_mousewheel(name: mousewheel, callback: js.Function1[/* e */ Any, Unit]): Unit = js.native
  @JSName("on")
  def on_paste(name: paste, callback: js.Function1[/* obj */ Text, Unit]): Unit = js.native
  
  def redo(): Unit = js.native
  
  def remove(): Unit = js.native
  def remove(dir: left | right): Unit = js.native
  
  def removeLineToEnd(): Unit = js.native
  
  def removeLines(): Unit = js.native
  
  def removeWordLeft(): Unit = js.native
  
  def removeWordRight(): Unit = js.native
  
  var renderer: VirtualRenderer = js.native
  
  def replace(replacement: String): Double = js.native
  def replace(replacement: String, options: PartialSearchOptions): Double = js.native
  
  def replaceAll(replacement: String): Double = js.native
  def replaceAll(replacement: String, options: PartialSearchOptions): Double = js.native
  
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  
  def scrollPageDown(): Unit = js.native
  
  def scrollPageUp(): Unit = js.native
  
  def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function0[Unit]): Unit = js.native
  
  def scrollToRow(row: Double): Unit = js.native
  
  def selectAll(): Unit = js.native
  
  def selectPageDown(): Unit = js.native
  
  def selectPageUp(): Unit = js.native
  
  var selection: Selection = js.native
  
  var session: EditSession = js.native
  
  def setAnimatedScroll(shouldAnimate: Boolean): Unit = js.native
  
  def setAutoScrollEditorIntoView(enable: Boolean): Unit = js.native
  
  def setBehavioursEnabled(enabled: Boolean): Unit = js.native
  
  def setDisplayIndentGuides(display: Boolean): Unit = js.native
  
  def setDragDelay(dragDelay: Double): Unit = js.native
  
  def setFadeFoldWidgets(fade: Boolean): Unit = js.native
  
  def setFontSize(size: Double): Unit = js.native
  
  def setHighlightActiveLine(shouldHighlight: Boolean): Unit = js.native
  
  def setHighlightGutterLine(shouldHighlight: Boolean): Unit = js.native
  
  def setHighlightSelectedWord(shouldHighlight: Boolean): Unit = js.native
  
  def setKeyboardHandler(): Unit = js.native
  def setKeyboardHandler(keyboardHandler: String): Unit = js.native
  def setKeyboardHandler(keyboardHandler: String, callback: js.Function0[Unit]): Unit = js.native
  def setKeyboardHandler(keyboardHandler: KeyboardHandler): Unit = js.native
  
  def setOption(name: cursorStyle, value: ace | slim | smooth | wide): Unit = js.native
  def setOption(name: foldStyle, value: markbegin | markbeginend | manual): Unit = js.native
  def setOption(name: mergeUndoDeltas, value: `true` | `false` | always): Unit = js.native
  def setOption(name: wrapMethod, value: code | text | auto): Unit = js.native
  def setOption(name: wrap, value: off | free | printmargin_): Unit = js.native
  @JSName("setOption")
  def setOption_animatedScroll(name: animatedScroll, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_autoScrollEditorIntoView(name: autoScrollEditorIntoView, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_behavioursEnabled(name: behavioursEnabled, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_copyWithEmptySelection(name: copyWithEmptySelection, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_displayIndentGuides(name: displayIndentGuides, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_dragDelay(name: dragDelay, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_dragEnabled(name: dragEnabled, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_enableAutoIndent(name: enableAutoIndent, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_fadeFoldWidgets(name: fadeFoldWidgets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_firstLineNumber(name: firstLineNumber, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_fixedWidthGutter(name: fixedWidthGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_focusTimeout(name: focusTimeout, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_fontFamily(name: fontFamily, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_fontSize(name: fontSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_hScrollBarAlwaysVisible(name: hScrollBarAlwaysVisible, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_hasCssTransforms(name: hasCssTransforms, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_highlightActiveLine(name: highlightActiveLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_highlightGutterLine(name: highlightGutterLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_highlightSelectedWord(name: highlightSelectedWord, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_indentedSoftWrap(name: indentedSoftWrap, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_keyboardHandler(name: keyboardHandler): Unit = js.native
  @JSName("setOption")
  def setOption_keyboardHandler(name: keyboardHandler, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_maxLines(name: maxLines, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_maxPixelHeight(name: maxPixelHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_minLines(name: minLines, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_mode(name: mode, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_navigateWithinSoftTabs(name: navigateWithinSoftTabs, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_newLineMode(name: newLineMode, value: NewLineMode): Unit = js.native
  @JSName("setOption")
  def setOption_overwrite(name: overwrite, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_placeholder(name: placeholder, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_printMargin(name: printMargin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_printMargin(name: printMargin, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_printMarginColumn(name: printMarginColumn, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_readOnly(name: readOnly, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(name: scrollPastEnd, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollSpeed(name: scrollSpeed, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_selectionStyle(name: selectionStyle, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_session(name: session, value: EditSession): Unit = js.native
  @JSName("setOption")
  def setOption_showFoldWidgets(name: showFoldWidgets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showGutter(name: showGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showInvisibles(name: showInvisibles, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showLineNumbers(name: showLineNumbers, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showPrintMargin(name: showPrintMargin, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_tabSize(name: tabSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_theme(name: theme, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_tooltipFollowsMouse(name: tooltipFollowsMouse, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_useSoftTabs(name: useSoftTabs, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_useWorker(name: useWorker, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_vScrollBarAlwaysVisible(name: vScrollBarAlwaysVisible, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_value(name: value, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_wrap(name: wrap, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_wrap(name: wrap, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_wrapBehavioursEnabled(name: wrapBehavioursEnabled, value: Boolean): Unit = js.native
  
  def setOverwrite(overwrite: Boolean): Unit = js.native
  
  def setPrintMarginColumn(showPrintMargin: Double): Unit = js.native
  
  def setReadOnly(readOnly: Boolean): Unit = js.native
  
  def setScrollSpeed(speed: Double): Unit = js.native
  
  def setSelectionStyle(`val`: String): Unit = js.native
  
  def setSession(session: EditSession): Unit = js.native
  
  def setShowFoldWidgets(show: Boolean): Unit = js.native
  
  def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
  
  def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
  
  def setStyle(style: String): Unit = js.native
  
  def setTheme(theme: String): Unit = js.native
  def setTheme(theme: String, callback: js.Function0[Unit]): Unit = js.native
  
  def setValue(`val`: String): String = js.native
  def setValue(`val`: String, cursorPos: Double): String = js.native
  
  def setWrapBehavioursEnabled(enabled: Boolean): Unit = js.native
  
  def sortLines(): Unit = js.native
  
  def splitLine(): Unit = js.native
  
  var textInput: TextInput = js.native
  
  def toLowerCase(): Unit = js.native
  
  def toUpperCase(): Unit = js.native
  
  def toggleBlockComment(): Unit = js.native
  
  def toggleCommentLines(): Unit = js.native
  
  def toggleOverwrite(): Unit = js.native
  
  def transposeLetters(): Unit = js.native
  
  def undo(): Unit = js.native
  
  def unsetStyle(style: String): Unit = js.native
}

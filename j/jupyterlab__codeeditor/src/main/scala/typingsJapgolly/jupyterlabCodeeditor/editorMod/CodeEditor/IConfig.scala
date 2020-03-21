package typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor

import typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.bounded
import typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.off
import typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.on
import typingsJapgolly.jupyterlabCodeeditor.jupyterlabCodeeditorStrings.wordWrapColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration options for an editor.
  */
trait IConfig extends js.Object {
  /**
    * Whether to automatically close brackets after opening them.
    */
  var autoClosingBrackets: Boolean
  /**
    * Wheter to allow code folding
    */
  var codeFolding: Boolean
  /**
    * User preferred font family for text editors.
    */
  var fontFamily: String | Null
  /**
    * User preferred size in pixel of the font used in text editors.
    */
  var fontSize: Double | Null
  /**
    * Whether to insert spaces when pressing Tab.
    */
  var insertSpaces: Boolean
  /**
    * User preferred text line height, as a multiplier of font size.
    */
  var lineHeight: Double | Null
  /**
    * Whether line numbers should be displayed.
    */
  var lineNumbers: Boolean
  /**
    * Control the line wrapping of the editor. Possible values are:
    * - "off", lines will never wrap.
    * - "on", lines will wrap at the viewport border.
    * - "wordWrapColumn", lines will wrap at `wordWrapColumn`.
    * - "bounded", lines will wrap at minimum between viewport width and wordWrapColumn.
    */
  var lineWrap: off | on | wordWrapColumn | bounded
  /**
    * Whether to highlight matching brackets when one of them is selected.
    */
  var matchBrackets: Boolean
  /**
    * Whether the editor is read-only.
    */
  var readOnly: Boolean
  /**
    * Column index at which rulers should be added.
    */
  var rulers: js.Array[Double]
  /**
    * The number of spaces a tab is equal to.
    */
  var tabSize: Double
  /**
    * The column where to break text line.
    */
  var wordWrapColumn: Double
}

object IConfig {
  @scala.inline
  def apply(
    autoClosingBrackets: Boolean,
    codeFolding: Boolean,
    insertSpaces: Boolean,
    lineNumbers: Boolean,
    lineWrap: off | on | wordWrapColumn | bounded,
    matchBrackets: Boolean,
    readOnly: Boolean,
    rulers: js.Array[Double],
    tabSize: Double,
    wordWrapColumn: Double,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    lineHeight: Int | Double = null
  ): IConfig = {
    val __obj = js.Dynamic.literal(autoClosingBrackets = autoClosingBrackets.asInstanceOf[js.Any], codeFolding = codeFolding.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], lineNumbers = lineNumbers.asInstanceOf[js.Any], lineWrap = lineWrap.asInstanceOf[js.Any], matchBrackets = matchBrackets.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rulers = rulers.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], wordWrapColumn = wordWrapColumn.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}


package typingsJapgolly.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the font attributes, such as font name, font size, and color, for a shape's TextRange object.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeFontLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    *
    * The HTML color code representation of the text color (e.g. "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the italic status of font. Returns null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents font size in points (e.g. 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Boolean] = js.native
  /**
    *
    * Type of underline applied to the font. Returns null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[Boolean] = js.native
}


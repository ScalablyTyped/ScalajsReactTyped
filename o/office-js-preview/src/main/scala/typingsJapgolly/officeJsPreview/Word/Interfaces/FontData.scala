package typingsJapgolly.officeJsPreview.Word.Interfaces

import typingsJapgolly.officeJsPreview.Word.UnderlineType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashLine
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashLineHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashLineLong
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashLineLongHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDashLine
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDashLineHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotLine
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DottedHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Hidden
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Single
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Thick
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TwoDotDashLine
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TwoDotDashLineHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Wave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WaveDouble
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WaveHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "font.toJSON()". */
trait FontData extends js.Object {
  /**
    *
    * Gets or sets a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color.
    **Note**: Only the default highlight colors are available in Office for Windows Desktop. These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black". When the add-in runs in Office for Windows Desktop, any other color is converted to the closest color when applied to the font.
    *
    * [Api set: WordApi 1.1]
    */
  var highlightColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that represents the name of the font.
    *
    * [Api set: WordApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets a value that represents the font size in points.
    *
    * [Api set: WordApi 1.1]
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var subscript: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var superscript: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * [Api set: WordApi 1.1]
    */
  var underline: js.UndefOr[
    UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble
  ] = js.undefined
}

object FontData {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    doubleStrikeThrough: js.UndefOr[Boolean] = js.undefined,
    highlightColor: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: Int | Double = null,
    strikeThrough: js.UndefOr[Boolean] = js.undefined,
    subscript: js.UndefOr[Boolean] = js.undefined,
    superscript: js.UndefOr[Boolean] = js.undefined,
    underline: UnderlineType | Mixed | None | Hidden | DotLine | Single | Word | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double | Thick | Dotted | DottedHeavy | DashLine | DashLineHeavy | DashLineLong | DashLineLongHeavy | DotDashLine | DotDashLineHeavy | TwoDotDashLine | TwoDotDashLineHeavy | Wave | WaveHeavy | WaveDouble = null
  ): FontData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleStrikeThrough)) __obj.updateDynamic("doubleStrikeThrough")(doubleStrikeThrough.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strikeThrough)) __obj.updateDynamic("strikeThrough")(strikeThrough.asInstanceOf[js.Any])
    if (!js.isUndefined(subscript)) __obj.updateDynamic("subscript")(subscript.asInstanceOf[js.Any])
    if (!js.isUndefined(superscript)) __obj.updateDynamic("superscript")(superscript.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontData]
  }
}


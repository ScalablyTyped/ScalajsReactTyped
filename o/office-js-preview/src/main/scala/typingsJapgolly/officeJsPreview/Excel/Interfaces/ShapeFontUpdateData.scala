package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ShapeFontUnderlineStyle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashLong
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashLongHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDashHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDotDash
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDotDashHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DottedHeavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Heavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Single
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Wavy
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WavyDouble
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WavyHeavy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeFont object, for use in `shapeFont.set({ ... })`. */
trait ShapeFontUpdateData extends js.Object {
  /**
    *
    * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The HTML color code representation of the text color (e.g. "#FF0000" represents red). Returns null if the TextRange includes text fragments with different colors.
    *
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the italic status of font. Returns null if the TextRange includes both italic and non-italic text fragments.
    *
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents font size in points (e.g. 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    *
    * Type of underline applied to the font. Returns null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    ShapeFontUnderlineStyle | None | Single | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
  ] = js.undefined
}

object ShapeFontUpdateData {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: Int | Double = null,
    underline: ShapeFontUnderlineStyle | None | Single | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble = null
  ): ShapeFontUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFontUpdateData]
  }
}


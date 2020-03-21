package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ChartColorScheme
import typingsJapgolly.officeJs.officeJsStrings.ColorfulPalette1
import typingsJapgolly.officeJs.officeJsStrings.ColorfulPalette2
import typingsJapgolly.officeJs.officeJsStrings.ColorfulPalette3
import typingsJapgolly.officeJs.officeJsStrings.ColorfulPalette4
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette1
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette10
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette11
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette12
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette13
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette2
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette3
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette4
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette5
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette6
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette7
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette8
import typingsJapgolly.officeJs.officeJsStrings.MonochromaticPalette9
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAreaFormat.toJSON()`. */
trait ChartAreaFormatData extends js.Object {
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  /**
    *
    * Returns or sets color scheme of the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[
    ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13
  ] = js.undefined
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
  /**
    *
    * Specifies whether or not chart area of the chart has rounded corners. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}

object ChartAreaFormatData {
  @scala.inline
  def apply(
    border: ChartBorderData = null,
    colorScheme: ChartColorScheme | ColorfulPalette1 | ColorfulPalette2 | ColorfulPalette3 | ColorfulPalette4 | MonochromaticPalette1 | MonochromaticPalette2 | MonochromaticPalette3 | MonochromaticPalette4 | MonochromaticPalette5 | MonochromaticPalette6 | MonochromaticPalette7 | MonochromaticPalette8 | MonochromaticPalette9 | MonochromaticPalette10 | MonochromaticPalette11 | MonochromaticPalette12 | MonochromaticPalette13 = null,
    font: ChartFontData = null,
    roundedCorners: js.UndefOr[Boolean] = js.undefined
  ): ChartAreaFormatData = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(roundedCorners)) __obj.updateDynamic("roundedCorners")(roundedCorners.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAreaFormatData]
  }
}


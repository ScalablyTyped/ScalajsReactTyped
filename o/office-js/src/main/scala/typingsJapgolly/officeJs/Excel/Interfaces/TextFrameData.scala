package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ShapeAutoSize
import typingsJapgolly.officeJs.Excel.ShapeTextHorizontalAlignment
import typingsJapgolly.officeJs.Excel.ShapeTextHorizontalOverflow
import typingsJapgolly.officeJs.Excel.ShapeTextOrientation
import typingsJapgolly.officeJs.Excel.ShapeTextReadingOrder
import typingsJapgolly.officeJs.Excel.ShapeTextVerticalAlignment
import typingsJapgolly.officeJs.Excel.ShapeTextVerticalOverflow
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeMixed
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeNone
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeShapeToFitText
import typingsJapgolly.officeJs.officeJsStrings.AutoSizeTextToFitShape
import typingsJapgolly.officeJs.officeJsStrings.Bottom
import typingsJapgolly.officeJs.officeJsStrings.Center
import typingsJapgolly.officeJs.officeJsStrings.Clip
import typingsJapgolly.officeJs.officeJsStrings.Distributed
import typingsJapgolly.officeJs.officeJsStrings.EastAsianVertical
import typingsJapgolly.officeJs.officeJsStrings.Ellipsis
import typingsJapgolly.officeJs.officeJsStrings.Horizontal
import typingsJapgolly.officeJs.officeJsStrings.Justified
import typingsJapgolly.officeJs.officeJsStrings.Justify
import typingsJapgolly.officeJs.officeJsStrings.JustifyLow
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.LeftToRight
import typingsJapgolly.officeJs.officeJsStrings.Middle
import typingsJapgolly.officeJs.officeJsStrings.MongolianVertical
import typingsJapgolly.officeJs.officeJsStrings.Overflow
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.RightToLeft
import typingsJapgolly.officeJs.officeJsStrings.ThaiDistributed
import typingsJapgolly.officeJs.officeJsStrings.Top
import typingsJapgolly.officeJs.officeJsStrings.Vertical
import typingsJapgolly.officeJs.officeJsStrings.Vertical270
import typingsJapgolly.officeJs.officeJsStrings.WordArtVertical
import typingsJapgolly.officeJs.officeJsStrings.WordArtVerticalRTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `textFrame.toJSON()`. */
trait TextFrameData extends js.Object {
  /**
    *
    * Gets or sets the automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.undefined
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies whether the text frame contains text.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment of the text frame. See Excel.ShapeTextHorizontalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.undefined
  /**
    *
    * Represents the horizontal overflow behavior of the text frame. See Excel.ShapeTextHorizontalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[ShapeTextHorizontalOverflow | Overflow | Clip] = js.undefined
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the angle to which the text is oriented for the text frame. See Excel.ShapeTextOrientation for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
  ] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See Excel.ShapeTextReadingOrder for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ShapeTextReadingOrder | LeftToRight | RightToLeft] = js.undefined
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of the text frame. See Excel.ShapeTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed] = js.undefined
  /**
    *
    * Represents the vertical overflow behavior of the text frame. See Excel.ShapeTextVerticalOverflow for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip] = js.undefined
}

object TextFrameData {
  @scala.inline
  def apply(
    autoSizeSetting: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed = null,
    bottomMargin: Int | Double = null,
    hasText: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed = null,
    horizontalOverflow: ShapeTextHorizontalOverflow | Overflow | Clip = null,
    leftMargin: Int | Double = null,
    orientation: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL = null,
    readingOrder: ShapeTextReadingOrder | LeftToRight | RightToLeft = null,
    rightMargin: Int | Double = null,
    topMargin: Int | Double = null,
    verticalAlignment: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed = null,
    verticalOverflow: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip = null
  ): TextFrameData = {
    val __obj = js.Dynamic.literal()
    if (autoSizeSetting != null) __obj.updateDynamic("autoSizeSetting")(autoSizeSetting.asInstanceOf[js.Any])
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(hasText)) __obj.updateDynamic("hasText")(hasText.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalOverflow != null) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow.asInstanceOf[js.Any])
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (readingOrder != null) __obj.updateDynamic("readingOrder")(readingOrder.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (verticalOverflow != null) __obj.updateDynamic("verticalOverflow")(verticalOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrameData]
  }
}


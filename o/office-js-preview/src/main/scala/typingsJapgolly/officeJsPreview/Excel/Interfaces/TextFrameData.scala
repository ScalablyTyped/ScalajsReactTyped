package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ShapeAutoSize
import typingsJapgolly.officeJsPreview.Excel.ShapeTextHorizontalAlignment
import typingsJapgolly.officeJsPreview.Excel.ShapeTextHorizontalOverflow
import typingsJapgolly.officeJsPreview.Excel.ShapeTextOrientation
import typingsJapgolly.officeJsPreview.Excel.ShapeTextReadingOrder
import typingsJapgolly.officeJsPreview.Excel.ShapeTextVerticalAlignment
import typingsJapgolly.officeJsPreview.Excel.ShapeTextVerticalOverflow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeMixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeNone
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeShapeToFitText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeTextToFitShape
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Center
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Clip
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Distributed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.EastAsianVertical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Ellipsis
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Horizontal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Justified
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Justify
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.JustifyLow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Left
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Middle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.MongolianVertical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Overflow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Right
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RightToLeft
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThaiDistributed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Top
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Vertical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Vertical270
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WordArtVertical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.WordArtVerticalRTL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `textFrame.toJSON()`. */
trait TextFrameData extends StObject {
  
  /**
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.undefined
  
  /**
    * Represents the bottom margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if the text frame contains text.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var hasText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the horizontal alignment of the text frame. See `Excel.ShapeTextHorizontalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var horizontalAlignment: js.UndefOr[
    ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.undefined
  
  /**
    * Represents the horizontal overflow behavior of the text frame. See `Excel.ShapeTextHorizontalOverflow` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var horizontalOverflow: js.UndefOr[ShapeTextHorizontalOverflow | Overflow | Clip] = js.undefined
  
  /**
    * Represents the left margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the angle to which the text is oriented for the text frame. See `Excel.ShapeTextOrientation` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var orientation: js.UndefOr[
    ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
  ] = js.undefined
  
  /**
    * Represents the reading order of the text frame, either left-to-right or right-to-left. See `Excel.ShapeTextReadingOrder` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var readingOrder: js.UndefOr[ShapeTextReadingOrder | LeftToRight | RightToLeft] = js.undefined
  
  /**
    * Represents the right margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the top margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the vertical alignment of the text frame. See `Excel.ShapeTextVerticalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var verticalAlignment: js.UndefOr[ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed] = js.undefined
  
  /**
    * Represents the vertical overflow behavior of the text frame. See `Excel.ShapeTextVerticalOverflow` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var verticalOverflow: js.UndefOr[ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip] = js.undefined
}
object TextFrameData {
  
  inline def apply(): TextFrameData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameData]
  }
  
  extension [Self <: TextFrameData](x: Self) {
    
    inline def setAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = StObject.set(x, "autoSizeSetting", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeSettingUndefined: Self = StObject.set(x, "autoSizeSetting", js.undefined)
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    inline def setHasText(value: Boolean): Self = StObject.set(x, "hasText", value.asInstanceOf[js.Any])
    
    inline def setHasTextUndefined: Self = StObject.set(x, "hasText", js.undefined)
    
    inline def setHorizontalAlignment(
      value: ShapeTextHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setHorizontalOverflow(value: ShapeTextHorizontalOverflow | Overflow | Clip): Self = StObject.set(x, "horizontalOverflow", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOverflowUndefined: Self = StObject.set(x, "horizontalOverflow", js.undefined)
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    inline def setOrientation(
      value: ShapeTextOrientation | Horizontal | Vertical | Vertical270 | WordArtVertical | EastAsianVertical | MongolianVertical | WordArtVerticalRTL
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setReadingOrder(value: ShapeTextReadingOrder | LeftToRight | RightToLeft): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    inline def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    inline def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setVerticalAlignment(value: ShapeTextVerticalAlignment | Top | Middle | Bottom | Justified | Distributed): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setVerticalOverflow(value: ShapeTextVerticalOverflow | Overflow | Ellipsis | Clip): Self = StObject.set(x, "verticalOverflow", value.asInstanceOf[js.Any])
    
    inline def setVerticalOverflowUndefined: Self = StObject.set(x, "verticalOverflow", js.undefined)
  }
}

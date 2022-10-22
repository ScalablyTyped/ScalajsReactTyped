package typingsJapgolly.officeJsPreview.PowerPoint.Interfaces

import typingsJapgolly.officeJsPreview.PowerPoint.ShapeAutoSize
import typingsJapgolly.officeJsPreview.PowerPoint.TextVerticalAlignment
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeMixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeNone
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeShapeToFitText
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.AutoSizeTextToFitShape
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.BottomCentered
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Middle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.MiddleCentered
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Top
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TopCentered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TextFrame object, for use in `textFrame.set({ ... })`. */
trait TextFrameUpdateData extends StObject {
  
  /**
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var autoSizeSetting: js.UndefOr[
    ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
  ] = js.undefined
  
  /**
    * Represents the bottom margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the left margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var leftMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the right margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var rightMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the top margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var topMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the vertical alignment of the text frame. See {@link PowerPoint.TextVerticalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var verticalAlignment: js.UndefOr[
    TextVerticalAlignment | Top | Middle | Bottom | TopCentered | MiddleCentered | BottomCentered
  ] = js.undefined
  
  /**
    * Determines whether lines break automatically to fit text inside the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}
object TextFrameUpdateData {
  
  inline def apply(): TextFrameUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFrameUpdateData]
  }
  
  extension [Self <: TextFrameUpdateData](x: Self) {
    
    inline def setAutoSizeSetting(
      value: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed
    ): Self = StObject.set(x, "autoSizeSetting", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeSettingUndefined: Self = StObject.set(x, "autoSizeSetting", js.undefined)
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    inline def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    inline def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    inline def setVerticalAlignment(
      value: TextVerticalAlignment | Top | Middle | Bottom | TopCentered | MiddleCentered | BottomCentered
    ): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}

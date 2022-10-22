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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeFont object, for use in `shapeFont.set({ ... })`. */
trait ShapeFontUpdateData extends StObject {
  
  /**
    * Represents the bold status of font. Returns `null` if the `TextRange` includes both bold and non-bold text fragments.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML color code representation of the text color (e.g., "#FF0000" represents red). Returns `null` if the `TextRange` includes text fragments with different colors.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the italic status of font. Returns `null` if the `TextRange` includes both italic and non-italic text fragments.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var italic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents font name (e.g., "Calibri"). If the text is a Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Represents font size in points (e.g., 11). Returns `null` if the `TextRange` includes text fragments with different font sizes.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of underline applied to the font. Returns `null` if the `TextRange` includes text fragments with different underline styles. See `Excel.ShapeFontUnderlineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var underline: js.UndefOr[
    ShapeFontUnderlineStyle | None | Single | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
  ] = js.undefined
}
object ShapeFontUpdateData {
  
  inline def apply(): ShapeFontUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFontUpdateData]
  }
  
  extension [Self <: ShapeFontUpdateData](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnderline(
      value: ShapeFontUnderlineStyle | None | Single | typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble
    ): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}

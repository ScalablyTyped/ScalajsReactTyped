package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ChartErrorBarsInclude
import typingsJapgolly.officeJsPreview.Excel.ChartErrorBarsType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Both
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Custom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FixedValue
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.MinusValues
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Percent
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PlusValues
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.StDev
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.StError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartErrorBars object, for use in `chartErrorBars.set({ ... })`. */
trait ChartErrorBarsUpdateData extends StObject {
  
  /**
    * Specifies if error bars have an end style cap.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the formatting type of the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatUpdateData] = js.undefined
  
  /**
    * Specifies which parts of the error bars to include.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[ChartErrorBarsInclude | Both | MinusValues | PlusValues] = js.undefined
  
  /**
    * The type of range marked by the error bars.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom] = js.undefined
  
  /**
    * Specifies whether the error bars are displayed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartErrorBarsUpdateData {
  
  inline def apply(): ChartErrorBarsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsUpdateData]
  }
  
  extension [Self <: ChartErrorBarsUpdateData](x: Self) {
    
    inline def setEndStyleCap(value: Boolean): Self = StObject.set(x, "endStyleCap", value.asInstanceOf[js.Any])
    
    inline def setEndStyleCapUndefined: Self = StObject.set(x, "endStyleCap", js.undefined)
    
    inline def setFormat(value: ChartErrorBarsFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInclude(value: ChartErrorBarsInclude | Both | MinusValues | PlusValues): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setType(value: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

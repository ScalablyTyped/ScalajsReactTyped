package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ArrowheadLength
import typingsJapgolly.officeJsPreview.Excel.ArrowheadStyle
import typingsJapgolly.officeJsPreview.Excel.ArrowheadWidth
import typingsJapgolly.officeJsPreview.Excel.ConnectorType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Curve
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Diamond
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Elbow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Long
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Medium
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Narrow
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Open
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Oval
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Short
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Stealth
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Straight
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Triangle
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Wide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Line object, for use in `line.set({ ... })`. */
trait LineUpdateData extends StObject {
  
  /**
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  
  /**
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  
  /**
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  
  /**
    * Represents the connector type for the line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.undefined
  
  /**
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  
  /**
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  
  /**
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
}
object LineUpdateData {
  
  inline def apply(): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineUpdateData]
  }
  
  extension [Self <: LineUpdateData](x: Self) {
    
    inline def setBeginArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "beginArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadLengthUndefined: Self = StObject.set(x, "beginArrowheadLength", js.undefined)
    
    inline def setBeginArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "beginArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadStyleUndefined: Self = StObject.set(x, "beginArrowheadStyle", js.undefined)
    
    inline def setBeginArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "beginArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setBeginArrowheadWidthUndefined: Self = StObject.set(x, "beginArrowheadWidth", js.undefined)
    
    inline def setConnectorType(value: ConnectorType | Straight | Elbow | Curve): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setEndArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = StObject.set(x, "endArrowheadLength", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadLengthUndefined: Self = StObject.set(x, "endArrowheadLength", js.undefined)
    
    inline def setEndArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = StObject.set(x, "endArrowheadStyle", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadStyleUndefined: Self = StObject.set(x, "endArrowheadStyle", js.undefined)
    
    inline def setEndArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = StObject.set(x, "endArrowheadWidth", value.asInstanceOf[js.Any])
    
    inline def setEndArrowheadWidthUndefined: Self = StObject.set(x, "endArrowheadWidth", js.undefined)
  }
}

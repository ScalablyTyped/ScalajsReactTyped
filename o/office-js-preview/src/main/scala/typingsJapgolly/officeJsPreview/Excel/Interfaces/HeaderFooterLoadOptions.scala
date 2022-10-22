package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait HeaderFooterLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The center footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The center header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var centerHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The left footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The left header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var leftHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The right footer of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The right header of the worksheet.
    To apply font formatting or insert a variable value, use format codes specified here: https://msdn.microsoft.com/library/bb225426.aspx.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var rightHeader: js.UndefOr[Boolean] = js.undefined
}
object HeaderFooterLoadOptions {
  
  inline def apply(): HeaderFooterLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFooterLoadOptions]
  }
  
  extension [Self <: HeaderFooterLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCenterFooter(value: Boolean): Self = StObject.set(x, "centerFooter", value.asInstanceOf[js.Any])
    
    inline def setCenterFooterUndefined: Self = StObject.set(x, "centerFooter", js.undefined)
    
    inline def setCenterHeader(value: Boolean): Self = StObject.set(x, "centerHeader", value.asInstanceOf[js.Any])
    
    inline def setCenterHeaderUndefined: Self = StObject.set(x, "centerHeader", js.undefined)
    
    inline def setLeftFooter(value: Boolean): Self = StObject.set(x, "leftFooter", value.asInstanceOf[js.Any])
    
    inline def setLeftFooterUndefined: Self = StObject.set(x, "leftFooter", js.undefined)
    
    inline def setLeftHeader(value: Boolean): Self = StObject.set(x, "leftHeader", value.asInstanceOf[js.Any])
    
    inline def setLeftHeaderUndefined: Self = StObject.set(x, "leftHeader", js.undefined)
    
    inline def setRightFooter(value: Boolean): Self = StObject.set(x, "rightFooter", value.asInstanceOf[js.Any])
    
    inline def setRightFooterUndefined: Self = StObject.set(x, "rightFooter", js.undefined)
    
    inline def setRightHeader(value: Boolean): Self = StObject.set(x, "rightHeader", value.asInstanceOf[js.Any])
    
    inline def setRightHeaderUndefined: Self = StObject.set(x, "rightHeader", js.undefined)
  }
}

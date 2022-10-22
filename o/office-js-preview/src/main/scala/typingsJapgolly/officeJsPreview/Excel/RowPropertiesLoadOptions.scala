package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.anon.CellPropertiesFormatLoadO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents which row properties to load, when used as part of a "range.getRowProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
trait RowPropertiesLoadOptions
  extends StObject
     with CellPropertiesLoadOptions {
  
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_RowPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadO] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `rowHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `rowIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
}
object RowPropertiesLoadOptions {
  
  inline def apply(): RowPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowPropertiesLoadOptions]
  }
  
  extension [Self <: RowPropertiesLoadOptions](x: Self) {
    
    inline def setFormat(value: CellPropertiesFormatLoadO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRowHidden(value: Boolean): Self = StObject.set(x, "rowHidden", value.asInstanceOf[js.Any])
    
    inline def setRowHiddenUndefined: Self = StObject.set(x, "rowHidden", js.undefined)
    
    inline def setRowIndex(value: Boolean): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}

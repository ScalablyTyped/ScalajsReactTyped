package typingsJapgolly.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotDataSourceOptions
  extends StObject
     with DataSourceOptions {
  
  var columns: js.UndefOr[js.Array[PivotDataSourceAxisOptions | String]] = js.undefined
  
  var measures: js.UndefOr[js.Array[String] | PivotDataSourceMeasureOptions] = js.undefined
  
  var rows: js.UndefOr[js.Array[PivotDataSourceAxisOptions | String]] = js.undefined
  
  @JSName("schema")
  var schema_PivotDataSourceOptions: js.UndefOr[PivotSchema] = js.undefined
  
  @JSName("transport")
  var transport_PivotDataSourceOptions: js.UndefOr[PivotTransport] = js.undefined
}
object PivotDataSourceOptions {
  
  inline def apply(): PivotDataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotDataSourceOptions]
  }
  
  extension [Self <: PivotDataSourceOptions](x: Self) {
    
    inline def setColumns(value: js.Array[PivotDataSourceAxisOptions | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (PivotDataSourceAxisOptions | String)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setMeasures(value: js.Array[String] | PivotDataSourceMeasureOptions): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setMeasuresVarargs(value: String*): Self = StObject.set(x, "measures", js.Array(value*))
    
    inline def setRows(value: js.Array[PivotDataSourceAxisOptions | String]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: (PivotDataSourceAxisOptions | String)*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSchema(value: PivotSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTransport(value: PivotTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}

package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindReplaceResponse extends StObject {
  
  /** The number of formula cells changed. */
  var formulasChanged: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of occurrences (possibly multiple within a cell) changed. For example, if replacing `"e"` with `"o"` in `"Google Sheets"`, this would be `"3"` because `"Google Sheets"`
    * -> `"Googlo Shoots"`.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
  
  /** The number of rows changed. */
  var rowsChanged: js.UndefOr[Double] = js.undefined
  
  /** The number of sheets changed. */
  var sheetsChanged: js.UndefOr[Double] = js.undefined
  
  /** The number of non-formula cells changed. */
  var valuesChanged: js.UndefOr[Double] = js.undefined
}
object FindReplaceResponse {
  
  inline def apply(): FindReplaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindReplaceResponse]
  }
  
  extension [Self <: FindReplaceResponse](x: Self) {
    
    inline def setFormulasChanged(value: Double): Self = StObject.set(x, "formulasChanged", value.asInstanceOf[js.Any])
    
    inline def setFormulasChangedUndefined: Self = StObject.set(x, "formulasChanged", js.undefined)
    
    inline def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
    
    inline def setRowsChanged(value: Double): Self = StObject.set(x, "rowsChanged", value.asInstanceOf[js.Any])
    
    inline def setRowsChangedUndefined: Self = StObject.set(x, "rowsChanged", js.undefined)
    
    inline def setSheetsChanged(value: Double): Self = StObject.set(x, "sheetsChanged", value.asInstanceOf[js.Any])
    
    inline def setSheetsChangedUndefined: Self = StObject.set(x, "sheetsChanged", js.undefined)
    
    inline def setValuesChanged(value: Double): Self = StObject.set(x, "valuesChanged", value.asInstanceOf[js.Any])
    
    inline def setValuesChangedUndefined: Self = StObject.set(x, "valuesChanged", js.undefined)
  }
}

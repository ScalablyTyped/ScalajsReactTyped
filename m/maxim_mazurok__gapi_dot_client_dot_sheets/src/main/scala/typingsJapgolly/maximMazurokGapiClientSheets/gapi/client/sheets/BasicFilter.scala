package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicFilter extends StObject {
  
  /**
    * The criteria for showing/hiding values per column. The map's key is the column index, and the value is the criteria for that column. This field is deprecated in favor of
    * filter_specs.
    */
  var criteria: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.FilterCriteria} */ js.Any
  ] = js.undefined
  
  /** The filter criteria per column. Both criteria and filter_specs are populated in responses. If both fields are specified in an update request, this field takes precedence. */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.undefined
  
  /** The range the filter covers. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The sort order per column. Later specifications are used when values are equal in the earlier specifications. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}
object BasicFilter {
  
  inline def apply(): BasicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicFilter]
  }
  
  extension [Self <: BasicFilter](x: Self) {
    
    inline def setCriteria(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.FilterCriteria} */ js.Any
    ): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setFilterSpecs(value: js.Array[FilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    inline def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    inline def setFilterSpecsVarargs(value: FilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value*))
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value*))
  }
}

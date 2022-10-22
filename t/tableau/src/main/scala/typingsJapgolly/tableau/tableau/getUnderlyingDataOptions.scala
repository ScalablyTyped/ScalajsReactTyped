package typingsJapgolly.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getUnderlyingDataOptions extends StObject {
  
  /** Do not use aliases specified in the data source in Tableau. Default is false. */
  var ignoreAliases: js.UndefOr[Boolean] = js.undefined
  
  /** Return all the columns for the data source. Default is false. */
  var ignoreAllColumns: js.UndefOr[Boolean] = js.undefined
  
  /** Only return data for the currently selected marks. Default is false. */
  var ignoreSelection: js.UndefOr[Boolean] = js.undefined
  
  /** The number of rows of data that you want to return. Enter 0 to return all rows. */
  var maxRows: Double
}
object getUnderlyingDataOptions {
  
  inline def apply(maxRows: Double): getUnderlyingDataOptions = {
    val __obj = js.Dynamic.literal(maxRows = maxRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[getUnderlyingDataOptions]
  }
  
  extension [Self <: getUnderlyingDataOptions](x: Self) {
    
    inline def setIgnoreAliases(value: Boolean): Self = StObject.set(x, "ignoreAliases", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAliasesUndefined: Self = StObject.set(x, "ignoreAliases", js.undefined)
    
    inline def setIgnoreAllColumns(value: Boolean): Self = StObject.set(x, "ignoreAllColumns", value.asInstanceOf[js.Any])
    
    inline def setIgnoreAllColumnsUndefined: Self = StObject.set(x, "ignoreAllColumns", js.undefined)
    
    inline def setIgnoreSelection(value: Boolean): Self = StObject.set(x, "ignoreSelection", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSelectionUndefined: Self = StObject.set(x, "ignoreSelection", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
  }
}

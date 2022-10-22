package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.`var`
import typingsJapgolly.exceljs.exceljsStrings.average
import typingsJapgolly.exceljs.exceljsStrings.count
import typingsJapgolly.exceljs.exceljsStrings.countNums
import typingsJapgolly.exceljs.exceljsStrings.custom
import typingsJapgolly.exceljs.exceljsStrings.max
import typingsJapgolly.exceljs.exceljsStrings.min
import typingsJapgolly.exceljs.exceljsStrings.none_
import typingsJapgolly.exceljs.exceljsStrings.stdDev
import typingsJapgolly.exceljs.exceljsStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumnProperties extends StObject {
  
  /**
  	  * Switches the filter control in the header
  	  * @default false
  	  */
  var filterButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  	  * The name of the column, also used in the header
  	  */
  var name: String
  
  /**
  	  * Optional formula for custom functions
  	  */
  var totalsRowFormula: js.UndefOr[String] = js.undefined
  
  /**
  	  * Name of the totals function
  	  * @default 'none'
  	  */
  var totalsRowFunction: js.UndefOr[none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom] = js.undefined
  
  /**
  	  * Label to describe the totals row (first column)
  	  * @default 'Total'
  	  */
  var totalsRowLabel: js.UndefOr[String] = js.undefined
}
object TableColumnProperties {
  
  inline def apply(name: String): TableColumnProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProperties]
  }
  
  extension [Self <: TableColumnProperties](x: Self) {
    
    inline def setFilterButton(value: Boolean): Self = StObject.set(x, "filterButton", value.asInstanceOf[js.Any])
    
    inline def setFilterButtonUndefined: Self = StObject.set(x, "filterButton", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowFormula(value: String): Self = StObject.set(x, "totalsRowFormula", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowFormulaUndefined: Self = StObject.set(x, "totalsRowFormula", js.undefined)
    
    inline def setTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = StObject.set(x, "totalsRowFunction", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowFunctionUndefined: Self = StObject.set(x, "totalsRowFunction", js.undefined)
    
    inline def setTotalsRowLabel(value: String): Self = StObject.set(x, "totalsRowLabel", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowLabelUndefined: Self = StObject.set(x, "totalsRowLabel", js.undefined)
  }
}

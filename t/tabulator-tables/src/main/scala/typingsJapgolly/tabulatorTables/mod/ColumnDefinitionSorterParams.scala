package typingsJapgolly.tabulatorTables.mod

import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.avg
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.bottom
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.length
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.max
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.min
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.sum
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinitionSorterParams extends StObject {
  
  var alignEmptyValues: js.UndefOr[top | bottom] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String | Boolean] = js.undefined
  
  var `type`: js.UndefOr[length | sum | max | min | avg] = js.undefined
}
object ColumnDefinitionSorterParams {
  
  inline def apply(): ColumnDefinitionSorterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinitionSorterParams]
  }
  
  extension [Self <: ColumnDefinitionSorterParams](x: Self) {
    
    inline def setAlignEmptyValues(value: top | bottom): Self = StObject.set(x, "alignEmptyValues", value.asInstanceOf[js.Any])
    
    inline def setAlignEmptyValuesUndefined: Self = StObject.set(x, "alignEmptyValues", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocale(value: String | Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setType(value: length | sum | max | min | avg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

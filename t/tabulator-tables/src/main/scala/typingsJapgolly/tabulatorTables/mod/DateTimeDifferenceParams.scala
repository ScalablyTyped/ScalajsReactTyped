package typingsJapgolly.tabulatorTables.mod

import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.days
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.hours
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.minutes
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.months
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.seconds
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.weeks
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.tabulatorTables.mod._FormatterParams because Already inherited */ trait DateTimeDifferenceParams
  extends StObject
     with DateTimeParams {
  
  // Date Time Difference
  var date: js.UndefOr[Any] = js.undefined
  
  var humanize: js.UndefOr[Boolean] = js.undefined
  
  var suffix: js.UndefOr[Boolean] = js.undefined
  
  var unit: js.UndefOr[years | months | weeks | days | hours | minutes | seconds] = js.undefined
}
object DateTimeDifferenceParams {
  
  inline def apply(): DateTimeDifferenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeDifferenceParams]
  }
  
  extension [Self <: DateTimeDifferenceParams](x: Self) {
    
    inline def setDate(value: Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setHumanize(value: Boolean): Self = StObject.set(x, "humanize", value.asInstanceOf[js.Any])
    
    inline def setHumanizeUndefined: Self = StObject.set(x, "humanize", js.undefined)
    
    inline def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setUnit(value: years | months | weeks | days | hours | minutes | seconds): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}

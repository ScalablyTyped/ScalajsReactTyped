package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartPointFormat
  extends StObject
     with Entity {
  
  // Represents the fill format of a chart, which includes background formating information. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.undefined
}
object WorkbookChartPointFormat {
  
  inline def apply(): WorkbookChartPointFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartPointFormat]
  }
  
  extension [Self <: WorkbookChartPointFormat](x: Self) {
    
    inline def setFill(value: NullableOption[WorkbookChartFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}

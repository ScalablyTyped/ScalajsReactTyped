package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartLineFormat
  extends StObject
     with Entity {
  
  // HTML color code representing the color of lines in the chart.
  var color: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookChartLineFormat {
  
  inline def apply(): WorkbookChartLineFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartLineFormat]
  }
  
  extension [Self <: WorkbookChartLineFormat](x: Self) {
    
    inline def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}

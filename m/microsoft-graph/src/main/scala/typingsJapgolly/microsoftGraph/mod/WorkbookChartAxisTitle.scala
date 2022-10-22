package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartAxisTitle
  extends StObject
     with Entity {
  
  // Represents the formatting of chart axis title. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartAxisTitleFormat]] = js.undefined
  
  // Represents the axis title.
  var text: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A boolean that specifies the visibility of an axis title.
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WorkbookChartAxisTitle {
  
  inline def apply(): WorkbookChartAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisTitle]
  }
  
  extension [Self <: WorkbookChartAxisTitle](x: Self) {
    
    inline def setFormat(value: NullableOption[WorkbookChartAxisTitleFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

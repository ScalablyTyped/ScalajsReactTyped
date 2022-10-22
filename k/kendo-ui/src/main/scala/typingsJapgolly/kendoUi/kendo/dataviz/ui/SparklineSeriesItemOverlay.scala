package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesItemOverlay extends StObject {
  
  var gradient: js.UndefOr[String] = js.undefined
}
object SparklineSeriesItemOverlay {
  
  inline def apply(): SparklineSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemOverlay]
  }
  
  extension [Self <: SparklineSeriesItemOverlay](x: Self) {
    
    inline def setGradient(value: String): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
  }
}

package typingsJapgolly.googleVisualization.google.visualization

import typingsJapgolly.googleVisualization.googleVisualizationStrings.area
import typingsJapgolly.googleVisualization.googleVisualizationStrings.bars
import typingsJapgolly.googleVisualization.googleVisualizationStrings.boxes
import typingsJapgolly.googleVisualization.googleVisualizationStrings.line
import typingsJapgolly.googleVisualization.googleVisualizationStrings.points
import typingsJapgolly.googleVisualization.googleVisualizationStrings.sticks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Intervals extends StObject {
  
  var barWidth: js.UndefOr[Double] = js.undefined
  
  var boxWidth: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var pointSize: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[area | bars | boxes | line | points | sticks] = js.undefined
}
object Intervals {
  
  inline def apply(): Intervals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Intervals]
  }
  
  extension [Self <: Intervals](x: Self) {
    
    inline def setBarWidth(value: Double): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
    
    inline def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setStyle(value: area | bars | boxes | line | points | sticks): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}

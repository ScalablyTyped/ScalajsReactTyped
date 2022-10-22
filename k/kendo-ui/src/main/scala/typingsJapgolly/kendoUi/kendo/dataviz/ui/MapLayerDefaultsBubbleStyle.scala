package typingsJapgolly.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsBubbleStyle extends StObject {
  
  var fill: js.UndefOr[MapLayerDefaultsBubbleStyleFill] = js.undefined
  
  var stroke: js.UndefOr[MapLayerDefaultsBubbleStyleStroke] = js.undefined
}
object MapLayerDefaultsBubbleStyle {
  
  inline def apply(): MapLayerDefaultsBubbleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsBubbleStyle]
  }
  
  extension [Self <: MapLayerDefaultsBubbleStyle](x: Self) {
    
    inline def setFill(value: MapLayerDefaultsBubbleStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: MapLayerDefaultsBubbleStyleStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}

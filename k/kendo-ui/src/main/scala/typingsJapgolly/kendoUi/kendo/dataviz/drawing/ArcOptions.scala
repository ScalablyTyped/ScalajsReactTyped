package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.geometry.Transformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcOptions extends StObject {
  
  var clip: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.Path] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var fill: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.FillOptions] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.StrokeOptions] = js.undefined
  
  var tooltip: js.UndefOr[typingsJapgolly.kendoUi.kendo.drawing.TooltipOptions] = js.undefined
  
  var transform: js.UndefOr[Transformation] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ArcOptions {
  
  inline def apply(): ArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcOptions]
  }
  
  extension [Self <: ArcOptions](x: Self) {
    
    inline def setClip(value: typingsJapgolly.kendoUi.kendo.drawing.Path): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFill(value: typingsJapgolly.kendoUi.kendo.drawing.FillOptions): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStroke(value: typingsJapgolly.kendoUi.kendo.drawing.StrokeOptions): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setTooltip(value: typingsJapgolly.kendoUi.kendo.drawing.TooltipOptions): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.FillRule
import typingsJapgolly.leaflet.mod.LineCapShape
import typingsJapgolly.leaflet.mod.LineJoinShape
import typingsJapgolly.leaflet.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.LayerOptions because var conflicts: attribution, pane. Inlined 
- typingsJapgolly.leaflet.mod.InteractiveLayerOptions because var conflicts: attribution, pane. Inlined bubblingMouseEvents, interactive
- typingsJapgolly.leaflet.mod.PathOptions because var conflicts: attribution, pane. Inlined lineCap, fillOpacity, stroke, lineJoin, fillColor, dashOffset, color, renderer, fillRule, fill, className, dashArray, opacity, weight */ trait FeatureGroupProps
  extends StObject
     with MapLayerProps
     with FeatureGroupEvents {
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var dashArray: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var dashOffset: js.UndefOr[String] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var fillRule: js.UndefOr[FillRule] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var lineCap: js.UndefOr[LineCapShape] = js.undefined
  
  var lineJoin: js.UndefOr[LineJoinShape] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  var stroke: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object FeatureGroupProps {
  
  inline def apply(): FeatureGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureGroupProps]
  }
  
  extension [Self <: FeatureGroupProps](x: Self) {
    
    inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashArray(value: String | js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
    
    inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
    
    inline def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value*))
    
    inline def setDashOffset(value: String): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
    
    inline def setDashOffsetUndefined: Self = StObject.set(x, "dashOffset", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setLineCap(value: LineCapShape): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineJoin(value: LineJoinShape): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}

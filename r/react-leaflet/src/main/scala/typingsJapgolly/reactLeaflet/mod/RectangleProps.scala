package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.LayerOptions because Already inherited
- typingsJapgolly.leaflet.mod.InteractiveLayerOptions because Already inherited
- typingsJapgolly.leaflet.mod.PathOptions because Already inherited
- typingsJapgolly.leaflet.mod.PolylineOptions because var conflicts: attribution, bubblingMouseEvents, className, color, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule, interactive, lineCap, lineJoin, opacity, pane, renderer, stroke, weight. Inlined noClip, smoothFactor */ trait RectangleProps
  extends StObject
     with PathProps {
  
  var bounds: LatLngBoundsExpression
  
  var noClip: js.UndefOr[Boolean] = js.undefined
  
  var smoothFactor: js.UndefOr[Double] = js.undefined
}
object RectangleProps {
  
  inline def apply(bounds: LatLngBoundsExpression): RectangleProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleProps]
  }
  
  extension [Self <: RectangleProps](x: Self) {
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setNoClip(value: Boolean): Self = StObject.set(x, "noClip", value.asInstanceOf[js.Any])
    
    inline def setNoClipUndefined: Self = StObject.set(x, "noClip", js.undefined)
    
    inline def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    inline def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
  }
}

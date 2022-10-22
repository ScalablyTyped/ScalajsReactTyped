package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.LayerOptions because Already inherited
- typingsJapgolly.leaflet.mod.InteractiveLayerOptions because Already inherited
- typingsJapgolly.leaflet.mod.PathOptions because Already inherited
- typingsJapgolly.leaflet.mod.PolylineOptions because var conflicts: attribution, bubblingMouseEvents, className, color, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule, interactive, lineCap, lineJoin, opacity, pane, renderer, stroke, weight. Inlined noClip, smoothFactor */ trait PolygonProps
  extends StObject
     with PathProps {
  
  var noClip: js.UndefOr[Boolean] = js.undefined
  
  var positions: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]
  
  var smoothFactor: js.UndefOr[Double] = js.undefined
}
object PolygonProps {
  
  inline def apply(positions: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): PolygonProps = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonProps]
  }
  
  extension [Self <: PolygonProps](x: Self) {
    
    inline def setNoClip(value: Boolean): Self = StObject.set(x, "noClip", value.asInstanceOf[js.Any])
    
    inline def setNoClipUndefined: Self = StObject.set(x, "noClip", js.undefined)
    
    inline def setPositions(value: js.Array[(js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: ((js.Array[js.Array[LatLngExpression] | LatLngExpression]) | LatLngExpression)*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    inline def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
  }
}

package typingsJapgolly.reactLeafletMarkercluster.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.leaflet.mod.DivIcon_
import typingsJapgolly.leaflet.mod.IconOptions
import typingsJapgolly.leaflet.mod.Icon_
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.leaflet.mod.PolylineOptions
import typingsJapgolly.leafletMarkercluster.leafletMod.MarkerCluster
import typingsJapgolly.reactLeafletMarkercluster.mod.MarkerClusterGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLeafletMarkercluster {
  
  @JSImport("react-leaflet-markercluster", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animateAddingMarkers(value: Boolean): this.type = set("animateAddingMarkers", value.asInstanceOf[js.Any])
    
    inline def chunkDelay(value: Double): this.type = set("chunkDelay", value.asInstanceOf[js.Any])
    
    inline def chunkInterval(value: Double): this.type = set("chunkInterval", value.asInstanceOf[js.Any])
    
    inline def chunkProgress(value: (/* processed */ Double, /* total */ Double, /* elapsed */ Double) => Callback): this.type = set("chunkProgress", js.Any.fromFunction3((t0: /* processed */ Double, t1: /* total */ Double, t2: /* elapsed */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def chunkProgressNull: this.type = set("chunkProgress", null)
    
    inline def chunkedLoading(value: Boolean): this.type = set("chunkedLoading", value.asInstanceOf[js.Any])
    
    inline def clusterPane(value: String): this.type = set("clusterPane", value.asInstanceOf[js.Any])
    
    inline def disableClusteringAtZoom(value: Double): this.type = set("disableClusteringAtZoom", value.asInstanceOf[js.Any])
    
    inline def iconCreateFunction(value: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_): this.type = set("iconCreateFunction", js.Any.fromFunction1(value))
    
    inline def maxClusterRadius(value: Double | (js.Function1[/* zoom */ Double, Double])): this.type = set("maxClusterRadius", value.asInstanceOf[js.Any])
    
    inline def maxClusterRadiusFunction1(value: /* zoom */ Double => Double): this.type = set("maxClusterRadius", js.Any.fromFunction1(value))
    
    inline def polygonOptions(value: PolylineOptions): this.type = set("polygonOptions", value.asInstanceOf[js.Any])
    
    inline def removeOutsideVisibleBounds(value: Boolean): this.type = set("removeOutsideVisibleBounds", value.asInstanceOf[js.Any])
    
    inline def showCoverageOnHover(value: Boolean): this.type = set("showCoverageOnHover", value.asInstanceOf[js.Any])
    
    inline def singleMarkerMode(value: Boolean): this.type = set("singleMarkerMode", value.asInstanceOf[js.Any])
    
    inline def spiderLegPolylineOptions(value: PolylineOptions): this.type = set("spiderLegPolylineOptions", value.asInstanceOf[js.Any])
    
    inline def spiderfyDistanceMultiplier(value: Double): this.type = set("spiderfyDistanceMultiplier", value.asInstanceOf[js.Any])
    
    inline def spiderfyOnMaxZoom(value: Boolean): this.type = set("spiderfyOnMaxZoom", value.asInstanceOf[js.Any])
    
    inline def spiderfyShapePositions(value: (/* count */ Double, /* centerPt */ Point_) => js.Array[Point_]): this.type = set("spiderfyShapePositions", js.Any.fromFunction2(value))
    
    inline def zoomToBoundsOnClick(value: Boolean): this.type = set("zoomToBoundsOnClick", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactLeafletMarkercluster.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarkerClusterGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

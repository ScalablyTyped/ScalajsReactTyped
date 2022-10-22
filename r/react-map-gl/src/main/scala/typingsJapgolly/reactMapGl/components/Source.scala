package typingsJapgolly.reactMapGl.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.reactMapGl.mod.SourceProps
import typingsJapgolly.reactMapGl.reactMapGlStrings.mapbox
import typingsJapgolly.reactMapGl.reactMapGlStrings.terrarium
import typingsJapgolly.reactMapGl.reactMapGlStrings.tms
import typingsJapgolly.reactMapGl.reactMapGlStrings.xyz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Source {
  
  inline def apply(`type`: String): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SourceProps]))
  }
  
  @JSImport("react-map-gl", "Source")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMapGl.mod.Source] {
    
    inline def attribution(value: String): this.type = set("attribution", value.asInstanceOf[js.Any])
    
    inline def bounds(value: js.Array[Double]): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def boundsVarargs(value: Double*): this.type = set("bounds", js.Array(value*))
    
    inline def buffer(value: Double): this.type = set("buffer", value.asInstanceOf[js.Any])
    
    inline def cluster(value: Boolean): this.type = set("cluster", value.asInstanceOf[js.Any])
    
    inline def clusterMaxZoom(value: Double): this.type = set("clusterMaxZoom", value.asInstanceOf[js.Any])
    
    inline def clusterProperties(value: js.Object): this.type = set("clusterProperties", value.asInstanceOf[js.Any])
    
    inline def clusterRadius(value: Double): this.type = set("clusterRadius", value.asInstanceOf[js.Any])
    
    inline def coordinates(value: js.Array[js.Array[Double]]): this.type = set("coordinates", value.asInstanceOf[js.Any])
    
    inline def coordinatesVarargs(value: js.Array[Double]*): this.type = set("coordinates", js.Array(value*))
    
    inline def data(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def encoding(value: terrarium | mapbox): this.type = set("encoding", value.asInstanceOf[js.Any])
    
    inline def generateId(value: Boolean): this.type = set("generateId", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def lineMetrics(value: Boolean): this.type = set("lineMetrics", value.asInstanceOf[js.Any])
    
    inline def maxzoom(value: Double): this.type = set("maxzoom", value.asInstanceOf[js.Any])
    
    inline def minzoom(value: Double): this.type = set("minzoom", value.asInstanceOf[js.Any])
    
    inline def scheme(value: xyz | tms): this.type = set("scheme", value.asInstanceOf[js.Any])
    
    inline def tileSize(value: Double): this.type = set("tileSize", value.asInstanceOf[js.Any])
    
    inline def tiles(value: js.Array[String]): this.type = set("tiles", value.asInstanceOf[js.Any])
    
    inline def tilesVarargs(value: String*): this.type = set("tiles", js.Array(value*))
    
    inline def tolerance(value: Double): this.type = set("tolerance", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    
    inline def urls(value: js.Array[String]): this.type = set("urls", value.asInstanceOf[js.Any])
    
    inline def urlsVarargs(value: String*): this.type = set("urls", js.Array(value*))
  }
  
  def withProps(p: SourceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

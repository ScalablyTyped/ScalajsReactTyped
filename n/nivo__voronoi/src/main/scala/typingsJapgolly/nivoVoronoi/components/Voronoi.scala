package typingsJapgolly.nivoVoronoi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoVoronoi.anon.PartialOmitVoronoiSvgProp
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiDatum
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiDomain
import typingsJapgolly.nivoVoronoi.distTypesTypesMod.VoronoiLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Voronoi {
  
  inline def apply(data: js.Array[VoronoiDatum], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PartialOmitVoronoiSvgProp]))
  }
  
  @JSImport("@nivo/voronoi", "Voronoi")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cellLineColor(value: String): this.type = set("cellLineColor", value.asInstanceOf[js.Any])
    
    inline def cellLineWidth(value: Double): this.type = set("cellLineWidth", value.asInstanceOf[js.Any])
    
    inline def enableCells(value: Boolean): this.type = set("enableCells", value.asInstanceOf[js.Any])
    
    inline def enableLinks(value: Boolean): this.type = set("enableLinks", value.asInstanceOf[js.Any])
    
    inline def enablePoints(value: Boolean): this.type = set("enablePoints", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[VoronoiLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: VoronoiLayer*): this.type = set("layers", js.Array(value*))
    
    inline def linkLineColor(value: String): this.type = set("linkLineColor", value.asInstanceOf[js.Any])
    
    inline def linkLineWidth(value: Double): this.type = set("linkLineWidth", value.asInstanceOf[js.Any])
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def pointColor(value: String): this.type = set("pointColor", value.asInstanceOf[js.Any])
    
    inline def pointSize(value: Double): this.type = set("pointSize", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def xDomain(value: VoronoiDomain): this.type = set("xDomain", value.asInstanceOf[js.Any])
    
    inline def yDomain(value: VoronoiDomain): this.type = set("yDomain", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PartialOmitVoronoiSvgProp): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

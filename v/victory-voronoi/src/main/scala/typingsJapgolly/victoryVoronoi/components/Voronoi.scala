package typingsJapgolly.victoryVoronoi.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryVoronoi.esMod.VoronoiProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Voronoi {
  
  @JSImport("victory-voronoi/es", "Voronoi")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryVoronoi.esMod.Voronoi] {
    
    inline def circleComponent(value: VdomElement): this.type = set("circleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def clipId(value: Double | String): this.type = set("clipId", value.asInstanceOf[js.Any])
    
    inline def clipPathComponent(value: VdomElement): this.type = set("clipPathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def datum(value: Any): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def pathComponent(value: VdomElement): this.type = set("pathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def polygon(value: js.Array[Any]): this.type = set("polygon", value.asInstanceOf[js.Any])
    
    inline def polygonVarargs(value: Any*): this.type = set("polygon", js.Array(value*))
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Voronoi.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VoronoiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

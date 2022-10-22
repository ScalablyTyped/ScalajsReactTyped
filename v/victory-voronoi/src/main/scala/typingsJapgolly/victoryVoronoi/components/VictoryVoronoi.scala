package typingsJapgolly.victoryVoronoi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryVoronoi.esMod.VictoryVoronoiProps
import typingsJapgolly.victoryVoronoi.esMod.VictoryVoronoiSortOrderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryVoronoi {
  
  @JSImport("victory-voronoi/es", "VictoryVoronoi")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryVoronoi.esMod.VictoryVoronoi] {
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, string | number | Array<string | number>> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, string | number | Array<string | number>> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def size(value: Double | (js.Function1[/* data */ Any, Double])): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sizeFunction1(value: /* data */ Any => Double): this.type = set("size", js.Any.fromFunction1(value))
    
    inline def sortKey(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("sortKey", value.asInstanceOf[js.Any])
    
    inline def sortKeyVarargs(value: String*): this.type = set("sortKey", js.Array(value*))
    
    inline def sortOrder(value: VictoryVoronoiSortOrderType): this.type = set("sortOrder", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: Double): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryVoronoi.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryVoronoiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.victoryVoronoiContainer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryVoronoiContainer.esMod.VictoryVoronoiContainerProps
import typingsJapgolly.victoryVoronoiContainer.victoryVoronoiContainerStrings.x
import typingsJapgolly.victoryVoronoiContainer.victoryVoronoiContainerStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryVoronoiContainer {
  
  @JSImport("victory-voronoi-container/es", "VictoryVoronoiContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryVoronoiContainer.esMod.VictoryVoronoiContainer] {
    
    inline def activateData(value: Boolean): this.type = set("activateData", value.asInstanceOf[js.Any])
    
    inline def activateLabels(value: Boolean): this.type = set("activateLabels", value.asInstanceOf[js.Any])
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def labelComponent(value: VdomElement): this.type = set("labelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def labels(value: (/* point */ Any, /* index */ Double, /* points */ js.Array[Any]) => String): this.type = set("labels", js.Any.fromFunction3(value))
    
    inline def mouseFollowTooltips(value: Boolean): this.type = set("mouseFollowTooltips", value.asInstanceOf[js.Any])
    
    inline def onActivated(value: (/* points */ js.Array[Any], VictoryVoronoiContainerProps) => Callback): this.type = set("onActivated", js.Any.fromFunction2((t0: /* points */ js.Array[Any], t1: VictoryVoronoiContainerProps) => (value(t0, t1)).runNow()))
    
    inline def onDeactivated(value: (/* points */ js.Array[Any], VictoryVoronoiContainerProps) => Callback): this.type = set("onDeactivated", js.Any.fromFunction2((t0: /* points */ js.Array[Any], t1: VictoryVoronoiContainerProps) => (value(t0, t1)).runNow()))
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def voronoiBlacklist(value: js.Array[String | js.RegExp]): this.type = set("voronoiBlacklist", value.asInstanceOf[js.Any])
    
    inline def voronoiBlacklistVarargs(value: (String | js.RegExp)*): this.type = set("voronoiBlacklist", js.Array(value*))
    
    inline def voronoiDimension(value: x | y): this.type = set("voronoiDimension", value.asInstanceOf[js.Any])
    
    inline def voronoiPadding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
    ): this.type = set("voronoiPadding", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryVoronoiContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryVoronoiContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Content
import typingsJapgolly.grommet.anon.Dark
import typingsJapgolly.grommet.anon.Name
import typingsJapgolly.grommet.es6ComponentsWorldMapMod.WorldMapExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorldMap {
  
  @JSImport("grommet/es6", "WorldMap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def color(value: ColorType): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def continents(value: js.Array[Name]): this.type = set("continents", value.asInstanceOf[js.Any])
    
    inline def continentsVarargs(value: Name*): this.type = set("continents", js.Array(value*))
    
    inline def fill(value: FillType): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def hoverColor(value: String | Dark): this.type = set("hoverColor", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onSelectPlace(value: /* place */ js.Tuple2[Double, Double] => Callback): this.type = set("onSelectPlace", js.Any.fromFunction1((t0: /* place */ js.Tuple2[Double, Double]) => value(t0).runNow()))
    
    inline def places(value: js.Array[Content]): this.type = set("places", value.asInstanceOf[js.Any])
    
    inline def placesVarargs(value: Content*): this.type = set("places", js.Array(value*))
  }
  
  implicit def make(companion: WorldMap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WorldMapExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

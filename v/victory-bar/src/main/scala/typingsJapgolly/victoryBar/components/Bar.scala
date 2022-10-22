package typingsJapgolly.victoryBar.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryBar.anon.Bottom
import typingsJapgolly.victoryBar.esMod.BarProps
import typingsJapgolly.victoryBar.esMod.VictoryBarAlignmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Bar {
  
  @JSImport("victory-bar/es", "Bar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryBar.esMod.Bar] {
    
    inline def alignment(value: VictoryBarAlignmentType): this.type = set("alignment", value.asInstanceOf[js.Any])
    
    inline def barOffset(value: js.Array[Double]): this.type = set("barOffset", value.asInstanceOf[js.Any])
    
    inline def barOffsetVarargs(value: Double*): this.type = set("barOffset", js.Array(value*))
    
    inline def barRatio(value: Double): this.type = set("barRatio", value.asInstanceOf[js.Any])
    
    inline def barWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("barWidth", value.asInstanceOf[js.Any])
    
    inline def cornerRadius(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
    ): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def datum(value: Any): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def getPath(value: js.Function): this.type = set("getPath", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def pathComponent(value: VdomElement): this.type = set("pathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
    
    inline def y0(value: Double): this.type = set("y0", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Bar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

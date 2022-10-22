package typingsJapgolly.victoryCanvas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCanvas.anon.Bottom
import typingsJapgolly.victoryCanvas.esMod.CanvasBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CanvasBar {
  
  @JSImport("victory-canvas/es", "CanvasBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCanvas.esMod.CanvasBar] {
    
    inline def alignment(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryBarAlignmentType */ Any
    ): this.type = set("alignment", value.asInstanceOf[js.Any])
    
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
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
    
    inline def y0(value: Double): this.type = set("y0", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CanvasBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CanvasBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

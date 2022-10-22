package typingsJapgolly.victoryLine.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryLine.esCurveMod.CurveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Curve {
  
  @JSImport("victory-line/es", "Curve")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
    ): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def interpolation(value: String | js.Function): this.type = set("interpolation", value.asInstanceOf[js.Any])
    
    inline def openCurve(value: Boolean): this.type = set("openCurve", value.asInstanceOf[js.Any])
    
    inline def pathComponent(value: VdomElement): this.type = set("pathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabIndex(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Curve.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CurveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

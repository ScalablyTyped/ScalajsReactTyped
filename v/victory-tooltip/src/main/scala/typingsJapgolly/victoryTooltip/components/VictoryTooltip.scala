package typingsJapgolly.victoryTooltip.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryTooltip.anon.X
import typingsJapgolly.victoryTooltip.anon.Y
import typingsJapgolly.victoryTooltip.esMod.VictoryTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryTooltip {
  
  @JSImport("victory-tooltip/es", "VictoryTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryTooltip.esMod.VictoryTooltip] {
    
    inline def activateData(value: Boolean): this.type = set("activateData", value.asInstanceOf[js.Any])
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def activePoints(value: js.Array[Any]): this.type = set("activePoints", value.asInstanceOf[js.Any])
    
    inline def activePointsVarargs(value: Any*): this.type = set("activePoints", js.Array(value*))
    
    inline def angle(value: String | Double): this.type = set("angle", value.asInstanceOf[js.Any])
    
    inline def center(value: X): this.type = set("center", value.asInstanceOf[js.Any])
    
    inline def centerOffset(value: Y): this.type = set("centerOffset", value.asInstanceOf[js.Any])
    
    inline def constrainToVisibleArea(value: Boolean): this.type = set("constrainToVisibleArea", value.asInstanceOf[js.Any])
    
    inline def cornerRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def datum(value: js.Object): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def dx(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("dx", value.asInstanceOf[js.Any])
    
    inline def dy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("dy", value.asInstanceOf[js.Any])
    
    inline def flyoutComponent(value: VdomElement): this.type = set("flyoutComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def flyoutHeight(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("flyoutHeight", value.asInstanceOf[js.Any])
    
    inline def flyoutPadding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingOrCallback */ Any
    ): this.type = set("flyoutPadding", value.asInstanceOf[js.Any])
    
    inline def flyoutStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
    ): this.type = set("flyoutStyle", value.asInstanceOf[js.Any])
    
    inline def flyoutWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("flyoutWidth", value.asInstanceOf[js.Any])
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def index(value: Double | String): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def orientation(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | (js.Function1[
          /* repeated */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
        ])
    ): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def orientationFunction1(
      value: /* repeated */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
    ): this.type = set("orientation", js.Any.fromFunction1(value))
    
    inline def pointerLength(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("pointerLength", value.asInstanceOf[js.Any])
    
    inline def pointerOrientation(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | (js.Function1[
          /* repeated */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
        ])
    ): this.type = set("pointerOrientation", value.asInstanceOf[js.Any])
    
    inline def pointerOrientationFunction1(
      value: /* repeated */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
    ): this.type = set("pointerOrientation", js.Any.fromFunction1(value))
    
    inline def pointerWidth(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("pointerWidth", value.asInstanceOf[js.Any])
    
    inline def renderInPortal(value: Boolean): this.type = set("renderInPortal", value.asInstanceOf[js.Any])
    
    inline def style(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
    ): this.type = set("style", js.Array(value*))
    
    inline def text(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | (js.Array[Double | String])
    ): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textVarargs(value: (Double | String)*): this.type = set("text", js.Array(value*))
    
    inline def theme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryThemeDefinition */ Any
    ): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

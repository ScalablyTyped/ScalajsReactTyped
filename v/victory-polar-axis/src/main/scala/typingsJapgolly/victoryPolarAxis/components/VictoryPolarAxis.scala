package typingsJapgolly.victoryPolarAxis.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryPolarAxis.esMod.VictoryPolarAxisProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryPolarAxis {
  
  @JSImport("victory-polar-axis/es", "VictoryPolarAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryPolarAxis.esMod.VictoryPolarAxis] {
    
    inline def axisAngle(value: Double): this.type = set("axisAngle", value.asInstanceOf[js.Any])
    
    inline def axisValue(value: Double | String | js.Date): this.type = set("axisValue", value.asInstanceOf[js.Any])
    
    inline def circularAxisComponent(value: VdomElement): this.type = set("circularAxisComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def circularGridComponent(value: VdomElement): this.type = set("circularGridComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def domain(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
    ): this.type = set("domain", value.asInstanceOf[js.Any])
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryPolarAxisTTargetType, string | number> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryPolarAxisTTargetType, string | number> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def gridComponent(value: VdomElement): this.type = set("gridComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def innerRadius(value: Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def labelOrientation(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelOrientationType */ Any
    ): this.type = set("labelOrientation", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelOrientationType */ Any
    ): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryPolarAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryPolarAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

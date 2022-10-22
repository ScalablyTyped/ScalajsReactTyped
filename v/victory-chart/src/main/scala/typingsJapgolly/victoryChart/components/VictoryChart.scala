package typingsJapgolly.victoryChart.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryChart.anon.Pickanyparentbackgroundan
import typingsJapgolly.victoryChart.esVictoryChartMod.AxesType
import typingsJapgolly.victoryChart.esVictoryChartMod.VictoryChartProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryChart {
  
  @JSImport("victory-chart/es", "VictoryChart")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundComponent(value: VdomElement): this.type = set("backgroundComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def categories(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
    ): this.type = set("categories", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultAxes(value: AxesType): this.type = set("defaultAxes", value.asInstanceOf[js.Any])
    
    inline def defaultPolarAxes(value: AxesType): this.type = set("defaultPolarAxes", value.asInstanceOf[js.Any])
    
    inline def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    
    inline def domain(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
    ): this.type = set("domain", value.asInstanceOf[js.Any])
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, Array<string> | Array<number> | string | number> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, Array<string> | Array<number> | string | number> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def innerRadius(value: Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def prependDefaultAxes(value: Boolean): this.type = set("prependDefaultAxes", value.asInstanceOf[js.Any])
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    inline def style(value: Pickanyparentbackgroundan): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

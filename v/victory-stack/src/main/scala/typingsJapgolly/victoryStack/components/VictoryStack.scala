package typingsJapgolly.victoryStack.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryStack.esVictoryStackMod.VictoryStackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryStack {
  
  @JSImport("victory-stack/es", "VictoryStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bins(value: Double | (js.Array[js.Date | Double])): this.type = set("bins", value.asInstanceOf[js.Any])
    
    inline def binsVarargs(value: (js.Date | Double)*): this.type = set("bins", js.Array(value*))
    
    inline def categories(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
    ): this.type = set("categories", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def colorScale(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
    ): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    inline def domain(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
    ): this.type = set("domain", value.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryStackTTargetType, StringOrNumberOrCallback> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryStackTTargetType, StringOrNumberOrCallback> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def fillInMissingData(value: Boolean): this.type = set("fillInMissingData", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def xOffset(value: Double): this.type = set("xOffset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryStack.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

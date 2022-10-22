package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.accordionTypesMod.AccordionOverrides
import typingsJapgolly.baseui.accordionTypesMod.AccordionProps
import typingsJapgolly.baseui.accordionTypesMod.AccordionState
import typingsJapgolly.baseui.accordionTypesMod.StateChangeType
import typingsJapgolly.baseui.anon.Expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  inline def apply(
    stateReducer: (/* stateChangeType */ StateChangeType, /* nextState */ AccordionState, /* currentState */ AccordionState) => AccordionState
  ): Builder = {
    val __props = js.Dynamic.literal(stateReducer = js.Any.fromFunction3(stateReducer))
    new Builder(js.Array(this.component, __props.asInstanceOf[AccordionProps]))
  }
  
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.accordionMod.Accordion] {
    
    inline def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def initialState(value: AccordionState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ Expanded => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: AccordionOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

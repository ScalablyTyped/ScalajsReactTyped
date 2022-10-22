package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.accordionTypesMod.AccordionOverrides
import typingsJapgolly.baseui.accordionTypesMod.PanelOverrides
import typingsJapgolly.baseui.accordionTypesMod.StatelessAccordionProps
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatelessAccordion {
  
  inline def apply(expanded: js.Array[Key]): Builder = {
    val __props = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatelessAccordionProps]))
  }
  
  @JSImport("baseui/accordion", "StatelessAccordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ typingsJapgolly.baseui.anon.Key => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: AccordionOverrides & PanelOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    inline def renderPanelContent(value: Boolean): this.type = set("renderPanelContent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatelessAccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.accordionMod.AccordionProps
import typingsJapgolly.cathoQuantum.accordionMod.default
import typingsJapgolly.cathoQuantum.anon.BaseFontSize
import typingsJapgolly.cathoQuantum.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  inline def apply(items: js.Array[Content]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AccordionProps]))
  }
  
  @JSImport("@catho/quantum/Accordion", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def keepOnlyOneOpen(value: Boolean): this.type = set("keepOnlyOneOpen", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSize): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

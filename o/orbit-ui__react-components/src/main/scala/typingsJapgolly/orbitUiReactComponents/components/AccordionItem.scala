package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distAccordionSrcAccordionItemMod.AccordionItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccordionItem {
  
  inline def apply(item: typingsJapgolly.orbitUiReactComponents.anon.Header): Default[js.Object] = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[AccordionItemProps]))
  }
  
  @JSImport("@orbit-ui/react-components/dist/accordion/src/AccordionItem", "AccordionItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AccordionItemProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionSectionItemMod.AccordionSectionItemCommonProps
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionSectionItemMod.AccordionSectionItemProps
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionSectionItemMod.default
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccordionSectionItem {
  
  inline def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AccordionSectionItemProps & AccordionSectionItemCommonProps]))
  }
  
  @JSImport("wix-style-react/dist/types/Accordion/AccordionSectionItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def size(value: tiny | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AccordionSectionItemProps & AccordionSectionItemCommonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

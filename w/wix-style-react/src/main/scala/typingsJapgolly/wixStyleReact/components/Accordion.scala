package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemCommonProps
import typingsJapgolly.wixStyleReact.distTypesAccordionMod.AccordionProps
import typingsJapgolly.wixStyleReact.distTypesAccordionMod.AccordionRenderOptionFn
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  @JSImport("wix-style-react", "Accordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Accordion] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def hideShadow(value: Boolean): this.type = set("hideShadow", value.asInstanceOf[js.Any])
    
    inline def horizontalPadding(value: none_ | tiny | small | medium | large): this.type = set("horizontalPadding", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[AccordionItemCommonProps | AccordionRenderOptionFn]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: (AccordionItemCommonProps | AccordionRenderOptionFn)*): this.type = set("items", js.Array(value*))
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnter(value: Unit): this.type = set("onAnimationEnter", value.asInstanceOf[js.Any])
    
    inline def onAnimationExit(value: Unit): this.type = set("onAnimationExit", value.asInstanceOf[js.Any])
    
    inline def size(value: tiny | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: light | standard | neutral): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def transitionSpeed(value: slow | medium | fast): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Accordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

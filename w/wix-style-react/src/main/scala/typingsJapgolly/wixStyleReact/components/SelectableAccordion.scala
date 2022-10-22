package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSelectableAccordionMod.SelectableAccordionItemProps
import typingsJapgolly.wixStyleReact.distTypesSelectableAccordionMod.SelectableAccordionProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkbox
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.radio
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectableAccordion {
  
  @JSImport("wix-style-react", "SelectableAccordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SelectableAccordion] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[SelectableAccordionItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: SelectableAccordionItemProps*): this.type = set("items", js.Array(value*))
    
    inline def onSelectionChanged(value: /* selectedIds */ js.Array[Double] => Callback): this.type = set("onSelectionChanged", js.Any.fromFunction1((t0: /* selectedIds */ js.Array[Double]) => value(t0).runNow()))
    
    inline def `type`(value: radio | checkbox | toggle): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def verticalPadding(value: medium | small | tiny): this.type = set("verticalPadding", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SelectableAccordion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectableAccordionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemButtonType
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemCommonProps
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemProps
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionItemMod.AccordionItemShowLabel
import typingsJapgolly.wixStyleReact.distTypesAccordionAccordionItemMod.default
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

object AccordionItem {
  
  @JSImport("wix-style-react/dist/types/Accordion/AccordionItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def buttonType(value: AccordionItemButtonType): this.type = set("buttonType", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseLabel(value: VdomNode): this.type = set("collapseLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def collapseLabelNull: this.type = set("collapseLabel", null)
    
    inline def collapseLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("collapseLabel", js.Array(value*))
    
    inline def collapseLabelVdomElement(value: VdomElement): this.type = set("collapseLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def expandLabel(value: VdomNode): this.type = set("expandLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def expandLabelNull: this.type = set("expandLabel", null)
    
    inline def expandLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("expandLabel", js.Array(value*))
    
    inline def expandLabelVdomElement(value: VdomElement): this.type = set("expandLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def hideShadow(value: Boolean): this.type = set("hideShadow", value.asInstanceOf[js.Any])
    
    inline def horizontalPadding(value: none_ | tiny | small | medium | large): this.type = set("horizontalPadding", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def initiallyOpen(value: Boolean): this.type = set("initiallyOpen", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnter(value: Unit): this.type = set("onAnimationEnter", value.asInstanceOf[js.Any])
    
    inline def onAnimationExit(value: Unit): this.type = set("onAnimationExit", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onToggle(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onToggle", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def showLabel(value: AccordionItemShowLabel): this.type = set("showLabel", value.asInstanceOf[js.Any])
    
    inline def size(value: tiny | small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: light | standard | neutral): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def transitionSpeed(value: slow | medium | fast): this.type = set("transitionSpeed", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AccordionItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AccordionItemProps & AccordionItemCommonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

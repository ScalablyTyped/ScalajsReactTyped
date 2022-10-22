package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
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

object distTypesAccordionAccordionItemMod {
  
  @JSImport("wix-style-react/dist/types/Accordion/AccordionItem", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AccordionItemProps & AccordionItemCommonProps, js.Object, Any]
  
  type AccordionItem = japgolly.scalajs.react.facade.React.Component[AccordionItemProps & AccordionItemCommonProps & js.Object, js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.textButton
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.button
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.node
  */
  trait AccordionItemButtonType extends StObject
  object AccordionItemButtonType {
    
    inline def button: typingsJapgolly.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.button]
    
    inline def node: typingsJapgolly.wixStyleReact.wixStyleReactStrings.node = "node".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.node]
    
    inline def textButton: typingsJapgolly.wixStyleReact.wixStyleReactStrings.textButton = "textButton".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.textButton]
  }
  
  trait AccordionItemCommonProps extends StObject {
    
    var buttonType: js.UndefOr[AccordionItemButtonType] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapseLabel: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandLabel: js.UndefOr[Node] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var initiallyOpen: js.UndefOr[Boolean] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onToggle: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var showLabel: js.UndefOr[AccordionItemShowLabel] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object AccordionItemCommonProps {
    
    inline def apply(): AccordionItemCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionItemCommonProps]
    }
    
    extension [Self <: AccordionItemCommonProps](x: Self) {
      
      inline def setButtonType(value: AccordionItemButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapseLabel(value: VdomNode): Self = StObject.set(x, "collapseLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCollapseLabelNull: Self = StObject.set(x, "collapseLabel", null)
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapseLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "collapseLabel", js.Array(value*))
      
      inline def setCollapseLabelVdomElement(value: VdomElement): Self = StObject.set(x, "collapseLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandLabel(value: VdomNode): Self = StObject.set(x, "expandLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpandLabelNull: Self = StObject.set(x, "expandLabel", null)
      
      inline def setExpandLabelUndefined: Self = StObject.set(x, "expandLabel", js.undefined)
      
      inline def setExpandLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandLabel", js.Array(value*))
      
      inline def setExpandLabelVdomElement(value: VdomElement): Self = StObject.set(x, "expandLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitiallyOpen(value: Boolean): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenUndefined: Self = StObject.set(x, "initiallyOpen", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnToggle(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setShowLabel(value: AccordionItemShowLabel): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait AccordionItemProps extends StObject {
    
    var hideShadow: js.UndefOr[Boolean] = js.undefined
    
    var horizontalPadding: js.UndefOr[none_ | tiny | small | medium | large] = js.undefined
    
    var onAnimationEnter: js.UndefOr[Unit] = js.undefined
    
    var onAnimationExit: js.UndefOr[Unit] = js.undefined
    
    var size: js.UndefOr[tiny | small | medium | large] = js.undefined
    
    var skin: js.UndefOr[light | standard | neutral] = js.undefined
    
    var transitionSpeed: js.UndefOr[slow | medium | fast] = js.undefined
  }
  object AccordionItemProps {
    
    inline def apply(): AccordionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionItemProps]
    }
    
    extension [Self <: AccordionItemProps](x: Self) {
      
      inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      inline def setHorizontalPadding(value: none_ | tiny | small | medium | large): Self = StObject.set(x, "horizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPaddingUndefined: Self = StObject.set(x, "horizontalPadding", js.undefined)
      
      inline def setOnAnimationEnter(value: Unit): Self = StObject.set(x, "onAnimationEnter", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEnterUndefined: Self = StObject.set(x, "onAnimationEnter", js.undefined)
      
      inline def setOnAnimationExit(value: Unit): Self = StObject.set(x, "onAnimationExit", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationExitUndefined: Self = StObject.set(x, "onAnimationExit", js.undefined)
      
      inline def setSize(value: tiny | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: light | standard | neutral): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTransitionSpeed(value: slow | medium | fast): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.always
  */
  trait AccordionItemShowLabel extends StObject
  object AccordionItemShowLabel {
    
    inline def always: typingsJapgolly.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.always]
    
    inline def hover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover]
  }
}

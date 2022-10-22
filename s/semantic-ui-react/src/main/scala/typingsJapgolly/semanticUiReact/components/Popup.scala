package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupContentMod.PopupContentProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupHeaderMod.PopupHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupMod.PopperOffsetsFunction
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupMod.PopperOffsetsFunctionParams
import typingsJapgolly.semanticUiReact.distCommonjsModulesPopupPopupMod.PopupProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom center`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`bottom right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`left center`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`right center`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top center`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.click
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.focus
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.hover
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popup {
  
  object Content {
    
    @JSImport("semantic-ui-react", "Popup.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_PopupContentProps_1200653545 = new SharedBuilder_PopupContentProps_1200653545(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PopupContentProps): SharedBuilder_PopupContentProps_1200653545 = new SharedBuilder_PopupContentProps_1200653545(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Popup.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_PopupHeaderProps_1580835029 = new SharedBuilder_PopupHeaderProps_1580835029(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PopupHeaderProps): SharedBuilder_PopupHeaderProps_1580835029 = new SharedBuilder_PopupHeaderProps_1580835029(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Popup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeOnDocumentClick(value: Boolean): this.type = set("closeOnDocumentClick", value.asInstanceOf[js.Any])
    
    inline def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    
    inline def closeOnPortalMouseLeave(value: Boolean): this.type = set("closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerBlur(value: Boolean): this.type = set("closeOnTriggerBlur", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerClick(value: Boolean): this.type = set("closeOnTriggerClick", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerMouseLeave(value: Boolean): this.type = set("closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandItem[PopupContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentFunction3(
      value: (/* component */ ElementType, PopupContentProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("content", js.Any.fromFunction3(value))
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def context(value: Document | Window | HTMLElement | RefHandle[HTMLElement]): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    
    inline def eventsEnabled(value: Boolean): this.type = set("eventsEnabled", value.asInstanceOf[js.Any])
    
    inline def flowing(value: Boolean): this.type = set("flowing", value.asInstanceOf[js.Any])
    
    inline def header(value: SemanticShorthandItem[PopupHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction3(
      value: (/* component */ ElementType, PopupHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def hideOnScroll(value: Boolean): this.type = set("hideOnScroll", value.asInstanceOf[js.Any])
    
    inline def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def mountNode(value: Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def offset(value: (js.Tuple2[Double, js.UndefOr[Double]]) | PopperOffsetsFunction): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def offsetFunction1(
      value: /* params */ PopperOffsetsFunctionParams => js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]
    ): this.type = set("offset", js.Any.fromFunction1(value))
    
    inline def on(value: hover | click | focus | (js.Array[hover | click | focus])): this.type = set("on", value.asInstanceOf[js.Any])
    
    inline def onClose(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PopupProps) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ PopupProps) => (value(t0, t1)).runNow()))
    
    inline def onMount(value: (/* nothing */ Null, /* data */ PopupProps) => Callback): this.type = set("onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PopupProps) => (value(t0, t1)).runNow()))
    
    inline def onOpen(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PopupProps) => Callback): this.type = set("onOpen", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ PopupProps) => (value(t0, t1)).runNow()))
    
    inline def onUnmount(value: (/* nothing */ Null, /* data */ PopupProps) => Callback): this.type = set("onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PopupProps) => (value(t0, t1)).runNow()))
    
    inline def onVarargs(value: (hover | click | focus)*): this.type = set("on", js.Array(value*))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerClick(value: Boolean): this.type = set("openOnTriggerClick", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerFocus(value: Boolean): this.type = set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerMouseEnter(value: Boolean): this.type = set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    
    inline def pinned(value: Boolean): this.type = set("pinned", value.asInstanceOf[js.Any])
    
    inline def popper(value: SemanticShorthandItem[HTMLAttributes[HTMLDivElement]]): this.type = set("popper", value.asInstanceOf[js.Any])
    
    inline def popperDependencies(value: js.Array[Any]): this.type = set("popperDependencies", value.asInstanceOf[js.Any])
    
    inline def popperDependenciesVarargs(value: Any*): this.type = set("popperDependencies", js.Array(value*))
    
    inline def popperFunction3(
      value: (/* component */ ElementType, HTMLAttributes[HTMLDivElement], /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("popper", js.Any.fromFunction3(value))
    
    inline def popperModifiers(value: js.Array[Any]): this.type = set("popperModifiers", value.asInstanceOf[js.Any])
    
    inline def popperModifiersVarargs(value: Any*): this.type = set("popperModifiers", js.Array(value*))
    
    inline def popperNull: this.type = set("popper", null)
    
    inline def popperVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("popper", js.Array(value*))
    
    inline def popperVdomElement(value: VdomElement): this.type = set("popper", value.rawElement.asInstanceOf[js.Any])
    
    inline def position(
      value: (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
    ): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def positionFixed(value: Boolean): this.type = set("positionFixed", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | tiny | small | large | huge): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def trigger(value: VdomNode): this.type = set("trigger", value.rawNode.asInstanceOf[js.Any])
    
    inline def triggerNull: this.type = set("trigger", null)
    
    inline def triggerRef(value: typingsJapgolly.react.mod.Ref[Any]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    
    inline def triggerRefFunction1(value: Any | Null => Callback): this.type = set("triggerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def triggerRefNull: this.type = set("triggerRef", null)
    
    inline def triggerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("trigger", js.Array(value*))
    
    inline def triggerVdomElement(value: VdomElement): this.type = set("trigger", value.rawElement.asInstanceOf[js.Any])
    
    inline def wide(value: Boolean | very): this.type = set("wide", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalDescriptionMod.ModalDescriptionProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalDimmerMod.ModalDimmerProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesModalModalMod.ModalProps
import typingsJapgolly.semanticUiReact.semanticUiReactBooleans.`true`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.blurring
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.fullscreen
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.inverted
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  object Actions {
    
    @JSImport("semantic-ui-react", "Modal.Actions")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Actions.type): SharedBuilder_ModalActionsProps_859704109[typingsJapgolly.semanticUiReact.mod.Modal.Actions] = new SharedBuilder_ModalActionsProps_859704109[typingsJapgolly.semanticUiReact.mod.Modal.Actions](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalActionsProps): SharedBuilder_ModalActionsProps_859704109[typingsJapgolly.semanticUiReact.mod.Modal.Actions] = new SharedBuilder_ModalActionsProps_859704109[typingsJapgolly.semanticUiReact.mod.Modal.Actions](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("semantic-ui-react", "Modal.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_ModalContentProps758371014 = new SharedBuilder_ModalContentProps758371014(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalContentProps): SharedBuilder_ModalContentProps758371014 = new SharedBuilder_ModalContentProps758371014(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Description {
    
    @JSImport("semantic-ui-react", "Modal.Description")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Description.type): SharedBuilder_ModalDescriptionProps994904665 = new SharedBuilder_ModalDescriptionProps994904665(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalDescriptionProps): SharedBuilder_ModalDescriptionProps994904665 = new SharedBuilder_ModalDescriptionProps994904665(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Dimmer {
    
    @JSImport("semantic-ui-react", "Modal.Dimmer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Dimmer.type): SharedBuilder_ModalDimmerProps_535174728 = new SharedBuilder_ModalDimmerProps_535174728(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalDimmerProps): SharedBuilder_ModalDimmerProps_535174728 = new SharedBuilder_ModalDimmerProps_535174728(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("semantic-ui-react", "Modal.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_ModalHeaderProps1269534675 = new SharedBuilder_ModalHeaderProps1269534675(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ModalHeaderProps): SharedBuilder_ModalHeaderProps1269534675 = new SharedBuilder_ModalHeaderProps1269534675(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Modal] {
    
    inline def actions(value: SemanticShorthandItem[ModalActionsProps]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsFunction3(
      value: (/* component */ ElementType, ModalActionsProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("actions", js.Any.fromFunction3(value))
    
    inline def actionsNull: this.type = set("actions", null)
    
    inline def actionsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("actions", js.Array(value*))
    
    inline def actionsVdomElement(value: VdomElement): this.type = set("actions", value.rawElement.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def basic(value: Boolean): this.type = set("basic", value.asInstanceOf[js.Any])
    
    inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeIcon(value: Any): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    inline def closeOnDimmerClick(value: Boolean): this.type = set("closeOnDimmerClick", value.asInstanceOf[js.Any])
    
    inline def closeOnDocumentClick(value: Boolean): this.type = set("closeOnDocumentClick", value.asInstanceOf[js.Any])
    
    inline def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    
    inline def closeOnPortalMouseLeave(value: Boolean): this.type = set("closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerBlur(value: Boolean): this.type = set("closeOnTriggerBlur", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerClick(value: Boolean): this.type = set("closeOnTriggerClick", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerMouseLeave(value: Boolean): this.type = set("closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandItem[ModalContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentFunction3(
      value: (/* component */ ElementType, ModalContentProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("content", js.Any.fromFunction3(value))
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def dimmer(value: `true` | blurring | inverted | SemanticShorthandItem[ModalDimmerProps]): this.type = set("dimmer", value.asInstanceOf[js.Any])
    
    inline def dimmerFunction3(
      value: (/* component */ ElementType, ModalDimmerProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("dimmer", js.Any.fromFunction3(value))
    
    inline def dimmerNull: this.type = set("dimmer", null)
    
    inline def dimmerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dimmer", js.Array(value*))
    
    inline def dimmerVdomElement(value: VdomElement): this.type = set("dimmer", value.rawElement.asInstanceOf[js.Any])
    
    inline def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    
    inline def header(value: SemanticShorthandItem[ModalHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    inline def headerFunction3(
      value: (/* component */ ElementType, ModalHeaderProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    
    inline def headerNull: this.type = set("header", null)
    
    inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
    
    inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
    
    inline def mountNode(value: Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def onActionClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback): this.type = set("onActionClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
    
    inline def onClose(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
    
    inline def onMount(value: (/* nothing */ Null, /* data */ ModalProps) => Callback): this.type = set("onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
    
    inline def onOpen(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ ModalProps) => Callback): this.type = set("onOpen", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
    
    inline def onUnmount(value: (/* nothing */ Null, /* data */ ModalProps) => Callback): this.type = set("onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ ModalProps) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerClick(value: Boolean): this.type = set("openOnTriggerClick", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerFocus(value: Boolean): this.type = set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerMouseEnter(value: Boolean): this.type = set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | tiny | small | large | fullscreen): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def trigger(value: VdomNode): this.type = set("trigger", value.rawNode.asInstanceOf[js.Any])
    
    inline def triggerNull: this.type = set("trigger", null)
    
    inline def triggerRef(value: typingsJapgolly.react.mod.Ref[Any]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    
    inline def triggerRefFunction1(value: Any | Null => Callback): this.type = set("triggerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def triggerRefNull: this.type = set("triggerRef", null)
    
    inline def triggerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("trigger", js.Array(value*))
    
    inline def triggerVdomElement(value: VdomElement): this.type = set("trigger", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

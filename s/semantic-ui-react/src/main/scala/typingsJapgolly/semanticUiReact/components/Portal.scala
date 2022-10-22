package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalInnerMod.PortalInnerProps
import typingsJapgolly.semanticUiReact.distCommonjsAddonsPortalPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  object Inner {
    
    @JSImport("semantic-ui-react", "Portal.Inner")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Inner.type): SharedBuilder_PortalInnerProps2040909682[typingsJapgolly.semanticUiReact.mod.Portal.Inner] = new SharedBuilder_PortalInnerProps2040909682[typingsJapgolly.semanticUiReact.mod.Portal.Inner](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PortalInnerProps): SharedBuilder_PortalInnerProps2040909682[typingsJapgolly.semanticUiReact.mod.Portal.Inner] = new SharedBuilder_PortalInnerProps2040909682[typingsJapgolly.semanticUiReact.mod.Portal.Inner](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Portal] {
    
    inline def closeOnDocumentClick(value: Boolean): this.type = set("closeOnDocumentClick", value.asInstanceOf[js.Any])
    
    inline def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    
    inline def closeOnPortalMouseLeave(value: Boolean): this.type = set("closeOnPortalMouseLeave", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerBlur(value: Boolean): this.type = set("closeOnTriggerBlur", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerClick(value: Boolean): this.type = set("closeOnTriggerClick", value.asInstanceOf[js.Any])
    
    inline def closeOnTriggerMouseLeave(value: Boolean): this.type = set("closeOnTriggerMouseLeave", value.asInstanceOf[js.Any])
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def eventPool(value: String): this.type = set("eventPool", value.asInstanceOf[js.Any])
    
    inline def mountNode(value: Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def onClose(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
    
    inline def onMount(value: (/* nothing */ Null, /* data */ PortalProps) => Callback): this.type = set("onMount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
    
    inline def onOpen(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ PortalProps) => Callback): this.type = set("onOpen", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
    
    inline def onUnmount(value: (/* nothing */ Null, /* data */ PortalProps) => Callback): this.type = set("onUnmount", js.Any.fromFunction2((t0: /* nothing */ Null, t1: /* data */ PortalProps) => (value(t0, t1)).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerClick(value: Boolean): this.type = set("openOnTriggerClick", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerFocus(value: Boolean): this.type = set("openOnTriggerFocus", value.asInstanceOf[js.Any])
    
    inline def openOnTriggerMouseEnter(value: Boolean): this.type = set("openOnTriggerMouseEnter", value.asInstanceOf[js.Any])
    
    inline def trigger(value: VdomNode): this.type = set("trigger", value.rawNode.asInstanceOf[js.Any])
    
    inline def triggerNull: this.type = set("trigger", null)
    
    inline def triggerRef(value: typingsJapgolly.react.mod.Ref[Any]): this.type = set("triggerRef", value.asInstanceOf[js.Any])
    
    inline def triggerRefFunction1(value: Any | Null => Callback): this.type = set("triggerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def triggerRefNull: this.type = set("triggerRef", null)
    
    inline def triggerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("trigger", js.Array(value*))
    
    inline def triggerVdomElement(value: VdomElement): this.type = set("trigger", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.`15`
import typingsJapgolly.baseui.modalTypesMod.ModalOverrides
import typingsJapgolly.baseui.modalTypesMod.ModalProps
import typingsJapgolly.baseui.modalTypesMod.RoleProp
import typingsJapgolly.baseui.modalTypesMod.SizeProp
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("baseui/modal", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.modalMod.Modal] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | js.Function0[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenCallbackTo(value: CallbackTo[Node]): this.type = set("children", value.toJsFn)
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
    
    inline def focusLock(value: Boolean): this.type = set("focusLock", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* a */ `15` => Any): this.type = set("onClose", js.Any.fromFunction1(value))
    
    inline def overrides(value: ModalOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def returnFocus(
      value: Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
    ): this.type = set("returnFocus", value.asInstanceOf[js.Any])
    
    inline def returnFocusFunction1(value: /* returnTo */ org.scalajs.dom.Element => Boolean | FocusOptions): this.type = set("returnFocus", js.Any.fromFunction1(value))
    
    inline def role(value: RoleProp): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def size(value: SizeProp): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

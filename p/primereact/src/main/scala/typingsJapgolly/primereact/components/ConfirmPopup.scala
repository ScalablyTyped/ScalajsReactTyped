package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.confirmpopupConfirmpopupMod.ConfirmPopupAppendToType
import typingsJapgolly.primereact.confirmpopupConfirmpopupMod.ConfirmPopupOptions
import typingsJapgolly.primereact.confirmpopupConfirmpopupMod.ConfirmPopupProps
import typingsJapgolly.primereact.confirmpopupConfirmpopupMod.ConfirmPopupTemplateType
import typingsJapgolly.primereact.mod.ConfirmPopup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfirmPopup {
  
  @JSImport("primereact", "ConfirmPopup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[ConfirmPopup_] {
    
    inline def accept(value: Callback): this.type = set("accept", value.toJsFn)
    
    inline def acceptClassName(value: String): this.type = set("acceptClassName", value.asInstanceOf[js.Any])
    
    inline def acceptIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
    ): this.type = set("acceptIcon", value.asInstanceOf[js.Any])
    
    inline def acceptLabel(value: String): this.type = set("acceptLabel", value.asInstanceOf[js.Any])
    
    inline def appendTo(value: ConfirmPopupAppendToType): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToNull: this.type = set("appendTo", null)
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dismissable(value: Boolean): this.type = set("dismissable", value.asInstanceOf[js.Any])
    
    inline def footer(value: ConfirmPopupTemplateType): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerFunction1(value: /* options */ ConfirmPopupOptions => Node): this.type = set("footer", js.Any.fromFunction1(value))
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
    ): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def message(value: ConfirmPopupTemplateType): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def messageFunction1(value: /* options */ ConfirmPopupOptions => Node): this.type = set("message", js.Any.fromFunction1(value))
    
    inline def messageNull: this.type = set("message", null)
    
    inline def messageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("message", js.Array(value*))
    
    inline def messageVdomElement(value: VdomElement): this.type = set("message", value.rawElement.asInstanceOf[js.Any])
    
    inline def onHide(value: /* result */ String => Callback): this.type = set("onHide", js.Any.fromFunction1((t0: /* result */ String) => value(t0).runNow()))
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def reject(value: Callback): this.type = set("reject", value.toJsFn)
    
    inline def rejectClassName(value: String): this.type = set("rejectClassName", value.asInstanceOf[js.Any])
    
    inline def rejectIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ConfirmPopupProps> */ Any
    ): this.type = set("rejectIcon", value.asInstanceOf[js.Any])
    
    inline def rejectLabel(value: String): this.type = set("rejectLabel", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tagKey(value: String): this.type = set("tagKey", value.asInstanceOf[js.Any])
    
    inline def target(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def transitionOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
    ): this.type = set("transitionOptions", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ConfirmPopup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ConfirmPopupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

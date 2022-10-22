package typingsJapgolly.reactModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.reactModal.mod.Aria
import typingsJapgolly.reactModal.mod.Classes
import typingsJapgolly.reactModal.mod.OnAfterOpenCallbackOptions
import typingsJapgolly.reactModal.mod.Props
import typingsJapgolly.reactModal.mod.Styles
import typingsJapgolly.reactModal.mod.^
import typingsJapgolly.reactModal.reactModalStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactModal {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-modal", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def appElement(value: HTMLElement | js.Array[HTMLElement] | HTMLCollection[Any] | NodeList[Node]): this.type = set("appElement", value.asInstanceOf[js.Any])
    
    inline def appElementVarargs(value: HTMLElement*): this.type = set("appElement", js.Array(value*))
    
    inline def aria(value: Aria): this.type = set("aria", value.asInstanceOf[js.Any])
    
    inline def ariaHideApp(value: Boolean): this.type = set("ariaHideApp", value.asInstanceOf[js.Any])
    
    inline def bodyOpenClassName(value: String): this.type = set("bodyOpenClassName", value.asInstanceOf[js.Any])
    
    inline def bodyOpenClassNameNull: this.type = set("bodyOpenClassName", null)
    
    inline def className(value: String | Classes): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeTimeoutMS(value: Double): this.type = set("closeTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def contentElement(
      value: (/* props */ ComponentPropsWithRef[div], /* children */ japgolly.scalajs.react.facade.React.Node) => Element
    ): this.type = set("contentElement", js.Any.fromFunction2(value))
    
    inline def contentLabel(value: String): this.type = set("contentLabel", value.asInstanceOf[js.Any])
    
    inline def contentRef(value: /* instance */ HTMLDivElement => Callback): this.type = set("contentRef", js.Any.fromFunction1((t0: /* instance */ HTMLDivElement) => value(t0).runNow()))
    
    inline def data(value: Any): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def htmlOpenClassName(value: String): this.type = set("htmlOpenClassName", value.asInstanceOf[js.Any])
    
    inline def htmlOpenClassNameNull: this.type = set("htmlOpenClassName", null)
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onAfterClose(value: Callback): this.type = set("onAfterClose", value.toJsFn)
    
    inline def onAfterOpen(value: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions] => Callback): this.type = set("onAfterOpen", js.Any.fromFunction1((t0: /* obj */ js.UndefOr[OnAfterOpenCallbackOptions]) => value(t0).runNow()))
    
    inline def onRequestClose(
      value: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element] => Callback
    ): this.type = set("onRequestClose", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element] | ReactKeyboardEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def overlayClassName(value: String | Classes): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
    
    inline def overlayElement(value: (/* props */ ComponentPropsWithRef[div], /* contentEl */ Element) => Element): this.type = set("overlayElement", js.Any.fromFunction2(value))
    
    inline def overlayRef(value: /* instance */ HTMLDivElement => Callback): this.type = set("overlayRef", js.Any.fromFunction1((t0: /* instance */ HTMLDivElement) => value(t0).runNow()))
    
    inline def parentSelector(value: CallbackTo[HTMLElement]): this.type = set("parentSelector", value.toJsFn)
    
    inline def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    
    inline def preventScroll(value: Boolean): this.type = set("preventScroll", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def roleNull: this.type = set("role", null)
    
    inline def shouldCloseOnEsc(value: Boolean): this.type = set("shouldCloseOnEsc", value.asInstanceOf[js.Any])
    
    inline def shouldCloseOnOverlayClick(value: Boolean): this.type = set("shouldCloseOnOverlayClick", value.asInstanceOf[js.Any])
    
    inline def shouldFocusAfterRender(value: Boolean): this.type = set("shouldFocusAfterRender", value.asInstanceOf[js.Any])
    
    inline def shouldReturnFocusAfterClose(value: Boolean): this.type = set("shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
    
    inline def style(value: Styles): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def testId(value: String): this.type = set("testId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

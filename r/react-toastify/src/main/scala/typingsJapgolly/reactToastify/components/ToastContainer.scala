package typingsJapgolly.reactToastify.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactToastify.anon.DefaultClassName
import typingsJapgolly.reactToastify.distComponentsCloseButtonMod.CloseButtonProps
import typingsJapgolly.reactToastify.distComponentsIconsMod.IconProps
import typingsJapgolly.reactToastify.distTypesMod.DraggableDirection
import typingsJapgolly.reactToastify.distTypesMod.Id
import typingsJapgolly.reactToastify.distTypesMod.Theme
import typingsJapgolly.reactToastify.distTypesMod.ToastClassName
import typingsJapgolly.reactToastify.distTypesMod.ToastContainerProps
import typingsJapgolly.reactToastify.distTypesMod.ToastPosition
import typingsJapgolly.reactToastify.distTypesMod.ToastTransition
import typingsJapgolly.reactToastify.reactToastifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToastContainer {
  
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def autoClose(value: Double | `false`): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    inline def bodyClassName(value: ToastClassName): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    
    inline def bodyClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("bodyClassName", js.Any.fromFunction1(value))
    
    inline def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def className(value: ToastClassName): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("className", js.Any.fromFunction1(value))
    
    inline def closeButton(value: Boolean | (js.Function1[/* props */ CloseButtonProps, Node]) | Element): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    inline def closeButtonFunction1(value: /* props */ CloseButtonProps => Node): this.type = set("closeButton", js.Any.fromFunction1(value))
    
    inline def closeButtonVdomElement(value: VdomElement): this.type = set("closeButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    
    inline def containerId(value: Id): this.type = set("containerId", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def draggableDirection(value: DraggableDirection): this.type = set("draggableDirection", value.asInstanceOf[js.Any])
    
    inline def draggablePercent(value: Double): this.type = set("draggablePercent", value.asInstanceOf[js.Any])
    
    inline def enableMultiContainer(value: Boolean): this.type = set("enableMultiContainer", value.asInstanceOf[js.Any])
    
    inline def hideProgressBar(value: Boolean): this.type = set("hideProgressBar", value.asInstanceOf[js.Any])
    
    inline def icon(value: Boolean | (js.Function1[/* props */ IconProps, Node]) | Element | String | Double | Node): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction1(value: /* props */ IconProps => Node): this.type = set("icon", js.Any.fromFunction1(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    inline def newestOnTop(value: Boolean): this.type = set("newestOnTop", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pauseOnFocusLoss(value: Boolean): this.type = set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    inline def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def position(value: ToastPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def progressClassName(value: ToastClassName): this.type = set("progressClassName", value.asInstanceOf[js.Any])
    
    inline def progressClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("progressClassName", js.Any.fromFunction1(value))
    
    inline def progressStyle(value: CSSProperties): this.type = set("progressStyle", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def toastClassName(value: ToastClassName): this.type = set("toastClassName", value.asInstanceOf[js.Any])
    
    inline def toastClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("toastClassName", js.Any.fromFunction1(value))
    
    inline def toastStyle(value: CSSProperties): this.type = set("toastStyle", value.asInstanceOf[js.Any])
    
    inline def transition(value: ToastTransition): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ToastContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastContainerProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

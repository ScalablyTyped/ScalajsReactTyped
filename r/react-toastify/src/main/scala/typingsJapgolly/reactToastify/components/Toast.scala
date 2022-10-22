package typingsJapgolly.reactToastify.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactToastify.anon.DefaultClassName
import typingsJapgolly.reactToastify.distComponentsCloseButtonMod.CloseButtonProps
import typingsJapgolly.reactToastify.distComponentsIconsMod.IconProps
import typingsJapgolly.reactToastify.distTypesMod.DraggableDirection
import typingsJapgolly.reactToastify.distTypesMod.Id
import typingsJapgolly.reactToastify.distTypesMod.Theme
import typingsJapgolly.reactToastify.distTypesMod.ToastClassName
import typingsJapgolly.reactToastify.distTypesMod.ToastContent
import typingsJapgolly.reactToastify.distTypesMod.ToastContentProps
import typingsJapgolly.reactToastify.distTypesMod.ToastPosition
import typingsJapgolly.reactToastify.distTypesMod.ToastProps
import typingsJapgolly.reactToastify.distTypesMod.ToastTransition
import typingsJapgolly.reactToastify.distTypesMod.TypeOptions
import typingsJapgolly.reactToastify.reactToastifyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  inline def apply(
    closeToast: Callback,
    deleteToast: Callback,
    draggablePercent: Double,
    isIn: Boolean,
    position: ToastPosition,
    theme: Theme,
    toastId: Id,
    transition: ToastTransition,
    `type`: TypeOptions
  ): Builder = {
    val __props = js.Dynamic.literal(closeToast = closeToast.toJsFn, deleteToast = deleteToast.toJsFn, draggablePercent = draggablePercent.asInstanceOf[js.Any], isIn = isIn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToastProps]))
  }
  
  @JSImport("react-toastify/dist/components", "Toast")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoClose(value: Double | `false`): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    inline def bodyClassName(value: ToastClassName): this.type = set("bodyClassName", value.asInstanceOf[js.Any])
    
    inline def bodyClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("bodyClassName", js.Any.fromFunction1(value))
    
    inline def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    inline def children(value: ToastContent[Any]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ ToastContentProps[Any] => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: ToastClassName): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("className", js.Any.fromFunction1(value))
    
    inline def closeButton(value: Boolean | (js.Function1[/* props */ CloseButtonProps, Node]) | Element): this.type = set("closeButton", value.asInstanceOf[js.Any])
    
    inline def closeButtonFunction1(value: /* props */ CloseButtonProps => Node): this.type = set("closeButton", js.Any.fromFunction1(value))
    
    inline def closeButtonVdomElement(value: VdomElement): this.type = set("closeButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeOnClick(value: Boolean): this.type = set("closeOnClick", value.asInstanceOf[js.Any])
    
    inline def containerId(value: Id): this.type = set("containerId", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Object): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def draggableDirection(value: DraggableDirection): this.type = set("draggableDirection", value.asInstanceOf[js.Any])
    
    inline def hideProgressBar(value: Boolean): this.type = set("hideProgressBar", value.asInstanceOf[js.Any])
    
    inline def icon(value: Boolean | (js.Function1[/* props */ IconProps, Node]) | Element | String | Double | Node): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction1(value: /* props */ IconProps => Node): this.type = set("icon", js.Any.fromFunction1(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconOut(value: VdomNode): this.type = set("iconOut", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconOutNull: this.type = set("iconOut", null)
    
    inline def iconOutVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("iconOut", js.Array(value*))
    
    inline def iconOutVdomElement(value: VdomElement): this.type = set("iconOut", value.rawElement.asInstanceOf[js.Any])
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClose(value: /* props */ js.Object => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* props */ js.Object) => value(t0).runNow()))
    
    inline def onOpen(value: /* props */ js.Object => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* props */ js.Object) => value(t0).runNow()))
    
    inline def pauseOnFocusLoss(value: Boolean): this.type = set("pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    inline def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def progress(value: Double | String): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def progressClassName(value: ToastClassName): this.type = set("progressClassName", value.asInstanceOf[js.Any])
    
    inline def progressClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): this.type = set("progressClassName", js.Any.fromFunction1(value))
    
    inline def progressStyle(value: CSSProperties): this.type = set("progressStyle", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def staleId(value: Id): this.type = set("staleId", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def updateId(value: Id): this.type = set("updateId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

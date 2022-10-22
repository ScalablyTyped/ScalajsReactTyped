package typingsJapgolly.reactToastify.distTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastProps
  extends StObject
     with ToastOptions[js.Object] {
  
  var children: js.UndefOr[ToastContent[Any]] = js.undefined
  
  def closeToast(): Unit
  
  def deleteToast(): Unit
  
  @JSName("draggablePercent")
  var draggablePercent_ToastProps: Double
  
  var iconOut: js.UndefOr[Node] = js.undefined
  
  var isIn: Boolean
  
  var key: Id
  
  @JSName("position")
  var position_ToastProps: ToastPosition
  
  var staleId: js.UndefOr[Id] = js.undefined
  
  @JSName("theme")
  var theme_ToastProps: Theme
  
  @JSName("toastId")
  var toastId_ToastProps: Id
  
  @JSName("transition")
  var transition_ToastProps: ToastTransition
  
  @JSName("type")
  var type_ToastProps: TypeOptions
}
object ToastProps {
  
  inline def apply(
    closeToast: Callback,
    deleteToast: Callback,
    draggablePercent: Double,
    isIn: Boolean,
    key: Id,
    position: ToastPosition,
    theme: Theme,
    toastId: Id,
    transition: ToastTransition,
    `type`: TypeOptions
  ): ToastProps = {
    val __obj = js.Dynamic.literal(closeToast = closeToast.toJsFn, deleteToast = deleteToast.toJsFn, draggablePercent = draggablePercent.asInstanceOf[js.Any], isIn = isIn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
  
  extension [Self <: ToastProps](x: Self) {
    
    inline def setChildren(value: ToastContent[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ ToastContentProps[Any] => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseToast(value: Callback): Self = StObject.set(x, "closeToast", value.toJsFn)
    
    inline def setDeleteToast(value: Callback): Self = StObject.set(x, "deleteToast", value.toJsFn)
    
    inline def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
    
    inline def setIconOut(value: VdomNode): Self = StObject.set(x, "iconOut", value.rawNode.asInstanceOf[js.Any])
    
    inline def setIconOutNull: Self = StObject.set(x, "iconOut", null)
    
    inline def setIconOutUndefined: Self = StObject.set(x, "iconOut", js.undefined)
    
    inline def setIconOutVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "iconOut", js.Array(value*))
    
    inline def setIconOutVdomElement(value: VdomElement): Self = StObject.set(x, "iconOut", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIsIn(value: Boolean): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setStaleId(value: Id): Self = StObject.set(x, "staleId", value.asInstanceOf[js.Any])
    
    inline def setStaleIdUndefined: Self = StObject.set(x, "staleId", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

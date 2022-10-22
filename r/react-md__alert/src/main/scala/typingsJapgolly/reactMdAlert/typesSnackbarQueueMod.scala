package typingsJapgolly.reactMdAlert

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.ToastMessage
import typingsJapgolly.reactMdAlert.typesSnackbarMod.SnackbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSnackbarQueueMod {
  
  @JSImport("@react-md/alert/types/SnackbarQueue", "SnackbarQueue")
  @js.native
  val SnackbarQueue: ForwardRefExoticComponent[SnackbarQueueProps[Any] & RefAttributes[HTMLDivElement]] = js.native
  
  type ActionEventHandler[M /* <: ToastMessage */] = js.Function2[/* message */ M, /* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]
  
  trait SnackbarQueueProps[M /* <: ToastMessage */]
    extends StObject
       with SnackbarProps {
    
    var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.undefined
    
    var queue: js.Array[M]
  }
  object SnackbarQueueProps {
    
    inline def apply[M /* <: ToastMessage */](id: String, queue: js.Array[M]): SnackbarQueueProps[M] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarQueueProps[M]]
    }
    
    extension [Self <: SnackbarQueueProps[?], M /* <: ToastMessage */](x: Self & SnackbarQueueProps[M]) {
      
      inline def setOnActionClick(value: (M, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2((t0: M, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setQueue(value: js.Array[M]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: M*): Self = StObject.set(x, "queue", js.Array(value*))
    }
  }
}

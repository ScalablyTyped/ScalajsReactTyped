package typingsJapgolly.reactMdAlert

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.ToastMessage
import typingsJapgolly.reactMdAlert.typesSnackbarMod.SnackbarProps
import typingsJapgolly.reactMdAlert.typesSnackbarQueueMod.ActionEventHandler
import typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.MessageQueueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageQueueMod {
  
  @JSImport("@react-md/alert/types/MessageQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MessageQueue[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MessageQueue")(hasTimeoutDuplicatesDefaultQueueChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MessageQueueProps[M /* <: ToastMessage */]
    extends StObject
       with MessageQueueOptions[M]
       with SnackbarProps {
    
    /**
      * The children are required in this component since the message queue relies
      * on setting up React Context and provide hooks to add a message to the
      * queue. If there are no children, the message queue will not work.
      */
    @JSName("children")
    var children_MessageQueueProps: Node
    
    /**
      * An optional function to call when the action button is clicked. This will
      * be applied to **all** toasts that appear in this message queue. You will
      * be provided the current message followed by the click event.
      */
    var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.undefined
  }
  object MessageQueueProps {
    
    inline def apply[M /* <: ToastMessage */](id: String): MessageQueueProps[M] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[MessageQueueProps[M]]
    }
    
    extension [Self <: MessageQueueProps[?], M /* <: ToastMessage */](x: Self & MessageQueueProps[M]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: (M, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2((t0: M, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    }
  }
}

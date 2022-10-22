package typingsJapgolly.reactMdAlert

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.AddMessage
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.DuplicateBehavior
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.Message
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.MessageQueueActions
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.ToastMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseMessageQueueMod {
  
  @JSImport("@react-md/alert/types/useMessageQueue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/alert/types/useMessageQueue", "ADD_MESSAGE")
  @js.native
  val ADD_MESSAGE: /* "ADD_MESSAGE" */ String = js.native
  
  @JSImport("@react-md/alert/types/useMessageQueue", "POP_MESSAGE")
  @js.native
  val POP_MESSAGE: /* "POP_MESSAGE" */ String = js.native
  
  @JSImport("@react-md/alert/types/useMessageQueue", "RESET_QUEUE")
  @js.native
  val RESET_QUEUE: /* "RESET_QUEUE" */ String = js.native
  
  inline def addMessage[M /* <: Message */](message: M, duplicates: DuplicateBehavior): AddMessageAction[ToastMessage] = (^.asInstanceOf[js.Dynamic].applyDynamic("addMessage")(message.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[AddMessageAction[ToastMessage]]
  
  inline def handleAddMessage[M /* <: Message */](state: js.Array[M], message: M, duplicates: DuplicateBehavior): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleAddMessage")(state.asInstanceOf[js.Any], message.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  inline def popMessage(): PopMessageAction = ^.asInstanceOf[js.Dynamic].applyDynamic("popMessage")().asInstanceOf[PopMessageAction]
  
  inline def reducer[M /* <: Message */](state: js.Array[M], action: MessageActions[M]): js.Array[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Array[M]]
  
  inline def resetQueue(): ResetQueueAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetQueue")().asInstanceOf[ResetQueueAction]
  
  inline def useMessageQueue[M /* <: Message */](hasTimeoutDuplicatesDefaultQueue: MessageQueueOptions[M]): MessageQueueResult[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessageQueue")(hasTimeoutDuplicatesDefaultQueue.asInstanceOf[js.Any]).asInstanceOf[MessageQueueResult[M]]
  
  trait AddMessageAction[M /* <: Message */]
    extends StObject
       with MessageActions[M] {
    
    var duplicates: DuplicateBehavior
    
    var message: M
    
    var `type`: /* "ADD_MESSAGE" */ String
  }
  object AddMessageAction {
    
    inline def apply[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): AddMessageAction[M] = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddMessageAction[M]]
    }
    
    extension [Self <: AddMessageAction[?], M /* <: Message */](x: Self & AddMessageAction[M]) {
      
      inline def setDuplicates(value: DuplicateBehavior): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: M): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "ADD_MESSAGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.AddMessageAction[M]
    - typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.PopMessageAction
    - typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.ResetQueueAction
  */
  trait MessageActions[M /* <: Message */] extends StObject
  object MessageActions {
    
    inline def AddMessageAction[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.AddMessageAction[M] = {
      val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.AddMessageAction[M]]
    }
    
    inline def PopMessageAction(`type`: /* "POP_MESSAGE" */ String): typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.PopMessageAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.PopMessageAction]
    }
    
    inline def ResetQueueAction(`type`: /* "RESET_QUEUE" */ String): typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.ResetQueueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactMdAlert.typesUseMessageQueueMod.ResetQueueAction]
    }
  }
  
  trait MessageQueueOptions[M /* <: Message */] extends StObject {
    
    var defaultQueue: js.UndefOr[js.Array[M]] = js.undefined
    
    var duplicates: js.UndefOr[DuplicateBehavior] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MessageQueueOptions {
    
    inline def apply[M /* <: Message */](): MessageQueueOptions[M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageQueueOptions[M]]
    }
    
    extension [Self <: MessageQueueOptions[?], M /* <: Message */](x: Self & MessageQueueOptions[M]) {
      
      inline def setDefaultQueue(value: js.Array[M]): Self = StObject.set(x, "defaultQueue", value.asInstanceOf[js.Any])
      
      inline def setDefaultQueueUndefined: Self = StObject.set(x, "defaultQueue", js.undefined)
      
      inline def setDefaultQueueVarargs(value: M*): Self = StObject.set(x, "defaultQueue", js.Array(value*))
      
      inline def setDuplicates(value: DuplicateBehavior): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait MessageQueueResult[M /* <: Message */]
    extends StObject
       with MessageQueueActions[M] {
    
    var addMessage: AddMessage[M]
    
    var queue: js.Array[M]
    
    var visible: Boolean
  }
  object MessageQueueResult {
    
    inline def apply[M /* <: Message */](
      addMessage: M => Callback,
      hideMessage: Callback,
      popMessage: Callback,
      queue: js.Array[M],
      resetQueue: CallbackTo[js.Array[M]],
      restartTimer: Callback,
      startTimer: Callback,
      stopTimer: Callback,
      visible: Boolean
    ): MessageQueueResult[M] = {
      val __obj = js.Dynamic.literal(addMessage = js.Any.fromFunction1((t0: M) => addMessage(t0).runNow()), hideMessage = hideMessage.toJsFn, popMessage = popMessage.toJsFn, queue = queue.asInstanceOf[js.Any], resetQueue = resetQueue.toJsFn, restartTimer = restartTimer.toJsFn, startTimer = startTimer.toJsFn, stopTimer = stopTimer.toJsFn, visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageQueueResult[M]]
    }
    
    extension [Self <: MessageQueueResult[?], M /* <: Message */](x: Self & MessageQueueResult[M]) {
      
      inline def setAddMessage(value: M => Callback): Self = StObject.set(x, "addMessage", js.Any.fromFunction1((t0: M) => value(t0).runNow()))
      
      inline def setQueue(value: js.Array[M]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(value: M*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopMessageAction
    extends StObject
       with MessageActions[Any] {
    
    var `type`: /* "POP_MESSAGE" */ String
  }
  object PopMessageAction {
    
    inline def apply(`type`: /* "POP_MESSAGE" */ String): PopMessageAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopMessageAction]
    }
    
    extension [Self <: PopMessageAction](x: Self) {
      
      inline def setType(value: /* "POP_MESSAGE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResetQueueAction
    extends StObject
       with MessageActions[Any] {
    
    var `type`: /* "RESET_QUEUE" */ String
  }
  object ResetQueueAction {
    
    inline def apply(`type`: /* "RESET_QUEUE" */ String): ResetQueueAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetQueueAction]
    }
    
    extension [Self <: ResetQueueAction](x: Self) {
      
      inline def setType(value: /* "RESET_QUEUE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

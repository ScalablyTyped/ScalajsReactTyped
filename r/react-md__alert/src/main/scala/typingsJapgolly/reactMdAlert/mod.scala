package typingsJapgolly.reactMdAlert

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.AddMessage
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.Message
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.MessageQueueActions
import typingsJapgolly.reactMdAlert.typesMessageQueueContextMod.ToastMessage
import typingsJapgolly.reactMdAlert.typesMessageQueueMod.MessageQueueProps
import typingsJapgolly.reactMdAlert.typesSnackbarMod.SnackbarProps
import typingsJapgolly.reactMdAlert.typesToastMod.ToastProps
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/alert", "AddMessageContext")
  @js.native
  val AddMessageContext: Context[AddMessage[Message]] = js.native
  
  @JSImport("@react-md/alert", "DEFAULT_MESSAGE_QUEUE_TIMEOUT")
  @js.native
  val DEFAULT_MESSAGE_QUEUE_TIMEOUT: /* 5000 */ Double = js.native
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition.CSSTransitionClassNamesObject> */
  object DEFAULT_TOAST_CLASSNAMES {
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  @JSImport("@react-md/alert", "DEFAULT_TOAST_TIMEOUT")
  @js.native
  val DEFAULT_TOAST_TIMEOUT: TransitionTimeout = js.native
  
  inline def MessageQueue[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MessageQueue")(hasTimeoutDuplicatesDefaultQueueChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/alert", "MessageQueueActionsContext")
  @js.native
  val MessageQueueActionsContext: Context[MessageQueueActions[Message]] = js.native
  
  @JSImport("@react-md/alert", "MessageQueueContext")
  @js.native
  val MessageQueueContext: Context[js.Array[Message]] = js.native
  
  @JSImport("@react-md/alert", "MessageVisibilityContext")
  @js.native
  val MessageVisibilityContext: Context[Boolean] = js.native
  
  @JSImport("@react-md/alert", "Snackbar")
  @js.native
  val Snackbar: ForwardRefExoticComponent[SnackbarProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/alert", "Toast")
  @js.native
  val Toast: ForwardRefExoticComponent[ToastProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useAddMessage[M /* <: Message */](): AddMessage[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAddMessage")().asInstanceOf[AddMessage[M]]
  
  inline def useMessageQueueActions[M /* <: Message */](): MessageQueueActions[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessageQueueActions")().asInstanceOf[MessageQueueActions[M]]
  
  inline def useMessageVisibility(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMessageVisibility")().asInstanceOf[Boolean]
  
  inline def useQueue[M /* <: Message */](): js.Array[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueue")().asInstanceOf[js.Array[M]]
}

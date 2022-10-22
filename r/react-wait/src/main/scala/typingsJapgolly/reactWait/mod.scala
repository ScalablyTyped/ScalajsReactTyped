package typingsJapgolly.reactWait

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWait.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-wait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-wait", "Waiter")
  @js.native
  val Waiter: FunctionComponent[Children] = js.native
  
  inline def useWait(): UseWaitAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("useWait")().asInstanceOf[UseWaitAPI]
  
  trait UseWaitAPI extends StObject {
    
    /**
      * Using Wait Component
      *
      * ```tsx
      * function Component() {
      *   const { Wait } = useWait();
      *   return (
      *     <Wait on="the waiting message" fallback={<div>Waiting...</div>}>
      *       The content after waiting done
      *     </Wait>
      *   );
      * }
      * ```
      *
      * Better example for a button with loading state:
      * ```tsx
      * <button disabled={isWaiting("creating user")}>
      *   <Wait on="creating user" fallback={<div>Creating User...</div>}>
      *     Create User
      *   </Wait>
      * </button>
      * ```
      */
    var Wait: ComponentType[WaitProps]
    
    /**
      * Returns boolean value if any loader exists in context.
      *
      * ```tsx
      * const { anyWaiting } = useWait();
      * return <button disabled={anyWaiting()}>Disabled while waiting</button>;
      * ```
      */
    def anyWaiting(): Boolean
    
    /**
      * Creates a waiting context.
      *
      * ```tsx
      * const { startWaiting, endWaiting, isWaiting, Wait } = createWaitingContext("creating user");
      *  return (
      *   <button disabled={isWaiting()}>
      *     Disabled while creating user
      *   </button>
      * );
      * ```
      */
    def createWaitingContext(waiter: String): WaitingContext
    
    /**
      * Stops the given waiter.
      *
      * ```tsx
      * const { end } = useWait();
      * return <button onClick={() => endWaiting("message")}>Stop</button>;
      * ```
      */
    def endWaiting(waiter: String): Unit
    
    /**
      * Returns boolean value if given loader exists in context.
      *
      * ```tsx
      * const { isWaiting } = useWait();
      * return (
      *   <button disabled={isWaiting("creating user")}>
      *     Disabled while creating user
      *   </button>
      * );
      * ```
      */
    def isWaiting(waiter: String): Boolean
    
    /**
      * Starts the given waiter.
      *
      * ```tsx
      * const { startWaiting } = useWait();
      * return <button onClick={() => startWaiting("message")}>Start</button>;
      * ```
      */
    def startWaiting(waiter: String): Unit
    
    /**
      * Returns an array of waiters.
      */
    var waiters: js.Array[String]
  }
  object UseWaitAPI {
    
    inline def apply(
      Wait: ComponentType[WaitProps],
      anyWaiting: CallbackTo[Boolean],
      createWaitingContext: String => WaitingContext,
      endWaiting: String => Callback,
      isWaiting: String => Boolean,
      startWaiting: String => Callback,
      waiters: js.Array[String]
    ): UseWaitAPI = {
      val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], anyWaiting = anyWaiting.toJsFn, createWaitingContext = js.Any.fromFunction1(createWaitingContext), endWaiting = js.Any.fromFunction1((t0: String) => endWaiting(t0).runNow()), isWaiting = js.Any.fromFunction1(isWaiting), startWaiting = js.Any.fromFunction1((t0: String) => startWaiting(t0).runNow()), waiters = waiters.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseWaitAPI]
    }
    
    extension [Self <: UseWaitAPI](x: Self) {
      
      inline def setAnyWaiting(value: CallbackTo[Boolean]): Self = StObject.set(x, "anyWaiting", value.toJsFn)
      
      inline def setCreateWaitingContext(value: String => WaitingContext): Self = StObject.set(x, "createWaitingContext", js.Any.fromFunction1(value))
      
      inline def setEndWaiting(value: String => Callback): Self = StObject.set(x, "endWaiting", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setIsWaiting(value: String => Boolean): Self = StObject.set(x, "isWaiting", js.Any.fromFunction1(value))
      
      inline def setStartWaiting(value: String => Callback): Self = StObject.set(x, "startWaiting", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWait(value: ComponentType[WaitProps]): Self = StObject.set(x, "Wait", value.asInstanceOf[js.Any])
      
      inline def setWaiters(value: js.Array[String]): Self = StObject.set(x, "waiters", value.asInstanceOf[js.Any])
      
      inline def setWaitersVarargs(value: String*): Self = StObject.set(x, "waiters", js.Array(value*))
    }
  }
  
  trait WaitProps
    extends StObject
       with WaitingContextWaitProps {
    
    var on: String
  }
  object WaitProps {
    
    inline def apply(fallback: VdomElement, on: String): WaitProps = {
      val __obj = js.Dynamic.literal(fallback = fallback.rawElement.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitProps]
    }
    
    extension [Self <: WaitProps](x: Self) {
      
      inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitingContext extends StObject {
    
    var Wait: ComponentType[WaitingContextWaitProps]
    
    def endWaiting(): Unit
    
    def isWaiting(): Boolean
    
    def startWaiting(): Unit
  }
  object WaitingContext {
    
    inline def apply(
      Wait: ComponentType[WaitingContextWaitProps],
      endWaiting: Callback,
      isWaiting: CallbackTo[Boolean],
      startWaiting: Callback
    ): WaitingContext = {
      val __obj = js.Dynamic.literal(Wait = Wait.asInstanceOf[js.Any], endWaiting = endWaiting.toJsFn, isWaiting = isWaiting.toJsFn, startWaiting = startWaiting.toJsFn)
      __obj.asInstanceOf[WaitingContext]
    }
    
    extension [Self <: WaitingContext](x: Self) {
      
      inline def setEndWaiting(value: Callback): Self = StObject.set(x, "endWaiting", value.toJsFn)
      
      inline def setIsWaiting(value: CallbackTo[Boolean]): Self = StObject.set(x, "isWaiting", value.toJsFn)
      
      inline def setStartWaiting(value: Callback): Self = StObject.set(x, "startWaiting", value.toJsFn)
      
      inline def setWait(value: ComponentType[WaitingContextWaitProps]): Self = StObject.set(x, "Wait", value.asInstanceOf[js.Any])
    }
  }
  
  trait WaitingContextWaitProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var fallback: Element
  }
  object WaitingContextWaitProps {
    
    inline def apply(fallback: VdomElement): WaitingContextWaitProps = {
      val __obj = js.Dynamic.literal(fallback = fallback.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaitingContextWaitProps]
    }
    
    extension [Self <: WaitingContextWaitProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFallback(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

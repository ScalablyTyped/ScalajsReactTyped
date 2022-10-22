package typingsJapgolly.reactToastify

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.node.timersMod.global.NodeJS.Timeout
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactToastify.distTypesMod.Id
import typingsJapgolly.reactToastify.distTypesMod.Toast
import typingsJapgolly.reactToastify.distTypesMod.ToastPosition
import typingsJapgolly.reactToastify.distTypesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContainerRef extends StObject {
    
    var containerRef: MutableRefObject[Null]
    
    def getToastToRender[T](cb: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], T]): js.Array[T]
    
    def isToastActive(id: Id): Boolean
  }
  object ContainerRef {
    
    inline def apply(
      containerRef: MutableRefObject[Null],
      getToastToRender: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], Any] => js.Array[Any],
      isToastActive: Id => Boolean
    ): ContainerRef = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], getToastToRender = js.Any.fromFunction1(getToastToRender), isToastActive = js.Any.fromFunction1(isToastActive))
      __obj.asInstanceOf[ContainerRef]
    }
    
    extension [Self <: ContainerRef](x: Self) {
      
      inline def setContainerRef(value: MutableRefObject[Null]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setGetToastToRender(
        value: js.Function2[/* position */ ToastPosition, /* toastList */ js.Array[Toast], Any] => js.Array[Any]
      ): Self = StObject.set(x, "getToastToRender", js.Any.fromFunction1(value))
      
      inline def setIsToastActive(value: Id => Boolean): Self = StObject.set(x, "isToastActive", js.Any.fromFunction1(value))
    }
  }
  
  trait DefaultClassName extends StObject {
    
    var defaultClassName: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[ToastPosition] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[TypeOptions] = js.undefined
  }
  object DefaultClassName {
    
    inline def apply(): DefaultClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultClassName]
    }
    
    extension [Self <: DefaultClassName](x: Self) {
      
      inline def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameUndefined: Self = StObject.set(x, "defaultClassName", js.undefined)
      
      inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EventHandlers extends StObject {
    
    var eventHandlers: DOMAttributes[HTMLElement]
    
    var isRunning: Boolean
    
    def pauseToast(): Unit
    
    def playToast(): Unit
    
    var preventExitTransition: Boolean
    
    var toastRef: RefHandle[HTMLDivElement]
  }
  object EventHandlers {
    
    inline def apply(
      eventHandlers: DOMAttributes[HTMLElement],
      isRunning: Boolean,
      pauseToast: Callback,
      playToast: Callback,
      preventExitTransition: Boolean,
      toastRef: RefHandle[HTMLDivElement]
    ): EventHandlers = {
      val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], pauseToast = pauseToast.toJsFn, playToast = playToast.toJsFn, preventExitTransition = preventExitTransition.asInstanceOf[js.Any], toastRef = toastRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setEventHandlers(value: DOMAttributes[HTMLElement]): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
      
      inline def setIsRunning(value: Boolean): Self = StObject.set(x, "isRunning", value.asInstanceOf[js.Any])
      
      inline def setPauseToast(value: Callback): Self = StObject.set(x, "pauseToast", value.toJsFn)
      
      inline def setPlayToast(value: Callback): Self = StObject.set(x, "playToast", value.toJsFn)
      
      inline def setPreventExitTransition(value: Boolean): Self = StObject.set(x, "preventExitTransition", value.asInstanceOf[js.Any])
      
      inline def setToastRef(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "toastRef", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofsetTimeout extends StObject {
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
    def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
  }
}

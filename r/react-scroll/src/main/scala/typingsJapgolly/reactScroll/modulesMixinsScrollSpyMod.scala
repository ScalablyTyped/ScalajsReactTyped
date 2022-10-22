package typingsJapgolly.reactScroll

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMixinsScrollSpyMod extends Shortcut {
  
  @JSImport("react-scroll/modules/mixins/scroll-spy", JSImport.Default)
  @js.native
  val default: ScrollSpy = js.native
  
  trait ScrollSpy extends StObject {
    
    def addSpyHandler(handler: Any, scrollSpyContainer: Any): Unit
    
    def addStateHandler(handler: Any): Unit
    
    def currentPositionY(scrollSpyContainer: Any): Double
    
    def isMounted(scrollSpyContainer: Any): Boolean
    
    def mount(scrollSpyContainer: Any): Unit
    
    def scrollHandler(scrollSpyContainer: Any): Unit
    
    var scrollSpyContainers: js.Array[Any]
    
    var spyCallbacks: js.Array[Any]
    
    var spySetState: js.Array[Any]
    
    def unmount(stateHandler: Any, spyHandler: Any): Unit
    
    def update(): Unit
    
    def updateStates(): Unit
  }
  object ScrollSpy {
    
    inline def apply(
      addSpyHandler: (Any, Any) => Callback,
      addStateHandler: Any => Callback,
      currentPositionY: Any => Double,
      isMounted: Any => Boolean,
      mount: Any => Callback,
      scrollHandler: Any => Callback,
      scrollSpyContainers: js.Array[Any],
      spyCallbacks: js.Array[Any],
      spySetState: js.Array[Any],
      unmount: (Any, Any) => Callback,
      update: Callback,
      updateStates: Callback
    ): ScrollSpy = {
      val __obj = js.Dynamic.literal(addSpyHandler = js.Any.fromFunction2((t0: Any, t1: Any) => (addSpyHandler(t0, t1)).runNow()), addStateHandler = js.Any.fromFunction1((t0: Any) => addStateHandler(t0).runNow()), currentPositionY = js.Any.fromFunction1(currentPositionY), isMounted = js.Any.fromFunction1(isMounted), mount = js.Any.fromFunction1((t0: Any) => mount(t0).runNow()), scrollHandler = js.Any.fromFunction1((t0: Any) => scrollHandler(t0).runNow()), scrollSpyContainers = scrollSpyContainers.asInstanceOf[js.Any], spyCallbacks = spyCallbacks.asInstanceOf[js.Any], spySetState = spySetState.asInstanceOf[js.Any], unmount = js.Any.fromFunction2((t0: Any, t1: Any) => (unmount(t0, t1)).runNow()), update = update.toJsFn, updateStates = updateStates.toJsFn)
      __obj.asInstanceOf[ScrollSpy]
    }
    
    extension [Self <: ScrollSpy](x: Self) {
      
      inline def setAddSpyHandler(value: (Any, Any) => Callback): Self = StObject.set(x, "addSpyHandler", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddStateHandler(value: Any => Callback): Self = StObject.set(x, "addStateHandler", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setCurrentPositionY(value: Any => Double): Self = StObject.set(x, "currentPositionY", js.Any.fromFunction1(value))
      
      inline def setIsMounted(value: Any => Boolean): Self = StObject.set(x, "isMounted", js.Any.fromFunction1(value))
      
      inline def setMount(value: Any => Callback): Self = StObject.set(x, "mount", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setScrollHandler(value: Any => Callback): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setScrollSpyContainers(value: js.Array[Any]): Self = StObject.set(x, "scrollSpyContainers", value.asInstanceOf[js.Any])
      
      inline def setScrollSpyContainersVarargs(value: Any*): Self = StObject.set(x, "scrollSpyContainers", js.Array(value*))
      
      inline def setSpyCallbacks(value: js.Array[Any]): Self = StObject.set(x, "spyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setSpyCallbacksVarargs(value: Any*): Self = StObject.set(x, "spyCallbacks", js.Array(value*))
      
      inline def setSpySetState(value: js.Array[Any]): Self = StObject.set(x, "spySetState", value.asInstanceOf[js.Any])
      
      inline def setSpySetStateVarargs(value: Any*): Self = StObject.set(x, "spySetState", js.Array(value*))
      
      inline def setUnmount(value: (Any, Any) => Callback): Self = StObject.set(x, "unmount", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
      
      inline def setUpdateStates(value: Callback): Self = StObject.set(x, "updateStates", value.toJsFn)
    }
  }
  
  type _To = ScrollSpy
  
  /* This means you don't have to write `default`, but can instead just say `modulesMixinsScrollSpyMod.foo` */
  override def _to: ScrollSpy = default
}

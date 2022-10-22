package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.anon.Componentanyoccurrencenum
import typingsJapgolly.wordpressComponents.anon.`1`
import typingsJapgolly.wordpressElement.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillContextMod extends Shortcut {
  
  @JSImport("@wordpress/components/slot-fill/context", JSImport.Default)
  @js.native
  val default: ComponentType[`1`] = js.native
  
  @JSImport("@wordpress/components/slot-fill/context", "Consumer")
  @js.native
  val Consumer: typingsJapgolly.react.mod.Consumer[SlotFillContext] = js.native
  
  trait SlotFillContext extends StObject {
    
    def getFills(name: String, instance: Component[js.Object, js.Object, Any]): js.Array[Componentanyoccurrencenum]
    
    def getSlot(name: String): Component[js.Object, js.Object, Any]
    
    // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
    def registerFill(name: String, instance: Component[js.Object, js.Object, Any]): Unit
    
    def registerSlot(name: String, instance: Component[js.Object, js.Object, Any]): Unit
    
    // FIXME: instance is not correctly typed. but there's a bug in the code that assumes this type.
    def unregisterFill(name: String, instance: Component[js.Object, js.Object, Any]): Unit
    
    def unregisterSlot(name: String, instance: Component[js.Object, js.Object, Any]): Unit
  }
  object SlotFillContext {
    
    inline def apply(
      getFills: (String, Component[js.Object, js.Object, Any]) => js.Array[Componentanyoccurrencenum],
      getSlot: String => Component[js.Object, js.Object, Any],
      registerFill: (String, Component[js.Object, js.Object, Any]) => Callback,
      registerSlot: (String, Component[js.Object, js.Object, Any]) => Callback,
      unregisterFill: (String, Component[js.Object, js.Object, Any]) => Callback,
      unregisterSlot: (String, Component[js.Object, js.Object, Any]) => Callback
    ): SlotFillContext = {
      val __obj = js.Dynamic.literal(getFills = js.Any.fromFunction2(getFills), getSlot = js.Any.fromFunction1(getSlot), registerFill = js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (registerFill(t0, t1)).runNow()), registerSlot = js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (registerSlot(t0, t1)).runNow()), unregisterFill = js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (unregisterFill(t0, t1)).runNow()), unregisterSlot = js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (unregisterSlot(t0, t1)).runNow()))
      __obj.asInstanceOf[SlotFillContext]
    }
    
    extension [Self <: SlotFillContext](x: Self) {
      
      inline def setGetFills(value: (String, Component[js.Object, js.Object, Any]) => js.Array[Componentanyoccurrencenum]): Self = StObject.set(x, "getFills", js.Any.fromFunction2(value))
      
      inline def setGetSlot(value: String => Component[js.Object, js.Object, Any]): Self = StObject.set(x, "getSlot", js.Any.fromFunction1(value))
      
      inline def setRegisterFill(value: (String, Component[js.Object, js.Object, Any]) => Callback): Self = StObject.set(x, "registerFill", js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterSlot(value: (String, Component[js.Object, js.Object, Any]) => Callback): Self = StObject.set(x, "registerSlot", js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (value(t0, t1)).runNow()))
      
      inline def setUnregisterFill(value: (String, Component[js.Object, js.Object, Any]) => Callback): Self = StObject.set(x, "unregisterFill", js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (value(t0, t1)).runNow()))
      
      inline def setUnregisterSlot(value: (String, Component[js.Object, js.Object, Any]) => Callback): Self = StObject.set(x, "unregisterSlot", js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object, Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = ComponentType[`1`]
  
  /* This means you don't have to write `default`, but can instead just say `slotFillContextMod.foo` */
  override def _to: ComponentType[`1`] = default
}

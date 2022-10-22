package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.storybookAddonKnobs.anon.DefaultValue
import typingsJapgolly.storybookAddonKnobs.anon.typeanygroupIdstringundef
import typingsJapgolly.storybookAddonKnobs.distTypeDefsMod.Knob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKnobStoreMod {
  
  @JSImport("@storybook/addon-knobs/dist/KnobStore", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with KnobStore {
    
    /* CompleteClass */
    var callbacks: js.Array[Callback] = js.native
    
    /* CompleteClass */
    override def get(key: String): typeanygroupIdstringundef | DefaultValue = js.native
    
    /* CompleteClass */
    override def getAll(): Record[String, KnobStoreKnob] = js.native
    
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def markAllUnused(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def set(key: String, value: KnobStoreKnob): Unit = js.native
    
    /* CompleteClass */
    var store: Record[String, KnobStoreKnob] = js.native
    
    /* CompleteClass */
    override def subscribe(cb: Callback): Unit = js.native
    
    /* CompleteClass */
    override def unsubscribe(cb: Callback): Unit = js.native
    
    /* CompleteClass */
    override def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
  }
  
  type Callback = js.Function0[Any]
  
  trait KnobStore extends StObject {
    
    var callbacks: js.Array[Callback]
    
    def get(key: String): typeanygroupIdstringundef | DefaultValue
    
    def getAll(): Record[String, KnobStoreKnob]
    
    def has(key: String): Boolean
    
    def markAllUnused(): Unit
    
    def reset(): Unit
    
    def set(key: String, value: KnobStoreKnob): Unit
    
    var store: Record[String, KnobStoreKnob]
    
    def subscribe(cb: Callback): Unit
    
    var timer: js.UndefOr[Double] = js.undefined
    
    def unsubscribe(cb: Callback): Unit
    
    def update(key: String, options: Partial[KnobStoreKnob]): Unit
  }
  object KnobStore {
    
    inline def apply(
      callbacks: js.Array[Callback],
      get: String => typeanygroupIdstringundef | DefaultValue,
      getAll: CallbackTo[Record[String, KnobStoreKnob]],
      has: String => Boolean,
      markAllUnused: japgolly.scalajs.react.Callback,
      reset: japgolly.scalajs.react.Callback,
      set: (String, KnobStoreKnob) => japgolly.scalajs.react.Callback,
      store: Record[String, KnobStoreKnob],
      subscribe: Callback => japgolly.scalajs.react.Callback,
      unsubscribe: Callback => japgolly.scalajs.react.Callback,
      update: (String, Partial[KnobStoreKnob]) => japgolly.scalajs.react.Callback
    ): KnobStore = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = getAll.toJsFn, has = js.Any.fromFunction1(has), markAllUnused = markAllUnused.toJsFn, reset = reset.toJsFn, set = js.Any.fromFunction2((t0: String, t1: KnobStoreKnob) => (set(t0, t1)).runNow()), store = store.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1((t0: Callback) => subscribe(t0).runNow()), unsubscribe = js.Any.fromFunction1((t0: Callback) => unsubscribe(t0).runNow()), update = js.Any.fromFunction2((t0: String, t1: Partial[KnobStoreKnob]) => (update(t0, t1)).runNow()))
      __obj.asInstanceOf[KnobStore]
    }
    
    extension [Self <: KnobStore](x: Self) {
      
      inline def setCallbacks(value: js.Array[Callback]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: Callback*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setGet(value: String => typeanygroupIdstringundef | DefaultValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: CallbackTo[Record[String, KnobStoreKnob]]): Self = StObject.set(x, "getAll", value.toJsFn)
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setMarkAllUnused(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "markAllUnused", value.toJsFn)
      
      inline def setReset(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSet(value: (String, KnobStoreKnob) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: KnobStoreKnob) => (value(t0, t1)).runNow()))
      
      inline def setStore(value: Record[String, KnobStoreKnob]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: Callback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1((t0: Callback) => value(t0).runNow()))
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      inline def setUnsubscribe(value: Callback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: Callback) => value(t0).runNow()))
      
      inline def setUpdate(value: (String, Partial[KnobStoreKnob]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: String, t1: Partial[KnobStoreKnob]) => (value(t0, t1)).runNow()))
    }
  }
  
  type KnobStoreKnob = Knob[Any] & typingsJapgolly.storybookAddonKnobs.anon.Callback
}

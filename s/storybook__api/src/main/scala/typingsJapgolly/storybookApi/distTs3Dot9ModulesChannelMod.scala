package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.mod.ModuleFn
import typingsJapgolly.storybookChannels.mod.Channel
import typingsJapgolly.storybookChannels.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesChannelMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/channel", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def collapseAll(): Unit
    
    def emit(`type`: String, args: Any*): Unit
    
    def expandAll(): Unit
    
    def getChannel(): Channel
    
    def off(`type`: String, cb: Listener): Unit
    
    def on(`type`: String, cb: Listener): js.Function0[Unit]
    
    def once(`type`: String, cb: Listener): Unit
  }
  object SubAPI {
    
    inline def apply(
      collapseAll: Callback,
      emit: (String, /* repeated */ Any) => Callback,
      expandAll: Callback,
      getChannel: CallbackTo[Channel],
      off: (String, Listener) => Callback,
      on: (String, Listener) => js.Function0[Unit],
      once: (String, Listener) => Callback
    ): SubAPI = {
      val __obj = js.Dynamic.literal(collapseAll = collapseAll.toJsFn, emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), expandAll = expandAll.toJsFn, getChannel = getChannel.toJsFn, off = js.Any.fromFunction2((t0: String, t1: Listener) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2((t0: String, t1: Listener) => (once(t0, t1)).runNow()))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setCollapseAll(value: Callback): Self = StObject.set(x, "collapseAll", value.toJsFn)
      
      inline def setEmit(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setExpandAll(value: Callback): Self = StObject.set(x, "expandAll", value.toJsFn)
      
      inline def setGetChannel(value: CallbackTo[Channel]): Self = StObject.set(x, "getChannel", value.toJsFn)
      
      inline def setOff(value: (String, Listener) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: Listener) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (String, Listener) => js.Function0[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (String, Listener) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: String, t1: Listener) => (value(t0, t1)).runNow()))
    }
  }
}

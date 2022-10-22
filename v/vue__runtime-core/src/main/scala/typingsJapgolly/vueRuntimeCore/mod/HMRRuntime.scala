package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HMRRuntime extends StObject {
  
  def createRecord(id: String, initialDef: HMRComponent): Boolean
  @JSName("createRecord")
  var createRecord_Original: js.Function2[/* id */ String, /* initialDef */ HMRComponent, Boolean]
  
  def reload(id: String, newComp: HMRComponent): Unit
  @JSName("reload")
  var reload_Original: js.Function2[/* id */ String, /* newComp */ HMRComponent, Unit]
  
  def rerender(id: String): Unit
  def rerender(id: String, newRender: js.Function): Unit
  @JSName("rerender")
  var rerender_Original: js.Function2[/* id */ String, /* newRender */ js.UndefOr[js.Function], Unit]
}
object HMRRuntime {
  
  inline def apply(
    createRecord: (/* id */ String, /* initialDef */ HMRComponent) => Boolean,
    reload: (/* id */ String, /* newComp */ HMRComponent) => Callback,
    rerender: (/* id */ String, /* newRender */ js.UndefOr[js.Function]) => Callback
  ): HMRRuntime = {
    val __obj = js.Dynamic.literal(createRecord = js.Any.fromFunction2(createRecord), reload = js.Any.fromFunction2((t0: /* id */ String, t1: /* newComp */ HMRComponent) => (reload(t0, t1)).runNow()), rerender = js.Any.fromFunction2((t0: /* id */ String, t1: /* newRender */ js.UndefOr[js.Function]) => (rerender(t0, t1)).runNow()))
    __obj.asInstanceOf[HMRRuntime]
  }
  
  extension [Self <: HMRRuntime](x: Self) {
    
    inline def setCreateRecord(value: (/* id */ String, /* initialDef */ HMRComponent) => Boolean): Self = StObject.set(x, "createRecord", js.Any.fromFunction2(value))
    
    inline def setReload(value: (/* id */ String, /* newComp */ HMRComponent) => Callback): Self = StObject.set(x, "reload", js.Any.fromFunction2((t0: /* id */ String, t1: /* newComp */ HMRComponent) => (value(t0, t1)).runNow()))
    
    inline def setRerender(value: (/* id */ String, /* newRender */ js.UndefOr[js.Function]) => Callback): Self = StObject.set(x, "rerender", js.Any.fromFunction2((t0: /* id */ String, t1: /* newRender */ js.UndefOr[js.Function]) => (value(t0, t1)).runNow()))
  }
}

package typingsJapgolly.playable.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModule extends StObject {
  
  def getModule(name: String): Any
  
  def registerModule(name: String, fn: js.Function): Unit
  
  def registerModuleAsSingleton(name: String, fn: js.Function): Unit
  
  def setConfig(newConfig: js.Object): Unit
  
  def setPlaybackAdapters(newAdapters: Any): Unit
}
object GetModule {
  
  inline def apply(
    getModule: String => Any,
    registerModule: (String, js.Function) => Callback,
    registerModuleAsSingleton: (String, js.Function) => Callback,
    setConfig: js.Object => Callback,
    setPlaybackAdapters: Any => Callback
  ): GetModule = {
    val __obj = js.Dynamic.literal(getModule = js.Any.fromFunction1(getModule), registerModule = js.Any.fromFunction2((t0: String, t1: js.Function) => (registerModule(t0, t1)).runNow()), registerModuleAsSingleton = js.Any.fromFunction2((t0: String, t1: js.Function) => (registerModuleAsSingleton(t0, t1)).runNow()), setConfig = js.Any.fromFunction1((t0: js.Object) => setConfig(t0).runNow()), setPlaybackAdapters = js.Any.fromFunction1((t0: Any) => setPlaybackAdapters(t0).runNow()))
    __obj.asInstanceOf[GetModule]
  }
  
  extension [Self <: GetModule](x: Self) {
    
    inline def setGetModule(value: String => Any): Self = StObject.set(x, "getModule", js.Any.fromFunction1(value))
    
    inline def setRegisterModule(value: (String, js.Function) => Callback): Self = StObject.set(x, "registerModule", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setRegisterModuleAsSingleton(value: (String, js.Function) => Callback): Self = StObject.set(x, "registerModuleAsSingleton", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setSetConfig(value: js.Object => Callback): Self = StObject.set(x, "setConfig", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetPlaybackAdapters(value: Any => Callback): Self = StObject.set(x, "setPlaybackAdapters", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

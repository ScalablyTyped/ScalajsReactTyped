package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRegistry extends StObject {
  
  /** Saves app data to memory. */
  def register(appName: String, config: AppRegistryOptions, containerDOM: HTMLElement): Unit
  
  /** Initializes the app by calling the init method defined in the creator. */
  def start(appName: String, creator: AppCreator): Unit
  
  /** Destoys the app by calling the destroy method defined in the creator. */
  def stop(): Unit
}
object AppRegistry {
  
  inline def apply(
    register: (String, AppRegistryOptions, HTMLElement) => Callback,
    start: (String, AppCreator) => Callback,
    stop: Callback
  ): AppRegistry = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction3((t0: String, t1: AppRegistryOptions, t2: HTMLElement) => (register(t0, t1, t2)).runNow()), start = js.Any.fromFunction2((t0: String, t1: AppCreator) => (start(t0, t1)).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[AppRegistry]
  }
  
  extension [Self <: AppRegistry](x: Self) {
    
    inline def setRegister(value: (String, AppRegistryOptions, HTMLElement) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction3((t0: String, t1: AppRegistryOptions, t2: HTMLElement) => (value(t0, t1, t2)).runNow()))
    
    inline def setStart(value: (String, AppCreator) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: String, t1: AppCreator) => (value(t0, t1)).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}

package typingsJapgolly.nodeRedRegistry.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPISettings extends StObject {
  
  def available(): Boolean
  
  def delete(prop: String): js.Promise[Unit]
  
  def disableNodeSettings(types: js.Array[String]): Unit
  
  def enableNodeSettings(types: js.Array[String]): Unit
  
  def exportNodeSettings(safeSettings: js.Object): js.Object
  
  def get(prop: String): Any
  
  def getUserSettings(username: String): Unit
  
  def registerNodeSettings(`type`: String, opts: js.Object): Unit
  
  def set(prop: String, value: Any): js.Promise[Unit]
  
  def setUserSettings(username: String, settings: js.Object): js.Promise[Unit]
}
object NodeAPISettings {
  
  inline def apply(
    available: CallbackTo[Boolean],
    delete: String => js.Promise[Unit],
    disableNodeSettings: js.Array[String] => Callback,
    enableNodeSettings: js.Array[String] => Callback,
    exportNodeSettings: js.Object => js.Object,
    get: String => Any,
    getUserSettings: String => Callback,
    registerNodeSettings: (String, js.Object) => Callback,
    set: (String, Any) => js.Promise[Unit],
    setUserSettings: (String, js.Object) => js.Promise[Unit]
  ): NodeAPISettings = {
    val __obj = js.Dynamic.literal(available = available.toJsFn, delete = js.Any.fromFunction1(delete), disableNodeSettings = js.Any.fromFunction1((t0: js.Array[String]) => disableNodeSettings(t0).runNow()), enableNodeSettings = js.Any.fromFunction1((t0: js.Array[String]) => enableNodeSettings(t0).runNow()), exportNodeSettings = js.Any.fromFunction1(exportNodeSettings), get = js.Any.fromFunction1(get), getUserSettings = js.Any.fromFunction1((t0: String) => getUserSettings(t0).runNow()), registerNodeSettings = js.Any.fromFunction2((t0: String, t1: js.Object) => (registerNodeSettings(t0, t1)).runNow()), set = js.Any.fromFunction2(set), setUserSettings = js.Any.fromFunction2(setUserSettings))
    __obj.asInstanceOf[NodeAPISettings]
  }
  
  extension [Self <: NodeAPISettings](x: Self) {
    
    inline def setAvailable(value: CallbackTo[Boolean]): Self = StObject.set(x, "available", value.toJsFn)
    
    inline def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setDisableNodeSettings(value: js.Array[String] => Callback): Self = StObject.set(x, "disableNodeSettings", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setEnableNodeSettings(value: js.Array[String] => Callback): Self = StObject.set(x, "enableNodeSettings", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setExportNodeSettings(value: js.Object => js.Object): Self = StObject.set(x, "exportNodeSettings", js.Any.fromFunction1(value))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetUserSettings(value: String => Callback): Self = StObject.set(x, "getUserSettings", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRegisterNodeSettings(value: (String, js.Object) => Callback): Self = StObject.set(x, "registerNodeSettings", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSet(value: (String, Any) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetUserSettings(value: (String, js.Object) => js.Promise[Unit]): Self = StObject.set(x, "setUserSettings", js.Any.fromFunction2(value))
  }
}

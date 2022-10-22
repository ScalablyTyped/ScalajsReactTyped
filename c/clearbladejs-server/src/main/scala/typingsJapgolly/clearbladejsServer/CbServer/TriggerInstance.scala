package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerInstance extends StObject {
  
  def Delete(callback: CbCallback): Unit
  
  def Update(options: js.Object, callback: CbCallback): Unit
  
  var name: String
  
  var systemKey: String
}
object TriggerInstance {
  
  inline def apply(
    Delete: CbCallback => Callback,
    Update: (js.Object, CbCallback) => Callback,
    name: String,
    systemKey: String
  ): TriggerInstance = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction1((t0: CbCallback) => Delete(t0).runNow()), Update = js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (Update(t0, t1)).runNow()), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerInstance]
  }
  
  extension [Self <: TriggerInstance](x: Self) {
    
    inline def setDelete(value: CbCallback => Callback): Self = StObject.set(x, "Delete", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (js.Object, CbCallback) => Callback): Self = StObject.set(x, "Update", js.Any.fromFunction2((t0: js.Object, t1: CbCallback) => (value(t0, t1)).runNow()))
  }
}

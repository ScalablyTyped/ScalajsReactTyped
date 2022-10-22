package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var data: js.Object
  
  def destroy(callback: CbCallback): Unit
  
  def refresh(callback: CbCallback): Unit
  
  def save(callback: CbCallback): Unit
}
object Item {
  
  inline def apply(
    data: js.Object,
    destroy: CbCallback => Callback,
    refresh: CbCallback => Callback,
    save: CbCallback => Callback
  ): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction1((t0: CbCallback) => destroy(t0).runNow()), refresh = js.Any.fromFunction1((t0: CbCallback) => refresh(t0).runNow()), save = js.Any.fromFunction1((t0: CbCallback) => save(t0).runNow()))
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: CbCallback => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setRefresh(value: CbCallback => Callback): Self = StObject.set(x, "refresh", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setSave(value: CbCallback => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
  }
}

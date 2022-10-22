package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var data: js.Object
  
  def destroy(): Unit
  
  def refresh(): Unit
  
  def save(): Unit
}
object Item {
  
  inline def apply(data: js.Object, destroy: Callback, refresh: Callback, save: Callback): Item = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destroy = destroy.toJsFn, refresh = refresh.toJsFn, save = save.toJsFn)
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
  }
}

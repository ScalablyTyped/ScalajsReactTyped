package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAsyncInfo extends StObject {
  
  def cancel(): Unit
  
  def close(): Unit
  
  var errorCode: Double
  
  var id: Double
  
  var status: AsyncStatus
}
object IAsyncInfo {
  
  inline def apply(cancel: Callback, close: Callback, errorCode: Double, id: Double, status: AsyncStatus): IAsyncInfo = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncInfo]
  }
  
  extension [Self <: IAsyncInfo](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

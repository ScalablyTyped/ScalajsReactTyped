package typingsJapgolly.awsSyntheticsPuppeteer.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCore extends StObject {
  
  def HTTP_DATA(): Unit
  
  def SEND(): Unit
  
  def VALIDATE_CREDENTIALS(): Unit
  
  def VALIDATE_PARAMETERS(): Unit
  
  def VALIDATE_REGION(): Unit
  
  def removeListener(eventName: String, eventListener: js.Function): Unit
}
object TypeofCore {
  
  inline def apply(
    HTTP_DATA: Callback,
    SEND: Callback,
    VALIDATE_CREDENTIALS: Callback,
    VALIDATE_PARAMETERS: Callback,
    VALIDATE_REGION: Callback,
    removeListener: (String, js.Function) => Callback
  ): TypeofCore = {
    val __obj = js.Dynamic.literal(HTTP_DATA = HTTP_DATA.toJsFn, SEND = SEND.toJsFn, VALIDATE_CREDENTIALS = VALIDATE_CREDENTIALS.toJsFn, VALIDATE_PARAMETERS = VALIDATE_PARAMETERS.toJsFn, VALIDATE_REGION = VALIDATE_REGION.toJsFn, removeListener = js.Any.fromFunction2((t0: String, t1: js.Function) => (removeListener(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofCore]
  }
  
  extension [Self <: TypeofCore](x: Self) {
    
    inline def setHTTP_DATA(value: Callback): Self = StObject.set(x, "HTTP_DATA", value.toJsFn)
    
    inline def setRemoveListener(value: (String, js.Function) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setSEND(value: Callback): Self = StObject.set(x, "SEND", value.toJsFn)
    
    inline def setVALIDATE_CREDENTIALS(value: Callback): Self = StObject.set(x, "VALIDATE_CREDENTIALS", value.toJsFn)
    
    inline def setVALIDATE_PARAMETERS(value: Callback): Self = StObject.set(x, "VALIDATE_PARAMETERS", value.toJsFn)
    
    inline def setVALIDATE_REGION(value: Callback): Self = StObject.set(x, "VALIDATE_REGION", value.toJsFn)
  }
}

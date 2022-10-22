package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IstopRecord
  extends StObject
     with BaseParams {
  
  @JSName("success")
  def success_MIstopRecord(res: Resouce): Unit
}
object IstopRecord {
  
  inline def apply(success: Resouce => Callback): IstopRecord = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: Resouce) => success(t0).runNow()))
    __obj.asInstanceOf[IstopRecord]
  }
  
  extension [Self <: IstopRecord](x: Self) {
    
    inline def setSuccess(value: Resouce => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: Resouce) => value(t0).runNow()))
  }
}

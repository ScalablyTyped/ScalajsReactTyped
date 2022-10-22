package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCenterLocationSuccCbOptions
  extends StObject
     with CommonCallbackOptions {
  
  @JSName("success")
  def success_MGetCenterLocationSuccCbOptions(res: LocationBaseOptions): Unit
}
object GetCenterLocationSuccCbOptions {
  
  inline def apply(success: LocationBaseOptions => Callback): GetCenterLocationSuccCbOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: LocationBaseOptions) => success(t0).runNow()))
    __obj.asInstanceOf[GetCenterLocationSuccCbOptions]
  }
  
  extension [Self <: GetCenterLocationSuccCbOptions](x: Self) {
    
    inline def setSuccess(value: LocationBaseOptions => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: LocationBaseOptions) => value(t0).runNow()))
  }
}

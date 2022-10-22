package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.anon.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgetNetworkType
  extends StObject
     with BaseParams {
  
  @JSName("success")
  def success_MIgetNetworkType(res: NetworkType): Unit
}
object IgetNetworkType {
  
  inline def apply(success: NetworkType => Callback): IgetNetworkType = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: NetworkType) => success(t0).runNow()))
    __obj.asInstanceOf[IgetNetworkType]
  }
  
  extension [Self <: IgetNetworkType](x: Self) {
    
    inline def setSuccess(value: NetworkType => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: NetworkType) => value(t0).runNow()))
  }
}

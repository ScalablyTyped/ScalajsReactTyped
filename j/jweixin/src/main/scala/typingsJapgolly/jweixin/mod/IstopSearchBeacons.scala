package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IstopSearchBeacons
  extends StObject
     with BaseParams {
  
  // 关闭查找完成后的回调函数
  @JSName("complete")
  def complete_MIstopSearchBeacons(res: Any): Unit
}
object IstopSearchBeacons {
  
  inline def apply(complete: Any => Callback): IstopSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()))
    __obj.asInstanceOf[IstopSearchBeacons]
  }
  
  extension [Self <: IstopSearchBeacons](x: Self) {
    
    inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

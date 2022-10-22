package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSearchBeacons
  extends StObject
     with BaseParams {
  
  // 回调函数，可以数组形式取得该商家注册的在周边的相关设备列表
  @JSName("complete")
  def complete_MIonSearchBeacons(argv: Any): Unit
}
object IonSearchBeacons {
  
  inline def apply(complete: Any => Callback): IonSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()))
    __obj.asInstanceOf[IonSearchBeacons]
  }
  
  extension [Self <: IonSearchBeacons](x: Self) {
    
    inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

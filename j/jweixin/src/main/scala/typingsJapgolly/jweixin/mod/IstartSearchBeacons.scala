package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
trait IstartSearchBeacons
  extends StObject
     with BaseParams {
  
  // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: Any): Unit
  
  var ticket: String
}
object IstartSearchBeacons {
  
  inline def apply(complete: Any => Callback, ticket: String): IstartSearchBeacons = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()), ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IstartSearchBeacons]
  }
  
  extension [Self <: IstartSearchBeacons](x: Self) {
    
    inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}

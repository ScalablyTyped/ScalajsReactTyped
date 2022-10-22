package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSearchBeaconsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 完成后的回调
    */
  @JSName("complete")
  def complete_MStartSearchBeaconsConfig(argv: Any): Unit
  
  /**
    * 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
    */
  var ticket: String
}
object StartSearchBeaconsConfig {
  
  inline def apply(complete: Any => Callback, ticket: String): StartSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()), ticket = ticket.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSearchBeaconsConfig]
  }
  
  extension [Self <: StartSearchBeaconsConfig](x: Self) {
    
    inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
  }
}

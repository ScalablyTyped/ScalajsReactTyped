package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INotifyHostEventHandler extends StObject {
  
  /* private */ @JSName("InfoPath.INotifyHostEventHandler_typekey")
  var InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler
  
  def NotifyHostEventHandler(punkSender: Any, bstrNotification: String): Unit
}
object INotifyHostEventHandler {
  
  inline def apply(
    InfoPathDotINotifyHostEventHandler_typekey: INotifyHostEventHandler,
    NotifyHostEventHandler: (Any, String) => Callback
  ): INotifyHostEventHandler = {
    val __obj = js.Dynamic.literal(NotifyHostEventHandler = js.Any.fromFunction2((t0: Any, t1: String) => (NotifyHostEventHandler(t0, t1)).runNow()))
    __obj.updateDynamic("InfoPath.INotifyHostEventHandler_typekey")(InfoPathDotINotifyHostEventHandler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotifyHostEventHandler]
  }
  
  extension [Self <: INotifyHostEventHandler](x: Self) {
    
    inline def setInfoPathDotINotifyHostEventHandler_typekey(value: INotifyHostEventHandler): Self = StObject.set(x, "InfoPath.INotifyHostEventHandler_typekey", value.asInstanceOf[js.Any])
    
    inline def setNotifyHostEventHandler(value: (Any, String) => Callback): Self = StObject.set(x, "NotifyHostEventHandler", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
  }
}

package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerDataPushSink extends StObject {
  
  def OnServerDataPush(RequestID: Double, JsonDataContent: String): Unit
}
object IServerDataPushSink {
  
  inline def apply(OnServerDataPush: (Double, String) => Callback): IServerDataPushSink = {
    val __obj = js.Dynamic.literal(OnServerDataPush = js.Any.fromFunction2((t0: Double, t1: String) => (OnServerDataPush(t0, t1)).runNow()))
    __obj.asInstanceOf[IServerDataPushSink]
  }
  
  extension [Self <: IServerDataPushSink](x: Self) {
    
    inline def setOnServerDataPush(value: (Double, String) => Callback): Self = StObject.set(x, "OnServerDataPush", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
  }
}

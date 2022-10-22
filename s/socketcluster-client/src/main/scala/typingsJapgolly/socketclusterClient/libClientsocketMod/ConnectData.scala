package typingsJapgolly.socketclusterClient.libClientsocketMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.socketclusterClient.libTransportMod.OnOpenValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectData
  extends StObject
     with OnOpenValue {
  
  def processPendingSubscriptions(): Unit
}
object ConnectData {
  
  inline def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double, processPendingSubscriptions: Callback): ConnectData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], processPendingSubscriptions = processPendingSubscriptions.toJsFn, authToken = null)
    __obj.asInstanceOf[ConnectData]
  }
  
  extension [Self <: ConnectData](x: Self) {
    
    inline def setProcessPendingSubscriptions(value: Callback): Self = StObject.set(x, "processPendingSubscriptions", value.toJsFn)
  }
}

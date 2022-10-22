package typingsJapgolly.trezorConnect.libTypescriptEventsMod

import typingsJapgolly.trezorConnect.anon.Bridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.anon.PayloadTransportInfo
  - typingsJapgolly.trezorConnect.anon.PayloadBridge
*/
trait TransportEvent extends StObject
object TransportEvent {
  
  inline def PayloadBridge(payload: Bridge, `type`: /* "transport-error" */ String): typingsJapgolly.trezorConnect.anon.PayloadBridge = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadBridge]
  }
  
  inline def PayloadTransportInfo(payload: TransportInfo, `type`: /* "transport-start" */ String): typingsJapgolly.trezorConnect.anon.PayloadTransportInfo = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.trezorConnect.anon.PayloadTransportInfo]
  }
}

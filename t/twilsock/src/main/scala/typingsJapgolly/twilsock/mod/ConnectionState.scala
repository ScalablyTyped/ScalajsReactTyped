package typingsJapgolly.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Indicates current state of connection between the client and Sync service.
  * <p>Possible values are as follows:
  * <li>'connecting' - client is offline and connection attempt is in process.
  * <li>'connected' - client is online and ready.
  * <li>'disconnecting' - client is going offline as disconnection is in process.
  * <li>'disconnected' - client is offline and no connection attempt is in process.
  * <li>'denied' - client connection is denied because of invalid JWT access token. User must refresh token in order to proceed.
  * <li>'error' - client connection is in a permanent erroneous state. Client re-initialization is required.
  * @typedef {('unknown'|'connecting'|'connected'|'disconnecting'|'disconnected'|'denied'|'error')} TwilsockClient#ConnectionState
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilsock.twilsockStrings.unknown
  - typingsJapgolly.twilsock.twilsockStrings.disconnecting
  - typingsJapgolly.twilsock.twilsockStrings.disconnected
  - typingsJapgolly.twilsock.twilsockStrings.connecting
  - typingsJapgolly.twilsock.twilsockStrings.connected
  - typingsJapgolly.twilsock.twilsockStrings.denied
  - typingsJapgolly.twilsock.twilsockStrings.error
*/
trait ConnectionState extends StObject
object ConnectionState {
  
  inline def connected: typingsJapgolly.twilsock.twilsockStrings.connected = "connected".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.connected]
  
  inline def connecting: typingsJapgolly.twilsock.twilsockStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.connecting]
  
  inline def denied: typingsJapgolly.twilsock.twilsockStrings.denied = "denied".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.denied]
  
  inline def disconnected: typingsJapgolly.twilsock.twilsockStrings.disconnected = "disconnected".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.disconnected]
  
  inline def disconnecting: typingsJapgolly.twilsock.twilsockStrings.disconnecting = "disconnecting".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.disconnecting]
  
  inline def error: typingsJapgolly.twilsock.twilsockStrings.error = "error".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.error]
  
  inline def unknown: typingsJapgolly.twilsock.twilsockStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.twilsock.twilsockStrings.unknown]
}

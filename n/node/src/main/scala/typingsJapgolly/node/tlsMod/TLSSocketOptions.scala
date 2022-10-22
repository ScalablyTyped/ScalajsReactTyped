package typingsJapgolly.node.tlsMod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSSocketOptions
  extends StObject
     with SecureContextOptions
     with CommonConnectionOptions {
  
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[typingsJapgolly.node.nodeColonnetMod.Server] = js.undefined
  
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[Buffer] = js.undefined
}
object TLSSocketOptions {
  
  inline def apply(): TLSSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSSocketOptions]
  }
  
  extension [Self <: TLSSocketOptions](x: Self) {
    
    inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
    
    inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
    
    inline def setRequestOCSP(value: Boolean): Self = StObject.set(x, "requestOCSP", value.asInstanceOf[js.Any])
    
    inline def setRequestOCSPUndefined: Self = StObject.set(x, "requestOCSP", js.undefined)
    
    inline def setServer(value: typingsJapgolly.node.nodeColonnetMod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSession(value: Buffer): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}

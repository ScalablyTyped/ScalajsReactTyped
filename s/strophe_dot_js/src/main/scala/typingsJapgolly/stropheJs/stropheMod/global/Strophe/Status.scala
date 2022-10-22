package typingsJapgolly.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends StObject
/** Constants: Connection Status Constants
  *  Connection status constants for use by the connection handler
  *  callback.
  *
  *  Status.ERROR - An error has occurred
  *  Status.CONNECTING - The connection is currently being made
  *  Status.CONNFAIL - The connection attempt failed
  *  Status.AUTHENTICATING - The connection is authenticating
  *  Status.AUTHFAIL - The authentication attempt failed
  *  Status.CONNECTED - The connection has succeeded
  *  Status.DISCONNECTED - The connection has been terminated
  *  Status.DISCONNECTING - The connection is currently being terminated
  *  Status.ATTACHED - The connection has been attached
  *  Status.REDIRECT - The connection has been redirected
  *  Status.CONNTIMEOUT - The connection has timed out
  */
@JSGlobal("Strophe.Status")
@js.native
object Status extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status & Double] = js.native
  
  @js.native
  sealed trait ATTACHED
    extends StObject
       with Status
  /* 8 */ val ATTACHED: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.ATTACHED & Double = js.native
  
  @js.native
  sealed trait ATTACHFAIL
    extends StObject
       with Status
  /* 12 */ val ATTACHFAIL: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.ATTACHFAIL & Double = js.native
  
  @js.native
  sealed trait AUTHENTICATING
    extends StObject
       with Status
  /* 3 */ val AUTHENTICATING: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.AUTHENTICATING & Double = js.native
  
  @js.native
  sealed trait AUTHFAIL
    extends StObject
       with Status
  /* 4 */ val AUTHFAIL: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.AUTHFAIL & Double = js.native
  
  @js.native
  sealed trait BINDREQUIRED
    extends StObject
       with Status
  /* 11 */ val BINDREQUIRED: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.BINDREQUIRED & Double = js.native
  
  @js.native
  sealed trait CONNECTED
    extends StObject
       with Status
  /* 5 */ val CONNECTED: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.CONNECTED & Double = js.native
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with Status
  /* 1 */ val CONNECTING: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.CONNECTING & Double = js.native
  
  @js.native
  sealed trait CONNFAIL
    extends StObject
       with Status
  /* 2 */ val CONNFAIL: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.CONNFAIL & Double = js.native
  
  @js.native
  sealed trait CONNTIMEOUT
    extends StObject
       with Status
  /* 10 */ val CONNTIMEOUT: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.CONNTIMEOUT & Double = js.native
  
  @js.native
  sealed trait DISCONNECTED
    extends StObject
       with Status
  /* 6 */ val DISCONNECTED: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.DISCONNECTED & Double = js.native
  
  @js.native
  sealed trait DISCONNECTING
    extends StObject
       with Status
  /* 7 */ val DISCONNECTING: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.DISCONNECTING & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with Status
  /* 0 */ val ERROR: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.ERROR & Double = js.native
  
  @js.native
  sealed trait REDIRECT
    extends StObject
       with Status
  /* 9 */ val REDIRECT: typingsJapgolly.stropheJs.stropheMod.global.Strophe.Status.REDIRECT & Double = js.native
}

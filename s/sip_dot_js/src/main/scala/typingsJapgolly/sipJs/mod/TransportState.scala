package typingsJapgolly.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "TransportState")
@js.native
object TransportState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiTransportStateMod.TransportState & String] = js.native
  
  /* "Connected" */ val Connected: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Connected & String = js.native
  
  /* "Connecting" */ val Connecting: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Connecting & String = js.native
  
  /* "Disconnected" */ val Disconnected: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Disconnected & String = js.native
  
  /* "Disconnecting" */ val Disconnecting: typingsJapgolly.sipJs.libApiTransportStateMod.TransportState.Disconnecting & String = js.native
}

package typingsJapgolly.peerjs.mod

import org.scalajs.dom.RTCPeerConnection
import typingsJapgolly.eventemitter3.mod.EventEmitter
import typingsJapgolly.eventemitter3.mod.ValidEventTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseConnection[T /* <: ValidEventTypes */]
  extends StObject
     with EventEmitter[T & BaseConnectionEvents, Any] {
  
  /* protected */ var _open: Boolean = js.native
  
  def close(): Unit = js.native
  
  var connectionId: String = js.native
  
  def handleMessage(message: ServerMessage): Unit = js.native
  
  val metadata: Any = js.native
  
  def open: Boolean = js.native
  
  val options: Any = js.native
  
  val peer: String = js.native
  
  var peerConnection: RTCPeerConnection = js.native
  
  var provider: Peer = js.native
  
  def `type`: ConnectionType = js.native
}

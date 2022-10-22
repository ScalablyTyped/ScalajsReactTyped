package typingsJapgolly.grpc.mod

import typingsJapgolly.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grpc", "ClientDuplexStream")
@js.native
/* private */ open class ClientDuplexStream[RequestType, ResponseType] () extends Duplex {
  
  /**
    * Cancel the ongoing call. Results in the call ending with a CANCELLED status,
    * unless it has already ended with some other status.
    */
  def cancel(): Unit = js.native
  
  /**
    * Get the endpoint this call/stream is connected to.
    * @return The URI of the endpoint
    */
  def getPeer(): String = js.native
  
  def write(message: RequestType, flags: Any & writeFlags): Boolean = js.native
  def write(message: RequestType, flags: Any & writeFlags, callback: js.Function): Boolean = js.native
  def write(message: RequestType, flags: Unit, callback: js.Function): Boolean = js.native
}

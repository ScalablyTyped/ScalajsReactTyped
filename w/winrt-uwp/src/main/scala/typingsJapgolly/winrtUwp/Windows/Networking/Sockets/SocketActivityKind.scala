package typingsJapgolly.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocketActivityKind extends js.Object

/** Describes the kind of socket object being transferred to or from the socket broker. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityKind")
@js.native
object SocketActivityKind extends js.Object {
  /** A socket type of DatagramSocket . */
  @js.native
  sealed trait datagramSocket extends SocketActivityKind
  
  /** The socket type is unknown. */
  @js.native
  sealed trait none extends SocketActivityKind
  
  /** A socket type of StreamSocket . */
  @js.native
  sealed trait streamSocket extends SocketActivityKind
  
  /** A socket type of StreamSocketListener . */
  @js.native
  sealed trait streamSocketListener extends SocketActivityKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketActivityKind with Double] = js.native
  /* 2 */ @js.native
  object datagramSocket extends TopLevel[datagramSocket with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object streamSocket extends TopLevel[streamSocket with Double]
  
  /* 1 */ @js.native
  object streamSocketListener extends TopLevel[streamSocketListener with Double]
  
}


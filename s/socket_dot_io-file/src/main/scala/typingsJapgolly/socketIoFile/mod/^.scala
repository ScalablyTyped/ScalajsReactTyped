package typingsJapgolly.socketIoFile.mod

import typingsJapgolly.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socket.io-file", JSImport.Namespace)
@js.native
class ^ protected () extends SocketIOFile {
  def this(socket: Socket, options: Options) = this()
  /* CompleteClass */
  override def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit = js.native
}


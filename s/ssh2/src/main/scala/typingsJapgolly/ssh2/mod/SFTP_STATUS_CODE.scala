package typingsJapgolly.ssh2.mod

import typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2", "SFTP_STATUS_CODE")
@js.native
object SFTP_STATUS_CODE extends js.Object {
  /* 5 */ val BAD_MESSAGE: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.BAD_MESSAGE with Double = js.native
  /* 7 */ val CONNECTION_LOST: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.CONNECTION_LOST with Double = js.native
  /* 1 */ val EOF: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.EOF with Double = js.native
  /* 4 */ val FAILURE: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.FAILURE with Double = js.native
  /* 6 */ val NO_CONNECTION: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.NO_CONNECTION with Double = js.native
  /* 2 */ val NO_SUCH_FILE: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.NO_SUCH_FILE with Double = js.native
  /* 0 */ val OK: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.OK with Double = js.native
  /* 8 */ val OP_UNSUPPORTED: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.OP_UNSUPPORTED with Double = js.native
  /* 3 */ val PERMISSION_DENIED: typingsJapgolly.ssh2Streams.mod.SFTPStream.STATUS_CODE.PERMISSION_DENIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[STATUS_CODE with Double] = js.native
}


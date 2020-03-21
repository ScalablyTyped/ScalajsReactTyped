package typingsJapgolly.ssh2.mod

import typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssh2", "SFTP_OPEN_MODE")
@js.native
object SFTP_OPEN_MODE extends js.Object {
  /* 0x00000004 */ val APPEND: typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE.APPEND with Double = js.native
  /* 0x00000008 */ val CREAT: typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE.CREAT with Double = js.native
  /* 0x00000020 */ val EXCL: typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE.EXCL with Double = js.native
  /* 0x00000001 */ val READ: typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE.READ with Double = js.native
  /* 0x00000010 */ val TRUNC: typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE.TRUNC with Double = js.native
  /* 0x00000002 */ val WRITE: typingsJapgolly.ssh2Streams.mod.SFTPStream.OPEN_MODE.WRITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OPEN_MODE with Double] = js.native
}


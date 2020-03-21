package typingsJapgolly.ptyJs.mod

import typingsJapgolly.ptyJs.AnonFd
import typingsJapgolly.ptyJs.AnonMaster
import typingsJapgolly.ptyJs.AnonPid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", "native")
@js.native
object native extends js.Object {
  def fork(file: String, args: js.Array[String], env: js.Any, cwd: String, cols: Double, rows: Double): AnonFd = js.native
  def fork(
    file: String,
    args: js.Array[String],
    env: js.Any,
    cwd: String,
    cols: Double,
    rows: Double,
    uid: Double
  ): AnonFd = js.native
  def fork(
    file: String,
    args: js.Array[String],
    env: js.Any,
    cwd: String,
    cols: Double,
    rows: Double,
    uid: Double,
    gid: Double
  ): AnonFd = js.native
  def kill(pid: Double): Unit = js.native
  def open(cols: Double, rows: Double): AnonMaster = js.native
  def open(dataPipe: String, cols: Double, rows: Double, debug: Boolean): AnonPid = js.native
  def process(fd: Double, tty: String): String = js.native
  def resize(fd: Double, cols: Double, rows: Double): Unit = js.native
  def startProcess(pid: Double, file: String, cmdline: String, env: js.Array[String], cwd: String): Unit = js.native
}


package typingsJapgolly.easyXHeaders.fsMod

import typingsJapgolly.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "ftruncate")
@js.native
object ftruncate extends js.Object {
  def apply(fd: Double): Unit = js.native
  def apply(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(fd: Double, len: Double): Unit = js.native
  def apply(fd: Double, len: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}


package typingsJapgolly.easyXapiSupertest.fsMod

import typingsJapgolly.easyXapiSupertest.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "fsync")
@js.native
object fsync extends js.Object {
  def apply(fd: Double): Unit = js.native
  def apply(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}


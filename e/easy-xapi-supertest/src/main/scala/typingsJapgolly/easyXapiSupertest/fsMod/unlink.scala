package typingsJapgolly.easyXapiSupertest.fsMod

import typingsJapgolly.easyXapiSupertest.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "unlink")
@js.native
object unlink extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}


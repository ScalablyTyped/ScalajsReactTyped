package typingsJapgolly.nodeJsflRunner.mod

import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jsfl-runner", "runJSFL")
@js.native
object runJSFL extends js.Object {
  def apply(flashLocation: String, fileName: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}


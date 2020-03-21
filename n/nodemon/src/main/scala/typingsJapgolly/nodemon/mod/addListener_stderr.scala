package typingsJapgolly.nodemon.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodemon.nodemonStrings.stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "addListener")
@js.native
object addListener_stderr extends js.Object {
  def apply(event: stderr, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
}


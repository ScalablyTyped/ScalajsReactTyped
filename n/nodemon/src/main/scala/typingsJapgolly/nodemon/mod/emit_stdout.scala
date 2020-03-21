package typingsJapgolly.nodemon.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.nodemon.nodemonStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "emit")
@js.native
object emit_stdout extends js.Object {
  def apply(event: stdout, data: Buffer): Boolean = js.native
}


package typingsJapgolly.stdoutStream.mod

import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.stdoutStream.stdoutStreamBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdoutStream extends Writable {
  val _isStdio: `true` = js.native
  val isTTY: Boolean = js.native
}


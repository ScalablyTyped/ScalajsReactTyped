package typingsJapgolly.duplexify.mod

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duplexify extends Duplex {
  def setReadable(readable: Readable): Unit = js.native
  def setWritable(writable: Writable): Unit = js.native
}


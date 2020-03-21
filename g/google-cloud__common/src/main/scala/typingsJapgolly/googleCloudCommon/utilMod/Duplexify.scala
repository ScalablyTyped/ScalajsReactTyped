package typingsJapgolly.googleCloudCommon.utilMod

import typingsJapgolly.googleCloudCommon.googleCloudCommonBooleans.`false`
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duplexify extends Duplex {
  def setReadable(): Unit = js.native
  def setReadable(readable: Readable): Unit = js.native
  @JSName("setReadable")
  def setReadable_false(readable: `false`): Unit = js.native
  def setWritable(): Unit = js.native
  def setWritable(writable: Writable): Unit = js.native
  @JSName("setWritable")
  def setWritable_false(writable: `false`): Unit = js.native
}


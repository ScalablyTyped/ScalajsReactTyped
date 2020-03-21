package typingsJapgolly.nodeInt64.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-int64", JSImport.Namespace)
@js.native
class ^ protected () extends Int64 {
  def this(array: scala.scalajs.js.typedarray.Uint8Array) = this()
  def this(buffer: Buffer) = this()
  def this(num: Double) = this()
  def this(str: String) = this()
  def this(array: scala.scalajs.js.typedarray.Uint8Array, offset: Double) = this()
  def this(buffer: Buffer, offset: Double) = this()
  def this(hi: Double, lo: Double) = this()
}

@JSImport("node-int64", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var MAX_INT: Double = js.native
  var MIN_INT: Double = js.native
}


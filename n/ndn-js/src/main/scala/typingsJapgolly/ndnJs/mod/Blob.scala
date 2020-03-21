package typingsJapgolly.ndnJs.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Blob")
@js.native
class Blob ()
  extends typingsJapgolly.ndnJs.blobMod.Blob {
  def this(value: String) = this()
  def this(value: js.Array[Double]) = this()
  def this(value: typingsJapgolly.ndnJs.blobMod.Blob) = this()
  def this(value: Buffer) = this()
  def this(value: Buffer, copy: Boolean) = this()
}


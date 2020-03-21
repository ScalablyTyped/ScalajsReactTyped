package typingsJapgolly.blake2sJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLAKE2s extends js.Object {
  def digest(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def hexDigest(): String = js.native
  def update(p: ByteArray): this.type = js.native
  def update(p: ByteArray, offset: Double): this.type = js.native
  def update(p: ByteArray, offset: Double, length: Double): this.type = js.native
}


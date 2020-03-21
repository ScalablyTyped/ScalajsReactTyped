package typingsJapgolly.write.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write", "sync")
@js.native
object sync extends js.Object {
  def apply(filepath: String, data: String): Result[String] = js.native
  def apply(filepath: String, data: String, options: Options): Result[String] = js.native
  def apply(filepath: String, data: Buffer): Result[Buffer] = js.native
  def apply(filepath: String, data: Buffer, options: Options): Result[Buffer] = js.native
  def apply(filepath: String, data: Uint8Array): Result[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def apply(filepath: String, data: Uint8Array, options: Options): Result[scala.scalajs.js.typedarray.Uint8Array] = js.native
}


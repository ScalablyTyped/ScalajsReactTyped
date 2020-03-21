package typingsJapgolly.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulsarClient.pulsarClientStrings.LZ4
  - typingsJapgolly.pulsarClient.pulsarClientStrings.Zlib
*/
trait CompressionType extends js.Object

object CompressionType {
  @scala.inline
  def LZ4: typingsJapgolly.pulsarClient.pulsarClientStrings.LZ4 = this.cast("LZ4")
  @scala.inline
  def Zlib: typingsJapgolly.pulsarClient.pulsarClientStrings.Zlib = this.cast("Zlib")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


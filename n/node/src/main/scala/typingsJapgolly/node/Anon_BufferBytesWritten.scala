package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferBytesWritten extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8Array
  var bytesWritten: Double
}

object Anon_BufferBytesWritten {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint8Array, bytesWritten: Double): Anon_BufferBytesWritten = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BufferBytesWritten]
  }
}


package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8Array
  var bytesWritten: Double
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Uint8Array, bytesWritten: Double): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuffer]
  }
}


package typingsJapgolly.promiseFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBufferInt8Array extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Int8Array
  var bytesRead: Double
}

object AnonBufferInt8Array {
  @scala.inline
  def apply(buffer: scala.scalajs.js.typedarray.Int8Array, bytesRead: Double): AnonBufferInt8Array = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBufferInt8Array]
  }
}


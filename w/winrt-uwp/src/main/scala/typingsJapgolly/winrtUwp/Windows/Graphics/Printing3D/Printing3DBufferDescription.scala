package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies how to parse data in the buffer. */
trait Printing3DBufferDescription extends js.Object {
  /** Specifies the format used by the buffer. */
  var format: Printing3DBufferFormat
  /** Specifies how far to move the pointer forward to find the next unit of data. */
  var stride: Double
}

object Printing3DBufferDescription {
  @scala.inline
  def apply(format: Printing3DBufferFormat, stride: Double): Printing3DBufferDescription = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Printing3DBufferDescription]
  }
}


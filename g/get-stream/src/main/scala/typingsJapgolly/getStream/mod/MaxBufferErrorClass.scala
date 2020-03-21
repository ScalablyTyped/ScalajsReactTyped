package typingsJapgolly.getStream.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxBufferErrorClass extends Error {
  @JSName("name")
  val name_MaxBufferErrorClass: typingsJapgolly.getStream.getStreamStrings.MaxBufferError
}

object MaxBufferErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.getStream.getStreamStrings.MaxBufferError,
    stack: String = null
  ): MaxBufferErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxBufferErrorClass]
  }
}


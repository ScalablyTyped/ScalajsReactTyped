package typingsJapgolly.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorsContainer[T] extends js.Object {
  var decorators: js.Array[T]
}

object DecoratorsContainer {
  @scala.inline
  def apply[T](decorators: js.Array[T]): DecoratorsContainer[T] = {
    val __obj = js.Dynamic.literal(decorators = decorators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecoratorsContainer[T]]
  }
}


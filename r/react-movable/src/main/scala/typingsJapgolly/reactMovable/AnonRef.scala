package typingsJapgolly.reactMovable

import japgolly.scalajs.react.raw.React.RefHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRef extends js.Object {
  var ref: RefHandle[_]
}

object AnonRef {
  @scala.inline
  def apply(ref: RefHandle[_]): AnonRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRef]
  }
}


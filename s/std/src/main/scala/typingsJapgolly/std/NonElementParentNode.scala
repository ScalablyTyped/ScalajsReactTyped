package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonElementParentNode extends js.Object {
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  def getElementById(elementId: java.lang.String): org.scalajs.dom.raw.Element | Null
}

object NonElementParentNode {
  @scala.inline
  def apply(getElementById: java.lang.String => CallbackTo[org.scalajs.dom.raw.Element | Null]): NonElementParentNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElementById")(js.Any.fromFunction1((t0: java.lang.String) => getElementById(t0).runNow()))
    __obj.asInstanceOf[NonElementParentNode]
  }
}


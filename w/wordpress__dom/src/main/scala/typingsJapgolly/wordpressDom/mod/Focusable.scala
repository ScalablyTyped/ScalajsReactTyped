package typingsJapgolly.wordpressDom.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focusable extends js.Object {
  def find(context: ParentNode): js.Array[Element]
}

object Focusable {
  @scala.inline
  def apply(find: ParentNode => CallbackTo[js.Array[Element]]): Focusable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.ParentNode) => find(t0).runNow()))
    __obj.asInstanceOf[Focusable]
  }
}


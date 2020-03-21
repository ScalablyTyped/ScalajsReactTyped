package typingsJapgolly.tinymce.mod.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moveable extends js.Object {
  def moveRel(elm: Node, rel: String): Control
}

object Moveable {
  @scala.inline
  def apply(moveRel: (Node, String) => CallbackTo[Control]): Moveable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moveRel")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: java.lang.String) => moveRel(t0, t1).runNow()))
    __obj.asInstanceOf[Moveable]
  }
}


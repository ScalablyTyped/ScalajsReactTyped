package typingsJapgolly.tinymce.mod.dom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tinymce.mod.html.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeWalker extends js.Object {
  def current(): Node
  def next(): Node
  def prev(): Node
}

object TreeWalker {
  @scala.inline
  def apply(current: CallbackTo[Node], next: CallbackTo[Node], prev: CallbackTo[Node]): TreeWalker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("prev")(prev.toJsFn)
    __obj.asInstanceOf[TreeWalker]
  }
}


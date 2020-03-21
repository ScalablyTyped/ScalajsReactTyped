package typingsJapgolly.atom.linterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackSolution extends js.Object {
  var position: Range
  var priority: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  // tslint:disable-next-line:no-any
  @JSName("apply")
  def apply(): js.Any
}

object CallbackSolution {
  @scala.inline
  def apply(apply: CallbackTo[js.Any], position: Range, priority: Int | Double = null, title: String = null): CallbackSolution = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(apply.toJsFn)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackSolution]
  }
}


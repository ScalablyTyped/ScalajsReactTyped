package typingsJapgolly.knockoutPreRendered.KnockoutComponentTypes

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.knockoutPreRendered.AnonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var createViewModel: js.UndefOr[js.Function2[/* params */ js.Any, /* options */ AnonElement, _]] = js.undefined
  var template: js.Array[Node]
}

object Definition {
  @scala.inline
  def apply(
    template: js.Array[Node],
    createViewModel: (/* params */ js.Any, /* options */ AnonElement) => CallbackTo[js.Any] = null
  ): Definition = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(js.Any.fromFunction2((t0: /* params */ js.Any, t1: /* options */ typingsJapgolly.knockoutPreRendered.AnonElement) => createViewModel(t0, t1).runNow()))
    __obj.asInstanceOf[Definition]
  }
}


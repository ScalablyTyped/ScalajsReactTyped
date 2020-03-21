package typingsJapgolly.loadableComponent

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren[TModule] extends js.Object {
  var children: js.UndefOr[js.Function1[/* module */ TModule, Node]] = js.undefined
  var fallback: js.UndefOr[Element] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply[TModule](
    children: /* module */ TModule => CallbackTo[Node] = null,
    fallback: VdomElement = null,
    ref: Ref = null
  ): AnonChildren[TModule] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* module */ TModule) => children(t0).runNow()))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawElement.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren[TModule]]
  }
}


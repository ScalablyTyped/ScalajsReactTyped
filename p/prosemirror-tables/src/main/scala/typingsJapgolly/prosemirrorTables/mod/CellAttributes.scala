package typingsJapgolly.prosemirrorTables.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellAttributes extends js.Object {
  var default: js.Any
  var getFromDOM: js.UndefOr[typingsJapgolly.prosemirrorTables.mod.getFromDOM] = js.undefined
  var setDOMAttr: js.UndefOr[typingsJapgolly.prosemirrorTables.mod.setDOMAttr] = js.undefined
}

object CellAttributes {
  @scala.inline
  def apply(
    default: js.Any,
    getFromDOM: /* dom */ Element => CallbackTo[js.Any] = null,
    setDOMAttr: (/* value */ js.Any, /* attrs */ js.Any) => CallbackTo[js.Any] = null
  ): CellAttributes = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (getFromDOM != null) __obj.updateDynamic("getFromDOM")(js.Any.fromFunction1((t0: /* dom */ org.scalajs.dom.raw.Element) => getFromDOM(t0).runNow()))
    if (setDOMAttr != null) __obj.updateDynamic("setDOMAttr")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* attrs */ js.Any) => setDOMAttr(t0, t1).runNow()))
    __obj.asInstanceOf[CellAttributes]
  }
}


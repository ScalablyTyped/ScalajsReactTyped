package typingsJapgolly.slateHtmlSerializer.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import typingsJapgolly.std.ChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var deserialize: js.UndefOr[
    js.Function2[
      /* el */ Element, 
      /* next */ js.Function1[/* elements */ (js.Array[(Node with ChildNode) | Element]) | NodeList, _], 
      _
    ]
  ] = js.undefined
  var serialize: js.UndefOr[
    js.Function2[/* obj */ js.Any, /* children */ String, japgolly.scalajs.react.raw.React.Node]
  ] = js.undefined
}

object Rule {
  @scala.inline
  def apply(
    deserialize: (/* el */ Element, /* next */ js.Function1[/* elements */ (js.Array[(Node with ChildNode) | Element]) | NodeList, js.Any]) => CallbackTo[js.Any] = null,
    serialize: (/* obj */ js.Any, /* children */ String) => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null
  ): Rule = {
    val __obj = js.Dynamic.literal()
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction2((t0: /* el */ org.scalajs.dom.raw.Element, t1: /* next */ js.Function1[
  /* elements */ (js.Array[
    (org.scalajs.dom.raw.Node with typingsJapgolly.std.ChildNode) | org.scalajs.dom.raw.Element
  ]) | org.scalajs.dom.raw.NodeList, 
  js.Any]) => deserialize(t0, t1).runNow()))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction2((t0: /* obj */ js.Any, t1: /* children */ java.lang.String) => serialize(t0, t1).runNow()))
    __obj.asInstanceOf[Rule]
  }
}


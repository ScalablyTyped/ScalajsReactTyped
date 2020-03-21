package typingsJapgolly.reactFromDom.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends js.Object {
  var post: js.UndefOr[
    js.Function3[
      /* node */ Node, 
      /* key */ String, 
      /* level */ Double, 
      japgolly.scalajs.react.raw.React.Node
    ]
  ] = js.undefined
  var pre: js.UndefOr[js.Function3[/* node */ Node, /* key */ String, /* level */ Double, Node]] = js.undefined
  def condition(node: Node, key: String, level: Double): Boolean
}

object IAction {
  @scala.inline
  def apply(
    condition: (Node, String, Double) => CallbackTo[Boolean],
    post: (/* node */ Node, /* key */ String, /* level */ Double) => CallbackTo[japgolly.scalajs.react.raw.React.Node] = null,
    pre: (/* node */ Node, /* key */ String, /* level */ Double) => CallbackTo[Node] = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("condition")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Node, t1: java.lang.String, t2: scala.Double) => condition(t0, t1, t2).runNow()))
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction3((t0: /* node */ org.scalajs.dom.raw.Node, t1: /* key */ java.lang.String, t2: /* level */ scala.Double) => post(t0, t1, t2).runNow()))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction3((t0: /* node */ org.scalajs.dom.raw.Node, t1: /* key */ java.lang.String, t2: /* level */ scala.Double) => pre(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IAction]
  }
}


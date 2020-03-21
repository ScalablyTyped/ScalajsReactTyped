package typingsJapgolly.reactMove.nodeGroupMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactMove.mod.GetInterpolator
import typingsJapgolly.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeGroupProps extends js.Object {
  var data: js.Array[_]
  var enter: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  var interpolation: js.UndefOr[GetInterpolator] = js.undefined
  var leave: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  var update: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.undefined
  def children(nodes: js.Array[_]): Element
  def keyAccessor(data: js.Any, index: Double): String | Double
  def start(data: js.Any, index: Double): HashMap
}

object INodeGroupProps {
  @scala.inline
  def apply(
    children: js.Array[js.Any] => CallbackTo[Element],
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => CallbackTo[String | Double],
    start: (js.Any, Double) => CallbackTo[HashMap],
    enter: (/* data */ js.Any, /* index */ Double) => CallbackTo[HashMap | js.Array[HashMap]] = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[js.Function1[/* t */ Double, js.Any]] = null,
    leave: (/* data */ js.Any, /* index */ Double) => CallbackTo[HashMap | js.Array[HashMap]] = null,
    update: (/* data */ js.Any, /* index */ Double) => CallbackTo[HashMap | js.Array[HashMap]] = null
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: js.Array[js.Any]) => children(t0).runNow()))
    __obj.updateDynamic("keyAccessor")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => keyAccessor(t0, t1).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => start(t0, t1).runNow()))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => enter(t0, t1).runNow()))
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4((t0: /* begValue */ js.UndefOr[js.Any], t1: /* endValue */ js.UndefOr[js.Any], t2: /* attr */ js.UndefOr[java.lang.String], t3: /* namespace */ js.UndefOr[java.lang.String]) => interpolation(t0, t1, t2, t3).runNow()))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => leave(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => update(t0, t1).runNow()))
    __obj.asInstanceOf[INodeGroupProps]
  }
}


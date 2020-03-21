package typingsJapgolly.estraverse.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.estraverse.estraverseStrings.iteration
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  var enter: js.UndefOr[
    js.Function2[/* node */ Node, /* parentNode */ Node | Null, VisitorOption | Node | Unit]
  ] = js.undefined
  var fallback: js.UndefOr[iteration | (js.Function1[/* node */ Node, js.Array[String]])] = js.undefined
  var keys: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var leave: js.UndefOr[
    js.Function2[/* node */ Node, /* parentNode */ Node | Null, VisitorOption | Node | Unit]
  ] = js.undefined
}

object Visitor {
  @scala.inline
  def apply(
    enter: (/* node */ Node, /* parentNode */ Node | Null) => CallbackTo[VisitorOption | Node | Unit] = null,
    fallback: iteration | (js.Function1[/* node */ Node, js.Array[String]]) = null,
    keys: StringDictionary[js.Array[String]] = null,
    leave: (/* node */ Node, /* parentNode */ Node | Null) => CallbackTo[VisitorOption | Node | Unit] = null
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.estree.mod.Node, t1: /* parentNode */ typingsJapgolly.estree.mod.Node | scala.Null) => enter(t0, t1).runNow()))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.estree.mod.Node, t1: /* parentNode */ typingsJapgolly.estree.mod.Node | scala.Null) => leave(t0, t1).runNow()))
    __obj.asInstanceOf[Visitor]
  }
}


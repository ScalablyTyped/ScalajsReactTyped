package typingsJapgolly.javascriptObfuscator.ivisitorMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.estraverse.mod.VisitorOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisitor[T /* <: Node */] extends js.Object {
  var enter: js.UndefOr[
    js.Function2[/* node */ T, /* parentNode */ Node | Null, Node | VisitorOption | Unit]
  ] = js.undefined
  var leave: js.UndefOr[
    js.Function2[/* node */ T, /* parentNode */ Node | Null, Node | VisitorOption | Unit]
  ] = js.undefined
}

object IVisitor {
  @scala.inline
  def apply[T /* <: Node */](
    enter: (/* node */ T, /* parentNode */ Node | Null) => CallbackTo[Node | VisitorOption | Unit] = null,
    leave: (/* node */ T, /* parentNode */ Node | Null) => CallbackTo[Node | VisitorOption | Unit] = null
  ): IVisitor[T] = {
    val __obj = js.Dynamic.literal()
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2((t0: /* node */ T, t1: /* parentNode */ org.scalajs.dom.raw.Node | scala.Null) => enter(t0, t1).runNow()))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction2((t0: /* node */ T, t1: /* parentNode */ org.scalajs.dom.raw.Node | scala.Null) => leave(t0, t1).runNow()))
    __obj.asInstanceOf[IVisitor[T]]
  }
}


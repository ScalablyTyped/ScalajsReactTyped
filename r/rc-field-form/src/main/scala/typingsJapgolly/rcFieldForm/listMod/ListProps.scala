package typingsJapgolly.rcFieldForm.listMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.rcFieldForm.interfaceMod.NamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends js.Object {
  var children: js.UndefOr[
    js.Function2[/* fields */ js.Array[ListField], /* operations */ ListOperations, Element | Node]
  ] = js.undefined
  var name: NamePath
}

object ListProps {
  @scala.inline
  def apply(
    name: NamePath,
    children: (/* fields */ js.Array[ListField], /* operations */ ListOperations) => CallbackTo[Element | Node] = null
  ): ListProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction2((t0: /* fields */ js.Array[typingsJapgolly.rcFieldForm.listMod.ListField], t1: /* operations */ typingsJapgolly.rcFieldForm.listMod.ListOperations) => children(t0, t1).runNow()))
    __obj.asInstanceOf[ListProps]
  }
}


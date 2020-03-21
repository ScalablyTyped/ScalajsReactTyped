package typingsJapgolly.antd.formListMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormListProps extends js.Object {
  var name: String | Double | (js.Array[String | Double])
  def children(fields: js.Array[FieldData], operation: Operation): Node
}

object FormListProps {
  @scala.inline
  def apply(
    children: (js.Array[FieldData], Operation) => CallbackTo[Node],
    name: String | Double | (js.Array[String | Double])
  ): FormListProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.antd.formListMod.FieldData], t1: typingsJapgolly.antd.formListMod.Operation) => children(t0, t1).runNow()))
    __obj.asInstanceOf[FormListProps]
  }
}


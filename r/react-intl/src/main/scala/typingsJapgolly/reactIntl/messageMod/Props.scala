package typingsJapgolly.reactIntl.messageMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.reactIntl.typesMod.MessageDescriptor
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[V /* <: Record[String, _] */] extends MessageDescriptor {
  var children: js.UndefOr[js.Function1[/* nodes */ ReactNodeArray, Node]] = js.undefined
  var tagName: js.UndefOr[ElementType] = js.undefined
  var values: js.UndefOr[V] = js.undefined
}

object Props {
  @scala.inline
  def apply[V /* <: Record[String, _] */](
    children: /* nodes */ ReactNodeArray => CallbackTo[Node] = null,
    defaultMessage: String = null,
    description: String | js.Object = null,
    id: String | Double = null,
    tagName: ElementType = null,
    values: V = null
  ): Props[V] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* nodes */ typingsJapgolly.react.mod.ReactNodeArray) => children(t0).runNow()))
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[V]]
  }
}


package typingsJapgolly.reactSelect.componentsMultiValueMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactSelect.AnonClassName
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: Node
  var data: OptionType
  var innerProps: AnonClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: AnonClassName, selectProps: js.Any, children: VdomNode = null): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}


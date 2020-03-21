package typingsJapgolly.reactSelect.componentsSingleValueMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered. */
  var children: Node
  /* The data of the selected option rendered in the Single Value componentn */
  var data: OptionType
  /** Props passed to the wrapping element for the group. */
  var innerProps: js.Any
}

object ValueProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](data: OptionType, innerProps: js.Any, children: VdomNode = null): ValueProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProps[OptionType]]
  }
}


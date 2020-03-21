package typingsJapgolly.antDesignReactNative.flexPropsTypeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexItemPropsType extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object FlexItemPropsType {
  @scala.inline
  def apply(children: VdomNode = null, disabled: js.UndefOr[Boolean] = js.undefined): FlexItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexItemPropsType]
  }
}


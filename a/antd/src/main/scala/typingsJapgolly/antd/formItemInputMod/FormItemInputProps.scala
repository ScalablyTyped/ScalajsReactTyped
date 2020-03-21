package typingsJapgolly.antd.formItemInputMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.gridColMod.ColProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemInputProps extends js.Object {
  var extra: js.UndefOr[Node] = js.undefined
  var help: js.UndefOr[Node] = js.undefined
  var wrapperCol: js.UndefOr[ColProps] = js.undefined
}

object FormItemInputProps {
  @scala.inline
  def apply(extra: VdomNode = null, help: VdomNode = null, wrapperCol: ColProps = null): FormItemInputProps = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.rawNode.asInstanceOf[js.Any])
    if (wrapperCol != null) __obj.updateDynamic("wrapperCol")(wrapperCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemInputProps]
  }
}


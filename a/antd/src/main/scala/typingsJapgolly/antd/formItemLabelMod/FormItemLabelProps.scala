package typingsJapgolly.antd.formItemLabelMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.gridColMod.ColProps
import typingsJapgolly.antd.interfaceMod.FormLabelAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemLabelProps extends js.Object {
  var colon: js.UndefOr[Boolean] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[Node] = js.undefined
  var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
  var labelCol: js.UndefOr[ColProps] = js.undefined
}

object FormItemLabelProps {
  @scala.inline
  def apply(
    colon: js.UndefOr[Boolean] = js.undefined,
    htmlFor: String = null,
    label: VdomNode = null,
    labelAlign: FormLabelAlign = null,
    labelCol: ColProps = null
  ): FormItemLabelProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (labelAlign != null) __obj.updateDynamic("labelAlign")(labelAlign.asInstanceOf[js.Any])
    if (labelCol != null) __obj.updateDynamic("labelCol")(labelCol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormItemLabelProps]
  }
}


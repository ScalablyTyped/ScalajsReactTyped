package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
import typingsJapgolly.materialUiCore.materialUiCoreStrings.none
import typingsJapgolly.materialUiCore.materialUiCoreStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabled extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var filled: js.UndefOr[Boolean] = js.native
  var focused: js.UndefOr[Boolean] = js.native
  var margin: js.UndefOr[dense | none | normal] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var startAdornment: js.UndefOr[Node] = js.native
}

object AnonDisabled {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    margin: dense | none | normal = null,
    required: js.UndefOr[Boolean] = js.undefined,
    startAdornment: VdomNode = null
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(filled)) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}


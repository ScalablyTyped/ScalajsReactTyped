package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.ellipsis
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.mod.DevExpress.viz.Font
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankeyNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHorizontalOffset extends js.Object {
  var border: js.UndefOr[AnonColorVisible] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ dxSankeyNode, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  var overlappingBehavior: js.UndefOr[ellipsis | hide | none] = js.undefined
  var shadow: js.UndefOr[AnonBlur] = js.undefined
  var useNodeColors: js.UndefOr[Boolean] = js.undefined
  var verticalOffset: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonHorizontalOffset {
  @scala.inline
  def apply(
    border: AnonColorVisible = null,
    customizeText: /* itemInfo */ dxSankeyNode => CallbackTo[String] = null,
    font: Font = null,
    horizontalOffset: Int | Double = null,
    overlappingBehavior: ellipsis | hide | none = null,
    shadow: AnonBlur = null,
    useNodeColors: js.UndefOr[Boolean] = js.undefined,
    verticalOffset: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonHorizontalOffset = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* itemInfo */ typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankeyNode) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(useNodeColors)) __obj.updateDynamic("useNodeColors")(useNodeColors.asInstanceOf[js.Any])
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHorizontalOffset]
  }
}


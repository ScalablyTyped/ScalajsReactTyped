package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.breakWord
import typingsJapgolly.devextreme.devextremeStrings.columns
import typingsJapgolly.devextreme.devextremeStrings.ellipsis
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.inside
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.normal
import typingsJapgolly.devextreme.devextremeStrings.outside
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import typingsJapgolly.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnector extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  var connector: js.UndefOr[AnonColorOpacity] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ AnonPercent, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
  var horizontalAlignment: js.UndefOr[left | right] = js.undefined
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[columns | inside | outside] = js.undefined
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object AnonConnector {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: AnonColorDashStyle = null,
    connector: AnonColorOpacity = null,
    customizeText: /* itemInfo */ AnonPercent => CallbackTo[String] = null,
    font: Font = null,
    format: format = null,
    horizontalAlignment: left | right = null,
    horizontalOffset: Int | Double = null,
    position: columns | inside | outside = null,
    showForZeroValues: js.UndefOr[Boolean] = js.undefined,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): AnonConnector = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* itemInfo */ typingsJapgolly.devextreme.AnonPercent) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showForZeroValues)) __obj.updateDynamic("showForZeroValues")(showForZeroValues.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnector]
  }
}


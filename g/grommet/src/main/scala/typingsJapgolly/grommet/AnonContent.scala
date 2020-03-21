package typingsJapgolly.grommet

import typingsJapgolly.grommet.textMod.TextProps
import typingsJapgolly.grommet.utilsMod.BorderType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var border: js.UndefOr[BorderType] = js.undefined
  var content: js.UndefOr[AnonPad] = js.undefined
  var error: js.UndefOr[AnonColorMargin] = js.undefined
  var help: js.UndefOr[AnonColorMargin] = js.undefined
  var label: js.UndefOr[TextProps] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(
    border: BorderType = null,
    content: AnonPad = null,
    error: AnonColorMargin = null,
    help: AnonColorMargin = null,
    label: TextProps = null,
    margin: MarginType = null
  ): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}


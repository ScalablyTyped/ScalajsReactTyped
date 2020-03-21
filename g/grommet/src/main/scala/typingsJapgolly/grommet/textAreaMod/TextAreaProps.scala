package typingsJapgolly.grommet.textAreaMod

import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.grommet.grommetStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends js.Object {
  var fill: js.UndefOr[Boolean] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[vertical | horizontal | Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(
    fill: js.UndefOr[Boolean] = js.undefined,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    placeholder: String = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    resize: vertical | horizontal | Boolean = null,
    size: small | medium | large | xlarge | String = null,
    value: String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaProps]
  }
}


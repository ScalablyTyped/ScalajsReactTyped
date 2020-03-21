package typingsJapgolly.grommet.maskedInputMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.grommet.AnonFixed
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskedInputProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[js.Array[AnonFixed]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ ReactFocusEventFrom[Element], _]] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object MaskedInputProps {
  @scala.inline
  def apply(
    id: String = null,
    mask: js.Array[AnonFixed] = null,
    name: String = null,
    onBlur: /* event */ ReactFocusEventFrom[Element] => CallbackTo[js.Any] = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null,
    value: String | Double = null
  ): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputProps]
  }
}


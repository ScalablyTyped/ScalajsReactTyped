package typingsJapgolly.antd.transferSearchMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferSearchProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handleClear: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TransferSearchProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleClear: /* e */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    onChange: /* e */ ReactEventFrom[HTMLElement] => Callback = null,
    placeholder: String = null,
    prefixCls: String = null,
    value: String = null
  ): TransferSearchProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handleClear != null) __obj.updateDynamic("handleClear")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => handleClear(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onChange(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferSearchProps]
  }
}


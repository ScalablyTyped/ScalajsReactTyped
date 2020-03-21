package typingsJapgolly.antDesignReactNative.textareaItemPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaItemPropsType extends js.Object {
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  var clear: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var labelNumber: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[TextAreaEventHandle] = js.undefined
  var onErrorClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextAreaItemPropsType {
  @scala.inline
  def apply(
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    labelNumber: Int | Double = null,
    maxLength: Int | Double = null,
    name: String = null,
    onChange: /* val */ js.UndefOr[String] => Callback = null,
    onErrorClick: js.UndefOr[Callback] = js.undefined,
    placeholder: String = null,
    rows: Int | Double = null,
    title: VdomNode = null,
    value: String = null
  ): TextAreaItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[java.lang.String]) => onChange(t0).runNow()))
    onErrorClick.foreach(p => __obj.updateDynamic("onErrorClick")(p.toJsFn))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaItemPropsType]
  }
}


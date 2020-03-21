package typingsJapgolly.dropkickjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropkickOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[Node] = js.undefined
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var mobile: js.UndefOr[Boolean] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var selectedIndex: js.UndefOr[Double] = js.undefined
  var selectedOptions: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object DropkickOptions {
  @scala.inline
  def apply(
    change: js.UndefOr[Callback] = js.undefined,
    close: js.UndefOr[Callback] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: Node = null,
    initialize: js.UndefOr[Callback] = js.undefined,
    length: Int | Double = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    open: js.UndefOr[Callback] = js.undefined,
    options: js.Array[String] = null,
    selectedIndex: Int | Double = null,
    selectedOptions: js.Array[String] = null,
    value: String = null
  ): DropkickOptions = {
    val __obj = js.Dynamic.literal()
    change.foreach(p => __obj.updateDynamic("change")(p.toJsFn))
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    initialize.foreach(p => __obj.updateDynamic("initialize")(p.toJsFn))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    open.foreach(p => __obj.updateDynamic("open")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedOptions != null) __obj.updateDynamic("selectedOptions")(selectedOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropkickOptions]
  }
}


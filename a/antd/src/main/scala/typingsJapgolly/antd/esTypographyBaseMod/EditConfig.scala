package typingsJapgolly.antd.esTypographyBaseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditConfig extends js.Object {
  var editing: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object EditConfig {
  @scala.inline
  def apply(
    editing: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Callback = null,
    onStart: js.UndefOr[Callback] = js.undefined
  ): EditConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    onStart.foreach(p => __obj.updateDynamic("onStart")(p.toJsFn))
    __obj.asInstanceOf[EditConfig]
  }
}


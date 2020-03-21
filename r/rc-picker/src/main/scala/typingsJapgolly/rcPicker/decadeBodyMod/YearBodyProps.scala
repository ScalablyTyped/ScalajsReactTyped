package typingsJapgolly.rcPicker.decadeBodyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearBodyProps[DateType] extends js.Object {
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var prefixCls: String
  var viewDate: DateType
  def onSelect(value: DateType): Unit
}

object YearBodyProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onSelect: DateType => Callback,
    prefixCls: String,
    viewDate: DateType,
    disabledDate: /* date */ DateType => CallbackTo[Boolean] = null
  ): YearBodyProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: DateType) => onSelect(t0).runNow()))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* date */ DateType) => disabledDate(t0).runNow()))
    __obj.asInstanceOf[YearBodyProps[DateType]]
  }
}


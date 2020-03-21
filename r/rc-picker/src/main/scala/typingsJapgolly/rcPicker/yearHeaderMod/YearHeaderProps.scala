package typingsJapgolly.rcPicker.yearHeaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var prefixCls: String
  var value: js.UndefOr[DateType | Null] = js.undefined
  var viewDate: DateType
  def onDecadeClick(): Unit
  def onNextDecade(): Unit
  def onPrevDecade(): Unit
}

object YearHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onDecadeClick: Callback,
    onNextDecade: Callback,
    onPrevDecade: Callback,
    prefixCls: String,
    viewDate: DateType,
    value: DateType = null
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onDecadeClick")(onDecadeClick.toJsFn)
    __obj.updateDynamic("onNextDecade")(onNextDecade.toJsFn)
    __obj.updateDynamic("onPrevDecade")(onPrevDecade.toJsFn)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[YearHeaderProps[DateType]]
  }
}


package typingsJapgolly.rcPicker.decadeHeaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YearHeaderProps[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var prefixCls: String
  var viewDate: DateType
  def onNextDecades(): Unit
  def onPrevDecades(): Unit
}

object YearHeaderProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    onNextDecades: Callback,
    onPrevDecades: Callback,
    prefixCls: String,
    viewDate: DateType
  ): YearHeaderProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onNextDecades")(onNextDecades.toJsFn)
    __obj.updateDynamic("onPrevDecades")(onPrevDecades.toJsFn)
    __obj.asInstanceOf[YearHeaderProps[DateType]]
  }
}


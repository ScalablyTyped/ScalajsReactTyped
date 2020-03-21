package typingsJapgolly.rcPicker

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcPicker.generateMod.GenerateConfig
import typingsJapgolly.rcPicker.interfaceMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledDate[DateType] extends js.Object {
  var generateConfig: GenerateConfig[DateType]
  var locale: Locale
  def disabledDate(date: DateType): Boolean
}

object AnonDisabledDate {
  @scala.inline
  def apply[DateType](
    disabledDate: DateType => CallbackTo[Boolean],
    generateConfig: GenerateConfig[DateType],
    locale: Locale
  ): AnonDisabledDate[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: DateType) => disabledDate(t0).runNow()))
    __obj.asInstanceOf[AnonDisabledDate[DateType]]
  }
}


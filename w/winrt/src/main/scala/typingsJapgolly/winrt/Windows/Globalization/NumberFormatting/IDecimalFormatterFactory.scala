package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecimalFormatterFactory extends js.Object {
  def createDecimalFormatter(languages: IIterable[String], geographicRegion: String): DecimalFormatter
}

object IDecimalFormatterFactory {
  @scala.inline
  def apply(createDecimalFormatter: (IIterable[String], String) => CallbackTo[DecimalFormatter]): IDecimalFormatterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createDecimalFormatter")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t1: java.lang.String) => createDecimalFormatter(t0, t1).runNow()))
    __obj.asInstanceOf[IDecimalFormatterFactory]
  }
}


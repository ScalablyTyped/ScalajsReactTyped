package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPercentFormatterFactory extends js.Object {
  def createPercentFormatter(languages: IIterable[String], geographicRegion: String): PercentFormatter
}

object IPercentFormatterFactory {
  @scala.inline
  def apply(createPercentFormatter: (IIterable[String], String) => CallbackTo[PercentFormatter]): IPercentFormatterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createPercentFormatter")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t1: java.lang.String) => createPercentFormatter(t0, t1).runNow()))
    __obj.asInstanceOf[IPercentFormatterFactory]
  }
}


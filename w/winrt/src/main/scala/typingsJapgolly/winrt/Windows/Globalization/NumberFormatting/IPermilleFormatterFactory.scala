package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPermilleFormatterFactory extends js.Object {
  def createPermilleFormatter(languages: IIterable[String], geographicRegion: String): PermilleFormatter
}

object IPermilleFormatterFactory {
  @scala.inline
  def apply(createPermilleFormatter: (IIterable[String], String) => CallbackTo[PermilleFormatter]): IPermilleFormatterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createPermilleFormatter")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String], t1: java.lang.String) => createPermilleFormatter(t0, t1).runNow()))
    __obj.asInstanceOf[IPermilleFormatterFactory]
  }
}


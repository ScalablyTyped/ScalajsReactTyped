package typingsJapgolly.reactIntl

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactIntl.reactIntlStrings.formatDate
import typingsJapgolly.reactIntl.reactIntlStrings.formatTime
import typingsJapgolly.std.Intl.DateTimeFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[Name /* <: formatDate | formatTime */] extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  def children(`val`: js.Array[DateTimeFormatPart]): Element | Null
}

object AnonValue {
  @scala.inline
  def apply[Name /* <: formatDate | formatTime */](
    children: js.Array[DateTimeFormatPart] => CallbackTo[Element | Null],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/types.IntlShape[Name]>[0] */ js.Any
  ): AnonValue[Name] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.std.Intl.DateTimeFormatPart]) => children(t0).runNow()))
    __obj.asInstanceOf[AnonValue[Name]]
  }
}


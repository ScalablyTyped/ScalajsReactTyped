package typingsJapgolly.reactIntl

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.std.Intl.NumberFormatPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  def children(`val`: js.Array[NumberFormatPart]): Element | Null
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[NumberFormatPart] => CallbackTo[Element | Null],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.std.Intl.NumberFormatPart]) => children(t0).runNow()))
    __obj.asInstanceOf[AnonChildren]
  }
}


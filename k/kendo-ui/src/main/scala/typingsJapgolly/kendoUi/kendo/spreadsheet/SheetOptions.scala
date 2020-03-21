package typingsJapgolly.kendoUi.kendo.spreadsheet

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SheetChangeEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object SheetOptions {
  @scala.inline
  def apply(change: /* e */ SheetChangeEvent => Callback = null, name: String = null): SheetOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.spreadsheet.SheetChangeEvent) => change(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetOptions]
  }
}


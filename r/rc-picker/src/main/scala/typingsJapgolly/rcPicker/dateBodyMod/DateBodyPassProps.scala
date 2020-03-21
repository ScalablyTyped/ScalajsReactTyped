package typingsJapgolly.rcPicker.dateBodyMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateBodyPassProps[DateType] extends js.Object {
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, Node]] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
}

object DateBodyPassProps {
  @scala.inline
  def apply[DateType](
    dateRender: (DateType, DateType) => CallbackTo[Node] = null,
    disabledDate: /* date */ DateType => CallbackTo[Boolean] = null,
    prefixColumn: /* date */ DateType => CallbackTo[Node] = null,
    rowClassName: /* date */ DateType => CallbackTo[String] = null
  ): DateBodyPassProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2((t0: DateType, t1: DateType) => dateRender(t0, t1).runNow()))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1((t0: /* date */ DateType) => disabledDate(t0).runNow()))
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1((t0: /* date */ DateType) => prefixColumn(t0).runNow()))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1((t0: /* date */ DateType) => rowClassName(t0).runNow()))
    __obj.asInstanceOf[DateBodyPassProps[DateType]]
  }
}


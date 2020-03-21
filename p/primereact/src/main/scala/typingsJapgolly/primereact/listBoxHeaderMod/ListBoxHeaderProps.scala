package typingsJapgolly.primereact.listBoxHeaderMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxHeaderProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
}

object ListBoxHeaderProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    onFilter: /* e */ AnonValue => Callback = null
  ): ListBoxHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonValue) => onFilter(t0).runNow()))
    __obj.asInstanceOf[ListBoxHeaderProps]
  }
}


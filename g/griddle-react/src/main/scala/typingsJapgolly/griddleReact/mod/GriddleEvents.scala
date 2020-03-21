package typingsJapgolly.griddleReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.griddleReact.mod.utils.SortProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleEvents extends GriddleActions {
  var onFilter: js.UndefOr[js.Function1[/* filterText */ String, Unit]] = js.undefined
  var setSortProperties: js.UndefOr[js.Function1[/* sortProperties */ SortProperties, js.Function0[Unit]]] = js.undefined
}

object GriddleEvents {
  @scala.inline
  def apply(
    onFilter: /* filterText */ String => Callback = null,
    onGetPage: /* pageNumber */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrevious: js.UndefOr[Callback] = js.undefined,
    onSort: /* sortProperties */ js.Any => Callback = null,
    setFilter: /* filter */ GriddleFilter => Callback = null,
    setSortProperties: /* sortProperties */ SortProperties => CallbackTo[js.Function0[Unit]] = null
  ): GriddleEvents = {
    val __obj = js.Dynamic.literal()
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1((t0: /* filterText */ java.lang.String) => onFilter(t0).runNow()))
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(js.Any.fromFunction1((t0: /* pageNumber */ scala.Double) => onGetPage(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrevious.foreach(p => __obj.updateDynamic("onPrevious")(p.toJsFn))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1((t0: /* sortProperties */ js.Any) => onSort(t0).runNow()))
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1((t0: /* filter */ typingsJapgolly.griddleReact.mod.GriddleFilter) => setFilter(t0).runNow()))
    if (setSortProperties != null) __obj.updateDynamic("setSortProperties")(js.Any.fromFunction1((t0: /* sortProperties */ typingsJapgolly.griddleReact.mod.utils.SortProperties) => setSortProperties(t0).runNow()))
    __obj.asInstanceOf[GriddleEvents]
  }
}


package typingsJapgolly.griddleReact.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleActions
  extends PropertyBag[js.UndefOr[ActionCreator[js.Any]]] {
  var onGetPage: js.UndefOr[js.Function1[/* pageNumber */ Double, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPrevious: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSort: js.UndefOr[js.Function1[/* sortProperties */ js.Any, Unit]] = js.undefined
  var setFilter: js.UndefOr[js.Function1[/* filter */ GriddleFilter, Unit]] = js.undefined
}

object GriddleActions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.UndefOr[ActionCreator[js.Any]]] = null,
    onGetPage: /* pageNumber */ Double => Callback = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrevious: js.UndefOr[Callback] = js.undefined,
    onSort: /* sortProperties */ js.Any => Callback = null,
    setFilter: /* filter */ GriddleFilter => Callback = null
  ): GriddleActions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onGetPage != null) __obj.updateDynamic("onGetPage")(js.Any.fromFunction1((t0: /* pageNumber */ scala.Double) => onGetPage(t0).runNow()))
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrevious.foreach(p => __obj.updateDynamic("onPrevious")(p.toJsFn))
    if (onSort != null) __obj.updateDynamic("onSort")(js.Any.fromFunction1((t0: /* sortProperties */ js.Any) => onSort(t0).runNow()))
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1((t0: /* filter */ typingsJapgolly.griddleReact.mod.GriddleFilter) => setFilter(t0).runNow()))
    __obj.asInstanceOf[GriddleActions]
  }
}


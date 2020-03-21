package typingsJapgolly.awesomplete.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.awesomplete.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoFirst: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Function2[/* item */ Suggestion, /* input */ String, String]] = js.undefined
  var filter: js.UndefOr[js.Function2[/* text */ String, /* input */ String, Boolean]] = js.undefined
  var item: js.UndefOr[js.Function2[/* text */ String, /* input */ String, HTMLElement]] = js.undefined
  var list: js.UndefOr[String | (js.Array[AnonValue | String | (js.Tuple2[String, String])]) | Element] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var minChars: js.UndefOr[Double] = js.undefined
  var replace: js.UndefOr[js.Function1[/* suggestion */ String | Suggestion, Unit]] = js.undefined
  var sort: js.UndefOr[Boolean | SortFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoFirst: js.UndefOr[Boolean] = js.undefined,
    data: (/* item */ Suggestion, /* input */ String) => CallbackTo[String] = null,
    filter: (/* text */ String, /* input */ String) => CallbackTo[Boolean] = null,
    item: (/* text */ String, /* input */ String) => CallbackTo[HTMLElement] = null,
    list: String | (js.Array[AnonValue | String | (js.Tuple2[String, String])]) | Element = null,
    maxItems: Int | Double = null,
    minChars: Int | Double = null,
    replace: /* suggestion */ String | Suggestion => Callback = null,
    sort: Boolean | SortFunction = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFirst)) __obj.updateDynamic("autoFirst")(autoFirst.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.awesomplete.mod.Suggestion, t1: /* input */ java.lang.String) => data(t0, t1).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* input */ java.lang.String) => filter(t0, t1).runNow()))
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* input */ java.lang.String) => item(t0, t1).runNow()))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: /* suggestion */ java.lang.String | typingsJapgolly.awesomplete.mod.Suggestion) => replace(t0).runNow()))
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


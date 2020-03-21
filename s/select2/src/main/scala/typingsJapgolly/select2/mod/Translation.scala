package typingsJapgolly.select2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var errorLoading: js.UndefOr[js.Function0[String]] = js.undefined
  var inputTooLong: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.undefined
  var inputTooShort: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.undefined
  var loadingMore: js.UndefOr[js.Function0[String]] = js.undefined
  var maximumSelected: js.UndefOr[js.Function1[/* arg */ TranslationArg, String]] = js.undefined
  var noResults: js.UndefOr[js.Function0[String]] = js.undefined
  var searching: js.UndefOr[js.Function0[String]] = js.undefined
}

object Translation {
  @scala.inline
  def apply(
    errorLoading: js.UndefOr[CallbackTo[String]] = js.undefined,
    inputTooLong: /* arg */ TranslationArg => CallbackTo[String] = null,
    inputTooShort: /* arg */ TranslationArg => CallbackTo[String] = null,
    loadingMore: js.UndefOr[CallbackTo[String]] = js.undefined,
    maximumSelected: /* arg */ TranslationArg => CallbackTo[String] = null,
    noResults: js.UndefOr[CallbackTo[String]] = js.undefined,
    searching: js.UndefOr[CallbackTo[String]] = js.undefined
  ): Translation = {
    val __obj = js.Dynamic.literal()
    errorLoading.foreach(p => __obj.updateDynamic("errorLoading")(p.toJsFn))
    if (inputTooLong != null) __obj.updateDynamic("inputTooLong")(js.Any.fromFunction1((t0: /* arg */ typingsJapgolly.select2.mod.TranslationArg) => inputTooLong(t0).runNow()))
    if (inputTooShort != null) __obj.updateDynamic("inputTooShort")(js.Any.fromFunction1((t0: /* arg */ typingsJapgolly.select2.mod.TranslationArg) => inputTooShort(t0).runNow()))
    loadingMore.foreach(p => __obj.updateDynamic("loadingMore")(p.toJsFn))
    if (maximumSelected != null) __obj.updateDynamic("maximumSelected")(js.Any.fromFunction1((t0: /* arg */ typingsJapgolly.select2.mod.TranslationArg) => maximumSelected(t0).runNow()))
    noResults.foreach(p => __obj.updateDynamic("noResults")(p.toJsFn))
    searching.foreach(p => __obj.updateDynamic("searching")(p.toJsFn))
    __obj.asInstanceOf[Translation]
  }
}


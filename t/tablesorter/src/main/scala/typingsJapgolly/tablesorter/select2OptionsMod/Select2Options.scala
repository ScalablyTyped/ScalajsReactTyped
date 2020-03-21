package typingsJapgolly.tablesorter.select2OptionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.select2.mod.AjaxOptions
import typingsJapgolly.select2.mod.DataFormat
import typingsJapgolly.select2.mod.GroupedDataFormat
import typingsJapgolly.select2.mod.IdTextPair
import typingsJapgolly.select2.mod.LoadingData
import typingsJapgolly.select2.mod.OptGroupData
import typingsJapgolly.select2.mod.OptionData
import typingsJapgolly.select2.mod.Options
import typingsJapgolly.select2.mod.SearchOptions
import typingsJapgolly.select2.mod.Translation
import typingsJapgolly.select2.mod._Global_.JQuery
import typingsJapgolly.select2.select2Strings.ltr
import typingsJapgolly.select2.select2Strings.rtl
import typingsJapgolly.tablesorter.controlOptionsMod.ControlOptions
import typingsJapgolly.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typingsJapgolly.tablesorter.strictOptionsMod.StrictOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Select2Options
  extends Options[DataFormat | GroupedDataFormat, js.Any]
     with ControlOptions
     with StrictOptions
     with DefaultValueOptions[String]

object Select2Options {
  @scala.inline
  def apply(
    ajax: AjaxOptions[DataFormat | GroupedDataFormat, js.Any] = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    amdBase: String = null,
    amdLanguageBase: String = null,
    cellText: String = null,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    containerCss: js.Any = null,
    containerCssClass: String = null,
    createTag: /* params */ SearchOptions => CallbackTo[IdTextPair | Null] = null,
    data: js.Array[DataFormat | GroupedDataFormat] = null,
    dataAdapter: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dir: ltr | rtl = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownAdapter: js.Any = null,
    dropdownAutoWidth: js.UndefOr[Boolean] = js.undefined,
    dropdownCss: js.Any = null,
    dropdownCssClass: String = null,
    dropdownParent: JQuery[HTMLElement] = null,
    escapeMarkup: /* markup */ String => CallbackTo[String] = null,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    initSelection: (/* element */ JQuery[HTMLElement], /* callback */ js.Function1[/* data */ js.Any, Unit]) => Callback = null,
    insertTag: (/* data */ js.Array[OptionData | IdTextPair], /* tag */ IdTextPair) => Callback = null,
    language: String | Translation = null,
    matcher: (/* params */ SearchOptions, /* data */ OptGroupData | OptionData) => CallbackTo[OptGroupData | OptionData | Null] = null,
    maximumInputLength: Int | Double = null,
    maximumSelectionLength: Int | Double = null,
    minimumInputLength: Int | Double = null,
    minimumResultsForSearch: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    placeholder: String | IdTextPair = null,
    resultsAdapter: js.Any = null,
    selectOnClose: js.UndefOr[Boolean] = js.undefined,
    selectionAdapter: js.Any = null,
    sorter: /* data */ js.Array[OptGroupData | OptionData | IdTextPair] => CallbackTo[js.Array[OptGroupData | OptionData | IdTextPair]] = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    templateResult: /* result */ LoadingData | (DataFormat | GroupedDataFormat) => CallbackTo[String | JQuery[HTMLElement] | Null] = null,
    templateSelection: /* selection */ IdTextPair | LoadingData | (DataFormat | GroupedDataFormat) => CallbackTo[String | JQuery[HTMLElement]] = null,
    theme: String = null,
    tokenSeparators: js.Array[String] = null,
    tokenizer: (/* input */ String, /* selection */ js.Array[js.Any], /* selectCallback */ js.Function0[Unit], /* options */ Options[DataFormat | GroupedDataFormat, js.Any]) => CallbackTo[String] = null,
    value: String = null,
    width: String = null
  ): Select2Options = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (amdBase != null) __obj.updateDynamic("amdBase")(amdBase.asInstanceOf[js.Any])
    if (amdLanguageBase != null) __obj.updateDynamic("amdLanguageBase")(amdLanguageBase.asInstanceOf[js.Any])
    if (cellText != null) __obj.updateDynamic("cellText")(cellText.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (containerCss != null) __obj.updateDynamic("containerCss")(containerCss.asInstanceOf[js.Any])
    if (containerCssClass != null) __obj.updateDynamic("containerCssClass")(containerCssClass.asInstanceOf[js.Any])
    if (createTag != null) __obj.updateDynamic("createTag")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.select2.mod.SearchOptions) => createTag(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataAdapter != null) __obj.updateDynamic("dataAdapter")(dataAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownAdapter != null) __obj.updateDynamic("dropdownAdapter")(dropdownAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownAutoWidth)) __obj.updateDynamic("dropdownAutoWidth")(dropdownAutoWidth.asInstanceOf[js.Any])
    if (dropdownCss != null) __obj.updateDynamic("dropdownCss")(dropdownCss.asInstanceOf[js.Any])
    if (dropdownCssClass != null) __obj.updateDynamic("dropdownCssClass")(dropdownCssClass.asInstanceOf[js.Any])
    if (dropdownParent != null) __obj.updateDynamic("dropdownParent")(dropdownParent.asInstanceOf[js.Any])
    if (escapeMarkup != null) __obj.updateDynamic("escapeMarkup")(js.Any.fromFunction1((t0: /* markup */ java.lang.String) => escapeMarkup(t0).runNow()))
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (initSelection != null) __obj.updateDynamic("initSelection")(js.Any.fromFunction2((t0: /* element */ typingsJapgolly.select2.mod._Global_.JQuery[org.scalajs.dom.raw.HTMLElement], t1: /* callback */ js.Function1[/* data */ js.Any, scala.Unit]) => initSelection(t0, t1).runNow()))
    if (insertTag != null) __obj.updateDynamic("insertTag")(js.Any.fromFunction2((t0: /* data */ js.Array[typingsJapgolly.select2.mod.OptionData | typingsJapgolly.select2.mod.IdTextPair], t1: /* tag */ typingsJapgolly.select2.mod.IdTextPair) => insertTag(t0, t1).runNow()))
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2((t0: /* params */ typingsJapgolly.select2.mod.SearchOptions, t1: /* data */ typingsJapgolly.select2.mod.OptGroupData | typingsJapgolly.select2.mod.OptionData) => matcher(t0, t1).runNow()))
    if (maximumInputLength != null) __obj.updateDynamic("maximumInputLength")(maximumInputLength.asInstanceOf[js.Any])
    if (maximumSelectionLength != null) __obj.updateDynamic("maximumSelectionLength")(maximumSelectionLength.asInstanceOf[js.Any])
    if (minimumInputLength != null) __obj.updateDynamic("minimumInputLength")(minimumInputLength.asInstanceOf[js.Any])
    if (minimumResultsForSearch != null) __obj.updateDynamic("minimumResultsForSearch")(minimumResultsForSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (resultsAdapter != null) __obj.updateDynamic("resultsAdapter")(resultsAdapter.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOnClose)) __obj.updateDynamic("selectOnClose")(selectOnClose.asInstanceOf[js.Any])
    if (selectionAdapter != null) __obj.updateDynamic("selectionAdapter")(selectionAdapter.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(js.Any.fromFunction1((t0: /* data */ js.Array[
  typingsJapgolly.select2.mod.OptGroupData | typingsJapgolly.select2.mod.OptionData | typingsJapgolly.select2.mod.IdTextPair]) => sorter(t0).runNow()))
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateResult != null) __obj.updateDynamic("templateResult")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.select2.mod.LoadingData | (typingsJapgolly.select2.mod.DataFormat | typingsJapgolly.select2.mod.GroupedDataFormat)) => templateResult(t0).runNow()))
    if (templateSelection != null) __obj.updateDynamic("templateSelection")(js.Any.fromFunction1((t0: /* selection */ typingsJapgolly.select2.mod.IdTextPair | typingsJapgolly.select2.mod.LoadingData | (typingsJapgolly.select2.mod.DataFormat | typingsJapgolly.select2.mod.GroupedDataFormat)) => templateSelection(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tokenSeparators != null) __obj.updateDynamic("tokenSeparators")(tokenSeparators.asInstanceOf[js.Any])
    if (tokenizer != null) __obj.updateDynamic("tokenizer")(js.Any.fromFunction4((t0: /* input */ java.lang.String, t1: /* selection */ js.Array[js.Any], t2: /* selectCallback */ js.Function0[scala.Unit], t3: /* options */ typingsJapgolly.select2.mod.Options[
  typingsJapgolly.select2.mod.DataFormat | typingsJapgolly.select2.mod.GroupedDataFormat, 
  js.Any]) => tokenizer(t0, t1, t2, t3).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select2Options]
  }
}


package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncTypeaheadProps[T /* <: TypeaheadModel */] extends TypeaheadProps[T] {
  /* 	Delay, in milliseconds, before performing search. */
  var delay: js.UndefOr[Double] = js.undefined
  /* Whether or not a request is currently pending. Necessary for the component to know when new results are available. */
  @JSName("isLoading")
  var isLoading_AsyncTypeaheadProps: Boolean
  /* Message displayed in the menu when there is no user input. */
  var promptText: js.UndefOr[Node] = js.undefined
  /* Message to display in the menu while the request is pending. */
  var searchText: js.UndefOr[Node] = js.undefined
  /* Whether or not the component should cache query results. */
  var useCache: js.UndefOr[Boolean] = js.undefined
  /* Callback to perform when the search is executed. */
  def onSearch(query: String): Unit
}

object AsyncTypeaheadProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    isLoading: Boolean,
    onSearch: String => Callback,
    options: js.Array[T],
    a11yNumResults: js.UndefOr[Callback] = js.undefined,
    a11yNumSelected: js.UndefOr[Callback] = js.undefined,
    align: TypeaheadAlign = null,
    allowNew: Boolean | (js.Function2[/* results */ js.Array[T], /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean]) = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    bodyContainer: js.UndefOr[Boolean] = js.undefined,
    bsSize: TypeaheadBsSizes = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    defaultInputValue: String = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultSelected: js.Array[T] = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropup: js.UndefOr[Boolean] = js.undefined,
    emptyLabel: String = null,
    filterBy: js.Array[String] | (js.Function2[T, /* props */ AllTypeaheadOwnAndInjectedProps[T], Boolean]) = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    highlightOnlyResult: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    ignoreDiacritics: js.UndefOr[Boolean] = js.undefined,
    inputProps: InputProps = null,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isValid: js.UndefOr[Boolean] = js.undefined,
    labelKey: TypeaheadLabelKey[T] = null,
    maxHeight: String = null,
    maxResults: Int | Double = null,
    menuId: String = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    newSelectionPrefix: String = null,
    onBlur: /* e */ Event_ => Callback = null,
    onChange: /* selected */ js.Array[T] => Callback = null,
    onFocus: /* e */ Event_ => Callback = null,
    onInputChange: (/* input */ String, /* e */ Event_) => Callback = null,
    onKeyDown: /* e */ Event_ => Callback = null,
    onMenuHide: js.UndefOr[Callback] = js.undefined,
    onMenuShow: js.UndefOr[Callback] = js.undefined,
    onMenuToggle: /* show */ Boolean => Callback = null,
    onPaginate: (/* e */ Event_, /* numResults */ Double) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    paginate: js.UndefOr[Boolean] = js.undefined,
    paginationText: String = null,
    placeholder: String = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    promptText: VdomNode = null,
    renderMenu: (/* results */ js.Array[TypeaheadResult[T]], /* menuProps */ js.Any) => CallbackTo[Node] = null,
    renderMenuItemChildren: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => CallbackTo[Node] = null,
    renderToken: (T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => CallbackTo[Node] = null,
    searchText: VdomNode = null,
    selectHintOnEnter: js.UndefOr[Boolean] = js.undefined,
    selected: js.Array[T] = null,
    useCache: js.UndefOr[Boolean] = js.undefined
  ): AsyncTypeaheadProps[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: java.lang.String) => onSearch(t0).runNow()))
    a11yNumResults.foreach(p => __obj.updateDynamic("a11yNumResults")(p.toJsFn))
    a11yNumSelected.foreach(p => __obj.updateDynamic("a11yNumSelected")(p.toJsFn))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (allowNew != null) __obj.updateDynamic("allowNew")(allowNew.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyContainer)) __obj.updateDynamic("bodyContainer")(bodyContainer.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropup)) __obj.updateDynamic("dropup")(dropup.asInstanceOf[js.Any])
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightOnlyResult)) __obj.updateDynamic("highlightOnlyResult")(highlightOnlyResult.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDiacritics)) __obj.updateDynamic("ignoreDiacritics")(ignoreDiacritics.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (newSelectionPrefix != null) __obj.updateDynamic("newSelectionPrefix")(newSelectionPrefix.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* selected */ js.Array[T]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2((t0: /* input */ java.lang.String, t1: /* e */ typingsJapgolly.std.Event_) => onInputChange(t0, t1).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onKeyDown(t0).runNow()))
    onMenuHide.foreach(p => __obj.updateDynamic("onMenuHide")(p.toJsFn))
    onMenuShow.foreach(p => __obj.updateDynamic("onMenuShow")(p.toJsFn))
    if (onMenuToggle != null) __obj.updateDynamic("onMenuToggle")(js.Any.fromFunction1((t0: /* show */ scala.Boolean) => onMenuToggle(t0).runNow()))
    if (onPaginate != null) __obj.updateDynamic("onPaginate")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.std.Event_, t1: /* numResults */ scala.Double) => onPaginate(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (paginationText != null) __obj.updateDynamic("paginationText")(paginationText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.asInstanceOf[js.Any])
    if (promptText != null) __obj.updateDynamic("promptText")(promptText.rawNode.asInstanceOf[js.Any])
    if (renderMenu != null) __obj.updateDynamic("renderMenu")(js.Any.fromFunction2((t0: /* results */ js.Array[typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadResult[T]], t1: /* menuProps */ js.Any) => renderMenu(t0, t1).runNow()))
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3((t0: /* option */ typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadResult[T], t1: /* props */ typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T], t2: /* index */ scala.Double) => renderMenuItemChildren(t0, t1, t2).runNow()))
    if (renderToken != null) __obj.updateDynamic("renderToken")(js.Any.fromFunction3((t0: T, t1: /* props */ typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T], t2: /* index */ scala.Double) => renderToken(t0, t1, t2).runNow()))
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectHintOnEnter)) __obj.updateDynamic("selectHintOnEnter")(selectHintOnEnter.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncTypeaheadProps[T]]
  }
}


package typingsJapgolly.semanticUiReact.searchSearchMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.inputInputMod.InputProps
import typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsJapgolly.semanticUiReact.searchResultMod.SearchResultProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.huge
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.massive
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.mini
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSearchProps extends js.Object {
  // ------------------------------------
  // Style
  // ------------------------------------
  /** A search can have its results aligned to its left or right container edge. */
  var aligned: js.UndefOr[String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A search can display results from remote content ordered by categories. */
  var category: js.UndefOr[Boolean] = js.undefined
  // ------------------------------------
  // Rendering
  // ------------------------------------
  /**
    * Renders the SearchCategory layout.
    *
    * @param {object} categoryContent - The Renderable SearchCategory contents.
    * @param {object} resultsContent - The Renderable SearchResult contents.
    * @returns {*} - Renderable SearchCategory layout.
    */
  var categoryLayoutRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, Element]] = js.undefined
  /**
    * Renders the SearchCategory contents.
    *
    * @param {object} props - The SearchCategory props object.
    * @returns {*} - Renderable SearchCategory contents.
    */
  var categoryRenderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, Element]] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  // ------------------------------------
  // Behavior
  // ------------------------------------
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  /** Initial value. */
  var defaultValue: js.UndefOr[String] = js.undefined
  /** A search can have its results take up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** Shorthand for input element. */
  var input: js.UndefOr[SemanticShorthandItem[InputProps]] = js.undefined
  /** A search can show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.undefined
  /** Minimum characters to query for results. */
  var minCharacters: js.UndefOr[Double] = js.undefined
  /** Additional text for "No Results" message with less emphasis. */
  var noResultsDescription: js.UndefOr[Node] = js.undefined
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[Node] = js.undefined
  // ------------------------------------
  // Callbacks
  // ------------------------------------
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.undefined
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.undefined
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.undefined
  /**
    * Called when a result is selected.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onResultSelect: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultData, Unit]
  ] = js.undefined
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of search input.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps, Unit]
  ] = js.undefined
  /**
    * Called when the active selection index is changed.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onSelectionChange: js.UndefOr[
    js.Function2[/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchResultData, Unit]
  ] = js.undefined
  /** Controls whether or not the results menu is displayed. */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Renders the SearchResult contents.
    *
    * @param {object} props - The SearchResult props object.
    * @returns {*} - Renderable SearchResult contents.
    */
  var resultRenderer: js.UndefOr[js.Function1[/* props */ SearchResultProps, Element]] = js.undefined
  /**
    * One of:
    * - array of Search.Result props e.g. `{ title: '', description: '' }` or
    * - object of categories e.g. `{ name: '', results: [{ title: '', description: '' }]`
    */
  var results: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  /** Whether the search should automatically select the first result after searching. */
  var selectFirstResult: js.UndefOr[Boolean] = js.undefined
  /** Whether a "no results" message should be shown if no results are found. */
  var showNoResults: js.UndefOr[Boolean] = js.undefined
  /** A search can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
  /** Current value of the search input. Creates a controlled component. */
  var value: js.UndefOr[String] = js.undefined
}

object StrictSearchProps {
  @scala.inline
  def apply(
    aligned: String = null,
    as: js.Any = null,
    category: js.UndefOr[Boolean] = js.undefined,
    categoryLayoutRenderer: /* props */ SearchCategoryProps => CallbackTo[Element] = null,
    categoryRenderer: /* props */ SearchCategoryProps => CallbackTo[Element] = null,
    className: String = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any = null,
    input: SemanticShorthandItem[InputProps] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    minCharacters: Int | Double = null,
    noResultsDescription: VdomNode = null,
    noResultsMessage: VdomNode = null,
    onBlur: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback = null,
    onFocus: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback = null,
    onMouseDown: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback = null,
    onResultSelect: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ SearchResultData) => Callback = null,
    onSearchChange: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchProps) => Callback = null,
    onSelectionChange: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ SearchResultData) => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    resultRenderer: /* props */ SearchResultProps => CallbackTo[Element] = null,
    results: js.Array[_] | js.Object = null,
    selectFirstResult: js.UndefOr[Boolean] = js.undefined,
    showNoResults: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    value: String = null
  ): StrictSearchProps = {
    val __obj = js.Dynamic.literal()
    if (aligned != null) __obj.updateDynamic("aligned")(aligned.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (categoryLayoutRenderer != null) __obj.updateDynamic("categoryLayoutRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps) => categoryLayoutRenderer(t0).runNow()))
    if (categoryRenderer != null) __obj.updateDynamic("categoryRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticUiReact.searchCategoryMod.SearchCategoryProps) => categoryRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (minCharacters != null) __obj.updateDynamic("minCharacters")(minCharacters.asInstanceOf[js.Any])
    if (noResultsDescription != null) __obj.updateDynamic("noResultsDescription")(noResultsDescription.rawNode.asInstanceOf[js.Any])
    if (noResultsMessage != null) __obj.updateDynamic("noResultsMessage")(noResultsMessage.rawNode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.searchSearchMod.SearchProps) => onBlur(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.searchSearchMod.SearchProps) => onFocus(t0, t1).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.searchSearchMod.SearchProps) => onMouseDown(t0, t1).runNow()))
    if (onResultSelect != null) __obj.updateDynamic("onResultSelect")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* data */ typingsJapgolly.semanticUiReact.searchSearchMod.SearchResultData) => onResultSelect(t0, t1).runNow()))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.searchSearchMod.SearchProps) => onSearchChange(t0, t1).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.searchSearchMod.SearchResultData) => onSelectionChange(t0, t1).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (resultRenderer != null) __obj.updateDynamic("resultRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.semanticUiReact.searchResultMod.SearchResultProps) => resultRenderer(t0).runNow()))
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(selectFirstResult)) __obj.updateDynamic("selectFirstResult")(selectFirstResult.asInstanceOf[js.Any])
    if (!js.isUndefined(showNoResults)) __obj.updateDynamic("showNoResults")(showNoResults.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSearchProps]
  }
}


package typingsJapgolly.semanticUiReact.searchSearchMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
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

trait SearchProps
  extends StrictSearchProps
     with /* key */ StringDictionary[js.Any]

object SearchProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
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
  ): SearchProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[SearchProps]
  }
}


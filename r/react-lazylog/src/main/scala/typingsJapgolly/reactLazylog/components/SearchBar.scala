package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLazylog.searchBarMod.SearchBarProps
import typingsJapgolly.reactLazylog.searchBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterActive: js.UndefOr[Boolean] = js.undefined,
    onClearSearch: js.UndefOr[Callback] = js.undefined,
    onFilterLinesWithMatches: /* isFiltered */ Boolean => Callback = null,
    onSearch: /* keyword */ String => Callback = null,
    resultsCount: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SearchBarProps, default, Unit, SearchBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(filterActive)) __obj.updateDynamic("filterActive")(filterActive.asInstanceOf[js.Any])
    onClearSearch.foreach(p => __obj.updateDynamic("onClearSearch")(p.toJsFn))
    if (onFilterLinesWithMatches != null) __obj.updateDynamic("onFilterLinesWithMatches")(js.Any.fromFunction1((t0: /* isFiltered */ scala.Boolean) => onFilterLinesWithMatches(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* keyword */ java.lang.String) => onSearch(t0).runNow()))
    if (resultsCount != null) __obj.updateDynamic("resultsCount")(resultsCount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.searchBarMod.SearchBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.searchBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.searchBarMod.SearchBarProps])(children: _*)
  }
  @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}


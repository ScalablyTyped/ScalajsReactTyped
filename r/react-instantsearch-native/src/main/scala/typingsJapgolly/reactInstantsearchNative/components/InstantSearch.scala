package typingsJapgolly.reactInstantsearchNative.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInstantsearchNative.AnonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InstantSearch {
  def UsingSearchClientProps(
    indexName: String,
    searchClient: js.Any,
    createURL: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchParameters: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchStateChange: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: AnonProps = null,
    searchState: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactInstantsearchNative.mod.UsingSearchClientProps, 
    typingsJapgolly.reactInstantsearchNative.mod.InstantSearch, 
    Unit, 
    typingsJapgolly.reactInstantsearchNative.mod.UsingSearchClientProps
  ] = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
  
      if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchParameters(t0).runNow()))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchStateChange(t0).runNow()))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInstantsearchNative.mod.UsingSearchClientProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInstantsearchNative.mod.InstantSearch](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInstantsearchNative.mod.UsingSearchClientProps])(children: _*)
  }
  def UsingManualInfoProps(
    apiKey: String,
    appId: String,
    indexName: String,
    algoliaClient: js.Any = null,
    createURL: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchParameters: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearchStateChange: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    resultsState: js.Any = null,
    root: AnonProps = null,
    searchState: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactInstantsearchNative.mod.UsingManualInfoProps, 
    typingsJapgolly.reactInstantsearchNative.mod.InstantSearch, 
    Unit, 
    typingsJapgolly.reactInstantsearchNative.mod.UsingManualInfoProps
  ] = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
  
      if (algoliaClient != null) __obj.updateDynamic("algoliaClient")(algoliaClient.asInstanceOf[js.Any])
    if (createURL != null) __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    if (onSearchParameters != null) __obj.updateDynamic("onSearchParameters")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchParameters(t0).runNow()))
    if (onSearchStateChange != null) __obj.updateDynamic("onSearchStateChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onSearchStateChange(t0).runNow()))
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (resultsState != null) __obj.updateDynamic("resultsState")(resultsState.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (searchState != null) __obj.updateDynamic("searchState")(searchState.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInstantsearchNative.mod.UsingManualInfoProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInstantsearchNative.mod.InstantSearch](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInstantsearchNative.mod.UsingManualInfoProps])(children: _*)
  }
  @JSImport("react-instantsearch-native", "InstantSearch")
  @js.native
  object componentImport extends js.Object
  
}


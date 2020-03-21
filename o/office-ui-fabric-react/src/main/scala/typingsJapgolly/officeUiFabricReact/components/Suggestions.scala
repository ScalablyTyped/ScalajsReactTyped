package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestions
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.keyCodesMod.KeyCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Suggestions {
  def apply[T](
    suggestions: js.Array[ISuggestionModel[T]],
    onRenderSuggestion: (T, ISuggestionItemProps[T]) => CallbackTo[Element],
    onSuggestionClick: (js.UndefOr[ReactMouseEventFrom[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Callback,
    className: String = null,
    componentRef: IRefObject[ISuggestions[T]] = null,
    createGenericItem: js.UndefOr[Callback] = js.undefined,
    forceResolveText: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isMostRecentlyUsedVisible: js.UndefOr[Boolean] = js.undefined,
    isResultsFooterVisible: js.UndefOr[Boolean] = js.undefined,
    isSearching: js.UndefOr[Boolean] = js.undefined,
    loadingText: String = null,
    moreSuggestionsAvailable: js.UndefOr[Boolean] = js.undefined,
    mostRecentlyUsedHeaderText: String = null,
    noResultsFoundText: String = null,
    onGetMoreResults: js.UndefOr[Callback] = js.undefined,
    onRenderNoResultFound: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], Element | Null]]) => CallbackTo[Element | Null] = null,
    onSuggestionRemove: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[T | IPersonaProps], /* index */ js.UndefOr[Double]) => Callback = null,
    refocusSuggestions: /* keyCode */ KeyCodes => Callback = null,
    removeSuggestionAriaLabel: String = null,
    resultsFooter: /* props */ ISuggestionsProps[T] => CallbackTo[Element] = null,
    resultsFooterFull: /* props */ ISuggestionsProps[T] => CallbackTo[Element] = null,
    resultsMaximumNumber: Int | Double = null,
    searchErrorText: String = null,
    searchForMoreText: String = null,
    searchingText: String = null,
    showForceResolve: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[_, _] = null,
    suggestionsAvailableAlertText: String = null,
    suggestionsClassName: String = null,
    suggestionsContainerAriaLabel: String = null,
    suggestionsHeaderText: String = null,
    suggestionsItemClassName: String = null,
    suggestionsListId: String = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISuggestionsProps[T], 
    typingsJapgolly.officeUiFabricReact.mod.Suggestions[T], 
    Unit, 
    ISuggestionsProps[T]
  ] = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onRenderSuggestion")(js.Any.fromFunction2((t0: T, t1: typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[T]) => onRenderSuggestion(t0, t1).runNow()))
    __obj.updateDynamic("onSuggestionClick")(js.Any.fromFunction3((t0: js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: js.UndefOr[js.Any], t2: js.UndefOr[scala.Double]) => onSuggestionClick(t0, t1, t2).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    createGenericItem.foreach(p => __obj.updateDynamic("createGenericItem")(p.toJsFn))
    if (forceResolveText != null) __obj.updateDynamic("forceResolveText")(forceResolveText.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(isMostRecentlyUsedVisible)) __obj.updateDynamic("isMostRecentlyUsedVisible")(isMostRecentlyUsedVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isResultsFooterVisible)) __obj.updateDynamic("isResultsFooterVisible")(isResultsFooterVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearching)) __obj.updateDynamic("isSearching")(isSearching.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(moreSuggestionsAvailable)) __obj.updateDynamic("moreSuggestionsAvailable")(moreSuggestionsAvailable.asInstanceOf[js.Any])
    if (mostRecentlyUsedHeaderText != null) __obj.updateDynamic("mostRecentlyUsedHeaderText")(mostRecentlyUsedHeaderText.asInstanceOf[js.Any])
    if (noResultsFoundText != null) __obj.updateDynamic("noResultsFoundText")(noResultsFoundText.asInstanceOf[js.Any])
    onGetMoreResults.foreach(p => __obj.updateDynamic("onGetMoreResults")(p.toJsFn))
    if (onRenderNoResultFound != null) __obj.updateDynamic("onRenderNoResultFound")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[scala.Unit], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[scala.Unit], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderNoResultFound(t0, t1).runNow()))
    if (onSuggestionRemove != null) __obj.updateDynamic("onSuggestionRemove")(js.Any.fromFunction3((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[T | typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t2: /* index */ js.UndefOr[scala.Double]) => onSuggestionRemove(t0, t1, t2).runNow()))
    if (refocusSuggestions != null) __obj.updateDynamic("refocusSuggestions")(js.Any.fromFunction1((t0: /* keyCode */ typingsJapgolly.uifabricUtilities.keyCodesMod.KeyCodes) => refocusSuggestions(t0).runNow()))
    if (removeSuggestionAriaLabel != null) __obj.updateDynamic("removeSuggestionAriaLabel")(removeSuggestionAriaLabel.asInstanceOf[js.Any])
    if (resultsFooter != null) __obj.updateDynamic("resultsFooter")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps[T]) => resultsFooter(t0).runNow()))
    if (resultsFooterFull != null) __obj.updateDynamic("resultsFooterFull")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps[T]) => resultsFooterFull(t0).runNow()))
    if (resultsMaximumNumber != null) __obj.updateDynamic("resultsMaximumNumber")(resultsMaximumNumber.asInstanceOf[js.Any])
    if (searchErrorText != null) __obj.updateDynamic("searchErrorText")(searchErrorText.asInstanceOf[js.Any])
    if (searchForMoreText != null) __obj.updateDynamic("searchForMoreText")(searchForMoreText.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    showForceResolve.foreach(p => __obj.updateDynamic("showForceResolve")(p.toJsFn))
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (suggestionsAvailableAlertText != null) __obj.updateDynamic("suggestionsAvailableAlertText")(suggestionsAvailableAlertText.asInstanceOf[js.Any])
    if (suggestionsClassName != null) __obj.updateDynamic("suggestionsClassName")(suggestionsClassName.asInstanceOf[js.Any])
    if (suggestionsContainerAriaLabel != null) __obj.updateDynamic("suggestionsContainerAriaLabel")(suggestionsContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsHeaderText != null) __obj.updateDynamic("suggestionsHeaderText")(suggestionsHeaderText.asInstanceOf[js.Any])
    if (suggestionsItemClassName != null) __obj.updateDynamic("suggestionsItemClassName")(suggestionsItemClassName.asInstanceOf[js.Any])
    if (suggestionsListId != null) __obj.updateDynamic("suggestionsListId")(suggestionsListId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.Suggestions[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionsProps[T]])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "Suggestions")
  @js.native
  object componentImport extends js.Object
  
}


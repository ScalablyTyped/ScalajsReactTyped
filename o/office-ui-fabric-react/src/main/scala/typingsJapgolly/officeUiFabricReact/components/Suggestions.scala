package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestions
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionsProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libKeyCodesMod.KeyCodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Suggestions {
  
  inline def apply[T](
    onRenderSuggestion: (T, ISuggestionItemProps[T]) => Element,
    onSuggestionClick: (js.UndefOr[ReactMouseEventFrom[HTMLElement] | Unit], js.UndefOr[Any | Unit], js.UndefOr[Double]) => Callback,
    suggestions: js.Array[ISuggestionModel[T]]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onRenderSuggestion = js.Any.fromFunction2(onRenderSuggestion), onSuggestionClick = js.Any.fromFunction3((t0: js.UndefOr[ReactMouseEventFrom[HTMLElement] | Unit], t1: js.UndefOr[Any | Unit], t2: js.UndefOr[Double]) => (onSuggestionClick(t0, t1, t2)).runNow()), suggestions = suggestions.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ISuggestionsProps[T]]))
  }
  
  @JSImport("office-ui-fabric-react", "Suggestions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.Suggestions[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[ISuggestions[T]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ ISuggestions[T] | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ISuggestions[T] | Null) => value(t0).runNow()))
    
    inline def createGenericItem(value: Callback): this.type = set("createGenericItem", value.toJsFn)
    
    inline def forceResolveText(value: String): this.type = set("forceResolveText", value.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def isMostRecentlyUsedVisible(value: Boolean): this.type = set("isMostRecentlyUsedVisible", value.asInstanceOf[js.Any])
    
    inline def isResultsFooterVisible(value: Boolean): this.type = set("isResultsFooterVisible", value.asInstanceOf[js.Any])
    
    inline def isSearching(value: Boolean): this.type = set("isSearching", value.asInstanceOf[js.Any])
    
    inline def loadingText(value: String): this.type = set("loadingText", value.asInstanceOf[js.Any])
    
    inline def moreSuggestionsAvailable(value: Boolean): this.type = set("moreSuggestionsAvailable", value.asInstanceOf[js.Any])
    
    inline def mostRecentlyUsedHeaderText(value: String): this.type = set("mostRecentlyUsedHeaderText", value.asInstanceOf[js.Any])
    
    inline def noResultsFoundText(value: String): this.type = set("noResultsFoundText", value.asInstanceOf[js.Any])
    
    inline def onGetMoreResults(value: Callback): this.type = set("onGetMoreResults", value.toJsFn)
    
    inline def onRenderNoResultFound(
      value: (/* props */ js.UndefOr[Unit], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Unit], Element | Null]]) => Element | Null
    ): this.type = set("onRenderNoResultFound", js.Any.fromFunction2(value))
    
    inline def onSuggestionRemove(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[T | IPersonaProps], /* index */ js.UndefOr[Double]) => Callback
    ): this.type = set("onSuggestionRemove", js.Any.fromFunction3((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], t1: /* item */ js.UndefOr[T | IPersonaProps], t2: /* index */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def refocusSuggestions(value: /* keyCode */ KeyCodes => Callback): this.type = set("refocusSuggestions", js.Any.fromFunction1((t0: /* keyCode */ KeyCodes) => value(t0).runNow()))
    
    inline def removeSuggestionAriaLabel(value: String): this.type = set("removeSuggestionAriaLabel", value.asInstanceOf[js.Any])
    
    inline def resultsFooter(value: /* props */ ISuggestionsProps[T] => Element): this.type = set("resultsFooter", js.Any.fromFunction1(value))
    
    inline def resultsFooterFull(value: /* props */ ISuggestionsProps[T] => Element): this.type = set("resultsFooterFull", js.Any.fromFunction1(value))
    
    inline def resultsMaximumNumber(value: Double): this.type = set("resultsMaximumNumber", value.asInstanceOf[js.Any])
    
    inline def searchErrorText(value: String): this.type = set("searchErrorText", value.asInstanceOf[js.Any])
    
    inline def searchForMoreIcon(value: IIconProps): this.type = set("searchForMoreIcon", value.asInstanceOf[js.Any])
    
    inline def searchForMoreText(value: String): this.type = set("searchForMoreText", value.asInstanceOf[js.Any])
    
    inline def searchingText(value: String): this.type = set("searchingText", value.asInstanceOf[js.Any])
    
    inline def showForceResolve(value: CallbackTo[Boolean]): this.type = set("showForceResolve", value.toJsFn)
    
    inline def showRemoveButtons(value: Boolean): this.type = set("showRemoveButtons", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[Any, Any]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: Any => DeepPartial[Any]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def suggestionsAvailableAlertText(value: String): this.type = set("suggestionsAvailableAlertText", value.asInstanceOf[js.Any])
    
    inline def suggestionsClassName(value: String): this.type = set("suggestionsClassName", value.asInstanceOf[js.Any])
    
    inline def suggestionsContainerAriaLabel(value: String): this.type = set("suggestionsContainerAriaLabel", value.asInstanceOf[js.Any])
    
    inline def suggestionsHeaderText(value: String): this.type = set("suggestionsHeaderText", value.asInstanceOf[js.Any])
    
    inline def suggestionsItemClassName(value: String): this.type = set("suggestionsItemClassName", value.asInstanceOf[js.Any])
    
    inline def suggestionsListId(value: String): this.type = set("suggestionsListId", value.asInstanceOf[js.Any])
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ISuggestionsProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}

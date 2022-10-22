package typingsJapgolly.reactMdAutocomplete

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdAutocomplete.typesHighlightedResultMod.HighlightedResultProps
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteData
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteProps
import typingsJapgolly.reactMdAutocomplete.typesUseAutoCompleteMod.AutoCompleteOptions
import typingsJapgolly.reactMdAutocomplete.typesUseAutoCompleteMod.AutoCompleteReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/autocomplete", "AutoComplete")
  @js.native
  val AutoComplete: ForwardRefExoticComponent[AutoCompleteProps & RefAttributes[HTMLInputElement]] = js.native
  
  inline def DEFAULT_GET_RESULT_ID(id: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_RESULT_ID")(id.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def DEFAULT_GET_RESULT_LABEL(datum: AutoCompleteData, labelKey: String, _query: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_RESULT_LABEL")(datum.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], _query.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def DEFAULT_GET_RESULT_VALUE(datum: AutoCompleteData, valueKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_RESULT_VALUE")(datum.asInstanceOf[js.Any], valueKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def HighlightedResult(hasPropIdStyleClassNameEnabledValueChildrenRepeatableIndex: HighlightedResultProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HighlightedResult")(hasPropIdStyleClassNameEnabledValueChildrenRepeatableIndex.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def isResultOf[T /* <: js.Object */](datum: AutoCompleteData): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResultOf")(datum.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoComplete")(hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete.asInstanceOf[js.Any]).asInstanceOf[AutoCompleteReturnValue]
}

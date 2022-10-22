package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsControlProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod.ISuggestionsHeaderFooterProps
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuggestionsControl {
  
  inline def apply[T](
    completeSuggestion: Callback,
    onSuggestionClick: (js.UndefOr[ReactMouseEventFrom[HTMLElement] | Unit], js.UndefOr[Any | Unit], js.UndefOr[Double]) => Callback,
    shouldLoopSelection: Boolean,
    suggestions: js.Array[ISuggestionModel[T]]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(completeSuggestion = completeSuggestion.toJsFn, onSuggestionClick = js.Any.fromFunction3((t0: js.UndefOr[ReactMouseEventFrom[HTMLElement] | Unit], t1: js.UndefOr[Any | Unit], t2: js.UndefOr[Double]) => (onSuggestionClick(t0, t1, t2)).runNow()), shouldLoopSelection = shouldLoopSelection.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ISuggestionsControlProps[T]]))
  }
  
  @JSImport("office-ui-fabric-react", "SuggestionsControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.SuggestionsControl[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[js.Object]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ js.Object | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ js.Object | Null) => value(t0).runNow()))
    
    inline def footerItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): this.type = set("footerItemsProps", value.asInstanceOf[js.Any])
    
    inline def footerItemsPropsVarargs(value: ISuggestionsHeaderFooterProps*): this.type = set("footerItemsProps", js.Array(value*))
    
    inline def headerItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): this.type = set("headerItemsProps", value.asInstanceOf[js.Any])
    
    inline def headerItemsPropsVarargs(value: ISuggestionsHeaderFooterProps*): this.type = set("headerItemsProps", js.Array(value*))
    
    inline def onRenderSuggestion(value: (T, /* suggestionItemProps */ ISuggestionItemProps[T]) => Element): this.type = set("onRenderSuggestion", js.Any.fromFunction2(value))
    
    inline def onSuggestionRemove(
      value: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[IPersonaProps], /* index */ js.UndefOr[Double]) => Callback
    ): this.type = set("onSuggestionRemove", js.Any.fromFunction3((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], t1: /* item */ js.UndefOr[IPersonaProps], t2: /* index */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def resultsMaximumNumber(value: Double): this.type = set("resultsMaximumNumber", value.asInstanceOf[js.Any])
    
    inline def shouldSelectFirstItem(value: CallbackTo[Boolean]): this.type = set("shouldSelectFirstItem", value.toJsFn)
    
    inline def showRemoveButtons(value: Boolean): this.type = set("showRemoveButtons", value.asInstanceOf[js.Any])
    
    inline def suggestionsAvailableAlertText(value: String): this.type = set("suggestionsAvailableAlertText", value.asInstanceOf[js.Any])
    
    inline def suggestionsContainerAriaLabel(value: String): this.type = set("suggestionsContainerAriaLabel", value.asInstanceOf[js.Any])
    
    inline def suggestionsFooterContainerAriaLabel(value: String): this.type = set("suggestionsFooterContainerAriaLabel", value.asInstanceOf[js.Any])
    
    inline def suggestionsHeaderContainerAriaLabel(value: String): this.type = set("suggestionsHeaderContainerAriaLabel", value.asInstanceOf[js.Any])
    
    inline def suggestionsItemClassName(value: String): this.type = set("suggestionsItemClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ISuggestionsControlProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}

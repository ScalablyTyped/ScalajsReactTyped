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
import typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsCore {
  def apply[T](
    shouldLoopSelection: Boolean,
    suggestions: js.Array[ISuggestionModel[T]],
    onSuggestionClick: (js.UndefOr[ReactMouseEventFrom[HTMLElement]], js.UndefOr[js.Any], js.UndefOr[Double]) => Callback,
    componentRef: IRefObject[js.Object] = null,
    onRenderSuggestion: (T, /* suggestionItemProps */ ISuggestionItemProps[T]) => CallbackTo[Element] = null,
    onSuggestionRemove: (/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], /* item */ js.UndefOr[IPersonaProps], /* index */ js.UndefOr[Double]) => Callback = null,
    resultsMaximumNumber: Int | Double = null,
    showRemoveButtons: js.UndefOr[Boolean] = js.undefined,
    suggestionsAvailableAlertText: String = null,
    suggestionsContainerAriaLabel: String = null,
    suggestionsItemClassName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISuggestionsCoreProps[T], 
    typingsJapgolly.officeUiFabricReact.mod.SuggestionsCore[T], 
    Unit, 
    ISuggestionsCoreProps[T]
  ] = {
    val __obj = js.Dynamic.literal(shouldLoopSelection = shouldLoopSelection.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onSuggestionClick")(js.Any.fromFunction3((t0: js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: js.UndefOr[js.Any], t2: js.UndefOr[scala.Double]) => onSuggestionClick(t0, t1, t2).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onRenderSuggestion != null) __obj.updateDynamic("onRenderSuggestion")(js.Any.fromFunction2((t0: T, t1: /* suggestionItemProps */ typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[T]) => onRenderSuggestion(t0, t1).runNow()))
    if (onSuggestionRemove != null) __obj.updateDynamic("onSuggestionRemove")(js.Any.fromFunction3((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]], t1: /* item */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], t2: /* index */ js.UndefOr[scala.Double]) => onSuggestionRemove(t0, t1, t2).runNow()))
    if (resultsMaximumNumber != null) __obj.updateDynamic("resultsMaximumNumber")(resultsMaximumNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveButtons)) __obj.updateDynamic("showRemoveButtons")(showRemoveButtons.asInstanceOf[js.Any])
    if (suggestionsAvailableAlertText != null) __obj.updateDynamic("suggestionsAvailableAlertText")(suggestionsAvailableAlertText.asInstanceOf[js.Any])
    if (suggestionsContainerAriaLabel != null) __obj.updateDynamic("suggestionsContainerAriaLabel")(suggestionsContainerAriaLabel.asInstanceOf[js.Any])
    if (suggestionsItemClassName != null) __obj.updateDynamic("suggestionsItemClassName")(suggestionsItemClassName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.SuggestionsCore[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps[T]])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "SuggestionsCore")
  @js.native
  object componentImport extends js.Object
  
}


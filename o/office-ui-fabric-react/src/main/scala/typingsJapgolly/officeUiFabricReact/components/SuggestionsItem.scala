package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItem
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItemStyleProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionsItemStyles
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsItem {
  def apply[T](
    suggestionModel: ISuggestionModel[T],
    RenderSuggestion: (T, ISuggestionItemProps[T]) => CallbackTo[Element],
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback,
    onRemoveItem: ReactMouseEventFrom[HTMLButtonElement] => Callback,
    className: String = null,
    componentRef: IRefObject[ISuggestionsItem] = null,
    id: String = null,
    isSelectedOverride: js.UndefOr[Boolean] = js.undefined,
    removeButtonAriaLabel: String = null,
    showRemoveButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISuggestionItemProps[T], 
    typingsJapgolly.officeUiFabricReact.mod.SuggestionsItem[T], 
    Unit, 
    ISuggestionItemProps[T]
  ] = {
    val __obj = js.Dynamic.literal(suggestionModel = suggestionModel.asInstanceOf[js.Any])
  
      __obj.updateDynamic("RenderSuggestion")(js.Any.fromFunction2((t0: T, t1: typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[T]) => RenderSuggestion(t0, t1).runNow()))
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onClick(t0).runNow()))
    __obj.updateDynamic("onRemoveItem")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => onRemoveItem(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectedOverride)) __obj.updateDynamic("isSelectedOverride")(isSelectedOverride.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemoveButton)) __obj.updateDynamic("showRemoveButton")(showRemoveButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.SuggestionsItem[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[T]])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "SuggestionsItem")
  @js.native
  object componentImport extends js.Object
  
}


package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.Input
import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePicker
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerStyles
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerSuggestionsProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IInputProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPickerItemDottypesMod.IPickerItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NormalPeoplePicker {
  
  inline def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | PromiseLike[js.Array[IPersonaProps]]
  ): Builder = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions))
    new Builder(js.Array(this.component, __props.asInstanceOf[IBasePickerProps[IPersonaProps]]))
  }
  
  @JSImport("office-ui-fabric-react", "NormalPeoplePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IBasePicker[IPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IBasePicker[IPersonaProps] | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IBasePicker[IPersonaProps] | Null) => value(t0).runNow()))
    
    inline def createGenericItem(
      value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[IPersonaProps] | IPersonaProps
    ): this.type = set("createGenericItem", js.Any.fromFunction2(value))
    
    inline def defaultSelectedItems(value: js.Array[IPersonaProps]): this.type = set("defaultSelectedItems", value.asInstanceOf[js.Any])
    
    inline def defaultSelectedItemsVarargs(value: IPersonaProps*): this.type = set("defaultSelectedItems", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enableSelectedSuggestionAlert(value: Boolean): this.type = set("enableSelectedSuggestionAlert", value.asInstanceOf[js.Any])
    
    inline def getTextFromItem(value: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => String): this.type = set("getTextFromItem", js.Any.fromFunction2(value))
    
    inline def inputProps(value: IInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def itemLimit(value: Double): this.type = set("itemLimit", value.asInstanceOf[js.Any])
    
    inline def onBlur(
      value: ReactFocusEventFrom[
          (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
        ] => Callback
    ): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[
          (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
        ]) => value(t0).runNow()))
    
    inline def onChange(value: /* items */ js.UndefOr[js.Array[IPersonaProps]] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[IPersonaProps]]) => value(t0).runNow()))
    
    inline def onDismiss(value: (/* ev */ js.UndefOr[Any], /* selectedItem */ js.UndefOr[IPersonaProps]) => Boolean | Unit): this.type = set("onDismiss", js.Any.fromFunction2(value))
    
    inline def onEmptyInputFocus(
      value: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | PromiseLike[js.Array[IPersonaProps]]
    ): this.type = set("onEmptyInputFocus", js.Any.fromFunction1(value))
    
    inline def onEmptyResolveSuggestions(
      value: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | PromiseLike[js.Array[IPersonaProps]]
    ): this.type = set("onEmptyResolveSuggestions", js.Any.fromFunction1(value))
    
    inline def onFocus(
      value: ReactFocusEventFrom[
          (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
        ] => Callback
    ): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[
          (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) & Element
        ]) => value(t0).runNow()))
    
    inline def onGetMoreResults(
      value: (/* filter */ String, /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | PromiseLike[js.Array[IPersonaProps]]
    ): this.type = set("onGetMoreResults", js.Any.fromFunction2(value))
    
    inline def onInputChange(value: /* input */ String => String): this.type = set("onInputChange", js.Any.fromFunction1(value))
    
    inline def onItemSelected(
      value: /* selectedItem */ js.UndefOr[IPersonaProps] => IPersonaProps | PromiseLike[IPersonaProps] | Null
    ): this.type = set("onItemSelected", js.Any.fromFunction1(value))
    
    inline def onRemoveSuggestion(value: IPersonaProps => Callback): this.type = set("onRemoveSuggestion", js.Any.fromFunction1((t0: IPersonaProps) => value(t0).runNow()))
    
    inline def onRenderItem(value: /* props */ IPickerItemProps[IPersonaProps] => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("onRenderItem", js.Any.fromFunction1(value))
    
    inline def onRenderSuggestionsItem(
      value: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => typingsJapgolly.react.mod.global.JSX.Element
    ): this.type = set("onRenderSuggestionsItem", js.Any.fromFunction2(value))
    
    inline def onValidateInput(value: /* input */ String => ValidationState): this.type = set("onValidateInput", js.Any.fromFunction1(value))
    
    inline def pickerCalloutProps(value: ICalloutProps): this.type = set("pickerCalloutProps", value.asInstanceOf[js.Any])
    
    inline def pickerSuggestionsProps(value: IBasePickerSuggestionsProps[Any]): this.type = set("pickerSuggestionsProps", value.asInstanceOf[js.Any])
    
    inline def removeButtonAriaLabel(value: String): this.type = set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def resolveDelay(value: Double): this.type = set("resolveDelay", value.asInstanceOf[js.Any])
    
    inline def searchingText(value: (js.Function1[/* props */ Input, String]) | String): this.type = set("searchingText", value.asInstanceOf[js.Any])
    
    inline def searchingTextFunction1(value: /* props */ Input => String): this.type = set("searchingText", js.Any.fromFunction1(value))
    
    inline def selectedItems(value: js.Array[IPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    
    inline def selectedItemsVarargs(value: IPersonaProps*): this.type = set("selectedItems", js.Array(value*))
    
    inline def styles(value: IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IBasePickerStyleProps => DeepPartial[IBasePickerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBasePickerProps[IPersonaProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

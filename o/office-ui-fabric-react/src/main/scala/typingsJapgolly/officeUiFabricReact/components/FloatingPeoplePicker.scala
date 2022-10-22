package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.anon.Input
import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerSuggestionProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerSuggestionsSuggestionsStoreMod.SuggestionsStore
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatingPeoplePicker {
  
  inline def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => js.Array[IPersonaProps] | Null | PromiseLike[js.Array[IPersonaProps]],
    suggestionsStore: SuggestionsStore[IPersonaProps]
  ): Builder = {
    val __props = js.Dynamic.literal(onResolveSuggestions = js.Any.fromFunction2(onResolveSuggestions), suggestionsStore = suggestionsStore.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBaseFloatingPickerProps[IPersonaProps]]))
  }
  
  @JSImport("office-ui-fabric-react", "FloatingPeoplePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.FloatingPeoplePicker] {
    
    inline def calloutWidth(value: Double): this.type = set("calloutWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IBaseFloatingPicker]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IBaseFloatingPicker | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IBaseFloatingPicker | Null) => value(t0).runNow()))
    
    inline def createGenericItem(value: (/* input */ String, /* isValid */ Boolean) => ISuggestionModel[IPersonaProps]): this.type = set("createGenericItem", js.Any.fromFunction2(value))
    
    inline def getTextFromItem(value: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => String): this.type = set("getTextFromItem", js.Any.fromFunction2(value))
    
    inline def inputElement(value: HTMLInputElement): this.type = set("inputElement", value.asInstanceOf[js.Any])
    
    inline def inputElementNull: this.type = set("inputElement", null)
    
    inline def onChange(value: IPersonaProps => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: IPersonaProps) => value(t0).runNow()))
    
    inline def onInputChanged(value: /* filter */ String => Callback): this.type = set("onInputChanged", js.Any.fromFunction1((t0: /* filter */ String) => value(t0).runNow()))
    
    inline def onRemoveSuggestion(value: IPersonaProps => Callback): this.type = set("onRemoveSuggestion", js.Any.fromFunction1((t0: IPersonaProps) => value(t0).runNow()))
    
    inline def onRenderSuggestionsItem(value: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => Element): this.type = set("onRenderSuggestionsItem", js.Any.fromFunction2(value))
    
    inline def onSuggestionsHidden(value: Callback): this.type = set("onSuggestionsHidden", value.toJsFn)
    
    inline def onSuggestionsShown(value: Callback): this.type = set("onSuggestionsShown", value.toJsFn)
    
    inline def onValidateInput(value: /* input */ String => Boolean): this.type = set("onValidateInput", js.Any.fromFunction1(value))
    
    inline def onZeroQuerySuggestion(
      value: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => js.Array[IPersonaProps] | PromiseLike[js.Array[IPersonaProps]] | Null
    ): this.type = set("onZeroQuerySuggestion", js.Any.fromFunction1(value))
    
    inline def pickerCalloutProps(value: ICalloutProps): this.type = set("pickerCalloutProps", value.asInstanceOf[js.Any])
    
    inline def pickerSuggestionsProps(value: IBaseFloatingPickerSuggestionProps): this.type = set("pickerSuggestionsProps", value.asInstanceOf[js.Any])
    
    inline def resolveDelay(value: Double): this.type = set("resolveDelay", value.asInstanceOf[js.Any])
    
    inline def searchingText(value: (js.Function1[/* props */ Input, String]) | String): this.type = set("searchingText", value.asInstanceOf[js.Any])
    
    inline def searchingTextFunction1(value: /* props */ Input => String): this.type = set("searchingText", js.Any.fromFunction1(value))
    
    inline def selectedItems(value: js.Array[IPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
    
    inline def selectedItemsVarargs(value: IPersonaProps*): this.type = set("selectedItems", js.Array(value*))
    
    inline def showForceResolve(value: CallbackTo[Boolean]): this.type = set("showForceResolve", value.toJsFn)
    
    inline def suggestionItems(value: js.Array[IPersonaProps]): this.type = set("suggestionItems", value.asInstanceOf[js.Any])
    
    inline def suggestionItemsVarargs(value: IPersonaProps*): this.type = set("suggestionItems", js.Array(value*))
  }
  
  def withProps(p: IBaseFloatingPickerProps[IPersonaProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

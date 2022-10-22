package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionsItem
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionsItemStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionsItemStyles
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SuggestionsItem {
  
  inline def apply[T](
    RenderSuggestion: (T, ISuggestionItemProps[T]) => Element,
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback,
    onRemoveItem: ReactMouseEventFrom[HTMLButtonElement] => Callback,
    suggestionModel: ISuggestionModel[T]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => onClick(t0).runNow()), onRemoveItem = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => onRemoveItem(t0).runNow()), suggestionModel = suggestionModel.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ISuggestionItemProps[T]]))
  }
  
  @JSImport("office-ui-fabric-react", "SuggestionsItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.SuggestionsItem[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[ISuggestionsItem]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ ISuggestionsItem | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ISuggestionsItem | Null) => value(t0).runNow()))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isSelectedOverride(value: Boolean): this.type = set("isSelectedOverride", value.asInstanceOf[js.Any])
    
    inline def removeButtonAriaLabel(value: String): this.type = set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def showRemoveButton(value: Boolean): this.type = set("showRemoveButton", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: ISuggestionsItemStyleProps => DeepPartial[ISuggestionsItemStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: ISuggestionItemProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}

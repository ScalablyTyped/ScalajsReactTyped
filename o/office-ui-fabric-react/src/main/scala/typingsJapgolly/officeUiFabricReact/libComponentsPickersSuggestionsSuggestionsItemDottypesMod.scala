package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPickersSuggestionsSuggestionsItemDottypesMod {
  
  trait ISuggestionItemProps[T] extends StObject {
    
    /** Optional renderer to override the default one for each type of picker. */
    def RenderSuggestion(item: T, suggestionItemProps: ISuggestionItemProps[T]): Element
    
    /** Optional className for the root element of the suggestion item. */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the ISuggestionItem interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ISuggestionsItem]] = js.undefined
    
    /** Unique id of the suggested item. */
    var id: js.UndefOr[String] = js.undefined
    
    /** An override for the 'selected' property of the SuggestionModel. */
    var isSelectedOverride: js.UndefOr[Boolean] = js.undefined
    
    /** Callback for when the user clicks on the suggestion. */
    def onClick(ev: ReactMouseEventFrom[HTMLButtonElement]): Unit
    
    /** Callback for when the item is removed from the array of suggested items. */
    def onRemoveItem(ev: ReactMouseEventFrom[HTMLButtonElement]): Unit
    
    /**
      * The ARIA label for the button to remove the suggestion from the list.
      */
    var removeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /** Whether the remove button should be rendered or not. */
    var showRemoveButton: js.UndefOr[Boolean] = js.undefined
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]] = js.undefined
    
    /** Individual suggestion object containing its properties. */
    var suggestionModel: ISuggestionModel[T]
    
    /** Theme provided by High-Order Component. */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ISuggestionItemProps {
    
    inline def apply[T](
      RenderSuggestion: (T, ISuggestionItemProps[T]) => Element,
      onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback,
      onRemoveItem: ReactMouseEventFrom[HTMLButtonElement] => Callback,
      suggestionModel: ISuggestionModel[T]
    ): ISuggestionItemProps[T] = {
      val __obj = js.Dynamic.literal(RenderSuggestion = js.Any.fromFunction2(RenderSuggestion), onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => onClick(t0).runNow()), onRemoveItem = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => onRemoveItem(t0).runNow()), suggestionModel = suggestionModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionItemProps[T]]
    }
    
    extension [Self <: ISuggestionItemProps[?], T](x: Self & ISuggestionItemProps[T]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ISuggestionsItem]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ISuggestionsItem | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ ISuggestionsItem | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsSelectedOverride(value: Boolean): Self = StObject.set(x, "isSelectedOverride", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedOverrideUndefined: Self = StObject.set(x, "isSelectedOverride", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
      
      inline def setOnRemoveItem(value: ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onRemoveItem", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
      
      inline def setRemoveButtonAriaLabel(value: String): Self = StObject.set(x, "removeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveButtonAriaLabelUndefined: Self = StObject.set(x, "removeButtonAriaLabel", js.undefined)
      
      inline def setRenderSuggestion(value: (T, ISuggestionItemProps[T]) => Element): Self = StObject.set(x, "RenderSuggestion", js.Any.fromFunction2(value))
      
      inline def setShowRemoveButton(value: Boolean): Self = StObject.set(x, "showRemoveButton", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveButtonUndefined: Self = StObject.set(x, "showRemoveButton", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ISuggestionsItemStyleProps, ISuggestionsItemStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ISuggestionsItemStyleProps => DeepPartial[ISuggestionsItemStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setSuggestionModel(value: ISuggestionModel[T]): Self = StObject.set(x, "suggestionModel", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ISuggestionsItem extends StObject
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/Suggestions/SuggestionsItem.types.ISuggestionItemProps<any>, 'className'> & {  suggested :boolean | undefined} */
  trait ISuggestionsItemStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether the suggestion item is selected or not. */
    var suggested: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object ISuggestionsItemStyleProps {
    
    inline def apply(theme: ITheme): ISuggestionsItemStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestionsItemStyleProps]
    }
    
    extension [Self <: ISuggestionsItemStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSuggested(value: Boolean): Self = StObject.set(x, "suggested", value.asInstanceOf[js.Any])
      
      inline def setSuggestedUndefined: Self = StObject.set(x, "suggested", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISuggestionsItemStyles extends StObject {
    
    /** Refers to the remove button in case it's rendered. */
    var closeButton: IStyle
    
    /** Refers to the CommandButton holding the content of the suggested item. */
    var itemButton: IStyle
    
    /** Root element of the suggested item. */
    var root: IStyle
  }
  object ISuggestionsItemStyles {
    
    inline def apply(): ISuggestionsItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISuggestionsItemStyles]
    }
    
    extension [Self <: ISuggestionsItemStyles](x: Self) {
      
      inline def setCloseButton(value: IStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setItemButton(value: IStyle): Self = StObject.set(x, "itemButton", value.asInstanceOf[js.Any])
      
      inline def setItemButtonNull: Self = StObject.set(x, "itemButton", null)
      
      inline def setItemButtonUndefined: Self = StObject.set(x, "itemButton", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}

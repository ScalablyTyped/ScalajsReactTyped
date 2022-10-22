package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsItemDottypesMod.ISuggestionItemProps
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerSuggestionsSuggestionsDottypesMod {
  
  @js.native
  trait ISuggestionsControlProps[T]
    extends StObject
       with ISuggestionsCoreProps[T] {
    
    /**
      * The CSS classname of the suggestions list.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Completes the suggestion
      */
    def completeSuggestion(): Unit = js.native
    
    /**
      * The footer items props
      */
    var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
    
    /**
      * The header items props
      */
    var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
    
    /**
      * Whether or not the first selectable item in the suggestions list should be selected
      */
    var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /**
      * An ARIA label for the container that is the parent of the suggestions footer items.
      */
    var suggestionsFooterContainerAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * An ARIA label for the container that is the parent of the suggestions header items.
      */
    var suggestionsHeaderContainerAriaLabel: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ISuggestionsCoreProps[T]
    extends StObject
       with ClassAttributes[Any] {
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
    
    /**
      * How the suggestion should look in the suggestion list.
      */
    var onRenderSuggestion: js.UndefOr[
        js.Function2[/* props */ T, /* suggestionItemProps */ ISuggestionItemProps[T], Element]
      ] = js.native
    
    /**
      * What should occur when a suggestion is clicked
      */
    def onSuggestionClick(): Unit = js.native
    def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement]): Unit = js.native
    def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: Any): Unit = js.native
    def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: Any, index: Double): Unit = js.native
    def onSuggestionClick(ev: ReactMouseEventFrom[HTMLElement], item: Unit, index: Double): Unit = js.native
    def onSuggestionClick(ev: Unit, item: Any): Unit = js.native
    def onSuggestionClick(ev: Unit, item: Any, index: Double): Unit = js.native
    def onSuggestionClick(ev: Unit, item: Unit, index: Double): Unit = js.native
    
    /**
      * Function to fire when one of the optional remove buttons on a suggestion is clicked.
      */
    var onSuggestionRemove: js.UndefOr[
        js.Function3[
          /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], 
          /* item */ js.UndefOr[IPersonaProps], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /**
      * Maximum number of suggestions to show in the full suggestion list.
      */
    var resultsMaximumNumber: js.UndefOr[Double] = js.native
    
    /**
      * Indicates whether to loop around to the top or bottom of the suggestions
      * on calling nextSuggestion and previousSuggestion, respectively
      */
    var shouldLoopSelection: Boolean = js.native
    
    /**
      * Indicates whether to show a button with each suggestion to remove that suggestion.
      */
    var showRemoveButtons: js.UndefOr[Boolean] = js.native
    
    /**
      * The list of Suggestions that will be displayed
      */
    var suggestions: js.Array[ISuggestionModel[T]] = js.native
    
    /**
      * Screen reader message to read when there are suggestions available.
      */
    var suggestionsAvailableAlertText: js.UndefOr[String] = js.native
    
    /**
      * An ARIA label for the container that is the parent of the suggestions.
      */
    var suggestionsContainerAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * the classname of the suggestionitem.
      */
    var suggestionsItemClassName: js.UndefOr[String] = js.native
  }
  
  trait ISuggestionsHeaderFooterItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
    
    var id: String
    
    var isSelected: Boolean
    
    var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def renderItem(): Element
  }
  object ISuggestionsHeaderFooterItemProps {
    
    inline def apply(id: String, isSelected: Boolean, renderItem: CallbackTo[Element]): ISuggestionsHeaderFooterItemProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], renderItem = renderItem.toJsFn)
      __obj.asInstanceOf[ISuggestionsHeaderFooterItemProps]
    }
    
    extension [Self <: ISuggestionsHeaderFooterItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ js.Object | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ js.Object | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setOnExecute(value: Callback): Self = StObject.set(x, "onExecute", value.toJsFn)
      
      inline def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      inline def setRenderItem(value: CallbackTo[Element]): Self = StObject.set(x, "renderItem", value.toJsFn)
    }
  }
  
  trait ISuggestionsHeaderFooterProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var onExecute: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def renderItem(): Element
    
    def shouldShow(): Boolean
  }
  object ISuggestionsHeaderFooterProps {
    
    inline def apply(renderItem: CallbackTo[Element], shouldShow: CallbackTo[Boolean]): ISuggestionsHeaderFooterProps = {
      val __obj = js.Dynamic.literal(renderItem = renderItem.toJsFn, shouldShow = shouldShow.toJsFn)
      __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
    }
    
    extension [Self <: ISuggestionsHeaderFooterProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnExecute(value: Callback): Self = StObject.set(x, "onExecute", value.toJsFn)
      
      inline def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
      
      inline def setRenderItem(value: CallbackTo[Element]): Self = StObject.set(x, "renderItem", value.toJsFn)
      
      inline def setShouldShow(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldShow", value.toJsFn)
    }
  }
}

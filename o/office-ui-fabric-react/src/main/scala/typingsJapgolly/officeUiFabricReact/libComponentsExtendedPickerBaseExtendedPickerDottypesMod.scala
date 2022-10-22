package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IInputProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsExtendedPickerBaseExtendedPickerDottypesMod {
  
  trait IBaseExtendedPicker[T] extends StObject {
    
    /** Sets focus to the input. */
    def focus(): Unit
    
    /** Forces the picker to resolve */
    var forceResolve: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Gets the current value of the input. */
    var items: js.UndefOr[js.Array[T]] = js.undefined
  }
  object IBaseExtendedPicker {
    
    inline def apply[T](focus: Callback): IBaseExtendedPicker[T] = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn)
      __obj.asInstanceOf[IBaseExtendedPicker[T]]
    }
    
    extension [Self <: IBaseExtendedPicker[?], T](x: Self & IBaseExtendedPicker[T]) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setForceResolve(value: Callback): Self = StObject.set(x, "forceResolve", value.toJsFn)
      
      inline def setForceResolveUndefined: Self = StObject.set(x, "forceResolve", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait IBaseExtendedPickerProps[T] extends StObject {
    
    /**
      * ClassName for the picker.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Ref of the component
      */
    var componentRef: js.UndefOr[IRefObject[IBaseExtendedPicker[T]]] = js.undefined
    
    /**
      * Current rendered query string that's corealte to current rendered result
      **/
    var currentRenderedQueryString: js.UndefOr[String] = js.undefined
    
    /**
      * Initial items that have already been selected and should appear in the people picker.
      */
    var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * Flag for disabling the picker.
      * @defaultvalue false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Floating picker properties
      */
    var floatingPickerProps: IBaseFloatingPickerProps[T]
    
    /**
      * Focus zone props
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
    
    /**
      * Header/title element for the picker
      */
    var headerComponent: js.UndefOr[Element] = js.undefined
    
    /**
      * Autofill input native props
      * @defaultvalue undefined
      */
    var inputProps: js.UndefOr[IInputProps] = js.undefined
    
    /**
      * Restrict the amount of selectable items.
      * @defaultvalue undefined
      */
    var itemLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * A callback for when the user moves the focus away from the picker
      */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.undefined
    
    /**
      * A callback for when the selected list of items changes.
      */
    var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.undefined
    
    /**
      * A callback for when the user put focus on the picker
      */
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement | Autofill]] = js.undefined
    
    /**
      * A callback on when an item was added to the selected item list
      */
    var onItemAdded: js.UndefOr[js.Function1[/* addedItem */ T, Unit]] = js.undefined
    
    /**
      * A callback to process a selection after the user selects a suggestion from the picker.
      * The returned item will be added to the selected items list
      */
    var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | PromiseLike[T]]] = js.undefined
    
    /**
      * A callback on when an item or items were removed from the selected item list
      */
    var onItemsRemoved: js.UndefOr[js.Function1[/* removedItems */ js.Array[T], Unit]] = js.undefined
    
    /**
      * A callback for when text is pasted into the input
      */
    var onPaste: js.UndefOr[js.Function1[/* pastedText */ String, js.Array[T]]] = js.undefined
    
    /**
      * Function that specifies how the floating picker will appear.
      */
    var onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]]
    
    /**
      * Function that specifies how the floating picker will appear.
      */
    var onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]]
    
    /**
      * If using as a controlled component use selectedItems here instead of the SelectedItemsList
      */
    var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * Selected items list properties
      */
    var selectedItemsListProps: IBaseSelectedItemsListProps[T]
    
    /**
      * If using as a controlled component use suggestionItems here instead of FloatingPicker
      */
    var suggestionItems: js.UndefOr[js.Array[T]] = js.undefined
  }
  object IBaseExtendedPickerProps {
    
    inline def apply[T](
      floatingPickerProps: IBaseFloatingPickerProps[T],
      onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]],
      onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]],
      selectedItemsListProps: IBaseSelectedItemsListProps[T]
    ): IBaseExtendedPickerProps[T] = {
      val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseExtendedPickerProps[T]]
    }
    
    extension [Self <: IBaseExtendedPickerProps[?], T](x: Self & IBaseExtendedPickerProps[T]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IBaseExtendedPicker[T]]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IBaseExtendedPicker[T] | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IBaseExtendedPicker[T] | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setCurrentRenderedQueryString(value: String): Self = StObject.set(x, "currentRenderedQueryString", value.asInstanceOf[js.Any])
      
      inline def setCurrentRenderedQueryStringUndefined: Self = StObject.set(x, "currentRenderedQueryString", js.undefined)
      
      inline def setDefaultSelectedItems(value: js.Array[T]): Self = StObject.set(x, "defaultSelectedItems", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedItemsUndefined: Self = StObject.set(x, "defaultSelectedItems", js.undefined)
      
      inline def setDefaultSelectedItemsVarargs(value: T*): Self = StObject.set(x, "defaultSelectedItems", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFloatingPickerProps(value: IBaseFloatingPickerProps[T]): Self = StObject.set(x, "floatingPickerProps", value.asInstanceOf[js.Any])
      
      inline def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      inline def setHeaderComponent(value: VdomElement): Self = StObject.set(x, "headerComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeaderComponentUndefined: Self = StObject.set(x, "headerComponent", js.undefined)
      
      inline def setInputProps(value: IInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setItemLimit(value: Double): Self = StObject.set(x, "itemLimit", value.asInstanceOf[js.Any])
      
      inline def setItemLimitUndefined: Self = StObject.set(x, "itemLimit", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[(HTMLInputElement | Autofill) & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | Autofill) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[T]]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[(HTMLInputElement | Autofill) & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | Autofill) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnItemAdded(value: /* addedItem */ T => Callback): Self = StObject.set(x, "onItemAdded", js.Any.fromFunction1((t0: /* addedItem */ T) => value(t0).runNow()))
      
      inline def setOnItemAddedUndefined: Self = StObject.set(x, "onItemAdded", js.undefined)
      
      inline def setOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | PromiseLike[T]): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
      
      inline def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
      
      inline def setOnItemsRemoved(value: /* removedItems */ js.Array[T] => Callback): Self = StObject.set(x, "onItemsRemoved", js.Any.fromFunction1((t0: /* removedItems */ js.Array[T]) => value(t0).runNow()))
      
      inline def setOnItemsRemovedUndefined: Self = StObject.set(x, "onItemsRemoved", js.undefined)
      
      inline def setOnPaste(value: /* pastedText */ String => js.Array[T]): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[T]]): Self = StObject.set(x, "onRenderFloatingPicker", value.asInstanceOf[js.Any])
      
      inline def setOnRenderSelectedItems(value: ComponentType[IBaseSelectedItemsListProps[T]]): Self = StObject.set(x, "onRenderSelectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsListProps(value: IBaseSelectedItemsListProps[T]): Self = StObject.set(x, "selectedItemsListProps", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSuggestionItems(value: js.Array[T]): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsUndefined: Self = StObject.set(x, "suggestionItems", js.undefined)
      
      inline def setSuggestionItemsVarargs(value: T*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
    }
  }
}

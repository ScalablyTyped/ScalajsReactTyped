package typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseExtendedPickerProps[T] extends js.Object {
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
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.undefined
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
  @scala.inline
  def apply[T](
    floatingPickerProps: IBaseFloatingPickerProps[T],
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[T]],
    onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[T]],
    selectedItemsListProps: IBaseSelectedItemsListProps[T],
    className: String = null,
    componentRef: IRefObject[IBaseExtendedPicker[T]] = null,
    currentRenderedQueryString: String = null,
    defaultSelectedItems: js.Array[T] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    headerComponent: VdomElement = null,
    inputProps: IInputProps = null,
    itemLimit: Int | Double = null,
    onBlur: ReactFocusEventFrom[(HTMLInputElement | Autofill) with org.scalajs.dom.raw.Element] => Callback = null,
    onChange: /* items */ js.UndefOr[js.Array[T]] => Callback = null,
    onFocus: ReactFocusEventFrom[(HTMLInputElement | Autofill) with org.scalajs.dom.raw.Element] => Callback = null,
    onItemAdded: /* addedItem */ T => Callback = null,
    onItemSelected: /* selectedItem */ js.UndefOr[T] => CallbackTo[T | js.Thenable[T]] = null,
    onItemsRemoved: /* removedItems */ js.Array[T] => Callback = null,
    onPaste: /* pastedText */ String => CallbackTo[js.Array[T]] = null,
    selectedItems: js.Array[T] = null,
    suggestionItems: js.Array[T] = null
  ): IBaseExtendedPickerProps[T] = {
    val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (currentRenderedQueryString != null) __obj.updateDynamic("currentRenderedQueryString")(currentRenderedQueryString.asInstanceOf[js.Any])
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (headerComponent != null) __obj.updateDynamic("headerComponent")(headerComponent.rawElement.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[T]]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onItemAdded != null) __obj.updateDynamic("onItemAdded")(js.Any.fromFunction1((t0: /* addedItem */ T) => onItemAdded(t0).runNow()))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1((t0: /* selectedItem */ js.UndefOr[T]) => onItemSelected(t0).runNow()))
    if (onItemsRemoved != null) __obj.updateDynamic("onItemsRemoved")(js.Any.fromFunction1((t0: /* removedItems */ js.Array[T]) => onItemsRemoved(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* pastedText */ java.lang.String) => onPaste(t0).runNow()))
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (suggestionItems != null) __obj.updateDynamic("suggestionItems")(suggestionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseExtendedPickerProps[T]]
  }
}


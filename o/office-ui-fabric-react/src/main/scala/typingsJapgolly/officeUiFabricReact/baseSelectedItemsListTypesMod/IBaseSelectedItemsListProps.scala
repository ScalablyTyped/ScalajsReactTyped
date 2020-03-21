package typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseSelectedItemsListProps[T]
  extends ClassAttributes[js.Any] {
  /**
    * A callback on whether this item can be deleted
    */
  var canRemoveItem: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.undefined
  var componentRef: js.UndefOr[IRefObject[IBaseSelectedItemsList[T]]] = js.undefined
  /**
    * Function that specifies how arbitrary text entered into the well is handled.
    */
  var createGenericItem: js.UndefOr[
    js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T]]
  ] = js.undefined
  /**
    * Initial items that have already been selected and should appear in the people picker.
    */
  var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * A callback for when the selected list of items changes.
    */
  var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.undefined
  /**
    * A callback for when items are copied
    */
  var onCopyItems: js.UndefOr[js.Function1[/* items */ js.Array[T], String]] = js.undefined
  /**
    * A callback when an item is deleted
    * @deprecated Use `onItemsDeleted` instead.
    */
  var onItemDeleted: js.UndefOr[js.Function1[/* deletedItem */ T, Unit]] = js.undefined
  /**
    * A callback to process a selection after the user selects something from the picker.
    */
  var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | js.Thenable[T]]] = js.undefined
  /**
    * A callback when and item or items are deleted
    */
  var onItemsDeleted: js.UndefOr[js.Function1[/* deletedItems */ js.Array[T], Unit]] = js.undefined
  /**
    * Function that specifies how the selected item will appear.
    */
  var onRenderItem: js.UndefOr[js.Function1[/* props */ ISelectedItemProps[T], Element]] = js.undefined
  /**
    * Aria label for the 'X' button in the selected item component.
    * @defaultvalue ''
    */
  var removeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * The items that the base picker should currently display as selected. If this is provided then the picker will act as a
    * controlled component.
    */
  var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * The selection
    */
  var selection: js.UndefOr[Selection[IObjectWithKey]] = js.undefined
}

object IBaseSelectedItemsListProps {
  @scala.inline
  def apply[T](
    canRemoveItem: /* item */ T => CallbackTo[Boolean] = null,
    componentRef: IRefObject[IBaseSelectedItemsList[T]] = null,
    createGenericItem: (/* input */ String, /* ValidationState */ ValidationState) => CallbackTo[ISuggestionModel[T]] = null,
    defaultSelectedItems: js.Array[T] = null,
    key: Key = null,
    onChange: /* items */ js.UndefOr[js.Array[T]] => Callback = null,
    onCopyItems: /* items */ js.Array[T] => CallbackTo[String] = null,
    onItemDeleted: /* deletedItem */ T => Callback = null,
    onItemSelected: /* selectedItem */ js.UndefOr[T] => CallbackTo[T | js.Thenable[T]] = null,
    onItemsDeleted: /* deletedItems */ js.Array[T] => Callback = null,
    onRenderItem: /* props */ ISelectedItemProps[T] => CallbackTo[Element] = null,
    ref: LegacyRef[js.Any] = null,
    removeButtonAriaLabel: String = null,
    selectedItems: js.Array[T] = null,
    selection: Selection[IObjectWithKey] = null
  ): IBaseSelectedItemsListProps[T] = {
    val __obj = js.Dynamic.literal()
    if (canRemoveItem != null) __obj.updateDynamic("canRemoveItem")(js.Any.fromFunction1((t0: /* item */ T) => canRemoveItem(t0).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2((t0: /* input */ java.lang.String, t1: /* ValidationState */ typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState) => createGenericItem(t0, t1).runNow()))
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[T]]) => onChange(t0).runNow()))
    if (onCopyItems != null) __obj.updateDynamic("onCopyItems")(js.Any.fromFunction1((t0: /* items */ js.Array[T]) => onCopyItems(t0).runNow()))
    if (onItemDeleted != null) __obj.updateDynamic("onItemDeleted")(js.Any.fromFunction1((t0: /* deletedItem */ T) => onItemDeleted(t0).runNow()))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1((t0: /* selectedItem */ js.UndefOr[T]) => onItemSelected(t0).runNow()))
    if (onItemsDeleted != null) __obj.updateDynamic("onItemsDeleted")(js.Any.fromFunction1((t0: /* deletedItems */ js.Array[T]) => onItemsDeleted(t0).runNow()))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps[T]) => onRenderItem(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseSelectedItemsListProps[T]]
  }
}


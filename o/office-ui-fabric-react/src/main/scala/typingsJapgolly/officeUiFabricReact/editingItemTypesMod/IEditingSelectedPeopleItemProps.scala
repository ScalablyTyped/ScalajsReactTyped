package typingsJapgolly.officeUiFabricReact.editingItemTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditingSelectedPeopleItemProps extends ISelectedPeopleItemProps {
  var floatingPickerProps: js.UndefOr[IBaseFloatingPickerProps[IPersonaProps]] = js.undefined
  var getEditingItemText: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, String]] = js.undefined
  var onRenderFloatingPicker: js.UndefOr[ComponentType[IBaseFloatingPickerProps[IPersonaProps]]] = js.undefined
  def onEditingComplete(oldItem: js.Any, newItem: js.Any): Unit
}

object IEditingSelectedPeopleItemProps {
  @scala.inline
  def apply(
    onEditingComplete: (js.Any, js.Any) => Callback,
    ISelectedPeopleItemProps: ISelectedPeopleItemProps = null,
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps] = null,
    getEditingItemText: /* item */ IExtendedPersonaProps => CallbackTo[String] = null,
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[IPersonaProps]] = null
  ): IEditingSelectedPeopleItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEditingComplete")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => onEditingComplete(t0, t1).runNow()))
    if (ISelectedPeopleItemProps != null) js.Dynamic.global.Object.assign(__obj, ISelectedPeopleItemProps)
    if (floatingPickerProps != null) __obj.updateDynamic("floatingPickerProps")(floatingPickerProps.asInstanceOf[js.Any])
    if (getEditingItemText != null) __obj.updateDynamic("getEditingItemText")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => getEditingItemText(t0).runNow()))
    if (onRenderFloatingPicker != null) __obj.updateDynamic("onRenderFloatingPicker")(onRenderFloatingPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditingSelectedPeopleItemProps]
  }
}


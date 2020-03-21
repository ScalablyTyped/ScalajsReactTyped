package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod.ISelectedItemWithContextMenuProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectedItemWithContextMenu {
  def apply(
    item: IExtendedPersonaProps,
    menuItems: js.Array[IContextualMenuItem],
    renderedItem: VdomElement,
    beginEditing: /* item */ IExtendedPersonaProps => Callback = null,
    componentRef: IRefObject[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISelectedItemWithContextMenuProps, 
    typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod.SelectedItemWithContextMenu, 
    Unit, 
    ISelectedItemWithContextMenuProps
  ] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any])
  
      if (renderedItem != null) __obj.updateDynamic("renderedItem")(renderedItem.rawElement.asInstanceOf[js.Any])
    if (beginEditing != null) __obj.updateDynamic("beginEditing")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => beginEditing(t0).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod.ISelectedItemWithContextMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod.SelectedItemWithContextMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod.ISelectedItemWithContextMenuProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  object componentImport extends js.Object
  
}


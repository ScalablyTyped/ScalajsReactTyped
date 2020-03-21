package typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedItemWithContextMenuProps
  extends IBaseProps[js.Any] {
  var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
  var item: IExtendedPersonaProps
  var menuItems: js.Array[IContextualMenuItem]
  var renderedItem: Element
}

object ISelectedItemWithContextMenuProps {
  @scala.inline
  def apply(
    item: IExtendedPersonaProps,
    menuItems: js.Array[IContextualMenuItem],
    renderedItem: VdomElement,
    beginEditing: /* item */ IExtendedPersonaProps => Callback = null,
    componentRef: IRefObject[js.Any] = null
  ): ISelectedItemWithContextMenuProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any])
    if (renderedItem != null) __obj.updateDynamic("renderedItem")(renderedItem.rawElement.asInstanceOf[js.Any])
    if (beginEditing != null) __obj.updateDynamic("beginEditing")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => beginEditing(t0).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
  }
}


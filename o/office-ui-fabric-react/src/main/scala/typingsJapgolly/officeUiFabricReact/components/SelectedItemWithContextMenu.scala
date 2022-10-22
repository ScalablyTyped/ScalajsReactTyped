package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListItemsSelectedItemWithContextMenuMod.ISelectedItemWithContextMenuProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectedItemWithContextMenu {
  
  inline def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: VdomElement): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.rawElement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ISelectedItemWithContextMenuProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListItemsSelectedItemWithContextMenuMod.SelectedItemWithContextMenu
        ] {
    
    inline def beginEditing(value: /* item */ IExtendedPersonaProps => Callback): this.type = set("beginEditing", js.Any.fromFunction1((t0: /* item */ IExtendedPersonaProps) => value(t0).runNow()))
    
    inline def componentRef(value: IRefObject[Any]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ Any | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ Any | Null) => value(t0).runNow()))
  }
  
  def withProps(p: ISelectedItemWithContextMenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

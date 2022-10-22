package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricUtilities.libBaseComponentDottypesMod.IBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListSelectedPeopleListItemsSelectedItemWithContextMenuMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
  @js.native
  open class SelectedItemWithContextMenu protected () extends Component[ISelectedItemWithContextMenuProps, IPeoplePickerItemState, Any] {
    def this(props: ISelectedItemWithContextMenuProps) = this()
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _onCloseContextualMenu: Any = js.native
    
    /* protected */ var itemElement: RefHandle[HTMLDivElement] = js.native
  }
  
  trait IPeoplePickerItemState extends StObject {
    
    var contextualMenuVisible: Boolean
  }
  object IPeoplePickerItemState {
    
    inline def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
      val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemState]
    }
    
    extension [Self <: IPeoplePickerItemState](x: Self) {
      
      inline def setContextualMenuVisible(value: Boolean): Self = StObject.set(x, "contextualMenuVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISelectedItemWithContextMenuProps
    extends StObject
       with IBaseProps[Any] {
    
    var beginEditing: js.UndefOr[js.Function1[/* item */ IExtendedPersonaProps, Unit]] = js.undefined
    
    var item: IExtendedPersonaProps
    
    var menuItems: js.Array[IContextualMenuItem]
    
    var renderedItem: Element
  }
  object ISelectedItemWithContextMenuProps {
    
    inline def apply(item: IExtendedPersonaProps, menuItems: js.Array[IContextualMenuItem], renderedItem: VdomElement): ISelectedItemWithContextMenuProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], renderedItem = renderedItem.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectedItemWithContextMenuProps]
    }
    
    extension [Self <: ISelectedItemWithContextMenuProps](x: Self) {
      
      inline def setBeginEditing(value: /* item */ IExtendedPersonaProps => Callback): Self = StObject.set(x, "beginEditing", js.Any.fromFunction1((t0: /* item */ IExtendedPersonaProps) => value(t0).runNow()))
      
      inline def setBeginEditingUndefined: Self = StObject.set(x, "beginEditing", js.undefined)
      
      inline def setItem(value: IExtendedPersonaProps): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setMenuItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "menuItems", js.Array(value*))
      
      inline def setRenderedItem(value: VdomElement): Self = StObject.set(x, "renderedItem", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

package typingsJapgolly.officeUiFabricReact.selectedItemWithContextMenuMod

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/SelectedItemWithContextMenu", "SelectedItemWithContextMenu")
@js.native
class SelectedItemWithContextMenu protected () extends BaseComponent[ISelectedItemWithContextMenuProps, IPeoplePickerItemState] {
  def this(props: ISelectedItemWithContextMenuProps) = this()
  var _onClick: js.Any = js.native
  var _onCloseContextualMenu: js.Any = js.native
  var itemElement: RefHandle[HTMLDivElement] = js.native
}


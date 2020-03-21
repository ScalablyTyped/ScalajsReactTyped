package typingsJapgolly.officeUiFabricReact.extendedSelectedItemMod

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/ExtendedSelectedItem", "ExtendedSelectedItem")
@js.native
class ExtendedSelectedItem protected () extends BaseComponent[ISelectedPeopleItemProps, IPeoplePickerItemState] {
  def this(props: ISelectedPeopleItemProps) = this()
  var _onClickIconButton: js.Any = js.native
  var persona: RefHandle[HTMLDivElement] = js.native
}


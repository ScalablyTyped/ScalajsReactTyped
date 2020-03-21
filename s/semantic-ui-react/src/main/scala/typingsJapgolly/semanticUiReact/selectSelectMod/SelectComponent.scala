package typingsJapgolly.semanticUiReact.selectSelectMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typingsJapgolly.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typingsJapgolly.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsJapgolly.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectComponent extends FunctionComponent[SelectProps] {
  var Divider: ComponentClassP[DropdownDividerProps with js.Object] = js.native
  var Header: ComponentClassP[DropdownHeaderProps with js.Object] = js.native
  var Item: ComponentClassP[DropdownItemProps with js.Object] = js.native
  var Menu: StatelessComponent[DropdownMenuProps] = js.native
}


package typingsJapgolly.semanticUiReact.dropdownDropdownMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typingsJapgolly.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typingsJapgolly.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsJapgolly.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import typingsJapgolly.semanticUiReact.dropdownSearchInputMod.DropdownSearchInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownComponent extends ComponentClass[DropdownProps, ComponentState] {
  var Divider: ComponentClassP[DropdownDividerProps with js.Object] = js.native
  var Header: ComponentClassP[DropdownHeaderProps with js.Object] = js.native
  var Item: ComponentClassP[DropdownItemProps with js.Object] = js.native
  var Menu: StatelessComponent[DropdownMenuProps] = js.native
  var SearchInput: ComponentClassP[DropdownSearchInputProps with js.Object] = js.native
}


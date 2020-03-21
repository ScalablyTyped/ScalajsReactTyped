package typingsJapgolly.semanticUiReact.menuMenuMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typingsJapgolly.semanticUiReact.menuItemMod.MenuItemProps
import typingsJapgolly.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuComponent extends ComponentClass[MenuProps, ComponentState] {
  var Header: ComponentClassP[MenuHeaderProps with js.Object] = js.native
  var Item: ComponentClassP[MenuItemProps with js.Object] = js.native
  var Menu: StatelessComponent[MenuMenuProps] = js.native
}


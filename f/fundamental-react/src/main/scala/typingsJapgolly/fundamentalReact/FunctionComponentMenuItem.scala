package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.MenuDotItem
import typingsJapgolly.fundamentalReact.menuMod.MenuItemProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName  :'Menu.Item'} */
@js.native
trait FunctionComponentMenuItem extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuItemProps] = js.native
  var displayName: js.UndefOr[String with MenuDotItem] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuItem] = js.native
  def apply(props: PropsWithChildren[MenuItemProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[MenuItemProps], context: js.Any): Element | Null = js.native
}


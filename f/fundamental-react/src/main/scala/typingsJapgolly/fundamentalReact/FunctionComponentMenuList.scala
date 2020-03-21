package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.MenuDotList
import typingsJapgolly.fundamentalReact.menuMod.MenuListProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName  :'Menu.List'} */
@js.native
trait FunctionComponentMenuList extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuListProps] = js.native
  var displayName: js.UndefOr[String with MenuDotList] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuList] = js.native
  def apply(props: PropsWithChildren[MenuListProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[MenuListProps], context: js.Any): Element | Null = js.native
}


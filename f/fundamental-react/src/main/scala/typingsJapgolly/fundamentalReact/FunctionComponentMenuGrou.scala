package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.MenuDotGroup
import typingsJapgolly.fundamentalReact.menuMod.MenuGroupProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuGroupProps> & {  displayName  :'Menu.Group'} */
@js.native
trait FunctionComponentMenuGrou extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuGroupProps] = js.native
  var displayName: js.UndefOr[String with MenuDotGroup] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuGrou] = js.native
  def apply(props: PropsWithChildren[MenuGroupProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[MenuGroupProps], context: js.Any): Element | Null = js.native
}


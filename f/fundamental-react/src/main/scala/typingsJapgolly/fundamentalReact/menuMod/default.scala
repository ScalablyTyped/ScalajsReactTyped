package typingsJapgolly.fundamentalReact.menuMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.FunctionComponentMenuGrou
import typingsJapgolly.fundamentalReact.FunctionComponentMenuItem
import typingsJapgolly.fundamentalReact.FunctionComponentMenuList
import typingsJapgolly.fundamentalReact.PartialMenuProps
import typingsJapgolly.fundamentalReact.WeakValidationMapMenuProp
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.Menu
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Menu/Menu", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: FunctionComponentMenuGrou = js.native
  var Item: FunctionComponentMenuItem = js.native
  var List: FunctionComponentMenuList = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMenuProps] = js.native
  var displayName: js.UndefOr[Menu | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMenuProp] = js.native
  def apply(props: PropsWithChildren[MenuProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[MenuProps], context: js.Any): Element | Null = js.native
}


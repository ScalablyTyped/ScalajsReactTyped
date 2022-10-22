package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.MenuDotItem
import typingsJapgolly.fundamentalReact.libMenuMenuMod.MenuItemProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuItemProps> & {  displayName :'Menu.Item'} */
@js.native
trait FunctionComponentMenuItem extends StObject {
  
  def apply(props: MenuItemProps): Element | Null = js.native
  def apply(props: MenuItemProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuItemProps] = js.native
  
  var displayName: js.UndefOr[String] & MenuDotItem = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuItem] = js.native
}

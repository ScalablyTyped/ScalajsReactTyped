package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.MenuDotList
import typingsJapgolly.fundamentalReact.libMenuMenuMod.MenuListProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuListProps> & {  displayName :'Menu.List'} */
@js.native
trait FunctionComponentMenuList extends StObject {
  
  def apply(props: MenuListProps): Element | Null = js.native
  def apply(props: MenuListProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuListProps] = js.native
  
  var displayName: js.UndefOr[String] & MenuDotList = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuList] = js.native
}

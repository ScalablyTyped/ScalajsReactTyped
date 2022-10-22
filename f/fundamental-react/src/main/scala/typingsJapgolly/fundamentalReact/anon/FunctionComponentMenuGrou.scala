package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.MenuDotGroup
import typingsJapgolly.fundamentalReact.libMenuMenuMod.MenuGroupProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Menu/Menu.MenuGroupProps> & {  displayName :'Menu.Group'} */
@js.native
trait FunctionComponentMenuGrou extends StObject {
  
  def apply(props: MenuGroupProps): Element | Null = js.native
  def apply(props: MenuGroupProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialMenuGroupProps] = js.native
  
  var displayName: js.UndefOr[String] & MenuDotGroup = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapMenuGrou] = js.native
}

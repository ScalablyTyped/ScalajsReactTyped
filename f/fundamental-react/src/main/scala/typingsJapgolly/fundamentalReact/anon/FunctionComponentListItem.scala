package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ListDotItem
import typingsJapgolly.fundamentalReact.libListListMod.ListItemProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListItemProps> & {  displayName :'List.Item'} */
@js.native
trait FunctionComponentListItem extends StObject {
  
  def apply(props: ListItemProps): Element | Null = js.native
  def apply(props: ListItemProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListItemProps] = js.native
  
  var displayName: js.UndefOr[String] & ListDotItem = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListItem] = js.native
}

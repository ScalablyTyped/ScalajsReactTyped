package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ListDotHeader
import typingsJapgolly.fundamentalReact.libListListMod.ListHeaderProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListHeaderProps> & {  displayName :'List.Header'} */
@js.native
trait FunctionComponentListHead extends StObject {
  
  def apply(props: ListHeaderProps): Element | Null = js.native
  def apply(props: ListHeaderProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListHeaderProps] = js.native
  
  var displayName: js.UndefOr[String] & ListDotHeader = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListHead] = js.native
}

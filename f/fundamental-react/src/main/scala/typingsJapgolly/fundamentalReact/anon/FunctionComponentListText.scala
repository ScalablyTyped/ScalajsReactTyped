package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ListDotText
import typingsJapgolly.fundamentalReact.libListListMod.ListTextProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListTextProps> & {  displayName :'List.Text'} */
@js.native
trait FunctionComponentListText extends StObject {
  
  def apply(props: ListTextProps): Element | Null = js.native
  def apply(props: ListTextProps, context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialListTextProps] = js.native
  
  var displayName: js.UndefOr[String] & ListDotText = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapListText] = js.native
}

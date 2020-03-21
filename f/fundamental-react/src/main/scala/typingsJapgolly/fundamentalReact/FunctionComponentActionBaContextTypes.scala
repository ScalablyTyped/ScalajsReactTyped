package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.actionBarMod.ActionBarHeaderProps
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ActionBarDotHeader
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ActionBar/ActionBar.ActionBarHeaderProps> & {  displayName  :'ActionBar.Header'} */
@js.native
trait FunctionComponentActionBaContextTypes extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarHeaderPro] = js.native
  var displayName: js.UndefOr[String with ActionBarDotHeader] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBaAriaactivedescendant] = js.native
  def apply(props: PropsWithChildren[ActionBarHeaderProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ActionBarHeaderProps], context: js.Any): Element | Null = js.native
}


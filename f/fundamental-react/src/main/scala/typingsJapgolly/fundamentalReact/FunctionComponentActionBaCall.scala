package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.actionBarMod.ActionBarBackProps
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ActionBarDotBack
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ActionBar/ActionBar.ActionBarBackProps> & {  displayName  :'ActionBar.Back'} */
@js.native
trait FunctionComponentActionBaCall extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarBackProps] = js.native
  var displayName: js.UndefOr[String with ActionBarDotBack] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBaAccessKey] = js.native
  def apply(props: PropsWithChildren[ActionBarBackProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ActionBarBackProps], context: js.Any): Element | Null = js.native
}


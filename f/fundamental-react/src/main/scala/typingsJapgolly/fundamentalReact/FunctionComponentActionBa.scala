package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.actionBarMod.ActionBarActionsProps
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ActionBarDotActions
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ActionBar/ActionBar.ActionBarActionsProps> & {  displayName  :'ActionBar.Actions'} */
@js.native
trait FunctionComponentActionBa extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarActionsPr] = js.native
  var displayName: js.UndefOr[String with ActionBarDotActions] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBaAbout] = js.native
  def apply(props: PropsWithChildren[ActionBarActionsProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ActionBarActionsProps], context: js.Any): Element | Null = js.native
}


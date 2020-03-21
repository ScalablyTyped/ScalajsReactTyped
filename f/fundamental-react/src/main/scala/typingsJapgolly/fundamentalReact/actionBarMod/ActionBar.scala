package typingsJapgolly.fundamentalReact.actionBarMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.FunctionComponentActionBa
import typingsJapgolly.fundamentalReact.FunctionComponentActionBaCall
import typingsJapgolly.fundamentalReact.FunctionComponentActionBaContextTypes
import typingsJapgolly.fundamentalReact.PartialActionBarProps
import typingsJapgolly.fundamentalReact.WeakValidationMapActionBa
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/ActionBar/ActionBar", "ActionBar")
@js.native
object ActionBar extends js.Object {
  var Actions: FunctionComponentActionBa = js.native
  var Back: FunctionComponentActionBaCall = js.native
  var Header: FunctionComponentActionBaContextTypes = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialActionBarProps] = js.native
  var displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.ActionBar | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapActionBa] = js.native
  def apply(props: PropsWithChildren[ActionBarProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ActionBarProps], context: js.Any): Element | Null = js.native
}


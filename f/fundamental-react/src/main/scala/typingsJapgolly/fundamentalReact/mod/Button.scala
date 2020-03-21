package typingsJapgolly.fundamentalReact.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialButtonProps
import typingsJapgolly.fundamentalReact.WeakValidationMapButtonPr
import typingsJapgolly.fundamentalReact.buttonMod.ButtonProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Button")
@js.native
object Button extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonProps] = js.native
  var displayName: js.UndefOr[typingsJapgolly.fundamentalReact.fundamentalReactStrings.Button | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  def apply(props: PropsWithChildren[ButtonProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ButtonProps], context: js.Any): Element | Null = js.native
}


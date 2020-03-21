package typingsJapgolly.fundamentalReact.buttonGroupMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.fundamentalReact.PartialButtonGroupProps
import typingsJapgolly.fundamentalReact.WeakValidationMapButtonGr
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.ButtonGroup
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Button/ButtonGroup", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
  var displayName: js.UndefOr[ButtonGroup | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
  def apply(props: PropsWithChildren[ButtonGroupProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ButtonGroupProps], context: js.Any): Element | Null = js.native
}


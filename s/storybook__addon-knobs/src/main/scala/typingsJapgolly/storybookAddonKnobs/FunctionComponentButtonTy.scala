package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> & {serialize (): undefined, deserialize (): undefined} */
@js.native
trait FunctionComponentButtonTy extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps]): Element | Null = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps], context: js.Any): Element | Null = js.native
  def deserialize(): js.UndefOr[scala.Nothing] = js.native
  def serialize(): js.UndefOr[scala.Nothing] = js.native
}


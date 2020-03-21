package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.selectMod.SelectTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> & {serialize (value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue, deserialize (value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue} */
@js.native
trait FunctionComponentSelectTy extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]): Element | Null = js.native
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]], context: js.Any): Element | Null = js.native
  def deserialize(value: SelectTypeKnobValue): SelectTypeKnobValue = js.native
  def serialize(value: SelectTypeKnobValue): SelectTypeKnobValue = js.native
}


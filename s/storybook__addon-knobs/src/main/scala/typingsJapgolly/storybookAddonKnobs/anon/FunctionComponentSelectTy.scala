package typingsJapgolly.storybookAddonKnobs.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> & {serialize (value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue, deserialize (value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue} */
@js.native
trait FunctionComponentSelectTy extends StObject {
  
  def apply(props: SelectTypeProps[SelectTypeKnobValue]): Element | Null = js.native
  def apply(props: SelectTypeProps[SelectTypeKnobValue], context: Any): Element | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
  
  def deserialize(value: SelectTypeKnobValue): SelectTypeKnobValue = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
  
  def serialize(value: SelectTypeKnobValue): SelectTypeKnobValue = js.native
}

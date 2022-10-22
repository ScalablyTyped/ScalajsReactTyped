package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesCheckboxesMod.CheckboxesTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesCheckboxesMod.CheckboxesTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesCheckboxesMod.CheckboxesTypeProps
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesCheckboxesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkboxes {
  
  inline def apply(
    isInline: scala.Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue
  ): Default[default] = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[default](js.Array(this.component, __props.asInstanceOf[CheckboxesTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CheckboxesTypeProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

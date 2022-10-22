package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeProps
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  inline def apply(
    isInline: scala.Boolean,
    knob: RadiosTypeKnob,
    onChange: RadiosTypeKnobValue => RadiosTypeKnobValue
  ): SharedBuilder_RadiosTypeProps995953317[default] = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_RadiosTypeProps995953317[default](js.Array(this.component, __props.asInstanceOf[RadiosTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Radio", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadiosTypeProps): SharedBuilder_RadiosTypeProps995953317[default] = new SharedBuilder_RadiosTypeProps995953317[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

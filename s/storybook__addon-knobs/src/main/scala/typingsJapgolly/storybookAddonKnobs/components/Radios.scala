package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.radios
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radios {
  
  inline def apply(
    isInline: scala.Boolean,
    knob: RadiosTypeKnob,
    onChange: RadiosTypeKnobValue => RadiosTypeKnobValue
  ): SharedBuilder_RadiosTypeProps995953317[radios] = {
    val __props = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new SharedBuilder_RadiosTypeProps995953317[radios](js.Array(this.component, __props.asInstanceOf[RadiosTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.radios")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RadiosTypeProps): SharedBuilder_RadiosTypeProps995953317[radios] = new SharedBuilder_RadiosTypeProps995953317[radios](js.Array(this.component, p.asInstanceOf[js.Any]))
}

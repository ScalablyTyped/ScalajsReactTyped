package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeProps
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Array {
  
  inline def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => ArrayTypeKnobValue): Default[array] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[array](js.Array(this.component, __props.asInstanceOf[ArrayTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.array")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ArrayTypeProps): Default[array] = new Default[array](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.number
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.NumberTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.NumberTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.NumberTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  inline def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): Default[number] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[number](js.Array(this.component, __props.asInstanceOf[NumberTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.number")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NumberTypeProps): Default[number] = new Default[number](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesBooleanMod.BooleanTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesBooleanMod.BooleanTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesBooleanMod.BooleanTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Boolean {
  
  inline def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => BooleanTypeKnobValue): Default[js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BooleanTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BooleanTypeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

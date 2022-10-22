package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsKnobOptionsDisplay
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Options {
  
  inline def apply(display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[Any], onChange: Any => Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[OptionsTypeProps[Any]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OptionsTypeProps[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

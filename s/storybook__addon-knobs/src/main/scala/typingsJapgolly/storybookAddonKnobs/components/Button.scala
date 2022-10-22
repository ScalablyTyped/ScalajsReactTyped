package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  inline def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ButtonTypeProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ButtonTypeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

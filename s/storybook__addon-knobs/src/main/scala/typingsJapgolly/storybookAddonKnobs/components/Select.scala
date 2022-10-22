package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  inline def apply(knob: SelectTypeKnob[SelectTypeKnobValue], onChange: SelectTypeKnobValue => SelectTypeKnobValue): Default[js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[SelectTypeProps[SelectTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SelectTypeProps[SelectTypeKnobValue]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

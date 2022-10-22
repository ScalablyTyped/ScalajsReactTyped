package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.text
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTextMod.TextTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  inline def apply(knob: KnobControlConfig[TextTypeKnobValue], onChange: TextTypeKnobValue => TextTypeKnobValue): Default[text] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[text](js.Array(this.component, __props.asInstanceOf[KnobControlProps[TextTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.text")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: KnobControlProps[TextTypeKnobValue]): Default[text] = new Default[text](js.Array(this.component, p.asInstanceOf[js.Any]))
}

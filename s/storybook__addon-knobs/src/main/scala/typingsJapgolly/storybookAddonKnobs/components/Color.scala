package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesColorMod.ColorTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.color
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Color {
  
  inline def apply(knob: KnobControlConfig[ColorTypeKnobValue], onChange: ColorTypeKnobValue => ColorTypeKnobValue): Default[color] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[color](js.Array(this.component, __props.asInstanceOf[KnobControlProps[ColorTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.color")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: KnobControlProps[ColorTypeKnobValue]): Default[color] = new Default[color](js.Array(this.component, p.asInstanceOf[js.Any]))
}

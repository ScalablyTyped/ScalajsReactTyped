package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesDateMod.DateTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.default.date
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Date {
  
  inline def apply(knob: KnobControlConfig[DateTypeKnobValue], onChange: DateTypeKnobValue => DateTypeKnobValue): Default[date] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[date](js.Array(this.component, __props.asInstanceOf[KnobControlProps[DateTypeKnobValue]]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/types", "default.date")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: KnobControlProps[DateTypeKnobValue]): Default[date] = new Default[date](js.Array(this.component, p.asInstanceOf[js.Any]))
}

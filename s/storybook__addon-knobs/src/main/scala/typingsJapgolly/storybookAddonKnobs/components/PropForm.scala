package typingsJapgolly.storybookAddonKnobs.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonKnobs.distComponentsPropFormMod.PropFormProps
import typingsJapgolly.storybookAddonKnobs.distComponentsPropFormMod.default
import typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PropForm {
  
  inline def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Callback,
    onFieldClick: KnobStoreKnob => Callback
  ): Default[default] = {
    val __props = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction1((t0: KnobStoreKnob) => onFieldChange(t0).runNow()), onFieldClick = js.Any.fromFunction1((t0: KnobStoreKnob) => onFieldClick(t0).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[PropFormProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/PropForm", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropFormProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

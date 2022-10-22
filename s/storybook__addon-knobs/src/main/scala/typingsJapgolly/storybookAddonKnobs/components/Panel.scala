package typingsJapgolly.storybookAddonKnobs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookAddonKnobs.anon.PickAPIonoffemitgetQueryP
import typingsJapgolly.storybookAddonKnobs.distComponentsPanelMod.KnobPanelProps
import typingsJapgolly.storybookAddonKnobs.distComponentsPanelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  inline def apply(active: scala.Boolean, api: PickAPIonoffemitgetQueryP): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KnobPanelProps]))
  }
  
  @JSImport("@storybook/addon-knobs/dist/components/Panel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onReset(value: js.Object): this.type = set("onReset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KnobPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

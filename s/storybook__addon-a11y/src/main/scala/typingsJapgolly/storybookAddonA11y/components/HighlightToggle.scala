package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.axeCore.mod.NodeResult
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportHighlightToggleMod.ToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HighlightToggle {
  
  inline def apply(elementsToHighlight: js.Array[NodeResult]): Builder = {
    val __props = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ToggleProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def toggleId(value: String): this.type = set("toggleId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

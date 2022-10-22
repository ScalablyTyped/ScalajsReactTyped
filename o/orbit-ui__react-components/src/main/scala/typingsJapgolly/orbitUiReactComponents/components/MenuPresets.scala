package typingsJapgolly.orbitUiReactComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.orbitUiReactComponents.distDateInputSrcMenuPresetsMod.MenuPresetsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuPresets {
  
  inline def apply(onSelectionChange: (ReactEventFrom[Element], Double) => Callback, values: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(onSelectionChange = js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: Double) => (onSelectionChange(t0, t1)).runNow()), values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuPresetsProps]))
  }
  
  @JSImport("@orbit-ui/react-components/dist/date-input/src/MenuPresets", "MenuPresets")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-details`(value: String): this.type = set("aria-details", value.asInstanceOf[js.Any])
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuPresetsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Switches.RadioButtonGroupProps
import typingsJapgolly.materialUi.materialUiStrings.left
import typingsJapgolly.materialUi.materialUiStrings.right
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButtonGroup {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RadioButtonGroupProps]))
  }
  
  @JSImport("material-ui", "RadioButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.RadioButtonGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSelected(value: Any): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    
    inline def labelPosition(value: left | right): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* e */ ReactEventFrom[js.Object & Element], /* selected */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: /* selected */ String) => (value(t0, t1)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def valueSelected(value: Any): this.type = set("valueSelected", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.downshift.mod.UseSelectStateChange
import typingsJapgolly.wordpressComponents.customSelectControlMod.CustomSelectControl.Option
import typingsJapgolly.wordpressComponents.customSelectControlMod.CustomSelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomSelectControl {
  
  inline def apply(label: String, options: js.Array[Option]): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "CustomSelectControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def hideLabelFromVision(value: Boolean): this.type = set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* changes */ UseSelectStateChange[Option] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* changes */ UseSelectStateChange[Option]) => value(t0).runNow()))
    
    inline def value(value: Option): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

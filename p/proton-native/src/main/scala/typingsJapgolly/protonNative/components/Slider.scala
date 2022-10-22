package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.anon.H
import typingsJapgolly.protonNative.anon.X
import typingsJapgolly.protonNative.mod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("proton-native", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.Slider] {
    
    inline def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    inline def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    
    inline def stretchy(value: Boolean): this.type = set("stretchy", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

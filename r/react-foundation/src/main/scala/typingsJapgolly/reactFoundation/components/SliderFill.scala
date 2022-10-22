package typingsJapgolly.reactFoundation.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFoundation.componentsSliderMod.SliderFillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SliderFill {
  
  @JSImport("react-foundation", "SliderFill")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SliderFill.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderFillProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

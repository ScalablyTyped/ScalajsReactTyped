package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.tuyaPanelKit.mod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("tuya-panel-kit", "Slider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Slider.type): SharedBuilder_SliderProps851987633[typingsJapgolly.tuyaPanelKit.mod.Slider] = new SharedBuilder_SliderProps851987633[typingsJapgolly.tuyaPanelKit.mod.Slider](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliderProps): SharedBuilder_SliderProps851987633[typingsJapgolly.tuyaPanelKit.mod.Slider] = new SharedBuilder_SliderProps851987633[typingsJapgolly.tuyaPanelKit.mod.Slider](js.Array(this.component, p.asInstanceOf[js.Any]))
}

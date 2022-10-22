package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Slider")
@js.native
open class Slider protected ()
  extends Component[SliderProps, js.Object, Any] {
  def this(props: SliderProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: SliderProps, context: Any) = this()
}
/* static members */
object Slider {
  
  @JSImport("tuya-panel-kit", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Slider.Horizontal")
  @js.native
  def Horizontal: ElementType = js.native
  inline def Horizontal_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Slider.Vertical")
  @js.native
  def Vertical: ElementType = js.native
  inline def Vertical_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}

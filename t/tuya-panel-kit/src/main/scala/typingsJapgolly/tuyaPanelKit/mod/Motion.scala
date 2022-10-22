package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Motion")
@js.native
open class Motion protected ()
  extends Component[MotionProps, js.Object, Any] {
  def this(props: MotionProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MotionProps, context: Any) = this()
}
/* static members */
object Motion {
  
  @JSImport("tuya-panel-kit", "Motion")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Motion.Fade")
  @js.native
  def Fade: ElementType = js.native
  inline def Fade_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fade")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.PullUp")
  @js.native
  def PullUp: ElementType = js.native
  inline def PullUp_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PullUp")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.PushDown")
  @js.native
  def PushDown: ElementType = js.native
  inline def PushDown_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PushDown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.ScaleFadeIn")
  @js.native
  def ScaleFadeIn: ElementType = js.native
  inline def ScaleFadeIn_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScaleFadeIn")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.ScalePullDown")
  @js.native
  def ScalePullDown: ElementType = js.native
  inline def ScalePullDown_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScalePullDown")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Motion.Toast")
  @js.native
  def Toast: ElementType = js.native
  inline def Toast_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toast")(x.asInstanceOf[js.Any])
}

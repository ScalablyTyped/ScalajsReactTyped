package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "Progress")
@js.native
open class Progress protected ()
  extends Component[ProgressBasicProps, js.Object, Any] {
  def this(props: ProgressBasicProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ProgressBasicProps, context: Any) = this()
}
/* static members */
object Progress {
  
  @JSImport("tuya-panel-kit", "Progress")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "Progress.Compose")
  @js.native
  def Compose: ElementType = js.native
  inline def Compose_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Compose")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Progress.Double")
  @js.native
  def Double: ElementType = js.native
  inline def Double_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "Progress.Space")
  @js.native
  def Space: ElementType = js.native
  inline def Space_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Space")(x.asInstanceOf[js.Any])
}

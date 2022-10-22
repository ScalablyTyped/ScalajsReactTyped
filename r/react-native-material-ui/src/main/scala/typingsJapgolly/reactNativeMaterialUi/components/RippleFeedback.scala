package typingsJapgolly.reactNativeMaterialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.mod.RippleFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RippleFeedback {
  
  @JSImport("react-native-material-ui", "RippleFeedback")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.RippleFeedback] {
    
    inline def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RippleFeedback.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RippleFeedbackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactNativeSnackbarComponent.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSnackbarComponent.mod.SnackbarComponentProps
import typingsJapgolly.reactNativeSnackbarComponent.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSnackbarComponent {
  
  @JSImport("react-native-snackbar-component", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    
    inline def actionHandler(value: Callback): this.type = set("actionHandler", value.toJsFn)
    
    inline def actionText(value: String): this.type = set("actionText", value.asInstanceOf[js.Any])
    
    inline def autoHidingTime(value: Double): this.type = set("autoHidingTime", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def bottom(value: Double): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def distanceCallback(value: Callback): this.type = set("distanceCallback", value.toJsFn)
    
    inline def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def messageColor(value: String): this.type = set("messageColor", value.asInstanceOf[js.Any])
    
    inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def right(value: Double): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def textMessage(value: String): this.type = set("textMessage", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSnackbarComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SnackbarComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.Message
import typingsJapgolly.reactNativeMaterialUi.mod.ButtonProps
import typingsJapgolly.reactNativeMaterialUi.mod.SnackbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  inline def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: Callback,
    timeout: Double,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onRequestClose = onRequestClose.toJsFn, timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SnackbarProps]))
  }
  
  @JSImport("react-native-material-ui", "Snackbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Snackbar] {
    
    inline def actionText(value: String): this.type = set("actionText", value.asInstanceOf[js.Any])
    
    inline def button(value: ButtonProps): this.type = set("button", value.asInstanceOf[js.Any])
    
    inline def onActionPress(value: Callback): this.type = set("onActionPress", value.toJsFn)
    
    inline def style(value: Message): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.Container
import typingsJapgolly.reactNativeMaterialUi.mod.ActionButtonProps
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionButton {
  
  @JSImport("react-native-material-ui", "ActionButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.ActionButton] {
    
    inline def actions(value: js.Array[Element | typingsJapgolly.reactNativeMaterialUi.anon.Icon | String]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: (Element | typingsJapgolly.reactNativeMaterialUi.anon.Icon | String)*): this.type = set("actions", js.Array(value*))
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def style(value: Container): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transition(value: toolbar | speedDial): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ActionButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActionButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

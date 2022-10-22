package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.DeepPartialTheme
import typingsJapgolly.reactNativePaper.anon.PickPropsstylechildrenvis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  inline def apply(visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsstylechildrenvis]))
  }
  
  @JSImport("react-native-paper", "Dialog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dismissable(value: Boolean): this.type = set("dismissable", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def theme(value: DeepPartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsstylechildrenvis): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

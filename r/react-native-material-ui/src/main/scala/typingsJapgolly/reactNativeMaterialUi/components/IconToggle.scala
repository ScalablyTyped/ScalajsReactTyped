package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.ContainerIcon
import typingsJapgolly.reactNativeMaterialUi.mod.IconToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconToggle {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconToggleProps]))
  }
  
  @JSImport("react-native-material-ui", "IconToggle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.IconToggle] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def maxOpacity(value: Double): this.type = set("maxOpacity", value.asInstanceOf[js.Any])
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: ContainerIcon): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactNativeCanvas.components

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCanvas.mod.Canvas
import typingsJapgolly.reactNativeCanvas.mod.CanvasProps
import typingsJapgolly.reactNativeCanvas.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeCanvas {
  
  inline def apply(ref: (js.Function1[/* canvas */ Canvas, Any]) | RefHandle[Canvas]): Builder = {
    val __props = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CanvasProps]))
  }
  
  @JSImport("react-native-canvas", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    
    inline def originWhitelist(value: js.Array[String]): this.type = set("originWhitelist", value.asInstanceOf[js.Any])
    
    inline def originWhitelistVarargs(value: String*): this.type = set("originWhitelist", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: CanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

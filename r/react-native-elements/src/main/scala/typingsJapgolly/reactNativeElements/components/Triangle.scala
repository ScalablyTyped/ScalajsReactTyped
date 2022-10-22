package typingsJapgolly.reactNativeElements.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.distTooltipTriangleMod.TriangleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Triangle {
  
  @JSImport("react-native-elements/dist/tooltip/Triangle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isDown(value: Boolean): this.type = set("isDown", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Triangle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TriangleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

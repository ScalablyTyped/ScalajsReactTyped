package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libFlexFlexItemDotnativeMod.FlexItemProps
import typingsJapgolly.antdMobileRn.libFlexFlexItemDotnativeMod.default
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlexItemDotnative {
  
  @JSImport("antd-mobile-rn/lib/flex/FlexItem.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def flex(value: Double): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def onPressIn(value: Callback): this.type = set("onPressIn", value.toJsFn)
    
    inline def onPressOut(value: Callback): this.type = set("onPressOut", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: FlexItemDotnative.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

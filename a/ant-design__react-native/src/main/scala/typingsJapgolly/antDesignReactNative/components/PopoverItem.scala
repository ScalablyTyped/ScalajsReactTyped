package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.libPopoverMod.PopoverItemProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverItem {
  
  inline def apply(value: Any): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PopoverItemProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/popover", "PopoverItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.libPopoverMod.PopoverItem] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: PopoverItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

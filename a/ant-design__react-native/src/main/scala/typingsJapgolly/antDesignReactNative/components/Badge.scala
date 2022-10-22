package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.large
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.small
import typingsJapgolly.antDesignReactNative.libBadgeMod.BadgeProps
import typingsJapgolly.antDesignReactNative.libBadgeStyleMod.BadgeStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("@ant-design/react-native", "Badge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Badge] {
    
    inline def corner(value: Boolean): this.type = set("corner", value.asInstanceOf[js.Any])
    
    inline def dot(value: Boolean): this.type = set("dot", value.asInstanceOf[js.Any])
    
    inline def overflowCount(value: Double): this.type = set("overflowCount", value.asInstanceOf[js.Any])
    
    inline def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[BadgeStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def text(value: Any): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

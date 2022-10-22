package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.fixed
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.normal
import typingsJapgolly.antDesignReactNative.libProgressMod.ProgressProps
import typingsJapgolly.antDesignReactNative.libProgressStyleMod.ProgressStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("@ant-design/react-native", "Progress")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Progress] {
    
    inline def appearTransition(value: Boolean): this.type = set("appearTransition", value.asInstanceOf[js.Any])
    
    inline def barStyle(value: StyleProp[ViewStyle]): this.type = set("barStyle", value.asInstanceOf[js.Any])
    
    inline def barStyleNull: this.type = set("barStyle", null)
    
    inline def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def position(value: fixed | normal): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: Partial[ProgressStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def unfilled(value: Boolean): this.type = set("unfilled", value.asInstanceOf[js.Any])
    
    inline def wrapWidth(value: Double): this.type = set("wrapWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

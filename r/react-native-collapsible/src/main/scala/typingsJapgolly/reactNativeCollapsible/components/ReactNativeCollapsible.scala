package typingsJapgolly.reactNativeCollapsible.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.mod.CollapsibleProps
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import typingsJapgolly.reactNativeCollapsible.mod.default
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeCollapsible {
  
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def collapsedHeight(value: Double): this.type = set("collapsedHeight", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: EasingMode | Any): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def enablePointerEvents(value: Boolean): this.type = set("enablePointerEvents", value.asInstanceOf[js.Any])
    
    inline def onAnimationEnd(value: Callback): this.type = set("onAnimationEnd", value.toJsFn)
    
    inline def renderChildrenCollapsed(value: Boolean): this.type = set("renderChildrenCollapsed", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: ReactNativeCollapsible.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsibleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

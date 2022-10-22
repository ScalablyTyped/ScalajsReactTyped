package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.CollapsibleProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapsible {
  
  @JSImport("tuya-panel-kit", "Collapsible")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Collapsible] {
    
    inline def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    inline def collapsedHeight(value: Double): this.type = set("collapsedHeight", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: String | js.Function0[Unit]): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def easingCallback(value: Callback): this.type = set("easing", value.toJsFn)
    
    inline def onChange(value: Callback): this.type = set("onChange", value.toJsFn)
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Collapsible.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapsibleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

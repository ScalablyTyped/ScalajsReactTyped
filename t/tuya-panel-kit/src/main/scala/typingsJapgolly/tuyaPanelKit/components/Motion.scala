package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.Delay
import typingsJapgolly.tuyaPanelKit.mod.MotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Motion {
  
  @JSImport("tuya-panel-kit", "Motion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Motion] {
    
    inline def animationConfig(value: Delay): this.type = set("animationConfig", value.asInstanceOf[js.Any])
    
    inline def hideDuration(value: Double): this.type = set("hideDuration", value.asInstanceOf[js.Any])
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def showDuration(value: Double): this.type = set("showDuration", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Motion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

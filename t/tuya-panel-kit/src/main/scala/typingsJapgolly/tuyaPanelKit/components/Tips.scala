package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.MotionFadeProps
import typingsJapgolly.tuyaPanelKit.mod.MotionPullUpProps
import typingsJapgolly.tuyaPanelKit.mod.MotionPushDownProps
import typingsJapgolly.tuyaPanelKit.mod.MotionScaleFadeInProps
import typingsJapgolly.tuyaPanelKit.mod.MotionScalePullDownProps
import typingsJapgolly.tuyaPanelKit.mod.TipsProps
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.Fade
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.PullUp
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.PushDown
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.ScaleFadeIn
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.ScalePullDown
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottomCenter
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottomLeft
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottomRight
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.topCenter
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.topLeft
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tips {
  
  @JSImport("tuya-panel-kit", "Tips")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Tips] {
    
    inline def bgColor(value: String): this.type = set("bgColor", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: StyleProp[ViewStyle]): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def contentStyleNull: this.type = set("contentStyle", null)
    
    inline def cornerPosition(value: topLeft | topCenter | topRight | bottomLeft | bottomCenter | bottomRight): this.type = set("cornerPosition", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: MotionScaleFadeInProps | MotionFadeProps | MotionPullUpProps | MotionScalePullDownProps | MotionPushDownProps
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def motionType(value: Fade | PullUp | ScaleFadeIn | ScalePullDown | PushDown): this.type = set("motionType", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def showCorner(value: Boolean): this.type = set("showCorner", value.asInstanceOf[js.Any])
    
    inline def tipStyle(value: StyleProp[ViewStyle]): this.type = set("tipStyle", value.asInstanceOf[js.Any])
    
    inline def tipStyleNull: this.type = set("tipStyle", null)
    
    inline def withModal(value: Boolean): this.type = set("withModal", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tips.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TipsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.storybookReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIMod.OnDeviceUIProps
import typingsJapgolly.storybookReactNative.distPreviewComponentsOnDeviceUIMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OnDeviceUI {
  
  inline def apply(stories: Any): Builder = {
    val __props = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OnDeviceUIProps]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def isUIHidden(value: Boolean): this.type = set("isUIHidden", value.asInstanceOf[js.Any])
    
    inline def keyboardAvoidingViewVerticalOffset(value: Double): this.type = set("keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
    
    inline def shouldDisableKeyboardAvoidingView(value: Boolean): this.type = set("shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
    
    inline def tabOpen(value: Double): this.type = set("tabOpen", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OnDeviceUIProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
